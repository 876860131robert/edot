package com.asiainfo.aigov.service.healthcare.doctor;

import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLike;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleLike;

public interface IDoctorCircleLikeService {
	
	
	public void saveEntity(PublicDoctorCircleLike doctorCircleLike) throws Exception;
	
	public PublicDoctorCircleLike findEntity(String doctorCircleId,String mac) throws Exception;
}
