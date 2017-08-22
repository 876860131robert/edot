package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.model.edot.work.WorkDeptExample;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IWorkDeptService {
	
	public int add(WorkDept bean)throws Exception;

	public int delete(String id)throws Exception;
	
	public int delete(String[] ids)throws Exception;

	public int update(WorkDept bean)throws Exception;
	
	public WorkDept find(String id)throws Exception;
	
	public int count(WorkDeptExample example)throws Exception;
	
	public List<WorkDept> select(WorkDeptExample example)throws Exception;
	
	public List<WorkDept> select(WorkDeptExample example, Page page)throws Exception;

	public void deleteAll()throws Exception;
	
	public boolean updateByRemote()throws Exception;
}
