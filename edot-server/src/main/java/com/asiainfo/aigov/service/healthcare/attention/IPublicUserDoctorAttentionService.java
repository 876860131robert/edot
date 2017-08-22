/**
 * IHospitalService.java	  V1.0   2017年4月17日 下午5:37:40
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.attention;

import java.math.BigDecimal;
import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.attention.PublicUserDoctorAttention;
import com.asiainfo.aigov.model.healthcare.attention.PublicUserDoctorAttentionExample;

public interface IPublicUserDoctorAttentionService {
	
	public int add(PublicUserDoctorAttention bean)throws Exception;
	
	public int update(PublicUserDoctorAttention bean)throws Exception;
	
	public PublicUserDoctorAttention find(String id)throws Exception;
	
	public int count(PublicUserDoctorAttentionExample example)throws Exception;
	
	public List<PublicUserDoctorAttention> select(PublicUserDoctorAttentionExample example)throws Exception;
	
	public List<PublicUserDoctorAttention> select(PublicUserDoctorAttentionExample example, Page page)throws Exception;
	
	public List<PublicUserDoctorAttention> getAttention(String userId,List<String> doctorList)throws Exception;
	
	public PublicUserDoctorAttention getAttention(String userId, String doctorId)throws Exception;

	public List<PublicUserDoctorAttention>  getAttention(String userId)throws Exception;
}
