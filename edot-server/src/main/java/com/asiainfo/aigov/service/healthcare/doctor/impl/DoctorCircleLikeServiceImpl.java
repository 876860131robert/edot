package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicDoctorCircleLikeMapper;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLike;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLikeExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleLike;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleLikeExample;
import com.asiainfo.aigov.service.healthcare.doctor.IDoctorCircleLikeService;

@Service
@Transactional
public class DoctorCircleLikeServiceImpl implements IDoctorCircleLikeService {

	@Autowired
	PublicDoctorCircleLikeMapper doctorCircleLikeMapper;
	
	@Override
	public void saveEntity(PublicDoctorCircleLike doctorCircleLike)
			throws Exception {
		doctorCircleLikeMapper.insert(doctorCircleLike);

	}

	@Override
	public PublicDoctorCircleLike findEntity(String doctorCircleId, String mac)
			throws Exception {
		PublicDoctorCircleLike doctorCircleLike=null;
		PublicDoctorCircleLikeExample example=new PublicDoctorCircleLikeExample();
		PublicDoctorCircleLikeExample.Criteria  criteria =example.createCriteria();
		criteria.andDoctorCircleIdEqualTo(doctorCircleId);
		criteria.andLikeMacEqualTo(mac);
		
		List<PublicDoctorCircleLike> cityVoiceLikeList=doctorCircleLikeMapper.selectByExample(example);
		
		if(cityVoiceLikeList!=null && !cityVoiceLikeList.isEmpty()){
			doctorCircleLike=cityVoiceLikeList.get(0);
		}
		return doctorCircleLike;
	}

}
