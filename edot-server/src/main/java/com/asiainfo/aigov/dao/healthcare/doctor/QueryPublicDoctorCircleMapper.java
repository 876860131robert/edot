package com.asiainfo.aigov.dao.healthcare.doctor;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircle;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleExample;

public interface QueryPublicDoctorCircleMapper {
	
	 List<?> selectCirclByUserVisual(@Param(value="userId")String userId, Page page);
	 
	 List<?> selectByExampleWithRowbounds(PublicDoctorCircleExample example, RowBounds rowBounds);

	 
	 List<?> selectByExample(PublicDoctorCircleExample example);


}
