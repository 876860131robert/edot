package com.asiainfo.aigov.service.healthcare.doctor.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicDoctorScheduleNumberMapper;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorScheduleNumber;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorScheduleNumberService;

@Service
@Transactional
public class PublicDoctorScheduleNumberServiceImpl implements IPublicDoctorScheduleNumberService {
	@Autowired
	PublicDoctorScheduleNumberMapper scheduleNumberMapper;

	@Override
	public int save(PublicDoctorScheduleNumber bean) throws Exception {
		PublicDoctorScheduleNumber scheduleNumber = scheduleNumberMapper
				.selectByPrimaryKey(bean.getHospitalId(), bean.getScheduleId(), bean.getHid());
		if(scheduleNumber!=null){
			return scheduleNumberMapper.updateByPrimaryKey(bean);
		}else{
			return scheduleNumberMapper.insert(bean);
		}
	}

}
