package com.asiainfo.aigov.service.edot.system;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.system.Feature;
import com.asiainfo.aigov.model.edot.system.FeatureExample;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IFeatureService {
	
	public int add(Feature bean)throws Exception;

	public int delete(String id)throws Exception;
	
	public int delete(String[] ids)throws Exception;

	public int update(Feature bean)throws Exception;
	
	public Feature find(String id)throws Exception;
	
	public int count(FeatureExample example)throws Exception;
	
	public List<Feature> select(FeatureExample example)throws Exception;
	
	public List<Feature> select(FeatureExample example, Page page)throws Exception;
	/**
	 * 根据层级返回数据，数据结构满足前端要求
	 * @param levelNo
	 * @return
	 * @throws Exception
	 */
	public List<Feature> selectDatas(Short levelNo)throws Exception;

	public List<Feature> selectDatas(String[] ids)throws Exception;
	
	public List<Feature> selectByParentId(String parentId, boolean includeChildren)throws Exception;
	
	public List<Feature> selectDatasByZone(String[] ids, String regionCode) throws Exception;
	
	public String getIdByZone(String parentId, String zone) throws Exception;
	
}
