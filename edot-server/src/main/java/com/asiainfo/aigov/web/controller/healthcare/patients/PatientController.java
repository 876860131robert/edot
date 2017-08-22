package com.asiainfo.aigov.web.controller.healthcare.patients;

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
import com.asiainfo.aigov.model.healthcare.patients.PublicPatients;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatientsExample;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicOfficeService;
import com.asiainfo.aigov.service.healthcare.patients.IPublicPatientSerivce;
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
@RequestMapping("/patients")
public class PatientController extends BaseController { 
	
	@Autowired  
	IPublicPatientSerivce patientSerivce;
	
	
	//@User
	@RequestMapping("/list")
	@ResponseBody
	@Remarks("患者列表")
	public AjaxResponse list(HttpServletRequest request,
			@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		String extraCon =request.getParameter("extraCon");
				UserInfo u = (UserInfo)userInfo.getUser();
				
				AjaxResponse resp = new AjaxResponse();
				Page page = new Page();
				page.setPageIndex(Integer.valueOf(curPageNum));
				page.setPageSize(Integer.valueOf(pageCount));
				PublicPatientsExample example = new PublicPatientsExample();
				example.createCriteria().andUserIdEqualTo(u.getUserId());
//				if(extraCon!=null&&!"".equals(extraCon)){
//					example.createCriteria().andNameLike("%"+extraCon+"%");
//
//				}
				
				example.setOrderByClause("PATIENT_NAME DESC");
				List<PublicPatients> list =patientSerivce.select(example, page);
				if(list==null){
					list=new ArrayList();
				}
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getSex().equals("0")){
						list.get(i).setSex("男");	
					}else{
						list.get(i).setSex("女");	
					}
					// 为了演示，直接写死年份
					String birthDate=list.get(i).getBirthDate();
					birthDate=birthDate.substring(0, 4);
					
					list.get(i).setBirthDate((2017-Integer.parseInt(birthDate))+"");
				}
		//resp.setData(publicDoctor);
		//return resp;
				resp.setData(list);
				return resp;
	}
}
