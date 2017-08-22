package com.asiainfo.aigov.service.healthcare.guidance;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.user.PublicUser;
import com.asiainfo.aigov.model.healthcare.user.PublicUserExample;
/**
 * 
 * @author 柯永锥
 *
 */
public interface IPublicUserService {
	
	public int add(PublicUser bean)throws Exception;
	
	public int update(PublicUser bean)throws Exception;
	
	public PublicUser find(String id)throws Exception;
	
	public int count(PublicUserExample example)throws Exception;
	
	public List<PublicUser> select(PublicUserExample example)throws Exception;
	
	public List<PublicUser> select(PublicUserExample example, Page page)throws Exception;
	
	public boolean isRegisterUser(String userName,String userType)throws Exception;
	
	public PublicUser getPublicUserByUserName(String userName,String userType)throws Exception;

}
