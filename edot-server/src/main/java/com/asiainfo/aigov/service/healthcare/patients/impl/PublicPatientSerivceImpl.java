package com.asiainfo.aigov.service.healthcare.patients.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.patients.PublicPatientsMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatients;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatientsExample;
import com.asiainfo.aigov.service.healthcare.patients.IPublicPatientSerivce;
import com.asiainfo.frame.utils.IdUtils;

@Service
@Transactional
public class PublicPatientSerivceImpl implements IPublicPatientSerivce {

	@Autowired
	private PublicPatientsMapper publicPatientMapper;
	
	@Override
	public PublicPatients find(String patientId) throws Exception {
		return publicPatientMapper.selectByPrimaryKey(patientId);

	}
	
	@Override
	public int add(PublicPatients record)throws Exception{
		record.setPatientId(IdUtils.uuid());
		return publicPatientMapper.insert(record);
	}
	
	@Override
	public int update(PublicPatients record)throws Exception{
		return publicPatientMapper.updateByPrimaryKey(record);
	}

	
	@Override
	public int count(PublicPatientsExample example)throws Exception{
		return publicPatientMapper.countByExample(example);
	}
	
	@Override
	public List<PublicPatients> select(PublicPatientsExample example) {
		return publicPatientMapper.selectByExample(example);
	}

	@Override
	public List<PublicPatients> select(PublicPatientsExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicPatientMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public List<PublicPatients> getPatientList(String userId) throws Exception {
		PublicPatientsExample example=new PublicPatientsExample();
		PublicPatientsExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		example.setOrderByClause("OPER_DATE");
		
		return select(example);
	}
	@Override
	public List<PublicPatients> getDefaultPatientList(String userId) throws Exception {
		PublicPatientsExample example=new PublicPatientsExample();
		PublicPatientsExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andDefaultFlagEqualTo("0");
		example.setOrderByClause("OPER_DATE");
		
		return select(example);
	}

	@Override
	public void delete(String id) throws Exception {
		publicPatientMapper.deleteByPrimaryKey(id);
	}


}
