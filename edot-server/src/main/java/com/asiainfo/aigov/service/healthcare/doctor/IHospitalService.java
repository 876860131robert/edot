/**
 * IHospitalService.java	  V1.0   2017年4月17日 下午5:37:40
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.doctor;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospitalExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;

public interface IHospitalService {
	
	public int add(PublicHospital bean)throws Exception;
	
	public int update(PublicHospital bean)throws Exception;
	
	public int save(PublicHospital bean)throws Exception;

	/**
	 * 
	 * 功能描述：获取医院信息
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月17日 下午6:01:30</p>
	 *
	 * @param hospitalId
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public PublicHospital getPublicHospital(Long hospitalId) throws Exception;
	
	/**
	 * 
	 * 功能描述：获取科室信息
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月17日 下午6:01:47</p>
	 *
	 * @param officeId
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public PublicOffice getPublicOffice(Long officeId) throws Exception; 
	
	public PublicOffice getPublicOffice(String officeCode, Long hospitalId) throws Exception;
	
	public int count(PublicHospitalExample example)throws Exception;
	
	public List<PublicHospital> select(PublicHospitalExample example, Page page)throws Exception;

}
