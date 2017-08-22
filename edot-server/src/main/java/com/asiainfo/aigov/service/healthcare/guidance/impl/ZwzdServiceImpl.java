/**
 * ZwzdServiceImpl.java	  V1.0   2017年5月2日 下午4:47:54
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.guidance.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.guidance.ZwzdDiseaseMapper;
import com.asiainfo.aigov.dao.healthcare.guidance.ZwzdPartyJibingMapper;
import com.asiainfo.aigov.dao.healthcare.guidance.ZwzdPartyJibingQuestMapper;
import com.asiainfo.aigov.dao.healthcare.guidance.ZwzdPartyMapper;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdDisease;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdParty;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibing;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibingExample;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibingQuest;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibingQuestExample;
import com.asiainfo.aigov.service.healthcare.guidance.IZwzdService;

@Service
@Transactional
public class ZwzdServiceImpl implements IZwzdService {
	@Autowired
	private ZwzdPartyMapper partyMapper;
	@Autowired
	private ZwzdPartyJibingMapper partyJibingMapper;
	@Autowired
	private ZwzdPartyJibingQuestMapper partyJibingQuestMapper;
	@Autowired
	private ZwzdDiseaseMapper diseaseMapper;

	@Override
	public List<ZwzdParty> queryZwzdParty() throws Exception {
		return partyMapper.selectByExample(null);
	}
	
	@Override
	public ZwzdParty getZwzdParty(Long partyid) throws Exception {
		return partyMapper.selectByPrimaryKey(BigDecimal.valueOf(partyid));
	}

	@Override
	public List<ZwzdPartyJibing> queryZwzdPartyJbing(Long partyid, Long sex) throws Exception {
		ZwzdPartyJibingExample example = new ZwzdPartyJibingExample();
		ZwzdPartyJibingExample.Criteria cr = example.createCriteria();
		cr.andSexEqualTo(BigDecimal.valueOf(sex));
		cr.andPartyidEqualTo(BigDecimal.valueOf(partyid));
		return partyJibingMapper.selectByExample(example);
	}

	@Override
	public ZwzdPartyJibingQuest findPartyJibingFirstQuestion(Long jibingcode) throws Exception {
		ZwzdPartyJibingQuestExample example = new ZwzdPartyJibingQuestExample();
		ZwzdPartyJibingQuestExample.Criteria cr = example.createCriteria();
		cr.andPatientAnswerEqualTo("-1");
		cr.andJibingcodeEqualTo(BigDecimal.valueOf(jibingcode));
		List<ZwzdPartyJibingQuest> list = partyJibingQuestMapper.selectByExample(example);
		if(null!=list && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public ZwzdPartyJibingQuest findPartyJibingNextQuestion(Long jibingcode, String nextQuestId, String parentAnswer) throws Exception {
		ZwzdPartyJibingQuestExample example = new ZwzdPartyJibingQuestExample();
		ZwzdPartyJibingQuestExample.Criteria cr = example.createCriteria();
		cr.andPatientAnswerEqualTo(parentAnswer);
		cr.andQuestIdEqualTo(nextQuestId);
		cr.andJibingcodeEqualTo(BigDecimal.valueOf(jibingcode));
		List<ZwzdPartyJibingQuest> list = partyJibingQuestMapper.selectByExample(example);
		if(null!=list && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public ZwzdDisease getZwzdDisease(String diseaseid) throws Exception {
		return diseaseMapper.selectByPrimaryKey(diseaseid);
	}

}
