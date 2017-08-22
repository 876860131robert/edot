package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.MaterialExample;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IMaterialService {
	
	public int add(Material bean)throws Exception;

	public int update(Material bean, boolean withBLOBs)throws Exception;
	
	public Material find(String mateno)throws Exception;
	
	public int count(MaterialExample example)throws Exception;
	
	public List<Material> select(MaterialExample example)throws Exception;
	
	public List<Material> select(MaterialExample example, Page page)throws Exception;

	public void deleteAll()throws Exception;
	
	public void deleteByServcode(String servcode)throws Exception;
	
	public boolean updateByRemote()throws Exception;
	
	public void deleteByDateBefore(String date)throws Exception;
}
