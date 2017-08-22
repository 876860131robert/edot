package com.asiainfo.aigov.service.healthcare.evaluate.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.healthcare.evaluate.PublicEvaluateMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.evaluate.PublicEvaluate;
import com.asiainfo.aigov.model.healthcare.evaluate.PublicEvaluateExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.healthcare.evaluate.IPublicEvaluateService;
import com.asiainfo.frame.utils.IdUtils;
/**
 * 
 * @author 柯永锥
 *
 */
@Service
public class PublicEvaluateService extends BaseService implements IPublicEvaluateService {

	@Autowired
	private PublicEvaluateMapper publicEvaluateMapper;

	@Override
	public int add(PublicEvaluate record)throws Exception{
		record.setEvaluateId(IdUtils.uuid());
		return publicEvaluateMapper.insert(record);
	}
	
	@Override
	public int update(PublicEvaluate record)throws Exception{
		return publicEvaluateMapper.updateByPrimaryKey(record);
	}

	@Override
	public PublicEvaluate find(String id)throws Exception{
		return publicEvaluateMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(PublicEvaluateExample example)throws Exception{
		return publicEvaluateMapper.countByExample(example);
	}
	
	@Override
	public List<PublicEvaluate> select(PublicEvaluateExample example) {
		return publicEvaluateMapper.selectByExample(example);
	}

	@Override
	public List<PublicEvaluate> select(PublicEvaluateExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicEvaluateMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public List<PublicEvaluate> queryQuestionnaire(String userId, String orderId) throws Exception {
		PublicEvaluateExample example= new PublicEvaluateExample();
		PublicEvaluateExample.Criteria criteria=example.createCriteria();
		criteria.andOrderIdEqualTo(orderId);
		criteria.andUserIdEqualTo(userId);
		return select(example);
	}


	
}
