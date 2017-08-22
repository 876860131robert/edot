/**
 * MyConsultationController.java	  V1.0   2017年4月22日 下午8:42:35
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.web.controller.healthcare.guidance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestion;
import com.asiainfo.aigov.model.healthcare.guidance.QueryMyQuestionReply;
import com.asiainfo.aigov.model.healthcare.guidance.QueryPublicReplyQuestion;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.guidance.IPublicReplyQuestionSerivce;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.SessionUtil;

@Controller
@Remarks("我的咨询")
@RequestMapping("/guidance/my")
public class MyConsultationController {
	@Autowired
	private IPublicReplyQuestionSerivce publicReplyQuestionSerivce;
	@Autowired
	private IPublicDoctorService doctorService;
	@Autowired
	private IHospitalService hospitalService;

	@RequestMapping("/myQuestion")
	@ResponseBody
	@Remarks("查询我的咨询列表")
	public AjaxResponse myQuestion(HttpServletRequest request, String userId, Integer curPageNum, Integer pageCount) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			Page page = new Page();
			page.setPageSize(pageCount);
			page.setPageIndex(curPageNum);
			UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
			List<QueryPublicReplyQuestion> list = publicReplyQuestionSerivce.qryMyQuestion(userId, page);			
			resp.setData(list);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/getQuestion")
	@ResponseBody
	@Remarks("查询我的咨询")
	public AjaxResponse getQuestion(HttpServletRequest request, String replyQuestionId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			PublicReplyQuestion bean = publicReplyQuestionSerivce.find(replyQuestionId);
			resp.setData(bean);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/qryQuestionReplys")
	@ResponseBody
	@Remarks("查询我咨询问题的答案")
	public AjaxResponse qryQuestionReplys(HttpServletRequest request, String replyQuestionId, Integer curPageNum, Integer pageCount) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			PublicReplyQuestion question = publicReplyQuestionSerivce.browse(replyQuestionId);
			List<PublicReplyQuestion> list = publicReplyQuestionSerivce.qryQuestionReplys(replyQuestionId, null);
			if(null!=list && !list.isEmpty()) {
				List<QueryMyQuestionReply> replys = new ArrayList<QueryMyQuestionReply>(); 
				for(PublicReplyQuestion bean : list) {
					QueryMyQuestionReply reply = new QueryMyQuestionReply();
					BeanUtils.copyProperties(bean, reply);
					PublicDoctor doctor = doctorService.find(reply.getCreateId());
					if(null!=doctor) {
						reply.setDoctorName(doctor.getName());
						PublicHospital hospital = hospitalService.getPublicHospital(doctor.getHospitalId().longValue());
						if(null!=hospital) {
							reply.setHospitalName(hospital.getName());
						}
						PublicOffice office = hospitalService.getPublicOffice(doctor.getOfficeCode(), doctor.getHospitalId().longValue());
						if(null!=office) {
							reply.setOfficeName(office.getName());
						}
					}	
					replys.add(reply);
				}
				data.put("replys", replys);
			}			
			data.put("question", question);			
			resp.setData(data);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
}
