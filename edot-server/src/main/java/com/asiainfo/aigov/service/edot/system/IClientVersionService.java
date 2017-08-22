package com.asiainfo.aigov.service.edot.system;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.system.ClientVersion;
import com.asiainfo.aigov.model.edot.system.ClientVersionExample;

/** 
 * @Title        IClientVersionService.java
 * @Description: 客户端版本的接口层
 * @author:      Administrator
 * @date:        2017年8月3日下午4:34:08 
 *  
 */
public interface IClientVersionService {
	
	/**
	 * 新增
	 * 
	 * @param bean
	 * @return
	 * @throws Exception
	 */
	public int add(ClientVersion bean)throws Exception;
	
	/**
	 * 删除
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public int delete(String[] ids)throws Exception;
	
	/**
	 * 作废
	 * 
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public int disable(String[] ids)throws Exception;
	
	/**
	 * 激活
	 * 
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public int enable(String[] ids)throws Exception;
	
	/**
	 * 更新
	 * 
	 * @param bean
	 * @return
	 * @throws Exception
	 */
	public int update(ClientVersion bean)throws Exception;
	
	public ClientVersion find(String id)throws Exception;
	
	public int count(ClientVersionExample example)throws Exception;
	
	public List<ClientVersion> select(ClientVersionExample example)throws Exception;
	
	public List<ClientVersion> select(ClientVersionExample example, Page page)throws Exception;

}
