package com.asiainfo.aigov.service.healthcare.doctor;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOfficeExample;
import com.asiainfo.aigov.web.vo.DeptListVo;
/**
 * 
 * @author 柯永锥
 *
 */
public interface IPublicOfficeService {
	
	public int update(PublicOffice bean)throws Exception;
	
	public PublicOffice find(String id)throws Exception;
	
	public int save(PublicOffice bean)throws Exception;
	
	public int count(PublicOfficeExample example)throws Exception;
	
	public List<PublicOffice> select(PublicOfficeExample example)throws Exception;
	
	public List<PublicOffice> select(PublicOfficeExample example, Page page)throws Exception;
	
	public List<PublicOffice> queryOffice(String hospitalId)throws Exception;
	
	public PublicOffice getPublicOfficeByCode(String hospitalId,String code)throws Exception;
	
	public List<DeptListVo> getDeptListVo(String hospitalId,String officeName)throws Exception;
}
