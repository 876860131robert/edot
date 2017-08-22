package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicOfficeMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOfficeExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicOfficeService;
/**
 * 
 * @author 柯永锥
 *
 */
import com.asiainfo.aigov.web.vo.DeptListVo;
import com.asiainfo.frame.utils.PinYinUtils;

import net.sf.json.JSONObject;
@Service
public class PublicOfficeService extends BaseService implements IPublicOfficeService {

	@Autowired
	private PublicOfficeMapper publicOfficeMapper;
	
	@Override
	public int update(PublicOffice record)throws Exception{
		return publicOfficeMapper.updateByPrimaryKey(record);
	}

	@Override
	public PublicOffice find(String id)throws Exception{
		return publicOfficeMapper.selectByPrimaryKey(new BigDecimal(id));
	}
	
	@Override
	public int save(PublicOffice bean)throws Exception{
		PublicOffice office=getPublicOfficeByCode(bean.getHospitalId().toString(), bean.getCode());
		if(office!=null){
			PublicOfficeExample example =new PublicOfficeExample();
			PublicOfficeExample.Criteria criteria=  example.createCriteria();
			criteria.andCodeEqualTo(bean.getCode());
			criteria.andHospitalIdEqualTo(bean.getHospitalId());
			bean.setOfficeId(office.getOfficeId());
			return publicOfficeMapper.updateByExample(bean, example);
		}else {
			return publicOfficeMapper.insert(bean);
		}
	}
	
	@Override
	public int count(PublicOfficeExample example)throws Exception{
		return publicOfficeMapper.countByExample(example);
	}
	
	@Override
	public List<PublicOffice> select(PublicOfficeExample example) {
		return publicOfficeMapper.selectByExample(example);
	}

	@Override
	public List<PublicOffice> select(PublicOfficeExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicOfficeMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
	@Override
	public List<PublicOffice> queryOffice(String hospitalId)throws Exception{
		PublicOfficeExample example =new PublicOfficeExample();
		PublicOfficeExample.Criteria criteria=  example.createCriteria();
		criteria.andHospitalIdEqualTo(new BigDecimal(hospitalId));
		return select(example);
	}
	
	@Override
	public PublicOffice getPublicOfficeByCode(String hospitalId,String code)throws Exception{
		PublicOffice publicOffice=null;
		PublicOfficeExample example =new PublicOfficeExample();
		PublicOfficeExample.Criteria criteria=  example.createCriteria();
		criteria.andCodeEqualTo(code);
		criteria.andHospitalIdEqualTo(new BigDecimal(hospitalId));
		List<PublicOffice> officeList =select(example);
		
		if(!officeList.isEmpty()){
			publicOffice=officeList.get(0);
		}
		return publicOffice;
	}
	
	public List<DeptListVo> getDeptListVo(String hospitalId,String officeName)throws Exception{
		List<DeptListVo> list2 = new ArrayList<DeptListVo>();
		List<PublicOffice> PublicOfficeList=queryOffice(hospitalId);
		if(PublicOfficeList!=null && !PublicOfficeList.isEmpty()){
			//将科室名称按字典排序
			Collections.sort(PublicOfficeList, new Comparator<PublicOffice>() {

				public int compare(
						PublicOffice o1,
						PublicOffice o2) {
					String s1 = PinYinUtils.getPingYin(o1.getName());
					String s2 = PinYinUtils.getPingYin(o2.getName());
					String[] s = new String[]{s1, s2};
					Arrays.sort(s);
					if(s[0].equals(s1)){
						return -1;
					} else {
						return 1;
					}
				}
			});
			
			//按首字母分组
			TreeMap<String, List<JSONObject>> map = new TreeMap<String, List<JSONObject>>();
			for (PublicOffice s : PublicOfficeList) {
				String firstString = Character.toString(Character.toUpperCase(PinYinUtils.getFirstSpell(s.getName()).charAt(0)));
				List<JSONObject> departList = map.get(firstString);
				
				JSONObject json=new JSONObject();
				json.put("dept_Name", s.getName());
				json.put("dept_Code", s.getCode());
				
				s.getName();
				if(departList == null){
					departList = new ArrayList<JSONObject>();
					departList.add(json);
					map.put(firstString, departList);
				} else {
					departList.add(json);
				}
			}
			//封装成前端格式
			
			Iterator<Map.Entry<String, List<JSONObject>>> it = map.entrySet().iterator();
	        while(it.hasNext()){
				Map.Entry<String, List<JSONObject>> entry =  it.next();
	            String key = entry.getKey();
	            List<JSONObject> value = entry.getValue();
	            if(StringUtils.isNotEmpty(officeName)){
	            	List<JSONObject> value2 = new ArrayList<JSONObject>();
	            	for (JSONObject record_Info : value) {
						if(record_Info.getString("dept_Name").contains(officeName)){
							value2.add(record_Info);
						}
					}
	            	if(value2.size() > 0){
	            		DeptListVo deptListVo = new DeptListVo();
	                    deptListVo.setLetterName(key);
	            		deptListVo.setDepartList(value2);
	                    list2.add(deptListVo);
	            	}
	            } else {
	            	DeptListVo deptListVo = new DeptListVo();
	                deptListVo.setLetterName(key);
	                deptListVo.setDepartList(value);
	                list2.add(deptListVo);
	            }
	        }
		}
		
		return list2;
	}
}
