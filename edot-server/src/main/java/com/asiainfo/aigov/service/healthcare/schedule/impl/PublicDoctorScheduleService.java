package com.asiainfo.aigov.service.healthcare.schedule.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.healthcare.schedule.PublicDoctorScheduleMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.schedule.PublicDoctorSchedule;
import com.asiainfo.aigov.model.healthcare.schedule.PublicDoctorScheduleExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.healthcare.schedule.IPublicDoctorScheduleService;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.IdUtils;
/**
 * 
 * @author 柯永锥
 *
 */
@Service
public class PublicDoctorScheduleService extends BaseService implements IPublicDoctorScheduleService {

	@Autowired
	private PublicDoctorScheduleMapper publicUserMapper;

	@Override
	public int add(PublicDoctorSchedule record)throws Exception{
		record.setScheduleId(IdUtils.uuid());
		return publicUserMapper.insert(record);
	}
	
	@Override
	public int save(PublicDoctorSchedule bean)throws Exception{
		PublicDoctorSchedule schedule =find(bean.getHospitalId(),bean.getScheduleId());
		if(schedule!=null){
			return publicUserMapper.updateByPrimaryKey(bean);
		}else{
			return publicUserMapper.insert(bean);
			
		}
	}
	
	@Override
	public int update(PublicDoctorSchedule record)throws Exception{
		return publicUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public PublicDoctorSchedule find(String hospitalId,String scheduleId)throws Exception{
		return publicUserMapper.selectByPrimaryKey(hospitalId, scheduleId);
	}
	
	@Override
	public int count(PublicDoctorScheduleExample example)throws Exception{
		return publicUserMapper.countByExample(example);
	}
	
	@Override
	public List<PublicDoctorSchedule> select(PublicDoctorScheduleExample example) {
		return publicUserMapper.selectByExample(example);
	}

	@Override
	public List<PublicDoctorSchedule> select(PublicDoctorScheduleExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicUserMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public List<PublicDoctorSchedule> getServiceByDoctor(String hospitalId, String deptCode, List<String> doctorCodeList,String startDate,String endDate)
			throws Exception {
		PublicDoctorScheduleExample example =new PublicDoctorScheduleExample();
		PublicDoctorScheduleExample.Criteria criteria= example.createCriteria();
		criteria.andHospitalIdEqualTo(hospitalId);
		criteria.andDeptCodeEqualTo(deptCode);
		criteria.andDoctorCodeIn(doctorCodeList);
		criteria.andHbDateBetween(DateUtils.getDate(startDate, "yyyy-MM-dd"), DateUtils.getDate(endDate, "yyyy-MM-dd"));
		return select(example);
	}
	
	@Override
	public List<PublicDoctorSchedule> getServiceByDoctor(String hospitalId, String deptCode,String doctorCode,String hbDate)
			throws Exception {
		PublicDoctorScheduleExample example =new PublicDoctorScheduleExample();
		PublicDoctorScheduleExample.Criteria criteria= example.createCriteria();
		criteria.andHospitalIdEqualTo(hospitalId);
		criteria.andDeptCodeEqualTo(deptCode);
		criteria.andDoctorCodeEqualTo(doctorCode);
		criteria.andHbDateEqualTo(DateUtils.getDate(hbDate, "yyyy-MM-dd"));
		return select(example);
	}
	
	
	
}
