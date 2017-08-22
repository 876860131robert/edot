/**
 * DoctorNoticeController.java	  V1.0   2017年4月20日 下午3:30:51
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.web.controller.healthcare.doctor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorNotice;
import com.asiainfo.aigov.service.healthcare.doctor.IDoctorNoticeService;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.model.AjaxResponse;

@Controller
@RequestMapping("/doctor/notice")
public class DoctorNoticeController {
	@Autowired
	private IDoctorNoticeService doctorNoticeSV;
	
	@RequestMapping("/queryDoctorNoticePublish")
	@ResponseBody
	@Remarks("查询消息通知列表")
	public AjaxResponse queryDoctorNoticePublish(HttpServletRequest request, Integer curPageNum, Integer pageCount) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			Page page = new Page();
			page.setPageSize(pageCount);
			page.setPageIndex(curPageNum);
			List<PublicDoctorNotice> notices = doctorNoticeSV.queryDoctorNoticePublish(page);
			resp.setData(notices);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/getDoctorNotice")
	@ResponseBody
	@Remarks("消息通知")
	public AjaxResponse getDoctorNotice(HttpServletRequest request, String noticeId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			PublicDoctorNotice notice = doctorNoticeSV.getDoctorNoticeByPK(noticeId);
			resp.setData(notice);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
}
