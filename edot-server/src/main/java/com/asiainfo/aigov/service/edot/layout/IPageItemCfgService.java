package com.asiainfo.aigov.service.edot.layout;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.layout.PageItemCfg;
import com.asiainfo.aigov.model.edot.layout.PageItemCfgExample;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IPageItemCfgService {
	
	public int add(PageItemCfg bean)throws Exception;
	
	public int count(PageItemCfgExample example)throws Exception;
	
	public List<PageItemCfg> select(PageItemCfgExample example)throws Exception;
	
	public List<PageItemCfg> select(PageItemCfgExample example, Page page)throws Exception;

	public List<PageItemCfg> selectByWorkCode(String workCode)throws Exception;
	
}
