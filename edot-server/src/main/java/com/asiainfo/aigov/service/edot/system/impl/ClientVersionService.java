package com.asiainfo.aigov.service.edot.system.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.system.ClientVersion;
import com.asiainfo.aigov.model.edot.system.ClientVersionExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.system.IClientVersionService;

import com.asiainfo.aigov.dao.edot.system.ClientVersionMapper;
import com.asiainfo.frame.common.Constants;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.DBUtil;

/** 
 * @Title        ClientVersionService.java
 * @Description: 客户端版本的业务实现类
 * @author:      Administrator
 * @date:        2017年8月3日下午4:36:37 
 *  
 */
@Service
public class ClientVersionService extends BaseService implements IClientVersionService {

	@Autowired
	private ClientVersionMapper clientVersionMapper;
	
	@Override
	public int add(ClientVersion record)throws Exception{
		if(find(record.getOsName())!=null) throw new AIException("[操作系统名称]重复！");
		record.setRemoved(Constants.NO_CHAR);
		return clientVersionMapper.insert(record);
	}
	@Override
	public int delete(String[] ids)throws Exception{
		ClientVersionExample example = new ClientVersionExample();
		example.createCriteria().andOsNameIn(Arrays.asList(ids));
		return clientVersionMapper.deleteByExample(example);
	}
	
	@Override
	public int disable(String[] ids)throws Exception{
		if(ids==null || ids.length==0){
			throw new AIException("编号为空！");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update ED_CLIENT_VERSION set REMOVED='1' ");
		sb.append(" where OS_NAME in (");
		for (int i = 0; i < ids.length; i++) {
			sb.append("'").append(ids[i]).append("'");
			if(i<ids.length-1){
				sb.append(",");
			}
		}
		sb.append(" )");
		
		return DBUtil.executeUpdate(DBUtil.getConnection(), sb.toString(), null);
	}
	@Override
	public int enable(String[] ids)throws Exception{
		if(ids==null || ids.length==0){
			throw new AIException("编号为空！");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update ED_CLIENT_VERSION set REMOVED='0' ");
		sb.append(" where OS_NAME in (");
		for (int i = 0; i < ids.length; i++) {
			sb.append("'").append(ids[i]).append("'");
			if(i<ids.length-1){
				sb.append(",");
			}
		}
		sb.append(" )");
		
		return DBUtil.executeUpdate(DBUtil.getConnection(), sb.toString(), null);
	}
	
	@Override
	public int update(ClientVersion record)throws Exception{
		return clientVersionMapper.updateByPrimaryKey(record);
	}

	@Override
	public ClientVersion find(String id)throws Exception{
		return clientVersionMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(ClientVersionExample example)throws Exception{
		return clientVersionMapper.countByExample(example);
	}
	
	@Override
	public List<ClientVersion> select(ClientVersionExample example) {
		return clientVersionMapper.selectByExample(example);
	}

	@Override
	public List<ClientVersion> select(ClientVersionExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return clientVersionMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
}
