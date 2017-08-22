/**
 * HospitalServiceImp.java	  V1.0   2017年4月17日 下午5:38:04
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicHospitalMapper;
import com.asiainfo.aigov.dao.healthcare.doctor.PublicOfficeMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospitalExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOfficeExample;
import com.asiainfo.aigov.model.healthcare.user.PublicUser;
import com.asiainfo.aigov.model.healthcare.user.PublicUserExample;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
	@Autowired
	private PublicHospitalMapper hospitalMapper;
	@Autowired
	private PublicOfficeMapper officeMapper;
	
	@Override
	public int add(PublicHospital bean)throws Exception{
		return hospitalMapper.insert(bean);
	}
	
	@Override
	public int update(PublicHospital bean)throws Exception{
		return hospitalMapper.updateByPrimaryKeySelective(bean);
	}
	
	@Override
	public int save(PublicHospital bean)throws Exception{
		PublicHospital hospital=hospitalMapper.selectByPrimaryKey(bean.getHospitalId());
		if(hospital!=null){
			return hospitalMapper.updateByPrimaryKeySelective(bean);
		}else{
			return hospitalMapper.insert(bean);
		}
		
	}
	@Override
	public PublicHospital getPublicHospital(Long hospitalId) throws Exception {
		return hospitalMapper.selectByPrimaryKey(BigDecimal.valueOf(hospitalId));
	}

	@Override
	public PublicOffice getPublicOffice(Long officeId) throws Exception {
		return officeMapper.selectByPrimaryKey(BigDecimal.valueOf(officeId));
	}
	
	@Override
	public List<PublicHospital> select(PublicHospitalExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return hospitalMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
	@Override
	public int count(PublicHospitalExample example)throws Exception{
		return hospitalMapper.countByExample(example);
	}
	
	public PublicOffice getPublicOffice(String officeCode, Long hospitalId) throws Exception {
		PublicOfficeExample example = new PublicOfficeExample();
		PublicOfficeExample.Criteria cr = example.createCriteria();
		cr.andCodeEqualTo(officeCode);
		cr.andHospitalIdEqualTo(BigDecimal.valueOf(hospitalId));
		List<PublicOffice> list = officeMapper.selectByExample(example);
		if(list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
}
