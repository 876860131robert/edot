package com.asiainfo.aigov.service.edot.tklogin;

import com.asiainfo.aigov.model.edot.tklogin.LoginToken;

/** 
 * @Title        ILoginTokenSV.java
 * @Description: 用户登录的接口
 * @author:      Administrator
 * @date:        2017年8月3日下午4:27:43 
 *  
 */
public interface ILoginTokenSV {
	/**
	 * 保存
	 * @throws Exception
	 */
	public void saveEntity(LoginToken loginToke)throws Exception;
	
	/**
	 * 刷新令牌
	 * @param loginToke
	 * @param oldSessionId 旧的回话标识
	 * @throws Exception
	 */
	public boolean reloadToken(LoginToken loginToke,String oldSessionId)throws Exception;
	
	/**
	 * 根据用户、mac、旧的会话标识判断是不否登入
	 * @param userName 用户名
	 * @param mac mac地址
	 * @param oldSessionId 旧会话标识
	 * @return 已登入返回true，否则返回false;
	 * @throws Exception
	 */
	public boolean isLogin(String userName, String mac,String oldSessionId)throws Exception;
	
	/**
	 * 根据用户和mac判断是不否登入
	 * @param userName 用户名
	 * @param mac mac地址
	 * @return 已登入返回true，否则返回false;
	 * @throws Exception
	 */
	public boolean isLogin(String userName, String mac)throws Exception;
}
