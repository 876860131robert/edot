/**
 * HospitalServiceImp.java	  V1.0   2017年4月17日 下午5:38:04
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.attention.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.attention.PublicUserDoctorAttentionMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.attention.PublicUserDoctorAttention;
import com.asiainfo.aigov.model.healthcare.attention.PublicUserDoctorAttentionExample;
import com.asiainfo.aigov.service.healthcare.attention.IPublicUserDoctorAttentionService;
import com.asiainfo.frame.utils.IdUtils;

@Service
@Transactional
public class PublicUserDoctorAttentionServiceImpl implements IPublicUserDoctorAttentionService {
	@Autowired
	private PublicUserDoctorAttentionMapper publicUserDoctorAttentionMapper;

	@Override
	public int add(PublicUserDoctorAttention record)throws Exception{
		record.setId(IdUtils.uuid());
		return publicUserDoctorAttentionMapper.insert(record);
	}
	
	@Override
	public int update(PublicUserDoctorAttention record)throws Exception{
		return publicUserDoctorAttentionMapper.updateByPrimaryKey(record);
	}

	@Override
	public PublicUserDoctorAttention find(String id)throws Exception{
		return publicUserDoctorAttentionMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(PublicUserDoctorAttentionExample example)throws Exception{
		return publicUserDoctorAttentionMapper.countByExample(example);
	}
	
	@Override
	public List<PublicUserDoctorAttention> select(PublicUserDoctorAttentionExample example) {
		return publicUserDoctorAttentionMapper.selectByExample(example);
	}

	@Override
	public List<PublicUserDoctorAttention> select(PublicUserDoctorAttentionExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicUserDoctorAttentionMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
	public List<PublicUserDoctorAttention> getAttention(String userId,List<String> doctorList)throws Exception{
		PublicUserDoctorAttentionExample example=new PublicUserDoctorAttentionExample();
		PublicUserDoctorAttentionExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andDoctorIdIn(doctorList);
		criteria.andAttentionStatusEqualTo("0");
		return select(example);
	}

	public PublicUserDoctorAttention getAttention(String userId, String doctorId)throws Exception{
		PublicUserDoctorAttentionExample example=new PublicUserDoctorAttentionExample();
		PublicUserDoctorAttentionExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andDoctorIdEqualTo(doctorId);
		List<PublicUserDoctorAttention> PublicUserDoctorAttentionList=select(example);
		if(PublicUserDoctorAttentionList!=null && !PublicUserDoctorAttentionList.isEmpty()){
			return PublicUserDoctorAttentionList.get(0);
		}else{
			return null;
		}
	}
	public List<PublicUserDoctorAttention> getAttention(String userId)throws Exception{
		PublicUserDoctorAttentionExample example=new PublicUserDoctorAttentionExample();
		PublicUserDoctorAttentionExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andAttentionStatusEqualTo("0");
		List<PublicUserDoctorAttention> PublicUserDoctorAttentionList=select(example);
		return PublicUserDoctorAttentionList;
	}
}
