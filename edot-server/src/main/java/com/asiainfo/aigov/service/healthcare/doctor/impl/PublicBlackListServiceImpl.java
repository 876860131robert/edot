package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicBlacklistMapper;
import com.asiainfo.aigov.model.healthcare.doctor.PublicBlacklist;
import com.asiainfo.aigov.model.healthcare.doctor.PublicBlacklistExample;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicBlackListService;

@Service
@Transactional
public class PublicBlackListServiceImpl implements IPublicBlackListService {
	@Autowired
	PublicBlacklistMapper blacklistMapper;

	@Override
	public int save(PublicBlacklist bean) throws Exception {
		String blacklistId=bean.getBlacklistId();
		BigDecimal hospitalId=bean.getHospitalId();
		PublicBlacklist publicBlacklist = find(blacklistId,hospitalId );
		if(publicBlacklist!=null){
			PublicBlacklistExample example=new PublicBlacklistExample();
			PublicBlacklistExample.Criteria criteria= example.createCriteria();
			criteria.andBlacklistIdEqualTo(blacklistId);
			criteria.andHospitalIdEqualTo(hospitalId);
			bean.setId(publicBlacklist.getId());
			return blacklistMapper.updateByExample(bean, example);
		}else{
			return blacklistMapper.insert(bean);
		}
	}
	
	public PublicBlacklist find(String blacklistId,BigDecimal hospitalId)throws Exception{
		PublicBlacklist publicBlacklist=null;
		PublicBlacklistExample example=new PublicBlacklistExample();
		PublicBlacklistExample.Criteria criteria= example.createCriteria();
		criteria.andBlacklistIdEqualTo(blacklistId);
		criteria.andHospitalIdEqualTo(hospitalId);
		List<PublicBlacklist> list=blacklistMapper.selectByExample(example);
		if(list!=null && !list.isEmpty()){
			publicBlacklist=list.get(0);
		}
		return publicBlacklist;
	}
}
