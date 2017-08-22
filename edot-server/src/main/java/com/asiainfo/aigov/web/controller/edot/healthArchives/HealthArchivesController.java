package com.asiainfo.aigov.web.controller.edot.healthArchives;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.api.WiseMedicalServiceAPI;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;

@Controller
@RequestMapping("/healthArchives")
@User
public class HealthArchivesController extends BaseController {

	@RequestMapping("/getBaseinfo")
	@ResponseBody
	@Remarks("查取人基本信息、生活环境信息、档案管理信息")
	public AjaxResponse getBaseinfo(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Response rsp = WiseMedicalServiceAPI.getBaseinfo(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/queryHealthSummaryInfo")
	@ResponseBody
	@Remarks("查取个人健康摘要信息")
	public AjaxResponse queryHealthSummaryInfo(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Response rsp = WiseMedicalServiceAPI.queryHealthSummaryInfo(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/getOutpatientList")
	@ResponseBody
	@Remarks("医疗服务查询（门诊，住院列表查询）")
	public AjaxResponse getOutpatientList(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Response rsp = WiseMedicalServiceAPI.getOutpatientList(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	//localhost:8080/edot/healthArchives/getOutpatientDetails?outpatientId=0001286902
	@RequestMapping("/getOutpatientDetails")
	@ResponseBody
	@Remarks("医疗服务查询-门诊详情查询")
	public AjaxResponse getOutpatientDetails(String outpatientId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.req.Request();
		req.setOutpatientId(outpatientId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Response rsp = WiseMedicalServiceAPI.getOutpatientDetails(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/getInpatientDetails")
	@ResponseBody
	@Remarks("医疗服务查询-住院详情查询")
	public AjaxResponse getInpatientDetails(String inpatientId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.req.Request();
		req.setInpatientId(inpatientId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Response rsp = WiseMedicalServiceAPI.getInpatientDetails(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/getHealexamList")
	@ResponseBody
	@Remarks("健康体检列表查询")
	public AjaxResponse getHealexamList(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.req.Request();
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		req.setIdNo(healthArchivesNo);
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.rsp.Response rsp = WiseMedicalServiceAPI.getHealexamInfo(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getHealexamDetails")
	@ResponseBody
	@Remarks("健康体检详情查询")
	public AjaxResponse getHealexamDetails(String healthExamId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.req.Request();
		req.setHealthArchivesNo(healthExamId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Response rsp = WiseMedicalServiceAPI.getHealexamInfoDetail(req);
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.RecordList recordList = rsp.getRecordList();
		List list = new ArrayList();
		//List<Map<String,String>> list2 = new ArrayList<Map<String,String>>();
		if(recordList!=null){
			for (int i = 0; i < recordList.getRecordCount(); i++) {
				com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record record = recordList.getRecord(i);
				
				boolean ifAdd = false;	//是否添加进去了
				for (int j = 0; j < list.size(); j++) {
					List list2 = (List) list.get(j);
					int list2_size = list2.size();
					if (list2_size > 0) {
						com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record r = (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record) list2.get(list2_size - 1);
						if (r.getTestName().equals(record.getTestName())) {
							list2.add(record);
							ifAdd = true;
							break;
						}
					}
				}
				if(!ifAdd){
					List list2 = new ArrayList();
					list2.add(record);
					list.add(list2);
				}
				if(record.getQualitativeResult() == null){
					
				}
			}
		}
		ajaxResponse.setData(list);
		return ajaxResponse;
	}	
	
	@RequestMapping("/getVaccList")
	@ResponseBody
	@Remarks("预防接种列表查询")
	public AjaxResponse getVaccList(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Response rsp = WiseMedicalServiceAPI.getVaccList(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getVaccDetails")
	@ResponseBody
	@Remarks("预防接种详情查询")
	public AjaxResponse getVaccDetails(String vaccRecordId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.req.Request();
		req.setVaccRecordId(vaccRecordId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Response rsp = WiseMedicalServiceAPI.getVaccDetails(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/getHyperList")
	@ResponseBody
	@Remarks("血压列表查询")
	public AjaxResponse getHyperList(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Response rsp = WiseMedicalServiceAPI.getHyperList(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getHyperDetails")
	@ResponseBody
	@Remarks("血压列表详情查询")
	public AjaxResponse getHyperDetails(String hypertensionFollowupId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3009.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3009.req.Request();
		req.setHypertensionFollowupId(hypertensionFollowupId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3009.rsp.Response rsp = WiseMedicalServiceAPI.getHyperDetails(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/getDiabetesList")
	@ResponseBody
	@Remarks("血糖列表查询")
	public AjaxResponse getDiabetesList(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3010.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3010.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3010.rsp.Response rsp = WiseMedicalServiceAPI.getDiabetesList(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getDiabetesDetails")
	@ResponseBody
	@Remarks("血糖详情查询")
	public AjaxResponse getDiabetesDetails(String diabetes2FollowupId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.req.Request();
		req.setDiabetes2FollowupId(diabetes2FollowupId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Response rsp = WiseMedicalServiceAPI.getDiabetesDetails(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
	@RequestMapping("/getInfectList")
	@ResponseBody
	@Remarks("传染病报告列表查询")
	public AjaxResponse getInfectList(String healthArchivesNo) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.req.Request();
		req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Response rsp = WiseMedicalServiceAPI.getInfectList(req);
		
		if(rsp.getRecordList() != null){
			ajaxResponse.setData(rsp.getRecordList().getRecord());
		}
		return ajaxResponse;
	}
	
	@RequestMapping("/getInfectDetails")
	@ResponseBody
	@Remarks("传染病报告详情查询")
	public AjaxResponse getInfectDetails(String infectionReporId) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.req.Request();
		req.setInfectionReporId(infectionReporId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Response rsp = WiseMedicalServiceAPI.getInfectDetails(req);
		
		ajaxResponse.setData(rsp);
		return ajaxResponse;
	}
	
}
