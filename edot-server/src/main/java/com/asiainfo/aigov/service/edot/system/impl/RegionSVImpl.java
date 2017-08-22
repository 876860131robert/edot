package com.asiainfo.aigov.service.edot.system.impl;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.system.RegionMapper;
import com.asiainfo.aigov.model.edot.system.Region;
import com.asiainfo.aigov.model.edot.system.RegionExample;
import com.asiainfo.aigov.service.edot.system.IRegionSV;

/** 
 * @Title        RegionSVImpl.java
 * @Description: 用户注册接口实现类
 * @author:      Administrator
 * @date:        2017年8月3日下午4:31:54 
 *  
 */
@Service
@Transactional
public class RegionSVImpl implements IRegionSV {
	
	@Autowired
	private RegionMapper regionMapper;

	public List<Region> getRegionList(String level, String parentCode) throws Exception {
		RegionExample example = new RegionExample();
		RegionExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isNotEmpty(level) && StringUtils.isNotEmpty(parentCode)){
			Short lv = Short.valueOf(level);
			criteria.andRegionCodeLike(parentCode.substring(0, lv * 2) + "%");
			criteria.andRegionLevelEqualTo(++lv);
			example.setOrderByClause("order_no");
			return regionMapper.selectByExample(example);
		} else {
			return Collections.emptyList();
		}
	}

	public String getRegionCodeByName(String regionName) throws Exception {
		RegionExample example = new RegionExample();
		RegionExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isNotEmpty(regionName)){
			criteria.andRegionNameEqualTo(regionName);
			criteria.andRegionLevelEqualTo((short)3);
			List<Region> list = regionMapper.selectByExample(example);
			if(list != null && list.size() == 1){
				return list.get(0).getRegionCode();
			} else {
				return "000000";//不限区域
			}
		} else {
			return "000000";//不限区域
		}
	}

}
