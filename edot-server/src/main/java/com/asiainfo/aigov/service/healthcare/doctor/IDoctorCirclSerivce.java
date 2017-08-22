package com.asiainfo.aigov.service.healthcare.doctor;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircle;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleVisual;
import com.asiainfo.frame.exception.AIException;

public interface IDoctorCirclSerivce {
	public List<?> selectCirclByUserVisual(String userId,Page page);

	public void add(PublicDoctorCircle doctorCircle, String type);

	public void like(String doctorCircleId);

	public PublicDoctorCircle find(String parentId);

	public List<?> select(PublicDoctorCircleExample example);


	public void delete(String[] strings) throws AIException;

	public void delReply(String doctorCircleId, String userId) throws Exception;

	public void add(PublicDoctorCircle doctorCircle,
			PublicDoctorCircleVisual[] doctorCircleVisual, String type);
	
	
	public List<PublicDoctorCircleVisual> selectVisualDoctor(String doctorCircleId);

}
