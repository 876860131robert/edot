package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.common.util.MD5Util;
import com.asiainfo.aigov.dao.healthcare.doctor.PublicDoctorMapper;
import com.asiainfo.aigov.dao.healthcare.user.PublicUserMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorExample;
import com.asiainfo.aigov.model.healthcare.user.PublicUser;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;

@Service
@Transactional
public class PublicDoctorServiceImpl implements IPublicDoctorService {

	@Autowired
	private PublicDoctorMapper publicDoctorMapper;
	@Autowired
	private PublicUserMapper publicUserMapper;
	
	public int save(PublicDoctor bean)throws Exception{
		PublicDoctor doctor=getDoctor(bean.getDoctorCode(),bean.getHospitalId());
		if(doctor!=null){
			bean.setDoctorId(doctor.getDoctorId());
			PublicDoctorExample example=new PublicDoctorExample();
			PublicDoctorExample.Criteria criteria =example.createCriteria();
			criteria.andDoctorCodeEqualTo(bean.getDoctorCode());
			criteria.andHospitalIdEqualTo(bean.getHospitalId());
			return publicDoctorMapper.updateByExample(bean, example);
		}else{
			return publicDoctorMapper.insert(bean);
		}
	}
	
	@Override
	public PublicDoctor find(String doctorId) throws Exception {
		
		return publicDoctorMapper.selectByPrimaryKey(doctorId);
	}
	
	@Override
	public List<PublicDoctor> select(PublicDoctorExample example, Page page)
			throws Exception {
		return publicDoctorMapper.selectByExampleWithRowbounds(example, page);
	}

	@Override
	public void resetPwd(String userId, String pwd) throws Exception {
		PublicUser user = new PublicUser();
		user.setUserId(userId);
		user.setPasswd(MD5Util.getMD5Str(pwd));
		publicUserMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public PublicDoctor updateDoctor(PublicDoctor doctor) throws Exception {
		//PublicDoctor old = publicDoctorMapper.selectByPrimaryKey(doctor.getDoctorId());
		PublicDoctor record = new PublicDoctor();
		record.setDoctorId(doctor.getDoctorId());
		if(StringUtils.isNotBlank(doctor.getName())) {
			record.setName(doctor.getName());
		}
		if(StringUtils.isNotBlank(doctor.getSexCode())) {
			record.setSexCode(doctor.getSexCode());
		}
		if(StringUtils.isNotBlank(doctor.getMobile())) {
			record.setMobile(doctor.getMobile());
		}
		if(StringUtils.isNotBlank(doctor.getSpecaility())) {
			record.setSpecaility(doctor.getSpecaility());
		}
		if(StringUtils.isNotBlank(doctor.getPersonalIntroduce())) {
			record.setPersonalIntroduce(doctor.getPersonalIntroduce());
		}
		publicDoctorMapper.updateByPrimaryKeySelective(record);
		return doctor;
	}

	@Override
	public void settingService(String doctorId, String serviceType, String flag) throws Exception {
		PublicDoctor doctor = new PublicDoctor();
		doctor.setDoctorId(doctorId);
		if("ONLINE".equals(serviceType)) {
			doctor.setOnlineZxFlag(flag);
		} else {
			doctor.setPhoneZxFlag(flag);
		}
		publicDoctorMapper.updateByPrimaryKeySelective(doctor);
	}
	
	@Override
	public List<PublicDoctor> getDoctorByOfficeCode(String hospitalId,String officeCode)throws Exception{
		PublicDoctorExample example=new PublicDoctorExample();
		PublicDoctorExample.Criteria criteria =example.createCriteria();
		criteria.andOfficeCodeEqualTo(officeCode);
		criteria.andHospitalIdEqualTo(new BigDecimal(hospitalId));
		return publicDoctorMapper.selectByExample(example);
	}

	@Override
	public List<PublicDoctor> getDoctorList(List<String> doctorIds) throws Exception {
		PublicDoctorExample example=new PublicDoctorExample();
		PublicDoctorExample.Criteria criteria =example.createCriteria();
		criteria.andDoctorIdIn(doctorIds);
		return publicDoctorMapper.selectByExample(example);
	}
	
	public PublicDoctor getDoctor(String doctorCode,BigDecimal hospitalId) throws Exception{
		PublicDoctor publicDoctor=null;
		PublicDoctorExample example=new PublicDoctorExample();
		PublicDoctorExample.Criteria criteria =example.createCriteria();
		criteria.andDoctorCodeEqualTo(doctorCode);
		criteria.andHospitalIdEqualTo(hospitalId);
		List<PublicDoctor> publicDoctorList= publicDoctorMapper.selectByExample(example);
		if(!publicDoctorList.isEmpty()){
			publicDoctor=publicDoctorList.get(0);
		}
		return publicDoctor;
	}

}
