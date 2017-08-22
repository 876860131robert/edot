package com.asiainfo.aigov.service.healthcare.user.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.user.PublicUser;
import com.asiainfo.aigov.model.healthcare.user.PublicUserExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.healthcare.user.IPublicUserService;
import com.asiainfo.frame.utils.IdUtils;
import com.asiainfo.aigov.dao.healthcare.user.PublicUserMapper;
/**
 * 
 * @author 柯永锥
 *
 */
@Service
public class PublicUserService extends BaseService implements IPublicUserService {

	@Autowired
	private PublicUserMapper publicUserMapper;

	@Override
	public int add(PublicUser record)throws Exception{
		record.setUserId(IdUtils.uuid());
		return publicUserMapper.insert(record);
	}
	
	@Override
	public int update(PublicUser record)throws Exception{
		return publicUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public PublicUser find(String id)throws Exception{
		return publicUserMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(PublicUserExample example)throws Exception{
		return publicUserMapper.countByExample(example);
	}
	
	@Override
	public List<PublicUser> select(PublicUserExample example) {
		return publicUserMapper.selectByExample(example);
	}

	@Override
	public List<PublicUser> select(PublicUserExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicUserMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public boolean isRegisterUser(String userName, String userType) throws Exception {
		PublicUserExample e=new PublicUserExample();
		PublicUserExample.Criteria criteria= e.createCriteria();
		criteria.andUserNameEqualTo(userName);
		criteria.andUserTypeEqualTo(userType);
		int index=count(e);
		if(index>0){
			return true;
		}
		return false;
	}
	
	@Override
	public PublicUser getPublicUserByUserName(String userName,String userType)throws Exception{
		PublicUserExample e=new PublicUserExample();
		PublicUserExample.Criteria criteria= e.createCriteria();
		criteria.andUserNameEqualTo(userName);
		criteria.andUserTypeEqualTo(userType);
		List<PublicUser>  userList=select(e);
		if(userList!=null && !userList.isEmpty()){
			return userList.get(0);
		}
		return null;
	}

	
}
