/**
 * DoctorNoticeServiceImpl.java	  V1.0   2017年4月20日 下午3:23:20
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicDoctorNoticeMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorNotice;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorNoticeExample;
import com.asiainfo.aigov.service.healthcare.doctor.IDoctorNoticeService;

@Service
@Transactional
public class DoctorNoticeServiceImpl implements IDoctorNoticeService {
	
	@Autowired
	private PublicDoctorNoticeMapper doctorNoticeMapper;

	@Override
	public List<PublicDoctorNotice> queryDoctorNoticePublish(Page page) throws Exception {
		PublicDoctorNoticeExample example = new PublicDoctorNoticeExample();
		PublicDoctorNoticeExample.Criteria cr = example.createCriteria();
		cr.andNoticeStatusEqualTo("1");
		example.setOrderByClause("LAST_DEPLOY_TIME DESC");
		return doctorNoticeMapper.selectByExampleWithRowbounds(example, page);
	}

	@Override
	public PublicDoctorNotice getDoctorNoticeByPK(String noticeId) throws Exception {
		return doctorNoticeMapper.selectByPrimaryKey(noticeId);
	}

}
