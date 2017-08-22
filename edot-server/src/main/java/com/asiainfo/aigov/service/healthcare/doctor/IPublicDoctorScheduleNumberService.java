/**
 * IHospitalService.java	  V1.0   2017年4月17日 下午5:37:40
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.doctor;

import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorScheduleNumber;

public interface IPublicDoctorScheduleNumberService {
	
	
	public int save(PublicDoctorScheduleNumber bean)throws Exception;


}
