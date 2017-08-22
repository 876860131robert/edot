package com.asiainfo.aigov.service.healthcare.patients;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatients;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatientsExample;

public interface IPublicPatientSerivce {
	public PublicPatients find(String patientId) throws Exception;
	
	public int add(PublicPatients bean)throws Exception;
	
	public int update(PublicPatients bean)throws Exception;
	
	public int count(PublicPatientsExample example)throws Exception;
	
	public List<PublicPatients> select(PublicPatientsExample example)throws Exception;
	
	public List<PublicPatients> select(PublicPatientsExample example, Page page)throws Exception;
	
	public List<PublicPatients> getPatientList(String userId)throws Exception;
	
	public void delete(String id)throws Exception;
	
	public List<PublicPatients> getDefaultPatientList(String userId) throws Exception;



}
