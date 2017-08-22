package com.asiainfo.aigov.service.edot.work.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.work.MaterialMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.MaterialExample;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.work.IMaterialService;
import com.asiainfo.aigov.service.edot.work.IServiceItemService;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.frame.utils.DBUtil;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class MaterialService extends BaseService implements IMaterialService {
	private static Logger log = Logger.getLogger(MaterialService.class);
	
	@Autowired
	private MaterialMapper matertialMapper;
	@Autowired
	private IServiceItemService serviceItemService;
	
	
	@Override
	public int add(Material record)throws Exception{
		return matertialMapper.insert(record);
	}
	
	@Override
	public int update(Material record, boolean withBLOBs)throws Exception{
		if(withBLOBs){
			return matertialMapper.updateByPrimaryKeyWithBLOBs(record);
		}else{
			return matertialMapper.updateByPrimaryKey(record);
		}
	}

	@Override
	public Material find(String mateno)throws Exception{
		return matertialMapper.selectByPrimaryKey(mateno);
	}
	
	@Override
	public int count(MaterialExample example)throws Exception{
		return matertialMapper.countByExample(example);
	}
	
	@Override
	public List<Material> select(MaterialExample example) {
		return matertialMapper.selectByExample(example);
	}

	@Override
	public List<Material> select(MaterialExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return matertialMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	@Override
	public void deleteAll()throws Exception{
		DBUtil.execute(super.getConnection(), "truncate table ED_WORK_MATERIAL");
	}
	@Override
	public void deleteByServcode(String servcode)throws Exception{
		MaterialExample example = new MaterialExample();
		example.createCriteria().andServcodeEqualTo(servcode);
		matertialMapper.deleteByExample(example);
	}
	
	@Override
	public boolean updateByRemote()throws Exception{
		deleteAll();
		int pageIndex = 1;
		Page page = new Page();
		page.setPageIndex(pageIndex);
		page.setPageSize(20);
		List<ServiceItem> list;
		while((list=serviceItemService.select(new ServiceItemExample(), page))!=null){
			for (ServiceItem serviceItem : list) {
				List<Material> matertialList = WorkWebService.searchServiceItemMatertias(serviceItem.getServno());
				if(matertialList!=null){
					for (Material matertial : matertialList) {
						matertial.setUpdateTime(new Date());
						this.add(matertial);
					}
				}
			}
			page.setPageIndex(++pageIndex);
		}
	
		return true;
	}
	
	public void deleteByDateBefore(String date)throws Exception{
		String sql = "delete ED_WORK_MATERIAL where TO_CHAR(UPDATE_TIME, 'yyyy-mm-dd hh24:mi:ss')<'"+date+"'";
		DBUtil.execute(super.getConnection(), sql);
	}
}
