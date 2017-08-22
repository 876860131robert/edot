package com.asiainfo.aigov.web.controller.healthcare.doctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestion;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestionExample;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicOfficeService;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.aigov.web.webservice.edot.cardService.api.CardServiceAPI;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.SessionUtil;

@Controller
@RequestMapping("/doctor/doctors")
public class DoctorController extends BaseController { 
	
	@Autowired  
	IPublicDoctorService publicDoctorService;
	
	@Autowired  
	IHospitalService hospitalService;
	
	@Autowired  
	IPublicOfficeService officeService;
	@User
	@RequestMapping("/list")
	@ResponseBody
	@Remarks("医生列表")
	public AjaxResponse list(HttpServletRequest request,
			@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		String extraCon =request.getParameter("extraCon");
			//	UserInfo u = (UserInfo)userInfo.getUser();
				AjaxResponse resp = new AjaxResponse();
				Page page = new Page();
				page.setPageIndex(Integer.valueOf(curPageNum));
				page.setPageSize(Integer.valueOf(pageCount));
				PublicDoctorExample example = new PublicDoctorExample();
				if(extraCon!=null&&!"".equals(extraCon)){
					example.createCriteria().andNameLike("%"+extraCon+"%");

				}
				
				example.setOrderByClause("name DESC");
				List<PublicDoctor> list =publicDoctorService.select(example, page);
				List<Map<String,String>> doctorList=new ArrayList<>();
				Map<String,String> doctor=null;
				for (int i = 0; i < list.size(); i++) {
					PublicDoctor publicDoctor=list.get(i);
					
					doctor=new HashMap<String, String>();
					doctor.put("doctorId", publicDoctor.getDoctorId());
					doctor.put("name",  list.get(i).getName());
					doctor.put("expert", publicDoctor.getSpecaility());
					doctor.put("personalIntroduce", publicDoctor.getPersonalIntroduce());
					doctor.put("leve", publicDoctor.getDoctorLevel());
					PublicOffice publicOffice=hospitalService.getPublicOffice(publicDoctor.getOfficeCode(),publicDoctor.getHospitalId().longValue());
					PublicHospital publicHospital=hospitalService.getPublicHospital(publicDoctor.getHospitalId().longValue()) ;
					if(publicOffice!=null){
						doctor.put("office",  publicOffice.getName());
					}else{
						doctor.put("office", "");
					}
					if(publicHospital!=null){
						doctor.put("hospital",publicHospital.getName());
					}else{
						doctor.put("hospital","");
					}
					
					doctorList.add(doctor);
				}
		//resp.setData(publicDoctor);
		//return resp;
				resp.setData(doctorList);
				return resp;
	}
	
	
	

	@RequestMapping("/info")
	@ResponseBody
	@Remarks("医生信息")
	@User
	public AjaxResponse list(HttpServletRequest request,
			@RequestParam String doctorId)
			throws Exception {
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		String extraCon =request.getParameter("extraCon");
			//	UserInfo u = (UserInfo)userInfo.getUser();
				AjaxResponse resp = new AjaxResponse();
			
				PublicDoctorExample example = new PublicDoctorExample();
				example.createCriteria().andDoctorIdEqualTo(doctorId);
				
				example.setOrderByClause("name DESC");
				PublicDoctor publicDoctor =publicDoctorService.find(doctorId);
				Map<String,String> doctor=null;
			
					
					doctor=new HashMap<String, String>();
					doctor.put("doctorId", publicDoctor.getDoctorId());
					doctor.put("name",  publicDoctor.getName());
					doctor.put("expert", publicDoctor.getSpecaility());
					doctor.put("leve", publicDoctor.getDoctorLevel());
					doctor.put("personalIntroduce", publicDoctor.getPersonalIntroduce());
					doctor.put("PhoneZxFlag",publicDoctor.getPhoneZxFlag());//d电话在线 1开启 0关闭
					doctor.put("OnlineZxFlag",publicDoctor.getOnlineZxFlag());//在线 1开启 0关闭
					doctor.put("mobile",publicDoctor.getMobile());
				//	doctor.put("", publicDoctor.getPersonalIntroduce());
					//doctor.put("personalIntroduce", publicDoctor.getPersonalIntroduce());
					PublicOffice publicOffice=hospitalService.getPublicOffice(publicDoctor.getOfficeCode(),publicDoctor.getHospitalId().longValue());
					PublicHospital publicHospital=hospitalService.getPublicHospital(publicDoctor.getHospitalId().longValue()) ;
					if(publicOffice!=null){
						doctor.put("office",  publicOffice.getName());
					}else{
						doctor.put("office", "");
					}
					if(publicHospital!=null){
						doctor.put("hospital",publicHospital.getName());
					}else{
						doctor.put("hospital","");
					}
					
				
		//resp.setData(publicDoctor);
		//return resp;
				resp.setData(doctor);
				return resp;
	}
}
