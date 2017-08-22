package com.asiainfo.aigov.service.healthcare.doctor;

import java.math.BigDecimal;
import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorExample;

public interface IPublicDoctorService {
	public List<PublicDoctor> select(PublicDoctorExample example, Page page)throws Exception;

	PublicDoctor find(String doctorId) throws Exception;

	public void resetPwd(String userId, String pwd) throws Exception;
	
	public int save(PublicDoctor bean)throws Exception;
	
	/**
	 * 
	 * 功能描述：更新医生个人信息
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月19日 上午10:00:03</p>
	 *
	 * @param doctor
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public PublicDoctor updateDoctor(PublicDoctor doctor) throws Exception;
	
	/**
	 * 得到 
	 * @param doctorCode
	 * @param hospitalId
	 * @return
	 * @throws Exception
	 */
	public PublicDoctor getDoctor(String doctorCode,BigDecimal hospitalId) throws Exception;

	
	/**
	 * 
	 * 功能描述：开启、关闭咨询服务
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月19日 上午10:00:22</p>
	 *
	 * @param doctorId
	 * @param serviceType
	 * @param flag
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public void settingService(String doctorId, String serviceType, String flag) throws Exception;

	
	public List<PublicDoctor> getDoctorByOfficeCode(String hospitalId,String officeCode)throws Exception;
	
	public List<PublicDoctor>  getDoctorList(List<String> doctorIds)throws Exception;
}
