package com.asiainfo.aigov.service.edot.hotLine.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.hotLine.CityVoiceLikeMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLike;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLikeExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.hotLine.ICityVoiceLikeService;
import com.asiainfo.frame.bo.IUser;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.DBUtil;
import com.asiainfo.frame.utils.IdUtils;

@Service
@Transactional
public class CityVoiceLikeSVImpl extends BaseService implements ICityVoiceLikeService{
	private static Logger log = Logger.getLogger(CityVoiceLikeSVImpl.class);
	
	@Autowired
	private CityVoiceLikeMapper cityVoiceLikeMapper;
	
	@Override
	public void saveEntity(CityVoiceLike cityVoiceLike) throws Exception {
		cityVoiceLikeMapper.insert(cityVoiceLike);
	}

	@Override
	public CityVoiceLike findEntity(String cityVoiceId,String mac) throws Exception {
		CityVoiceLike cityVoiceLike=null;
		CityVoiceLikeExample example=new CityVoiceLikeExample();
		CityVoiceLikeExample.Criteria  criteria =example.createCriteria();
		criteria.andCityVoiceIdEqualTo(cityVoiceId);
		criteria.andLikeMacEqualTo(mac);
		List<CityVoiceLike> cityVoiceLikeList=cityVoiceLikeMapper.selectByExample(example);
		
		if(cityVoiceLikeList!=null && !cityVoiceLikeList.isEmpty()){
			cityVoiceLike=cityVoiceLikeList.get(0);
		}
		return cityVoiceLike;
	}

}
