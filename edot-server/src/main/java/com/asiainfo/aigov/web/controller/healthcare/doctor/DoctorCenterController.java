/**
 * DoctorCenterController.java	  V1.0   2017年4月17日 上午10:28:07
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.web.controller.healthcare.doctor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.SessionUtil;

@Controller
@RequestMapping("/doctor/center")
public class DoctorCenterController {

	@Autowired  
	IPublicDoctorService publicDoctorService;
	@Autowired
	private IHospitalService hospitalSV;
	
	@RequestMapping("/qryDoctor")
	@ResponseBody
	@Remarks("医生个人信息查询")
	@User
	public AjaxResponse qryDoctor(HttpServletRequest request)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();		
		try{
			UserInfo userInfo = (UserInfo) SessionUtil.getUserSessionInfo(request).getUser();
			PublicDoctor doctor = publicDoctorService.find(userInfo.getDoctorId());			
			if(doctor==null) {
				resp.setCode(1);
				resp.setMessage("未找到医生基本信息");
				return resp;
			}
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("doctor", doctor);
			param.put("hospital", hospitalSV.getPublicHospital(doctor.getHospitalId().longValue()));
			param.put("office", hospitalSV.getPublicOffice(doctor.getOfficeCode(), doctor.getHospitalId().longValue()));
			resp.setData(param);
			
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
		
	@RequestMapping("/resetPwd")
	@ResponseBody
	@Remarks("医生端重置密码")
	@User
	public AjaxResponse resetPwd(HttpServletRequest request, String pwd)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();		
		try{
			UserInfo userInfo = (UserInfo) SessionUtil.getUserSessionInfo(request).getUser();
			publicDoctorService.resetPwd(userInfo.getUserId(), pwd);							
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/settingBase")
	@ResponseBody
	@Remarks("医生端设置基本信息")
	@User
	public AjaxResponse settingBase(HttpServletRequest request, PublicDoctor doctor)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();		
		try{
			UserInfo userInfo = (UserInfo) SessionUtil.getUserSessionInfo(request).getUser();
			doctor.setDoctorId(userInfo.getDoctorId());
			publicDoctorService.updateDoctor(doctor);							
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/settingService")
	@ResponseBody
	@Remarks("医生端设置咨询服务")
	@User
	public AjaxResponse settingService(HttpServletRequest request, String serviceType, String flag)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();		
		try{
			UserInfo userInfo = (UserInfo) SessionUtil.getUserSessionInfo(request).getUser();
			publicDoctorService.settingService(userInfo.getDoctorId(), serviceType, flag);							
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
}
