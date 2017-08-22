package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.BusinessClassExample;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IBusinessClassService {
	
	public int add(BusinessClass bean)throws Exception;

	public int delete(String id)throws Exception;
	
	public int delete(String[] ids)throws Exception;

	public int update(BusinessClass bean)throws Exception;
	
	public BusinessClass find(String id)throws Exception;
	
	public int count(BusinessClassExample example)throws Exception;
	
	public List<BusinessClass> select(BusinessClassExample example)throws Exception;
	
	public List<BusinessClass> select(BusinessClassExample example, Page page)throws Exception;

	public void deleteAll()throws Exception;
	
	public boolean updateByRemote()throws Exception;
}
