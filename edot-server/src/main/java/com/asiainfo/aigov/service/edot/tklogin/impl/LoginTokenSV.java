package com.asiainfo.aigov.service.edot.tklogin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.tklogin.LoginTokenMapper;
import com.asiainfo.aigov.model.edot.tklogin.LoginToken;
import com.asiainfo.aigov.model.edot.tklogin.LoginTokenExample;
import com.asiainfo.aigov.service.edot.tklogin.ILoginTokenSV;

/** 
 * @Title        LoginTokenSV.java
 * @Description: 用户登录接口的实现类
 * @author:      Administrator
 * @date:        2017年8月3日下午4:28:30 
 *  
 */
@Service
public class LoginTokenSV implements ILoginTokenSV{
	
	@Autowired
	private LoginTokenMapper loginTokenMapper; 
	/**
	 * 保存
	 * @throws Exception
	 */
	public void saveEntity(LoginToken loginToke)throws Exception{
		String username=loginToke.getUserName();
		String mac=loginToke.getMac();
		if(isLogin(username,mac)){
			
			LoginTokenExample example=new LoginTokenExample();
			LoginTokenExample.Criteria criteria= example.createCriteria();
			criteria.andMacEqualTo(mac);
			criteria.andUserNameEqualTo(username);
			loginTokenMapper.updateByExample(loginToke, example);
		}else{
			loginTokenMapper.insert(loginToke);
		}
	}
	
	/**
	 * 刷新令牌
	 * @param loginToke
	 * @param oldSessionId 旧的回话标识
	 * @throws Exception
	 */
	public boolean reloadToken(LoginToken loginToke,String oldSessionId)throws Exception{
		boolean flag=false;
		String username=loginToke.getUserName();
		String mac=loginToke.getMac();
		if(isLogin(username, mac, oldSessionId) ){
			flag=true;
		}
		return flag;
	}
	
	/**
	 * 根据用户和mac得到对象
	 * @param userName 用户名
	 * @param mac mac地址
	 * @return 存在返回LoginToken，否则返回null
	 * @throws Exception
	 */
	public LoginToken getEntity(String userName, String mac)throws Exception{
		LoginToken loginToken=null;
		LoginTokenExample example=new LoginTokenExample();
		LoginTokenExample.Criteria criteria= example.createCriteria();
		criteria.andMacEqualTo(mac);
		criteria.andUserNameEqualTo(userName);
		List<LoginToken> list=loginTokenMapper.selectByExample(example);
		if(list!=null && !list.isEmpty()){
			loginToken=list.get(0);
		}		
		return loginToken;
	}
	
	/**
	 * 根据用户和mac和旧的回话判断是否登入
	 * @param userName 用户名
	 * @param mac mac地址
	 * @param oldSessionId 旧的回话id
	 * @return 已登入返回true，否则返回false;
	 * @throws Exception
	 */
	public boolean isLogin(String userName, String mac,String oldSessionId)throws Exception{
		boolean flag=false;
		LoginTokenExample example=new LoginTokenExample();
		LoginTokenExample.Criteria criteria= example.createCriteria();
		criteria.andMacEqualTo(mac);
		criteria.andUserNameEqualTo(userName);
		criteria.andSessionIdEqualTo(oldSessionId);
		int tcount=loginTokenMapper.countByExample(example);
		if(tcount>0){
			flag=true;
		}
		return flag;
	}
	
	/**
	 * 根据用户和mac判断是否登入
	 * @param userName 用户名
	 * @param mac mac地址
	 * @return 已登入返回true，否则返回false;
	 * @throws Exception
	 */
	public boolean isLogin(String userName, String mac)throws Exception{
		boolean flag=false;
		LoginTokenExample example=new LoginTokenExample();
		LoginTokenExample.Criteria criteria= example.createCriteria();
		criteria.andMacEqualTo(mac);
		criteria.andUserNameEqualTo(userName);
		int tcount=loginTokenMapper.countByExample(example);
		if(tcount>0){
			flag=true;
		}
		return flag;
	}
}
