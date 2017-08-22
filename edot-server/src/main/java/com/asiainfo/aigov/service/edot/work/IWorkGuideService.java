package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.WorkGuide;
import com.asiainfo.aigov.model.edot.work.WorkGuideExample;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IWorkGuideService {
	
	public int add(WorkGuide bean)throws Exception;

	public int delete(String id)throws Exception;
	
	public int delete(String[] ids)throws Exception;

	public int update(WorkGuide bean)throws Exception;
	
	public WorkGuide find(String id)throws Exception;
	
	public int count(WorkGuideExample example)throws Exception;
	
	public List<WorkGuide> select(WorkGuideExample example)throws Exception;
	
	public List<WorkGuide> select(WorkGuideExample example, Page page)throws Exception;
	
}
