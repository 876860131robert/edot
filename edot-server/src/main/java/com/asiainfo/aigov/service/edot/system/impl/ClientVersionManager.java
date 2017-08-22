package com.asiainfo.aigov.service.edot.system.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.edot.system.ClientVersion;
import com.asiainfo.aigov.model.edot.system.ClientVersionExample;
import com.asiainfo.aigov.service.edot.system.IClientVersionService;
import com.asiainfo.frame.utils.ApplicationContextUtil;
import com.asiainfo.frame.utils.JRedisMap;

/**
 * 
 * @author songxiaoliang
 *
 */
public class ClientVersionManager{
	private static Logger logger = Logger.getLogger(ClientVersionManager.class);
	private static ClientVersionManager instance = new ClientVersionManager();

	private Map<String, ClientVersion> clientMap = null;
	
	private ClientVersionManager() {
		try {
			clientMap = new JRedisMap("ClientVersion");
			load();
			print();
		} catch (Exception e) {
			logger.error("加载客户端记录失败", e);
		}
	}

	public static ClientVersionManager getInstance() {
		return instance;
	}

	public void load()throws Exception{
		IClientVersionService clientVersionService = ApplicationContextUtil.getInstance().getBean(IClientVersionService.class);
		List<ClientVersion> list = clientVersionService.select(new ClientVersionExample());
		if(list!=null){
			for (ClientVersion clientVersion : list) {
				clientMap.put(clientVersion.getOsName(), clientVersion);
			}
		}
	}
	
	public void reload()throws Exception{
		clientMap.clear();
		load();
	}
	
	public ClientVersion getClientVersion(String osn){
		return clientMap.get(osn);
	}
	
	public List<ClientVersion> selectAll(){
		List<ClientVersion> list = new ArrayList<ClientVersion>();
		for(Map.Entry<String, ClientVersion> entry: clientMap.entrySet()){
			list.add(entry.getValue());
		}
		return list;
	}
	
	public void print(){
		for(Map.Entry<String, ClientVersion> entry: clientMap.entrySet()){
			logger.info(JSONObject.toJSONString(entry.getValue()));
		}
	}
}
