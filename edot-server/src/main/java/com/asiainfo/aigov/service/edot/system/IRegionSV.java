package com.asiainfo.aigov.service.edot.system;

import java.util.List;

import com.asiainfo.aigov.model.edot.system.Region;

/** 
 * @Title        IRegionSV.java
 * @Description: 用户注册接口
 * @author:      Administrator
 * @date:        2017年8月3日下午4:31:39 
 *  
 */
public interface IRegionSV {

	List<Region> getRegionList(String level, String parentCode) throws Exception;

	String getRegionCodeByName(String regionName) throws Exception;
	
}
