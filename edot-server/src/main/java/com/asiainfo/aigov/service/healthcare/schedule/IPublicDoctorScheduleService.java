package com.asiainfo.aigov.service.healthcare.schedule;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.schedule.PublicDoctorSchedule;
import com.asiainfo.aigov.model.healthcare.schedule.PublicDoctorScheduleExample;
/**
 * 
 * @author 柯永锥
 *
 */
public interface IPublicDoctorScheduleService {
	
	public int add(PublicDoctorSchedule bean)throws Exception;
	
	public int update(PublicDoctorSchedule bean)throws Exception;
	
	public int save(PublicDoctorSchedule bean)throws Exception;
	
	public PublicDoctorSchedule find(String hospitalId,String scheduleId)throws Exception;
	
	public int count(PublicDoctorScheduleExample example)throws Exception;
	
	public List<PublicDoctorSchedule> select(PublicDoctorScheduleExample example)throws Exception;
	
	public List<PublicDoctorSchedule> select(PublicDoctorScheduleExample example, Page page)throws Exception;

	public List<PublicDoctorSchedule> getServiceByDoctor(String hospitalId,String deptCode,List<String> doctorCodeList,String startDate,String endDate)throws Exception;

	public List<PublicDoctorSchedule> getServiceByDoctor(String hospitalId, String deptCode,String doctorCode,String hbDate) throws Exception;
}
