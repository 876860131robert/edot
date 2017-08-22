package com.asiainfo.aigov.web.webservice.healthcare;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.springframework.context.ApplicationContext;
import org.springframework.remoting.jaxrpc.ServletEndpointSupport;

import com.ai.common.util.TimeUtil;
import com.asiainfo.aigov.model.healthcare.doctor.PublicBlacklist;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorScheduleNumber;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.order.PublicOrder;
import com.asiainfo.aigov.model.healthcare.schedule.PublicDoctorSchedule;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicBlackListService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorScheduleNumberService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicOfficeService;
import com.asiainfo.aigov.service.healthcare.doctor.impl.HospitalServiceImpl;
import com.asiainfo.aigov.service.healthcare.doctor.impl.PublicBlackListServiceImpl;
import com.asiainfo.aigov.service.healthcare.doctor.impl.PublicDoctorScheduleNumberServiceImpl;
import com.asiainfo.aigov.service.healthcare.doctor.impl.PublicDoctorServiceImpl;
import com.asiainfo.aigov.service.healthcare.doctor.impl.PublicOfficeService;
import com.asiainfo.aigov.service.healthcare.order.IPublicOrderService;
import com.asiainfo.aigov.service.healthcare.order.impl.PublicOrderService;
import com.asiainfo.aigov.service.healthcare.schedule.IPublicDoctorScheduleService;
import com.asiainfo.aigov.service.healthcare.schedule.impl.PublicDoctorScheduleService;
import com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Request;
import com.asiainfo.aigov.web.webservice.healthcare.healthcareService.response.Response;

/**
 * 医院接口
 * 
 * @author 柯永锥
 * @email keyz@asiainfo.com
 * @createTime 2017-05-24 11:39:00
 *
 */
public class HealthcareService extends ServletEndpointSupport{
	
	private ApplicationContext applicationContext;  
	
	private IHospitalService hospitalService;
	
	public IPublicOfficeService officeService; 
	
	public IPublicDoctorService publicDoctorService;
	
	public IPublicDoctorScheduleService scheduleService;
	
	public IPublicDoctorScheduleNumberService scheduleNumberService; 
	
	public IPublicBlackListService blackListService;
	
	public IPublicOrderService publicOrderService;
	
    @Override  
    protected void onInit() throws ServiceException {  
        // 初始化Spirng 配置  
        applicationContext = super.getApplicationContext();
        hospitalService=(HospitalServiceImpl)applicationContext.getBean("hospitalServiceImpl");
        officeService=(PublicOfficeService)applicationContext.getBean("publicOfficeService");
        publicDoctorService=(PublicDoctorServiceImpl)applicationContext.getBean("publicDoctorServiceImpl");
        scheduleService=(PublicDoctorScheduleService)applicationContext.getBean("publicDoctorScheduleService");
        scheduleNumberService=(PublicDoctorScheduleNumberServiceImpl)applicationContext.getBean("publicDoctorScheduleNumberServiceImpl");
        blackListService=(PublicBlackListServiceImpl)applicationContext.getBean("publicBlackListServiceImpl");
        publicOrderService=(PublicOrderService)applicationContext.getBean("publicOrderService");
    }  
	
    /**
     * 医院HIS主动上传医生排班表信息接口
     * @param xml
     * @return
     */
	public String queryPlatFormDoctorSchedule(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormDoctorSchedule");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Request.unmarshal(in);
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_List recordList;
			recordList=request.getRecord_List();
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_Info recordInfo;
			for(int i=0;i<recordList.getRecord_InfoCount();i++){
				recordInfo=recordList.getRecord_Info(i);
				PublicDoctorSchedule publicSchedule=new PublicDoctorSchedule();
				
				publicSchedule.setHospitalId(request.getHospital_Mark());
				publicSchedule.setScheduleId(recordInfo.getSchedule_Id());
				publicSchedule.setDeptCode(recordInfo.getDept_Code());
				publicSchedule.setDeptName(recordInfo.getDept_Name());
				publicSchedule.setStandardOfficeId(recordInfo.getStandard_Office_Id());
				publicSchedule.setDoctorCode(recordInfo.getDoctor_Code());
				publicSchedule.setDoctorName(recordInfo.getDoctor_Name());
				publicSchedule.setMarkType(recordInfo.getMark_Type());
				publicSchedule.setMarkDesc(recordInfo.getMark_Desc());
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				publicSchedule.setHbDate(df.parse(recordInfo.getHb_Date()));
				publicSchedule.setAmPm(recordInfo.getAm_Pm());
				publicSchedule.setLimit(new Short(recordInfo.getLimit()));
				publicSchedule.setSumFee(new BigDecimal(recordInfo.getSum_Fee()));
				publicSchedule.setClinicFee(new BigDecimal(recordInfo.getClinic_Fee()));
				publicSchedule.setAverageMinute(recordInfo.getAverage_Minute());
				publicSchedule.setUpdateTime(new Date());
				publicSchedule.setIsStopdiagnostic(recordInfo.getIs_StopDiagnostic());
				publicSchedule.setUsed(new Short(recordInfo.getUsed()));
				scheduleService.save(publicSchedule);
			}
			
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	/**
	 * 医院HIS主动上传医生排班表信息接口
	 * @param xml
	 * @return
	 */
	public String queryPlatFormDoctorScheduleNumber(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormDoctorSchedule");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Request.unmarshal(in);
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_List recordList;
			recordList=request.getRecord_List();
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_Info recordInfo;
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			for(int i=0;i<recordList.getRecord_InfoCount();i++){
				recordInfo=recordList.getRecord_Info(i);
				PublicDoctorScheduleNumber scheduleNumber=new PublicDoctorScheduleNumber();
				
				scheduleNumber.setHospitalId(request.getHospital_Mark());
				scheduleNumber.setScheduleId(recordInfo.getSchedule_Id());
				scheduleNumber.setHid(recordInfo.getHid());
				scheduleNumber.setOrderNo(recordInfo.getOrder_no());
				scheduleNumber.setStartTime(df.parse(recordInfo.getStart_Time()));
				scheduleNumber.setEndTime(df.parse(recordInfo.getEnd_Time()));
				scheduleNumber.setLimit(new Short(recordInfo.getLimit()));
				scheduleNumber.setUpdateTime(new Date());
				scheduleNumber.setUsed(new Short(recordInfo.getUsed()));
				scheduleNumberService.save(scheduleNumber);
			}
			
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	/**
	 * 医院HIS主动上传已经预约的信息
	 * @param xml
	 * @return
	 */
	public String queryPlatFormPublicOrder(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormPublicOrder");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Request.unmarshal(in);
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_List recordList;
			recordList=request.getRecord_List();
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_Info recordInfo;
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for(int i=0;i<recordList.getRecord_InfoCount();i++){
				recordInfo=recordList.getRecord_Info(i);
				PublicOrder publicOrder=new PublicOrder();
				publicOrder.setHospitalId(request.getHospital_Mark());
				publicOrder.setAppointNo(recordInfo.getAppoint_No());
				publicOrder.setHid(recordInfo.getHid());
				publicOrder.setStartTime(df.parse(recordInfo.getHb_Date()));
				publicOrder.setDoctorCode(recordInfo.getDoctor_Code());
				publicOrder.setOfficeCode(recordInfo.getDept_Code());
				publicOrder.setOrderTime(df2.parse(recordInfo.getRegister_Time()));
				publicOrder.setOperateType(new BigDecimal(recordInfo.getStatus()));
				publicOrder.setStartTime(df.parse(recordInfo.getStart_Time()));
				publicOrder.setEndTime(df.parse(recordInfo.getEnd_Time()));
				publicOrder.setSourceType(recordInfo.getSource());
				publicOrder.setPatientName(recordInfo.getPatient_Name());
				publicOrder.setPatientId(recordInfo.getPatient_Id());
				publicOrder.setAttendCardNum(recordInfo.getCard_No());
				publicOrder.setPatientCertNo(recordInfo.getId_No());
				publicOrder.setPatientTel(recordInfo.getPatient_Tel());
				publicOrder.setStatus("1");
				publicOrderService.save(publicOrder);
			}
			
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	/**
	 * 医院HIS主动上传黑名单患者信息
	 * @param xml
	 * @return
	 */
	public String queryPlatFormPublicBlackList(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormPublicBlackList");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Request.unmarshal(in);
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_List recordList;
			recordList=request.getRecord_List();
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_Info recordInfo;
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			for(int i=0;i<recordList.getRecord_InfoCount();i++){
				recordInfo=recordList.getRecord_Info(i);
				PublicBlacklist blacklist=new PublicBlacklist();
				blacklist.setHospitalId(new BigDecimal(request.getHospital_Mark()));
				blacklist.setBlacklistId(recordInfo.getBlackList_Id());
				blacklist.setName(recordInfo.getName());
				blacklist.setIdNo(recordInfo.getId_No());
				blacklist.setCardNo(recordInfo.getCard_No());
				blacklist.setBlackDate(df.parse(recordInfo.getBlack_Date()));
				blacklist.setStatus(recordInfo.getStatus());
				blackListService.save(blacklist);
			}
			
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	/**
	 * 医院HIS主动上传医院基本信息
	 * @param xml
	 * @return
	 */
	public String queryPlatFormHospitalInfo(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormHospitalInfo");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request.unmarshal(in);
			PublicHospital hospital=new PublicHospital();
			hospital.setAdress(request.getAddress());
			hospital.setHospitalId(new BigDecimal(request.getHospital_Mark()));
			hospital.setCode(request.getCode());
			hospital.setName(request.getName());
			hospital.setTel(request.getTel());
			hospital.setAdress(request.getAddress());
			hospital.setProvinceCode(request.getProvince_Code());
			hospital.setCityCode(request.getCity_Code());
			hospital.setCountyCode(request.getCounty_Code());
			hospital.setHospitalLevel(request.getHospital_Level());
			hospital.setIntro(request.getIntro());
			hospital.setHosFloorIntr(request.getHos_Floor_Intr());
			hospital.setSite(request.getSite());
			hospital.setDeleted(new BigDecimal(request.getDeleted()));
			hospitalService.save(hospital);
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	/**
	 * 医院HIS主动上传科室基本信息
	 * @param xml
	 * @return
	 */
	public String queryPlatFormDeptInfo(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormDeptInfo");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Request.unmarshal(in);
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_List recordList;
			recordList=request.getRecord_List();
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_Info recordInfo;
			for(int i=0;i<recordList.getRecord_InfoCount();i++){
				recordInfo=recordList.getRecord_Info(i);
				PublicOffice publicOffice=new PublicOffice();
				publicOffice.setCode(recordInfo.getCode());
				publicOffice.setName(recordInfo.getName());
				publicOffice.setOfficeJianPin(recordInfo.getOffice_Jian_Pin());
				publicOffice.setStandardOfficeId(recordInfo.getStandard_Office_Id());
				publicOffice.setSummary(recordInfo.getSummary());
				publicOffice.setDeleted(new BigDecimal(recordInfo.getDeleted()));
				publicOffice.setHospitalId(new BigDecimal(request.getHospital_Mark()));
				officeService.save(publicOffice);
			}
			
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
	
	/**
	 * 医院HIS主动上传医生信息
	 * @param xml
	 * @return
	 */
	public String queryPlatFormDoctorInfo(String xml){
		StringReader in = new StringReader(xml);
		com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Request request;
		Response response=new Response();
		response.setResult_Code("0000");
		response.setServiceName("queryPlatFormDoctorInfo");
		try {
			request=com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Request.unmarshal(in);
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_List recordList;
			recordList=request.getRecord_List();
			com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_Info recordInfo;
			for(int i=0;i<recordList.getRecord_InfoCount();i++){
				recordInfo=recordList.getRecord_Info(i);
				PublicDoctor publicDoctor=new PublicDoctor();
				publicDoctor.setDoctorCode(recordInfo.getDoctor_Code());
				publicDoctor.setHospitalId(new BigDecimal(request.getHospital_Mark()));
				publicDoctor.setName(recordInfo.getName());
				publicDoctor.setOfficeCode(recordInfo.getOffice_Code());
				publicDoctor.setSexCode(recordInfo.getSex_Code());
				publicDoctor.setEducationName(recordInfo.getDegree());
				publicDoctor.setDoctorLevel(recordInfo.getTech_Title());
				publicDoctor.setSpecaility(recordInfo.getSpecaility());
				publicDoctor.setDeleted(new BigDecimal(recordInfo.getDeleted()));
				publicDoctorService.save(publicDoctor);
			}
			
		} catch (Exception e) {
			response.setResult_Code("0001");
			response.setError_Msg(e.getMessage());
		}
		StringWriter out = new StringWriter();
		try {
			response.marshal(out);
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
}
