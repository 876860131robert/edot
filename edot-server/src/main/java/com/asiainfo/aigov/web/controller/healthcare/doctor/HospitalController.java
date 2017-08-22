package com.asiainfo.aigov.web.controller.healthcare.doctor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.attention.PublicUserDoctorAttention;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospitalExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.evaluate.PublicEvaluate;
import com.asiainfo.aigov.model.healthcare.order.PublicOrder;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatients;
import com.asiainfo.aigov.model.healthcare.schedule.PublicDoctorSchedule;
import com.asiainfo.aigov.service.edot.wiseMedical.IWiseMedicalSV;
import com.asiainfo.aigov.service.healthcare.attention.IPublicUserDoctorAttentionService;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicOfficeService;
import com.asiainfo.aigov.service.healthcare.evaluate.IPublicEvaluateService;
import com.asiainfo.aigov.service.healthcare.evaluate.impl.PublicEvaluateService;
import com.asiainfo.aigov.service.healthcare.order.IPublicOrderService;
import com.asiainfo.aigov.service.healthcare.patients.IPublicPatientSerivce;
import com.asiainfo.aigov.service.healthcare.schedule.IPublicDoctorScheduleService;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.aigov.web.http.edot.weatherService.bean.Data;
import com.asiainfo.aigov.web.vo.AttentionInfoVo;
import com.asiainfo.aigov.web.vo.DeptListVo;
import com.asiainfo.aigov.web.vo.DoctorListVo;
import com.asiainfo.aigov.web.vo.DoctorListVo.Regist_Info;
import com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.api.WiseMedicalServiceAPI;
import com.asiainfo.aigov.web.vo.DoctorScheduleInfoVo;
import com.asiainfo.aigov.web.vo.EvaluateListVo;
import com.asiainfo.aigov.web.vo.EvaluateVo;
import com.asiainfo.aigov.web.vo.HospitalInfoVo;
import com.asiainfo.aigov.web.vo.HospitalVo;
import com.asiainfo.aigov.web.vo.OrderVo;
import com.asiainfo.aigov.web.vo.PatientsVo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.IdUtils;
import com.asiainfo.frame.utils.SessionUtil;


@Controller
@RequestMapping("/healthcare/hospital")
public class HospitalController extends BaseController {

	@Autowired
	public IHospitalService hospitalService;

	@Autowired
	public IPublicOfficeService publicOfficeService;

	@Autowired
	public IPublicDoctorService publicDoctorService;

	@Autowired
	public IPublicUserDoctorAttentionService publicUserDoctorAttentionService;

	@Autowired
	public IPublicDoctorScheduleService publicDoctorScheduleService;

	@Autowired
	public IPublicPatientSerivce publicPatientSerivce;
	
	@Autowired
	public IPublicOrderService publicOrderService;
	
	@Autowired
	public IPublicEvaluateService publicEvaluateService;
	
	@Autowired
	private IWiseMedicalSV wiseMedicalSV;

	@RequestMapping("/queryHospital")
	@ResponseBody
	@Remarks("查询医院列表")
	public AjaxResponse queryHospital(String pageCount, String curPageNum, String extraCon) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		Page page = new Page();
		page.setPageCount(Integer.valueOf(curPageNum));
		page.setPageSize(Integer.valueOf(pageCount));
		PublicHospitalExample example = new PublicHospitalExample();
		if (extraCon != null && !extraCon.isEmpty()) {
			PublicHospitalExample.Criteria criteria = example.createCriteria();
			criteria.andNameLike("%" + extraCon + "%");
		}
		try {
			List<PublicHospital> hospitalList = hospitalService.select(example, page);
			List<HospitalVo> result = new ArrayList<HospitalVo>();
			for (PublicHospital bean : hospitalList) {
				HospitalVo data = new HospitalVo();
				data.setHospitalId(String.valueOf(bean.getHospitalId()));
				data.setHospitalCode(bean.getCode());
				data.setHospitalName(bean.getName());
				data.setTel(bean.getTel());
				data.setAdress(bean.getAdress());
				data.setHospitalType(bean.getHospitalType());
				data.setHasSub(String.valueOf(bean.getHasSub()));
				data.setParentId(String.valueOf(bean.getParentId()));
				data.setFigureImg(bean.getHosPicUrl());
				data.setSite(bean.getSite());
				data.setIntro(bean.getIntro());
				data.setHospitalLevel(bean.getHospitalLevel());
				data.setProvinceCode(bean.getProvinceCode());
				data.setCityCode(bean.getCityCode());
				data.setCountyCode(bean.getCountyCode());
				data.setJingDuValue(bean.getJingDuValue());
				data.setWeiDuValue(bean.getWeiDuValue());
				data.setDaoHangPicUrl(bean.getDaoHangPicUrl());
				data.setHosPicUrl(bean.getHosPicUrl());
				data.setDaoHangPicHotPoints(bean.getDaoHangPicHotPoints());
				data.setHosFloorIntr(bean.getHosFloorIntr());
				result.add(data);
			}
			ajaxResponse.setData(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ajaxResponse;
	}

	@RequestMapping("/queryAppointDept")
	@ResponseBody
	@Remarks("查询科室列表")
	public AjaxResponse queryAppointDept(String hospitalCode, String hospitalId, String extraCon) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		List<DeptListVo> DeptListVoList = publicOfficeService.getDeptListVo(hospitalId, extraCon);
		ajaxResponse.setData(DeptListVoList);
		return ajaxResponse;
	}

	@RequestMapping("/queryHospitalInfo")
	@ResponseBody
	@Remarks("查询同步医院基本信息")
	public AjaxResponse queryHospitalInfo(String hospitalCode, String hospitalId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicHospital publicHospital = hospitalService.getPublicHospital(new Long(hospitalId));
		if (publicHospital != null) {
			HospitalInfoVo hospitalInfoVo = new HospitalInfoVo();
			hospitalInfoVo.setHospital_Address(publicHospital.getAdress());
			hospitalInfoVo.setHospital_Image(publicHospital.getHosPicUrl());
			hospitalInfoVo.setHospital_Introduction(publicHospital.getIntro());
			hospitalInfoVo.setHospital_Lat(publicHospital.getWeiDuValue());
			hospitalInfoVo.setHospital_Lng(publicHospital.getJingDuValue());
			hospitalInfoVo.setHospital_Name(publicHospital.getName());
			hospitalInfoVo.setHospital_Nav_Image(publicHospital.getDaoHangPicUrl());
			hospitalInfoVo.setHospital_Nav_Introduction(publicHospital.getHosFloorIntr());
			hospitalInfoVo.setHospital_Short_Name(publicHospital.getName());
			hospitalInfoVo.setHospital_TelPhone(publicHospital.getTel());
			ajaxResponse.setData(hospitalInfoVo);
		} else {
			ajaxResponse.setCode(-1);
			ajaxResponse.setMessage("医院不存在！");
		}

		return ajaxResponse;
	}

	@RequestMapping("/getDateTime")
	@ResponseBody
	@Remarks("获取服务器时间")
	public AjaxResponse getDateTime() {
		AjaxResponse ajaxResponse = new AjaxResponse();

		String curDate = DateUtils.getDateString("yyyy-MM-dd HH:mm:ss");
		ajaxResponse.setData(curDate);
		return ajaxResponse;
	}

	@RequestMapping("/queryAppointDoctor")
	@ResponseBody
	@Remarks("查询医生列表")
	@User
	public AjaxResponse queryAppointDoctor(HttpServletRequest request, String hospitalId, String hospitalCode,
			String deptCode, String startDate, String endDate) throws Exception {

		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userid = user.getUser().getUserId();

		AjaxResponse ajaxResponse = new AjaxResponse();

		List<DoctorListVo> list = new ArrayList<DoctorListVo>();
		List<PublicDoctor> PublicDoctorList = publicDoctorService.getDoctorByOfficeCode(hospitalId, deptCode);

		List<String> doctorIdList = new ArrayList<String>();
		List<String> doctorCodeList = new ArrayList<String>();
		for (PublicDoctor publicDoctor : PublicDoctorList) {
			doctorIdList.add(publicDoctor.getDoctorId());
			doctorCodeList.add(publicDoctor.getDoctorCode());
			DoctorListVo vo = new DoctorListVo();
			vo.setDoctor_Code(publicDoctor.getDoctorCode());
			vo.setDoctor_Id(publicDoctor.getDoctorId());
			vo.setDoctor_Name(publicDoctor.getName());
			vo.setMark_Desc(publicDoctor.getSpecaility());
			vo.setMark_Type(publicDoctor.getNoType());
			vo.setRegist_List(new ArrayList<Regist_Info>());
			list.add(vo);
		}
		// 得到关注医生
		if (!doctorIdList.isEmpty()) {

			List<PublicUserDoctorAttention> attentionList = publicUserDoctorAttentionService.getAttention(userid,
					doctorIdList);

			for (PublicUserDoctorAttention publicUserDoctorAttention : attentionList) {
				for (DoctorListVo vo : list) {
					if (publicUserDoctorAttention.getDoctorId().equals(vo.getDoctor_Id())) {
						vo.setAttentionId(publicUserDoctorAttention.getId());
						break;
					}

				}

			}

		}
		if (!doctorCodeList.isEmpty()) {
			// 得到排版信息
			List<PublicDoctorSchedule> scheduleList = publicDoctorScheduleService.getServiceByDoctor(hospitalId,
					deptCode, doctorCodeList, startDate, endDate);

			for (PublicDoctorSchedule publicDoctorSchedule : scheduleList) {
				for (DoctorListVo vo : list) {
					if (vo.getDoctor_Code().equals(publicDoctorSchedule.getDoctorCode())) {
						List<Regist_Info> registList = vo.getRegist_List();
						Regist_Info registInfo = vo.new Regist_Info();
						String hbDate = DateUtils.getDateString(publicDoctorSchedule.getHbDate(), "yyyy-MM-dd");
						String amPm = publicDoctorSchedule.getAmPm();
						String dateStr = hbDate;
						if (amPm.equals("AM")) {
							dateStr += " 12:00:00";
							registInfo.setAm_Pm("门诊上午");
						} else if (amPm.equals("PM")) {
							dateStr += " 24:00:00";
							registInfo.setAm_Pm("门诊下午");
						}
						Date date = DateUtils.getDate(dateStr, "yyyy-MM-dd HH:mm:ss");
						Date now = new Date();
						// 判断当前时间是否已超过
						if (now.after(date)) {
							continue;
						}

						if (publicDoctorSchedule.getSumFee() != null) {
							registInfo.setSum_Fee(publicDoctorSchedule.getSumFee().toString());
						} else {
							registInfo.setSum_Fee("0");
						}
						if (publicDoctorSchedule.getSumFee() != null) {
							registInfo.setClinic_Fee(publicDoctorSchedule.getClinicFee().toString());
						} else {
							registInfo.setClinic_Fee("0");
						}

						registInfo.setHb_Date(hbDate);
						registInfo.setFlag_Available(publicDoctorSchedule.getIsStopdiagnostic());
						registList.add(registInfo);
						break;
					}
				}
			}

		}

		ajaxResponse.setData(list);

		return ajaxResponse;
	}

	@RequestMapping("/addAttentionDoctor")
	@ResponseBody
	@Remarks("增加关注医生")
	@User
	public AjaxResponse addAttentionDoctor(HttpServletRequest request, String doctorId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		PublicUserDoctorAttention publicUserDoctorAttention = publicUserDoctorAttentionService.getAttention(userId,
				doctorId);
		if (publicUserDoctorAttention != null) {
			publicUserDoctorAttention.setAttentionStatus("0");
			publicUserDoctorAttention.setAttentionTime(new Date());
			publicUserDoctorAttentionService.update(publicUserDoctorAttention);
		} else {
			publicUserDoctorAttention = new PublicUserDoctorAttention();
			publicUserDoctorAttention.setUserId(userId);
			publicUserDoctorAttention.setDoctorId(doctorId);
			publicUserDoctorAttention.setAttentionStatus("0");
			publicUserDoctorAttention.setAttentionTime(new Date());
			publicUserDoctorAttentionService.add(publicUserDoctorAttention);
		}
		String attentionId = publicUserDoctorAttention.getId();
		JSONObject json = new JSONObject();
		json.put("attentionId", attentionId);
		ajaxResponse.setMessage("关注成功！");
		ajaxResponse.setData(json);
		return ajaxResponse;
	}

	@RequestMapping("/deleteAttentionInfo")
	@ResponseBody
	@Remarks("取消关注医生")
	@User
	public AjaxResponse deleteAttentionInfo(HttpServletRequest request, String attentionId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicUserDoctorAttention publicUserDoctorAttention = publicUserDoctorAttentionService.find(attentionId);
		if (publicUserDoctorAttention != null) {
			publicUserDoctorAttention.setAttentionStatus("1");
			publicUserDoctorAttention.setUnattentionTime(new Date());
			publicUserDoctorAttentionService.update(publicUserDoctorAttention);
			JSONObject json = new JSONObject();
			json.put("attentionId", attentionId);
			ajaxResponse.setMessage("关注成功！");
			ajaxResponse.setData(json);
		} else {
			ajaxResponse.setCode(-1);
			ajaxResponse.setMessage("操作失败");

		}
		return ajaxResponse;
	}

	@RequestMapping("/queryRegistHid")
	@ResponseBody
	@Remarks("医生可预约号源查询")
	public AjaxResponse queryRegistHid(String hospitalId, String deptCode, String doctorCode, String hbDate)
			throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		List<PublicDoctorSchedule> scheduleList = publicDoctorScheduleService.getServiceByDoctor(hospitalId, deptCode,
				doctorCode, hbDate);
		List<DoctorScheduleInfoVo> voList = new ArrayList<DoctorScheduleInfoVo>();
		for (PublicDoctorSchedule schedule : scheduleList) {
			DoctorScheduleInfoVo vo = new DoctorScheduleInfoVo();
			vo.setDept_Code(schedule.getDeptCode());
			vo.setDept_Name(schedule.getDeptName());
			vo.setDoctor_Code(schedule.getDoctorCode());
			vo.setDoctor_Name(schedule.getDoctorName());
			vo.setFlag_Used(String.valueOf(schedule.getUsed()));
			vo.setHb_Date(hbDate);
			vo.setHb_Time(hbDate);
			vo.setHid(hospitalId);
			String amPm = schedule.getAmPm();
			if (amPm.equals("AM")) {
				vo.setAm_Pm("上午");
			} else if (amPm.equals("PM")) {
				vo.setAm_Pm("下午");
			}

			voList.add(vo);
		}

		ajaxResponse.setData(voList);
		return ajaxResponse;
	}

	@RequestMapping("/queryPatients")
	@ResponseBody
	@Remarks("就诊人列表查询")
	@User
	public AjaxResponse queryPatients(HttpServletRequest request) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		List<PublicPatients> PublicPatientsList = publicPatientSerivce.getPatientList(userId);
		List<PatientsVo> PatientsVoList = new ArrayList<PatientsVo>();
		for (PublicPatients publicPatients : PublicPatientsList) {
			PatientsVo patientsVo = new PatientsVo();
			patientsVo.setBirthDate(publicPatients.getBirthDate());
			patientsVo.setCertCode(publicPatients.getCertCode());
			patientsVo.setDefaultFlag(publicPatients.getDefaultFlag());
			patientsVo.setHisPatientId(publicPatients.getPatientId());
			patientsVo.setPatientId(publicPatients.getPatientId());
			patientsVo.setPatientName(publicPatients.getPatientName());
			patientsVo.setSex(publicPatients.getSex());
			patientsVo.setPhoneNum(publicPatients.getPhoneNum());
			PatientsVoList.add(patientsVo);
		}
		ajaxResponse.setData(PatientsVoList);
		return ajaxResponse;
	}

	@RequestMapping("/deletePatient")
	@ResponseBody
	@Remarks("删除就诊人信息")
	@User
	public AjaxResponse deletePatient(String patientId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		publicPatientSerivce.delete(patientId);
		return ajaxResponse;
	}

	@RequestMapping("/addPatientInfo")
	@ResponseBody
	@Remarks("新增就诊人信息")
	@User
	public AjaxResponse addPatientInfo(HttpServletRequest request,
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2007.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		PublicPatients publicPatient = new PublicPatients();
		Date date = DateUtils.getDate(req.getBirthDate(), "yyyy-MM-dd");
		publicPatient.setBirthDate(DateUtils.getDateString(date, "yyyyMMdd"));
		publicPatient.setCertCode(req.getCertCode());
		publicPatient.setDefaultFlag(req.getDefaultFlag());
		publicPatient.setPatientName(req.getPatientName());
		publicPatient.setOperDate(new Date());
		publicPatient.setPhoneNum(req.getPhoneNum());
		publicPatient.setSex(req.getSex());
		publicPatient.setStatus("0");
		publicPatient.setOperId(userId);
		publicPatient.setUserId(userId);
		publicPatientSerivce.add(publicPatient);
		return ajaxResponse;
	}

	@RequestMapping("/queryPatientDetail")
	@ResponseBody
	@Remarks("就诊人详细信息查询")
	@User
	public AjaxResponse queryPatientDetail(
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicPatients publicPatient = publicPatientSerivce.find(req.getPaitentId());
		PatientsVo patientsVo = new PatientsVo();
		patientsVo.setPatientId(publicPatient.getPatientId());
		Date date = DateUtils.getDate(publicPatient.getBirthDate(), "yyyyMMdd");
		patientsVo.setBirthDate(DateUtils.getDateString(date, "yyyy-MM-dd"));
		patientsVo.setCertCode(publicPatient.getCertCode());
		patientsVo.setDefaultFlag(publicPatient.getDefaultFlag());
		patientsVo.setHisPatientId(publicPatient.getPatientId());
		patientsVo.setPatientId(publicPatient.getPatientId());
		patientsVo.setPatientName(publicPatient.getPatientName());
		patientsVo.setSex(publicPatient.getSex());
		patientsVo.setPhoneNum(publicPatient.getPhoneNum());
		ajaxResponse.setData(patientsVo);
		return ajaxResponse;
	}

	@RequestMapping("/changePatientInfo")
	@ResponseBody
	@Remarks("就诊人信息变更")
	@User
	public AjaxResponse changePatientInfo(
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2005.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicPatients publicPatient = publicPatientSerivce.find(req.getPatientId());
		Date date = DateUtils.getDate(req.getBirthDate(), "yyyy-MM-dd");
		publicPatient.setBirthDate(DateUtils.getDateString(date, "yyyyMMdd"));
		publicPatient.setCertCode(req.getCertCode());
		publicPatient.setDefaultFlag(req.getDefaultFlag());
		publicPatient.setPatientName(req.getPatientName());
		publicPatient.setOperDate(new Date());
		publicPatient.setPhoneNum(req.getPhoneNum());
		publicPatient.setSex(req.getSex());
		publicPatient.setStatus("0");
		publicPatientSerivce.update(publicPatient);
		return ajaxResponse;
	}

	@RequestMapping("/queryAttentionInfo")
	@ResponseBody
	@Remarks("我的关注")
	@User
	public AjaxResponse queryAttentionInfo(HttpServletRequest request) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		List<AttentionInfoVo> attentionInfoVos=new ArrayList<AttentionInfoVo>();
		List<PublicUserDoctorAttention>  attentionList=publicUserDoctorAttentionService.getAttention(userId);
		List<String> doctorIds=new ArrayList<String>();
		for (PublicUserDoctorAttention publicUserDoctorAttention : attentionList) {
			doctorIds.add(publicUserDoctorAttention.getDoctorId());
		}
		if(doctorIds!=null && !doctorIds.isEmpty()){
			List<PublicDoctor> PublicDoctorList=publicDoctorService.getDoctorList(doctorIds);
			
			for (PublicUserDoctorAttention publicUserDoctorAttention : attentionList) {
				for (PublicDoctor publicDoctor : PublicDoctorList) {
					if(publicDoctor.getDoctorId().equals(publicUserDoctorAttention.getDoctorId())){
						AttentionInfoVo vo=new AttentionInfoVo();
						vo.setAttentionId(publicUserDoctorAttention.getId());
						vo.setDoctorCode(publicDoctor.getDoctorCode());
						vo.setDoctorId(publicDoctor.getDoctorId());
						vo.setDoctorLevel(publicDoctor.getDoctorLevel());
						vo.setDoctorName(publicDoctor.getName());
						PublicOffice publicOffice=publicOfficeService.getPublicOfficeByCode(publicDoctor.getHospitalId().toString(),publicDoctor.getOfficeCode());
						vo.setOfficeCode(publicOffice.getCode());
						vo.setOfficeName(publicOffice.getName());
						vo.setMarkType(publicDoctor.getNoType());
						vo.setUserId(userId);
						
						PublicHospital hospital=hospitalService.getPublicHospital(publicDoctor.getHospitalId().longValue());
						vo.setHospitalCode(hospital.getCode());
						vo.setHospitalId(hospital.getHospitalId().toString());
						vo.setHospitalLevel(hospital.getHospitalLevel());
						vo.setHospitalName(hospital.getName());
						attentionInfoVos.add(vo);
						break;
					}
				}
			}
		}
		
		ajaxResponse.setData(attentionInfoVos);
		/*com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request();
		req.setUserId(userId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Response rsp = WiseMedicalServiceAPI
				.queryAttentionInfo(req);

		if (rsp.getResult_Data() != null) {
			ajaxResponse.setData(rsp.getResult_Data().getResult_List());
		}*/
		return ajaxResponse;
	}
	
	@RequestMapping("/queryPatientList")
	@ResponseBody
	@User
	@Remarks("就诊人列表查询")
	public AjaxResponse queryPatientList( HttpServletRequest request,String hospitalId, String hospitalCode) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		List<PublicPatients> PublicPatientsList = publicPatientSerivce.getPatientList(userId);
		List<PatientsVo> PatientsVoList = new ArrayList<PatientsVo>();
		for (PublicPatients publicPatients : PublicPatientsList) {
			PatientsVo patientsVo = new PatientsVo();
			patientsVo.setBirthDate(publicPatients.getBirthDate());
			patientsVo.setCertCode(publicPatients.getCertCode());
			patientsVo.setDefaultFlag(publicPatients.getDefaultFlag());
			patientsVo.setHisPatientId(publicPatients.getPatientId());
			patientsVo.setPatientId(publicPatients.getPatientId());
			patientsVo.setPatientName(publicPatients.getPatientName());
			patientsVo.setSex(publicPatients.getSex());
			patientsVo.setPhoneNum(publicPatients.getPhoneNum());
			PatientsVoList.add(patientsVo);
		}
		ajaxResponse.setData(PatientsVoList);
		return ajaxResponse;
	}
	
	@RequestMapping("/appoint")
	@ResponseBody
	@Remarks("预约")
	@User
	public AjaxResponse appoint(HttpServletRequest request, com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request req, String phone_Num, String sms_Code, String hospitalCode, String deptName, String doctorName, String hbTime) throws Exception {
		// 订单保存
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicOrder order=new PublicOrder();
		String uuid=IdUtils.uuid();
		order.setId(uuid);
		order.setOrderId(uuid);
		order.setPatientId(req.getPatientId());
		order.setPatientName(req.getPatientName());
		order.setPatientCertNo(req.getPatientCertNo());
		order.setHospitalId(req.getHospitalId());
		order.setHospitalCode(hospitalCode);
		order.setOfficeId(req.getOfficeId());
		order.setOfficeCode(req.getOfficeCode());
		order.setStartTime(DateUtils.getDate(hbTime, "yyyy-MM-dd"));
		order.setOrderTime(new Date());
		order.setDoctorId(req.getDoctorId());
		order.setDoctorCode(req.getDoctorCode());
		order.setOrderFee(new BigDecimal(req.getRegFee()));
		order.setAttendCardNum(req.getMedicalCard());
		order.setStatus("1");
		order.setPatientTel(phone_Num);
		order.setUserId(userId);
		order.setAmPm(req.getAmPm());
		order.setOperateType(new BigDecimal("0"));
		order.setAppTime(DateUtils.getDate(hbTime, "yyyy-MM-dd"));
		publicOrderService.add(order);
		ajaxResponse.setData(order);
		return ajaxResponse;
	}
	
	@RequestMapping("/queryOrder")
	@ResponseBody
	@Remarks("预约挂号订单查询")
	public AjaxResponse queryOrder(HttpServletRequest request, String orderId, String evaluateStatus, String visitStauts, Boolean isToday) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		
		List<PublicOrder>  orderList = publicOrderService.queryOrder(userId,orderId);
		List<OrderVo>  list =new ArrayList<OrderVo>();
		for (PublicOrder publicOrder : orderList) {
			String json=JSONObject.toJSONString(publicOrder);
			OrderVo vo=JSONObject.parseObject(json,OrderVo.class);
			String doctorId=publicOrder.getDoctorId();
			PublicDoctor publicDoctor=publicDoctorService.find(doctorId);
			vo.setDoctorLevel(publicDoctor.getDoctorLevel());
			vo.setDoctorName(publicDoctor.getName());
			PublicHospital publicHospital=hospitalService.getPublicHospital(new Long( publicOrder.getHospitalId()));
			vo.setHospitalName(publicHospital.getName());
			PublicOffice office=publicOfficeService.getPublicOfficeByCode(publicOrder.getHospitalId(), publicOrder.getOfficeCode());
			vo.setOfficeCode(office.getCode());
			vo.setOfficeName(office.getName());
			list.add(vo);
		}
		if(list != null && !list.isEmpty()) {
			
			// 只显示今天之后的预约信息
			if(isToday!=null && isToday) {
				List<OrderVo> list2 = new ArrayList<OrderVo>();
				for(OrderVo resultList : list) {
					String curDate = DateUtils.getDateString("yyyyMMdd");
					Date d2 = resultList.getAppTime();
					Date d1 = DateUtils.getDate(curDate, "yyyyMMdd");
					if(d2.getTime() >= d1.getTime()) {
						long d = (d2.getTime() - d1.getTime()) / (1000 * 3600 * 24);
						resultList.setAttendCardNum(d+"");	//还剩天数
						list2.add(resultList);
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
	
	@RequestMapping("/queryNotEvaluateList")
	@ResponseBody
	@Remarks("待评价就诊信息查询")
	@User
	public AjaxResponse queryNotEvaluateList(HttpServletRequest request,com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		
		List<PublicOrder>  orderList=publicOrderService.queryEvaluateList(userId,"wait_evaluate");
		List<EvaluateListVo> voList=new ArrayList<EvaluateListVo>();
		for (PublicOrder publicOrder : orderList) {
			EvaluateListVo vo=new EvaluateListVo();
			vo.setId(publicOrder.getOrderId());
			vo.setCreate_date(publicOrder.getOrderTime());
			PublicDoctor publicDoctor=publicDoctorService.find(publicOrder.getDoctorId());
			vo.setDoctor_name(publicDoctor.getName());
			vo.setEvaluate_status("0");
			PublicHospital hospital= hospitalService.getPublicHospital(new Long(publicOrder.getHospitalId()));
			vo.setHospital_code(hospital.getCode());
			vo.setHospital_name(hospital.getName());
			PublicOffice publicOffice=publicOfficeService.find(publicOrder.getOfficeCode());
			vo.setOffice_code(publicOffice.getCode());
			vo.setOffice_name(publicOffice.getName());
			vo.setPatient_name(publicOrder.getPatientName());
			vo.setVisit_date(publicOrder.getActualTime());
			voList.add(vo);
		}
		ajaxResponse.setData(voList);
		
		return ajaxResponse;
	}
	
	@RequestMapping("/queryEvaluateList")
	@ResponseBody
	@Remarks("已评价就诊信息查询")
	@User
	public AjaxResponse queryEvaluateList(HttpServletRequest request,com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request req) throws Exception {
AjaxResponse ajaxResponse = new AjaxResponse();
		
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		
		List<PublicOrder>  orderList=publicOrderService.queryEvaluateList(userId,"complete");
		List<EvaluateListVo> voList=new ArrayList<EvaluateListVo>();
		for (PublicOrder publicOrder : orderList) {
			EvaluateListVo vo=new EvaluateListVo();
			vo.setId(publicOrder.getOrderId());
			vo.setCreate_date(publicOrder.getOrderTime());
			PublicDoctor publicDoctor=publicDoctorService.find(publicOrder.getDoctorId());
			vo.setDoctor_name(publicDoctor.getName());
			vo.setEvaluate_status("1");
			PublicHospital hospital= hospitalService.getPublicHospital(new Long(publicOrder.getHospitalId()));
			vo.setHospital_code(hospital.getCode());
			vo.setHospital_name(hospital.getName());
			PublicOffice publicOffice=publicOfficeService.find(publicOrder.getOfficeCode());
			vo.setOffice_code(publicOffice.getCode());
			vo.setOffice_name(publicOffice.getName());
			vo.setPatient_name(publicOrder.getPatientName());
			vo.setVisit_date(publicOrder.getActualTime());
			voList.add(vo);
		}
		ajaxResponse.setData(voList);
		
		return ajaxResponse;
	}
	
	
	@RequestMapping("/saveQuestionnaire")
	@ResponseBody
	@Remarks("满意度调查保存")
	@User
	public AjaxResponse saveQuestionnaire(HttpServletRequest request,com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2022.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicEvaluate publicEvaluate=publicEvaluateService.find(req.getId());
		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		
		if(publicEvaluate==null){
			publicEvaluate =new PublicEvaluate();
			publicEvaluate.setTreatmentTime(new Date());
		}
		publicEvaluate.setDoctorCode(req.getDoctorCode());
		publicEvaluate.setHospatilCode(req.getHospatilCode());
		publicEvaluate.setOfficeCode(req.getOfficeCode());
		publicEvaluate.setOrderId(req.getOrderId());
		publicEvaluate.setPaitentCertNo(req.getPaitentCertNo());
		publicEvaluate.setPatientName(req.getPatientName());
		publicEvaluate.setQuestion1(new BigDecimal(req.getQuestion1()));
		publicEvaluate.setQuestion2(new BigDecimal(req.getQuestion2()));
		publicEvaluate.setQuestion3(new BigDecimal(req.getQuestion3()));
		publicEvaluate.setQuestion4(new BigDecimal(req.getQuestion4()));
		publicEvaluate.setQuestion5(new BigDecimal(req.getQuestion5()));
		publicEvaluate.setQuestion6(req.getQuestion6());
		publicEvaluate.setQuestion7(req.getQuestion7());
		publicEvaluate.setUserId(userId);
		
		//publicEvaluate.setTotalScore(totalScore);
		if(publicEvaluate.getEvaluateId()==null){
			publicEvaluateService.add(publicEvaluate);
			PublicOrder publicOrder=publicOrderService.find(req.getOrderId());
			publicOrder.setEvaluateStatus("complete");
			publicOrderService.update(publicOrder);
		}else{
			publicEvaluateService.update(publicEvaluate);
		}
		
		return ajaxResponse;
	}

	@RequestMapping("/queryQuestionnaire")
	@ResponseBody
	@Remarks("查询满意度调查")
	@User
	public AjaxResponse queryQuestionnaire(HttpServletRequest request,com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request req) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();

		UserSessionInfo user = SessionUtil.getUserSessionInfo(request);
		String userId = user.getUser().getUserId();
		List<PublicEvaluate> evaluateList=publicEvaluateService.queryQuestionnaire(userId, req.getOrderId());
		ajaxResponse.setData(evaluateList);
		return ajaxResponse;
	}
	
	@RequestMapping("/updateOrder")
	@ResponseBody
	@Remarks("更新订单状态")
	@User
	public AjaxResponse updateOrder(HttpServletRequest request,String orderId,String status,String operateType) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		PublicOrder publicOrder=publicOrderService.find(orderId);
		publicOrder.setStatus(status);
		publicOrder.setOperateType(new BigDecimal(operateType));
		publicOrderService.update(publicOrder);
		return ajaxResponse;
	}
	
	
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
}
