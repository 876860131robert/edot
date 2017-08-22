/**
 * DoctorNoticeService.java	  V1.0   2017年4月20日 下午3:07:11
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
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorNotice;

public interface IDoctorNoticeService {
	/**
	 * 
	 * 功能描述：查询已发布的消息通知
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月20日 下午3:21:29</p>
	 *
	 * @param page
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public List<PublicDoctorNotice> queryDoctorNoticePublish(Page page) throws Exception;
	
	/**
	 * 
	 * 功能描述：根据主键获取消息通知
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月20日 下午3:22:19</p>
	 *
	 * @param noticeId
	 * @return
	 * @throws Excetion
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public PublicDoctorNotice getDoctorNoticeByPK(String noticeId) throws Exception;
}
