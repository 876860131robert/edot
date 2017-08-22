package com.asiainfo.aigov.service.edot.system.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.system.Feature;
import com.asiainfo.aigov.model.edot.system.FeatureExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.system.IFeatureService;

import com.asiainfo.aigov.dao.edot.system.FeatureMapper;
/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class FeatureService extends BaseService implements IFeatureService {

	@Autowired
	private FeatureMapper FeatureMapper;
	
	@Override
	public int add(Feature record)throws Exception{
		if(StringUtils.isNotEmpty(record.getOriginalId()))
			FeatureMapper.deleteByPrimaryKey(record.getOriginalId());
		return FeatureMapper.insert(record);
	}
	
	@Override
	public int delete(String id)throws Exception{
		return FeatureMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String[] ids)throws Exception{
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(Arrays.asList(ids));
		return FeatureMapper.deleteByExample(example);
	}
	
	@Override
	public int update(Feature record)throws Exception{
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(record.getId());
		return FeatureMapper.updateByExample(record, example);	//user为set后面的值，example为where后面的条件
	}

	@Override
	public Feature find(String id)throws Exception{
		return FeatureMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(FeatureExample example)throws Exception{
		return FeatureMapper.countByExample(example);
	}
	
	@Override
	public List<Feature> select(FeatureExample example) {
		return FeatureMapper.selectByExample(example);
	}

	@Override
	public List<Feature> select(FeatureExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return FeatureMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public List<Feature> selectDatas(Short levelNo)throws Exception{
		List<Feature> result = new ArrayList<Feature>();
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andLevelNoEqualTo(levelNo);
		example.setOrderByClause("ORDER_NO");
		List<Feature> list = this.select(example);
		for (Feature bean : list) {
			String id = bean.getId();
			List<Feature> childrenList = this.selectByParentId(id, true);
			bean.setChild(childrenList);
			result.add(bean);
		}
		
		return result;
	}
	public List<Feature> selectDatas(String[] ids)throws Exception{
		List<Feature> result = new ArrayList<Feature>();
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(Arrays.asList(ids));
		example.setOrderByClause("ORDER_NO");
		List<Feature> list = this.select(example);
		for (Feature bean : list) {
			String id = bean.getId();
			List<Feature> childrenList = this.selectByParentId(id, true);
			bean.setChild(childrenList);
			result.add(bean);
		}
		
		return result;
	}
	@Override
	public List<Feature> selectByParentId(String parentId, boolean includeChildren)throws Exception{
		List<Feature> result = new ArrayList<Feature>();
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		example.setOrderByClause("ORDER_NO");
		List<Feature> list = this.select(example);
		if(list!=null && list.size()>0){
			for (Feature bean : list) {
				String id = bean.getId();
				if(includeChildren){
					List<Feature> childrenList = this.selectByParentId(id, includeChildren);
					bean.setChild(childrenList);
				}
				result.add(bean);
			}
		}
		
		return result;
	}

	public List<Feature> selectDatasByZone(String[] ids, String regionCode) throws Exception {
		List<Feature> result = new ArrayList<Feature>();
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(Arrays.asList(ids));
		List<Feature> list = this.select(example);
		for (Feature bean : list) {
			String id = bean.getId();
			List<Feature> childrenList = this.selectByParentCode(id, regionCode);
			bean.setChild(childrenList);
			result.add(bean);
		}
		
		return result;
	}
	
	private List<Feature> selectByParentCode(String id, String parentCode)throws Exception{
		List<Feature> list = new ArrayList<Feature>();
		//不限区域
		if("000000".equals(parentCode)){
			FeatureExample example = new FeatureExample();
			FeatureExample.Criteria criteria = example.createCriteria();
			criteria.andIdLike(id + "_000000%");
			example.setOrderByClause("order_no");
			list.addAll(this.select(example));
		} else {
			//区县
			FeatureExample example = new FeatureExample();
			FeatureExample.Criteria criteria = example.createCriteria();
			criteria.andIdLike(id + "_" + parentCode + "%");
			example.setOrderByClause("order_no");
			list.addAll(this.select(example));
			//市
			example = new FeatureExample();
			criteria = example.createCriteria();
			criteria.andIdLike(id + "_" + parentCode.substring(0, 4) + "00%");
			example.setOrderByClause("order_no");
			list.addAll(this.select(example));
			//省
			example = new FeatureExample();
			criteria = example.createCriteria();
			criteria.andIdLike(id + "_" + parentCode.substring(0, 2) + "0000%");
			example.setOrderByClause("order_no");
			list.addAll(this.select(example));
			//不限区域
			example = new FeatureExample();
			criteria = example.createCriteria();
			criteria.andIdLike(id + "_000000%");
			example.setOrderByClause("order_no");
			list.addAll(this.select(example));
		}
		return list;
	}

	public String getIdByZone(String parentId, String zone) throws Exception {
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		criteria.andIdLike(parentId + "_" + zone + "_%");
		example.setOrderByClause("id");
		List<Feature> list = this.select(example);
		String num = "01";
		String end = "09";//最大为09
		for (Feature bean : list) {
			String id = bean.getId();
			String[] array = id.replaceAll(parentId + "_", "").split("_");
			if(array[1].equals(num)){
				if(end.equals(num)){
					break;
				} else {
					num = "0" + (Integer.parseInt(array[1]) + 1);
					continue;
				}
			} else {
				break;
			}
		}
		return parentId + "_" + zone + "_" + num;
	}
	
}
