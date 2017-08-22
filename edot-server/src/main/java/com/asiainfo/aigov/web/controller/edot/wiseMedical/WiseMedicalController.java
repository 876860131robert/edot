package com.asiainfo.aigov.web.controller.edot.wiseMedical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.wiseMedical.IWiseMedicalSV;
import com.asiainfo.aigov.web.vo.DeptListVo;
import com.asiainfo.aigov.web.vo.DiseaseListVo;
import com.asiainfo.aigov.web.vo.DoctorListVo;
import com.asiainfo.aigov.web.webservice.edot.mpsService.api.MpsServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.api.WiseMedicalServiceAPI;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.ErrorCode;
import com.asiainfo.frame.utils.SessionUtil;

@Controller
@RequestMapping("/wiseMedical")
public class WiseMedicalController extends BaseController {

	@Autowired
	private IWiseMedicalSV wiseMedicalSV;
	
	@RequestMapping("/getDateTime")
	@ResponseBody
	@Remarks("获取服务器时间")
	public AjaxResponse getDateTime() {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		String curDate = DateUtils.getDateString("yyyy-MM-dd HH:mm:ss");
		ajaxResponse.setData(curDate);
		return ajaxResponse;
	}

	// /wiseMedical/queryHospital?pageCount=15&curPageNum=1&extraCon=
	@RequestMapping("/queryHospital")
	@ResponseBody
	@Remarks("查询医院列表")
	public AjaxResponse queryHospital(String pageCount, String curPageNum, String extraCon) {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.req.Request();
		req.setHospitalName(extraCon);
		req.setPageSize(pageCount);
		req.setCurrentPage(curPageNum);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Response rsp = WiseMedicalServiceAPI.queryHospital(req);

		if(rsp.getResult_Data() != null) {
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Result_List[] list = rsp.getResult_Data().getResult_List();
			ajaxResponse.setData(list);
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryAppointDept?hospitalCode=435631450&extraCon=
	@RequestMapping("/queryAppointDept")
	@ResponseBody
	@Remarks("查询科室列表")
	public AjaxResponse queryAppointDept(String hospitalCode, String extraCon) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.req.Request req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.req.Request();
		req.setHospital_Mark(hospitalCode);
		req.setServiceName("queryAppointDept");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Response rsp = MpsServiceAPI.queryAppointDept(req);

		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null) {
			List<DeptListVo> list = wiseMedicalSV.getDepartList(rsp.getResult_Data().getRecord_List().getRecord_Info(), extraCon);
			ajaxResponse.setData(list);
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryHospitalInfo?hospitalCode=435631450
	@RequestMapping("/queryHospitalInfo")
	@ResponseBody
	@Remarks("查询同步医院基本信息")
	public AjaxResponse queryHospitalInfo(String hospitalCode) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.req.Request req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.req.Request();
		req.setHospital_Mark(hospitalCode);
		req.setServiceName("queryHospitalInfo");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response rsp = MpsServiceAPI.queryHospitalInfo(req);
		if(StringUtils.isEmpty(rsp.getHospital_Lng()))
			rsp.setHospital_Lng("108.702795");
		if(StringUtils.isEmpty(rsp.getHospital_Lat()))
			rsp.setHospital_Lat("34.333904");
		if(StringUtils.isEmpty(rsp.getHospital_Image()))
			rsp.setHospital_Image("http://xytest.lingwww.com:8181/edot/images/icon/photo4.png");
		if(StringUtils.isEmpty(rsp.getHospital_Nav_Image()))
			rsp.setHospital_Nav_Image("http://xytest.lingwww.com:8181/edot/images/icon/u23.png");
		if(StringUtils.isEmpty(rsp.getHospital_Nav_Introduction()))
			rsp.setHospital_Nav_Introduction("");

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	// /wiseMedical/queryAppointDoctor?hospitalId=910009&hospitalCode=435631450&deptCode=0169000001&startDate=2016-06-01&endDate=2016-06-07
	@RequestMapping("/queryAppointDoctor")
	@ResponseBody
	@Remarks("查询医生列表")
	@User
	public AjaxResponse queryAppointDoctor(HttpServletRequest hReq, String hospitalId, String hospitalCode, String deptCode, String startDate, String endDate) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request();
		req.setUserId(SessionUtil.getUser(hReq).getUserId());
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Response rsp = WiseMedicalServiceAPI.queryAttentionInfo(req);

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.req.Request req2 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.req.Request();
		req2.setHospitalId(hospitalId);
		req2.setOfficeCode(deptCode);
		req2.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req2.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req2.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Response rsp2 = WiseMedicalServiceAPI.queryDoctorByOffice(req2);

		List<DoctorListVo> list = null;
		if(rsp2.getResult_Data() != null) {
			if(rsp.getResult_Data() != null) {
				list = wiseMedicalSV.getDoctorList(rsp.getResult_Data().getResult_List(), rsp2.getResult_Data().getResult_List(), hospitalCode, startDate, endDate);
			} else {
				list = wiseMedicalSV.getDoctorList(null, rsp2.getResult_Data().getResult_List(), hospitalCode, startDate, endDate);
			}
			ajaxResponse.setData(list);
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryAttentionInfo?userId=1091
	@RequestMapping("/queryAttentionInfo")
	@ResponseBody
	@Remarks("我的关注")
	public AjaxResponse queryAttentionInfo(String userId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request();
		req.setUserId(userId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Response rsp = WiseMedicalServiceAPI.queryAttentionInfo(req);

		if(rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	// /wiseMedical/deleteAttentionInfo?attentionId=1
	@RequestMapping("/deleteAttentionInfo")
	@ResponseBody
	@Remarks("取消关注医生")
	public AjaxResponse deleteAttentionInfo(String attentionId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2012.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2012.req.Request();
		req.setAttentionId(attentionId);
		req.setAttentionType("0");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2012.rsp.Response rsp = WiseMedicalServiceAPI.deleteAttentionInfo(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	// /wiseMedical/addAttentionDoctor?doctorId=5212
	@RequestMapping("/addAttentionDoctor")
	@ResponseBody
	@Remarks("增加关注医生")
	@User
	public AjaxResponse addAttentionDoctor(HttpServletRequest hReq, String doctorId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2011.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2011.req.Request();
		req.setDoctorId(doctorId);
		req.setUserId(SessionUtil.getUser(hReq).getUserId());
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2011.rsp.Response rsp = WiseMedicalServiceAPI.addAttentionDoctor(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	// /wiseMedical/queryRegistHid?hospitalCode=435631450&deptCode=0169000001&doctorCode=00000684&hbDate=2016-06-01&amPm=门诊上午
	@RequestMapping("/queryRegistHid")
	@ResponseBody
	@Remarks("医生可预约号源查询")
	public AjaxResponse queryRegistHid(String hospitalCode, String deptCode, String doctorCode, String hbDate, String amPm) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request();
		req.setHospital_Mark(hospitalCode);
		req.setServiceName("queryRegistHid");
		req.setDept_Code(deptCode);
		req.setDept_Name("");
		req.setDoctor_Code(doctorCode);
		req.setHb_Date(hbDate);
		req.setAm_Pm(amPm);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Response rsp = MpsServiceAPI.queryRegistHid(req);

		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null) {
			ajaxResponse.setData(wiseMedicalSV.getRegistHidList(rsp.getResult_Data().getRecord_List().getRecord_Info()));
		}
		return ajaxResponse;
	}

	// /wiseMedical/opAppoint?hid=111&id_No=330702197108020812&sms_Code=222
	@RequestMapping("/opAppoint")
	@ResponseBody
	@Remarks("预约请求写入")
	public AjaxResponse opAppoint(HttpSession session, com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setServiceName("opAppoint");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.rsp.Response rsp = MpsServiceAPI.opAppoint(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	@RequestMapping("/opRegist")
	@ResponseBody
	@Remarks("挂号请求写入")
	public AjaxResponse opRegist(HttpSession session, com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setServiceName("opRegist");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Response rsp = MpsServiceAPI.opRegist(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	// /wiseMedical/queryBodyPartInfo?partId=1
	@RequestMapping("/queryBodyPartInfo")
	@ResponseBody
	@Remarks("获取身体子部位")
	public AjaxResponse queryBodyPartInfo(String partId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.req.Request();
		req.setPartLevel("2");
		req.setPartId(partId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Response rsp = WiseMedicalServiceAPI.queryBodyPartInfo(req);

		if(rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	// /wiseMedical/querySymptomInfo?partId=1&sex=1
	@RequestMapping("/querySymptomInfo")
	@ResponseBody
	@Remarks("根据身体部置得到症状")
	public AjaxResponse querySymptomInfo(String partId, String sex) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5002.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5002.req.Request();
		req.setPartId(partId);
		req.setSex(sex);
		req.setAgeGroup("");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5002.rsp.Response rsp = WiseMedicalServiceAPI.querySymptomInfo(req);

		if(rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryRelSymptomInfo?symptomId=12
	@RequestMapping("/queryRelSymptomInfo")
	@ResponseBody
	@Remarks("得到相关症状")
	public AjaxResponse queryRelSymptomInfo(String symptomId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.req.Request();
		req.setSymptomId(symptomId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Response rsp = WiseMedicalServiceAPI.queryRelSymptomInfo(req);

		if(rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryDiseaseInfo?symptomId=1
	@RequestMapping("/queryDiseaseInfo")
	@ResponseBody
	@Remarks("得到疾病信息查询")
	public AjaxResponse queryDiseaseInfo(String symptomId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.req.Request();
		req.setSymptomId(symptomId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Response rsp = WiseMedicalServiceAPI.queryDiseaseInfo(req);

		if(rsp.getResult_Data() != null) {
			List<DiseaseListVo> list = wiseMedicalSV.getDiseaseList(rsp.getResult_Data().getResult_List());
			ajaxResponse.setData(list);
		}
		return ajaxResponse;
	}

	@RequestMapping("/queryCheckListMaster")
	@ResponseBody
	@Remarks("查阅检验记录概要信息概")
	public AjaxResponse queryCheckListMaster(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setServiceName("queryCheckListMaster");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Response rsp = MpsServiceAPI.queryCheckListMaster(req);

		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getRecord_List().getRecord_Info());
		}
		return ajaxResponse;
	}

	@RequestMapping("/queryCheckListDetails")
	@ResponseBody
	@Remarks("查阅检验记录详细信息")
	public AjaxResponse queryCheckListDetails(String testNo, String hospitalCode) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request();
		req.setServiceName("queryCheckListDetails");
		req.setTest_No(testNo);
		req.setHospital_Mark(hospitalCode);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Response rsp = MpsServiceAPI.queryCheckListDetails(req);

		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getRecord_List().getRecord_Info());
		}
		return ajaxResponse;
	}

	@RequestMapping("/queryExamMaster")
	@ResponseBody
	@Remarks("查阅检查记录信息概要")
	public AjaxResponse queryExamMaster(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setServiceName("queryExamMaster");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Response rsp = MpsServiceAPI.queryExamMaster(req);

		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getRecord_List().getRecord_Info());
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryPersonalBaseInfo?userId=5079
	@RequestMapping("/queryPersonalBaseInfo")
	@ResponseBody
	@Remarks("个人基本信息查询")
	public AjaxResponse queryPersonalBaseInfo(String userId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.req.Request();
		req.setUserId(userId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Response rsp = WiseMedicalServiceAPI.queryPersonalBaseInfo(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	@RequestMapping("/changePersonalBaseInfo")
	@ResponseBody
	@Remarks("个人基本信息修改")
	@User
	public AjaxResponse changePersonalBaseInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2002.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2002.rsp.Response rsp = WiseMedicalServiceAPI.changePersonalBaseInfo(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	// /wiseMedical/queryOrder?userId=1091
	@RequestMapping("/queryOrder")
	@ResponseBody
	@Remarks("预约挂号订单查询")
	public AjaxResponse queryOrder(String userId, String orderId, String evaluateStatus, String visitStauts, Boolean isToday) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.req.Request();
		req.setUserId(userId);
		req.setOrderId(orderId);
		req.setEvaluateStatus(evaluateStatus);
		req.setVisitStauts(visitStauts);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Response rsp = WiseMedicalServiceAPI.queryOrder(req);

		if(rsp.getResult_Data() != null) {
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List[] list = rsp.getResult_Data().getResult_List();
			
			// 只显示今天之后的预约信息
			if(isToday!=null && isToday) {
				List<com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List> list2 = new ArrayList<com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List>();
				for(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List resultList : list) {
					String appTime = resultList.getAppTime();
					if(appTime.length() >= 10) {
						String curDate = DateUtils.getDateString("yyyyMMdd");
						appTime = appTime.substring(0, 10).replaceAll("-", "");
						if(Long.valueOf(appTime) >= Long.valueOf(curDate)) {
							Date d1 = DateUtils.getDate(curDate, "yyyyMMdd");
							Date d2 = DateUtils.getDate(appTime, "yyyyMMdd");
							long d = (d2.getTime() - d1.getTime()) / (1000 * 3600 * 24);
							resultList.setAttendCardNum(d+"");	//还剩天数
							list2.add(resultList);
						}
					}
				}
				ajaxResponse.setData(list2);
			}
			//显示全部
			else {
				ajaxResponse.setData(list);
			}
		}
		return ajaxResponse;
	}

	// /wiseMedical/queryForAlipay?orderId=1000000&orderFee=0.01&returnUrl=http://www.baidu.com
	@RequestMapping("/queryForAlipay")
	@ResponseBody
	@Remarks("手机app支付（支付宝）")
	@User
	public AjaxResponse queryForAlipay(String sourceType, String orderId, String orderFee, String returnUrl) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request();
		if(StringUtils.isNotEmpty(sourceType))
			req.setSourceType(sourceType);
		else
			req.setSourceType("4");
		req.setOrderId(orderId);
		req.setOrderFee(orderFee);
		req.setReturnUrl(returnUrl);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.rsp.Response rsp = WiseMedicalServiceAPI.queryForAlipay(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	// /wiseMedical/queryAlipayRefund?orderId=1000000
	@RequestMapping("/queryAlipayRefund")
	@ResponseBody
	@Remarks("手机app退款（支付宝）")
	public AjaxResponse queryAlipayRefund(String sourceType, String orderId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.req.Request();
		if(StringUtils.isNotEmpty(sourceType))
			req.setSourceType(sourceType);
		else
			req.setSourceType("4");
		req.setOrderId(orderId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.rsp.Response rsp = WiseMedicalServiceAPI.queryAlipayRefund(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/queryAlipayRefundRepeat")
	@ResponseBody
	@Remarks("手机app退款（支付宝）--带重试")
	public AjaxResponse queryAlipayRefundRepeat(String sourceType, String orderId) throws Exception {
		AjaxResponse ajaxResponse = null;
		
		int count = 1;
	    while(count <= 3){
	    	try {
	    		ajaxResponse = this.queryAlipayRefund(sourceType, orderId);
	    		if(ajaxResponse != null && ajaxResponse.getCode() == 0){
	    			if(ajaxResponse.getData() != null){
	    				com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.rsp.Response rsp = (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.rsp.Response)ajaxResponse.getData();
	    				if("0000".equals(rsp.getResult_Code())){
	    	    			break;
	    				} else {
	    					count++;
	    				}
	    			} else {
	    				count++;
	    			}
		    	} else {
		    		count++;
		    	}
			} catch (Exception e) {
				count++;
			}
	    }
		return ajaxResponse;
	}

	@RequestMapping("/queryPatientList")
	@ResponseBody
	@Remarks("就诊人列表查询")
	public AjaxResponse queryPatientList(String userId, String hospitalId, String hospitalCode) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2020.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2020.req.Request();
		req.setUserId(userId);
		req.setHospitalId(hospitalId);
		req.setHospitalCode(hospitalCode);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2020.rsp.Response rsp = WiseMedicalServiceAPI.queryPatientList(req);
		if(rsp.getResult_Data() != null && rsp.getResult_Data().getResult_List() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	@RequestMapping("/queryPatsRegistStatus")
	@ResponseBody
	@Remarks("查询挂号预约订单状态")
	public AjaxResponse queryPatsRegistStatus(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_Info record_Info, String hospitalCode) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Request req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Request();
		req.setHospital_Mark(hospitalCode);
		req.setServiceName("queryPatsRegistStatus");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_List record_List = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_List();
		record_List.addRecord_Info(record_Info);
		req.setRecord_List(record_List);
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.rsp.Response rsp = MpsServiceAPI.queryPatsRegistStatus(req);

		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null && rsp.getResult_Data().getRecord_List().getRecord_Info() != null && rsp.getResult_Data().getRecord_List().getRecord_Info().length > 0) {
			ajaxResponse.setData(rsp.getResult_Data().getRecord_List().getRecord_Info(0));
		}
		return ajaxResponse;
	}

	@RequestMapping("/queryOfficesByMainOffice")
	@ResponseBody
	@Remarks("根据主科室查子列表科室")
	public AjaxResponse queryOfficesByMainOffice(String officeId, String pageCount, String curPageNum) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.req.Request();
		req.setOfficeId(officeId);
		req.setPageSize(pageCount);
		req.setCurrentPage(curPageNum);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Response rsp = WiseMedicalServiceAPI.queryOfficesByMainOffice(req);

		if(rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	@RequestMapping("/saveOrder")
	@ResponseBody
	@Remarks("预约挂号订单保存")
	@User
	@SuppressWarnings("rawtypes")
	public AjaxResponse saveOrder(HttpSession session, com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request req, String phone_Num, String sms_Code) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		Map mobileCode = (Map) session.getAttribute("MSG_CODE" + phone_Num);
		if(mobileCode != null) {
			Date now = new Date();
			Date codeDate = (Date) mobileCode.get("date");
			if(codeDate.before(now)) {
				ajaxResponse.setCode(1);
				ajaxResponse.setMessage("随机码超时，请重新随机码");
				return ajaxResponse;
			}
			String checkCode = (String) mobileCode.get("code");
			if(!sms_Code.equals(checkCode) /*&& !"123456".equals(sms_Code)*/) {
				ajaxResponse.setCode(1);
				ajaxResponse.setMessage("随机码错误");
				return ajaxResponse;
			}
		} else {
			ajaxResponse.setCode(1);
			ajaxResponse.setMessage("请发送随机码");
			return ajaxResponse;
		}

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response rsp = WiseMedicalServiceAPI.saveOrder(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	@RequestMapping("/appoint")
	@ResponseBody
	@Remarks("预约")
	@User
	public AjaxResponse appoint(HttpSession session, com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request req, String phone_Num, String sms_Code, String hospitalCode, String deptName, String doctorName, String hbTime) throws Exception {
		// 订单保存
		AjaxResponse ajaxResponse = this.saveOrder(session, req, phone_Num, sms_Code);
		if(ajaxResponse.getCode() == ErrorCode.SUCCESS) {
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response rsp = (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response) ajaxResponse.getData();
			if("0000".equals(rsp.getResult_Code())) {
				// 调预约接口预约
				com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request req2 = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request();
				req2.setHospital_Mark(hospitalCode);
				req2.setHid(req.getHid());
				req2.setId_No(req.getPatientCertNo());
				req2.setPatient_Name(req.getPatientName());
				req2.setPatient_Id(req.getHisPatientId());
				req2.setDept_Code(req.getOfficeCode());
				req2.setDept_Name(deptName);
				req2.setDoctor_Code(req.getDoctorCode());
				req2.setDoctor_Name(doctorName);
				req2.setHb_Date(req.getRegDate());
				req2.setHb_Time(hbTime);
				req2.setAm_Pm(req.getAmPm());
				req2.setOperate_Type("0");
				req2.setFlow_No(rsp.getResult_Data().getOrderId());
				req2.setHm_Card_No(req.getMedicalCard());

				AjaxResponse ajaxResponse2 = this.opAppoint(session, req2);
				if(ajaxResponse2.getCode() == ErrorCode.SUCCESS) {
					com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.rsp.Response rsp2 = (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.rsp.Response) ajaxResponse2.getData();
					if("0000".equals(rsp2.getResult_Code())) {
						com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.rsp.Result_Data result_Data = rsp2.getResult_Data();

						com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request req3 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request();
						req3.setOrderId(rsp.getResult_Data().getOrderId());
						req3.setStatus("1");// 成功
						req3.setOperateType("0");
						req3.setAppointNo(result_Data.getAppoint_No());
						req3.setResCode(rsp2.getResult_Code());
						req3.setResMsg(rsp2.getError_Msg());
						req3.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
						req3.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
						req3.setToken(AppPropertyUtil.getProperty("TOKEN"));
						com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.rsp.Response rsp3 = WiseMedicalServiceAPI.updateOrder(req3);

						AjaxResponse ajaxResponse3 = new AjaxResponse();
						JSONObject jsonObject = (JSONObject) JSONObject.toJSON(rsp3);
						jsonObject.put("orderId", rsp.getResult_Data().getOrderId());
						ajaxResponse3.setData(jsonObject);
						return ajaxResponse3;
					} else {
						com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request req3 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request();
						req3.setOrderId(rsp.getResult_Data().getOrderId());
						req3.setStatus("2");// 失败
						req3.setOperateType("0");
						req3.setResCode(rsp2.getResult_Code());
						req3.setResMsg(rsp2.getError_Msg());
						req3.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
						req3.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
						req3.setToken(AppPropertyUtil.getProperty("TOKEN"));
						WiseMedicalServiceAPI.updateOrder(req3);

						return ajaxResponse2;
					}
				} else {
					return ajaxResponse2;
				}
			} else {
				return ajaxResponse;
			}
		} else {
			return ajaxResponse;
		}
	}

	@RequestMapping("/regist")
	@ResponseBody
	@Remarks("挂号")
	@User
	public AjaxResponse regist(HttpSession session, com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request req, String phone_Num, String sms_Code, String hospitalCode, String deptName, String doctorName, String hbTime) throws Exception {
		Date now = new Date();
		String today = DateUtils.getDateString("yyyy-MM-dd");
		Date date0655 = DateUtils.getDate(today + " 06:55:00", "yyyy-MM-dd HH:mm:ss");
		Date date1200 = DateUtils.getDate(today + " 12:00:00", "yyyy-MM-dd HH:mm:ss");
		Date date1315 = DateUtils.getDate(today + " 13:15:00", "yyyy-MM-dd HH:mm:ss");
		Date date1732 = DateUtils.getDate(today + " 17:32:00", "yyyy-MM-dd HH:mm:ss");
		if(!((now.after(date0655) && now.before(date1200)) || (now.after(date1315) && now.before(date1732)))) {
			throw new AIException("只有06:55-12:00以及13:15-17:32两个时间段才允许挂号");
		}

		// 订单保存
		AjaxResponse ajaxResponse = this.saveOrder(session, req, phone_Num, sms_Code);
		if(ajaxResponse.getCode() == ErrorCode.SUCCESS) {
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response rsp = (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response) ajaxResponse.getData();
			if("0000".equals(rsp.getResult_Code())) {
				String orderFee = rsp.getResult_Data().getOrderFee();
				// 挂号费大于0
				if(NumberUtils.toDouble(orderFee, 0d) > 0) {
					// 直接返回支付宝地址
					return this.queryForAlipay(null, rsp.getResult_Data().getOrderId(), orderFee, AppPropertyUtil.getProperty("RETURN_URL") + "/static/pay_success/pay_success.html");
				} else {
					// 调用挂号接口
					com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.req.Request req2 = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.req.Request();
					req2.setHospital_Mark(hospitalCode);
					req2.setHid(req.getHid());
					req2.setPatient_Id(req.getHisPatientId());
					req2.setDept_Code(req.getOfficeCode());
					req2.setDept_Name(deptName);
					req2.setDoctor_Code(req.getDoctorCode());
					req2.setDoctor_Name(doctorName);
					req2.setHb_Date(req.getRegDate());
					req2.setHb_Time(hbTime);
					req2.setAm_Pm(req.getAmPm());
					req2.setOperate_Type("0");
					req2.setSum_Fee(orderFee);
					req2.setPay_Way("0");
					req2.setFlow_No(rsp.getResult_Data().getOrderId());
					req2.setHm_Card_No(req.getMedicalCard());

					AjaxResponse ajaxResponse2 = this.opRegist(session, req2);
					if(ajaxResponse2.getCode() == ErrorCode.SUCCESS) {
						com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Response rsp2 = (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Response) ajaxResponse2.getData();
						if("0000".equals(rsp2.getResult_Code())) {
							com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Result_Data result_Data = rsp2.getResult_Data();

							com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request req3 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request();
							req3.setOrderId(rsp.getResult_Data().getOrderId());
							req3.setStatus("1");// 成功
							req3.setOperateType("1");
							req3.setReceiptNo(result_Data.getReceipt_No());
							req3.setResCode(rsp2.getResult_Code());
							req3.setResMsg(rsp2.getError_Msg());
							req3.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
							req3.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
							req3.setToken(AppPropertyUtil.getProperty("TOKEN"));
							com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.rsp.Response rsp3 = WiseMedicalServiceAPI.updateOrder(req3);

							AjaxResponse ajaxResponse3 = new AjaxResponse();
							ajaxResponse3.setData(rsp3);
							return ajaxResponse3;
						} else {
							com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request req3 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request();
							req3.setOrderId(rsp.getResult_Data().getOrderId());
							req3.setStatus("2");// 失败
							req3.setOperateType("1");
							req3.setResCode(rsp2.getResult_Code());
							req3.setResMsg(rsp2.getError_Msg());
							req3.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
							req3.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
							req3.setToken(AppPropertyUtil.getProperty("TOKEN"));
							WiseMedicalServiceAPI.updateOrder(req3);

							return ajaxResponse2;
						}
					} else {
						return ajaxResponse2;
					}
				}
			} else {
				return ajaxResponse;
			}
		} else {
			return ajaxResponse;
		}
	}

	@RequestMapping("/saveQuestionnaire")
	@ResponseBody
	@Remarks("满意度调查保存")
	@User
	public AjaxResponse saveQuestionnaire(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2022.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2022.rsp.Response rsp = WiseMedicalServiceAPI.saveQuestionnaire(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	@RequestMapping("/queryQuestionnaire")
	@ResponseBody
	@Remarks("查询满意度调查")
	@User
	public AjaxResponse queryQuestionnaire(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Response rsp = WiseMedicalServiceAPI.queryQuestionnaire(req);

		if(rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}

	@RequestMapping("/updateOrder")
	@ResponseBody
	@Remarks("更新订单状态")
	@User
	public AjaxResponse updateOrder(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.rsp.Response rsp = WiseMedicalServiceAPI.updateOrder(req);

		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/addPatientInfo")
	@ResponseBody
	@Remarks("新增就诊人信息")
	@User
	public AjaxResponse addPatientInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2007.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		//000000为虚拟卡号
		if("000000".equals(req.getCardNum())){
			req.setCardNum("");
		}
		req.setOperdate(DateUtils.getDateString("yyyy-MM-dd HH:mm:ss"));
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2007.rsp.Response rsp = WiseMedicalServiceAPI.addPatientInfo(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/changePatientInfo")
	@ResponseBody
	@Remarks("就诊人信息变更")
	@User
	public AjaxResponse changePatientInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2005.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2005.rsp.Response rsp = WiseMedicalServiceAPI.changePatientInfo(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/deletePatient")
	@ResponseBody
	@Remarks("删除就诊人信息")
	@User
	public AjaxResponse deletePatient(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2006.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2006.rsp.Response rsp = WiseMedicalServiceAPI.deletePatient(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}

	@RequestMapping("/queryPatients")
	@ResponseBody
	@Remarks("就诊人列表查询")
	@User
	public AjaxResponse queryPatients(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Response rsp = WiseMedicalServiceAPI.queryPatients(req);
		
		if(rsp.getResult_Data() != null){
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/queryPatientDetail")
	@ResponseBody
	@Remarks("就诊人详细信息查询")
	@User
	public AjaxResponse queryPatientDetail(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Response rsp = WiseMedicalServiceAPI.queryPatientDetail(req);
		
		ajaxResponse.setData(rsp.getResult_Data());
		return ajaxResponse;
	}
	
	@RequestMapping("/queryPatsCardInfo")
	@ResponseBody
	@Remarks("查取就诊卡信息")
	@User
	public AjaxResponse queryPatsCardInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.req.Request req, String sex, String birthdate, String age) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		req.setServiceName("queryPatsCardInfo");
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Response rsp = MpsServiceAPI.queryPatsCardInfo(req);
		
		if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null){
			ajaxResponse.setData(rsp.getResult_Data().getRecord_List().getRecord_Info());
		} else {
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request req2 = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request();
			req2.setHospital_Mark(req.getHospital_Mark());
			req2.setServiceName("healthCardRegistration");
			req2.setCardno("");
			req2.setPatname(req.getPatient_Name());
			req2.setSex(sex);
			req2.setBirthdate(birthdate);
			req2.setAge(age);
			req2.setId_code(req.getId_No());
			req2.setAddress("");
			req2.setPhone(req.getPhone_Number());
			req2.setOper_date(DateUtils.getDateString("yyyy-MM-dd"));
			req2.setOper_time(DateUtils.getDateString("HH:mm:ss"));
			req2.setCard_type("1");
			req2.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
			req2.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
			req2.setToken(AppPropertyUtil.getProperty("TOKEN"));
			req2.setReg_type("1");
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response rsp2 = MpsServiceAPI.healthCardRegistration(req2);
			
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info record_Info = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info();
			record_Info.setPatient_Id(rsp2.getResult_Data().getPatient_Id());
			record_Info.setPatient_Name(rsp2.getResult_Data().getPatient_Name());
			record_Info.setPhone_Number(req.getPhone_Number());
			ajaxResponse.setData(Arrays.asList(record_Info));
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getHealexamInfo")
	@ResponseBody
	@Remarks("健康体检列表查询2")
	@User
	public AjaxResponse getHealexamInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.rsp.Response rsp = WiseMedicalServiceAPI.getHealexamInfo(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getHealexamInfoDetail")
	@ResponseBody
	@Remarks("健康体检详情查询2")
	@User
	public AjaxResponse getHealexamInfoDetail(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Response rsp = WiseMedicalServiceAPI.getHealexamInfoDetail(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	//缓存
	private static Map<String, String> userId2patientIdMap = new HashMap<String, String>();
	
	@RequestMapping("/queryAppPayInfo")
	@ResponseBody
	@Remarks("查询申请单记录")
	@User
	public AjaxResponse queryAppPayInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.req.Request req, String userId, String idNo) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		String patientId = userId2patientIdMap.get(userId)/*"000000578220"*/;
		if(StringUtils.isEmpty(patientId)){
			//通过userId获取对应默认就诊人病人ID
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.req.Request req2 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.req.Request();
			req2.setUserId(userId);
			req2.setHospitalCode(req.getHospital_Mark());
			req2.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
			req2.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
			req2.setToken(AppPropertyUtil.getProperty("TOKEN"));
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Response rsp2 = WiseMedicalServiceAPI.queryPatients(req2);
			
			if(rsp2.getResult_Data() != null && rsp2.getResult_Data().getResult_List() != null){
				com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List[] result_Lists = rsp2.getResult_Data().getResult_List();
				for (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List result_List : result_Lists) {
					String hospitalCode = result_List.getHospitalCode();
					String certCode = result_List.getCertCode();
					String defaultFlag = result_List.getDefaultFlag();
					if(req.getHospital_Mark().equals(hospitalCode) && idNo.endsWith(certCode) && "0".equals(defaultFlag)){
						patientId = result_List.getHisPatientId();
						userId2patientIdMap.put(userId, patientId);
						break;
					}
				}
			}
		}
		if(StringUtils.isNotEmpty(patientId)){
			req.setServiceName("queryAppPayInfo");
			req.setPatient_Id(patientId);
			req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
			req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
			req.setToken(AppPropertyUtil.getProperty("TOKEN"));
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Response rsp = MpsServiceAPI.queryAppPayInfo(req);
			
			if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null){
				ajaxResponse.setData(rsp.getResult_Data().getRecord_List().getRecord_Info());
			}
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/savePayOrder")
	@ResponseBody
	@Remarks("药品、检查检验单缴费订单保存")
	@User
	public AjaxResponse savePayOrder(String data) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request req = JSON.parseObject(data, com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request.class);
		
		req.setPatient_Id(userId2patientIdMap.get(req.getPatient_Id())/*"000000578220"*/);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Response rsp = WiseMedicalServiceAPI.savePayOrder(req);
		
		if(rsp != null && "0000".equals(rsp.getResult_Code())){
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Result_Data result_Data = rsp.getResult_Data();
			ajaxResponse = this.queryForAlipay(result_Data.getSouceType(), result_Data.getFlowNo(), result_Data.getAllAmt()/*"0.01"*/, AppPropertyUtil.getProperty("RETURN_URL") + "/static/pay_success/pay_success2.html");
		} else {
			ajaxResponse.setData(rsp);
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/queryEvaluateList")
	@ResponseBody
	@Remarks("待评价就诊信息查询")
	@User
	public AjaxResponse queryEvaluateList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Response rsp = WiseMedicalServiceAPI.queryEvaluateList(req);
		
		if(rsp.getResult_Data() != null){
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}
		return ajaxResponse;
	}
	
}
