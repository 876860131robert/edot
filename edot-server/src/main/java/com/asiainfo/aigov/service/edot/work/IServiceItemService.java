package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IServiceItemService {
	
	public int add(ServiceItem bean)throws Exception;

	public int delete(String id)throws Exception;
	
	public int delete(String[] ids)throws Exception;

	public int update(ServiceItem bean, boolean withBLOBs)throws Exception;
	
	public ServiceItem find(String id)throws Exception;
	
	public int count(ServiceItemExample example)throws Exception;
	
	public List<ServiceItem> select(ServiceItemExample example)throws Exception;
	
	public List<ServiceItem> selectWithBLOBs(ServiceItemExample example)throws Exception;
	
	public List<ServiceItem> select(ServiceItemExample example, Page page)throws Exception;

	public void deleteAll()throws Exception;
	
	public boolean updateByRemote()throws Exception;
	
	public void deleteByDateBefore(String date)throws Exception;
}
