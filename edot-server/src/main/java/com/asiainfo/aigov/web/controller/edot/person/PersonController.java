package com.asiainfo.aigov.web.controller.edot.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.common.cache.redis.JRedisPoolUtils;
import com.ai.common.ip.IPSeeker;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.model.edot.work.UserWork;
import com.asiainfo.aigov.service.edot.hotLine.IHotMailService;
import com.asiainfo.aigov.service.edot.work.impl.UserWorkService;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.aigov.web.webservice.edot.mpsService.api.MpsServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.api.WiseMedicalServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.work.UserWorkWebService;
import com.asiainfo.aigov.web.webservice.edot.work.bean.CaseInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.ChinaDate;
import com.asiainfo.frame.utils.PubTools;
import com.asiainfo.frame.utils.SessionUtil;
@Controller
@RequestMapping("/person")
@User
public class PersonController extends BaseController {
	private static Logger logger = Logger.getLogger(PersonController.class);
	@Autowired
	private MpsServiceAPI mpsServiceAPI;
	@Autowired
	private WiseMedicalServiceAPI wiseMedicalServiceAPI;
	@Autowired
	private UserWorkService userWorkService;
	@Autowired
	private IHotMailService hotMailService;
	@Autowired
	private JRedisPoolUtils jRedisPoolUtils;
	
	@RequestMapping("/queryAppointOrder")
	@ResponseBody
	@Remarks("预约查询")
	public AjaxResponse queryAppointOrder(@RequestParam String patientId,@RequestParam String hospitalMark)
			throws Exception {
/*		jRedisPoolUtils.setHSet("TEST", "001", "value_test");
		String test = (String)jRedisPoolUtils.getHSet("TEST", "001");
		System.out.println("==============>"+test);*/
		com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1008.req.Request 
		   req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1008.req.Request();
		req.setPatient_Id(patientId);
		req.setHospital_Mark(hospitalMark);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		req.setServiceName("queryAppointOrder");
		AjaxResponse resp = new AjaxResponse();
		resp.setData(mpsServiceAPI.queryAppointOrder(req));
		return resp;
	}
	
	@RequestMapping("/getOutpatientList")
	@ResponseBody
	@Remarks("门诊记录查询")
	public AjaxResponse getOutpatientList(@RequestParam String healthArchivesNo )
			throws Exception {
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.req.Request 
		  req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.req.Request();
        req.setHealthArchivesNo(healthArchivesNo);
		AjaxResponse resp = new AjaxResponse();
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		resp.setData(wiseMedicalServiceAPI.getOutpatientList(req));
		return resp;
	}
	
	@RequestMapping("/getInpatientDetails")
	@ResponseBody
	@Remarks("门诊详情查询")
	public AjaxResponse getInpatientDetails(@RequestParam String outpatientId)
			throws Exception {
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.req.Request 
		  req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.req.Request();
        req.setInpatientId(outpatientId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		AjaxResponse resp = new AjaxResponse();
		resp.setData(wiseMedicalServiceAPI.getInpatientDetails(req));
		return resp;
	}
	
	
	@RequestMapping("/getHealexamList")
	@ResponseBody
	@Remarks("体检列表查询")
	public AjaxResponse getHealexamList(@RequestParam String healthArchivesNo )
			throws Exception {
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.req.Request
		  req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.req.Request();
        req.setHealthArchivesNo(healthArchivesNo);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		AjaxResponse resp = new AjaxResponse();
		resp.setData(wiseMedicalServiceAPI.getHealexamList(req));
		return resp;
	}
	
	@RequestMapping("/getHealexamDetails")
	@ResponseBody
	@Remarks("体检详情查询")
	public AjaxResponse getHealexamDetails(@RequestParam String healthExamId )
			throws Exception {
		com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.req.Request
		  req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.req.Request();
        req.setHealthExamId(healthExamId);
		req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
		req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
		req.setToken(AppPropertyUtil.getProperty("TOKEN"));
		AjaxResponse resp = new AjaxResponse();
		resp.setData(wiseMedicalServiceAPI.getHealexamDetails(req));
		return resp;
	}
	
	@RequestMapping("/qryUserWorkGuide")
	@ResponseBody
	@Remarks("获取办事列表")
	@User
	public AjaxResponse qryUserWorkGuide(@RequestParam String mobile,
			@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		Page page = new Page();
		page.setPageIndex(Integer.valueOf(curPageNum));
		page.setPageSize(Integer.valueOf(pageCount));
		
		/**
		 * 待办:2015050751558979、补正:201603230145137331
			不予许可:201607220107847763、退件:201605180135371488、不予受理:2015070928341470
			许可:2015051169915157、已发证:2015050583547409
		 */
//		if(AppPropertyUtil.isDebug()) mobile = "18082211212";
		List<CaseInfo> list = UserWorkWebService.searchCaseInfos(mobile, curPageNum, pageCount);
		if(list!=null){
			for (CaseInfo caseInfo : list) {
				String caseapplydate = caseInfo.getCaseapplydate();
				if (caseapplydate.length() > 19) {
					caseInfo.setCaseapplydate(caseapplydate.substring(0, 19));
				}
			}
		}
		resp.setData(list);
		return resp;
	}
	
	@RequestMapping("/qryUnReadStatusCount")
	@ResponseBody
	@Remarks("获取已审批未读取数")
	public JSONObject qryUnReadStatusCount(@RequestParam String userId )
			throws Exception {
		JSONObject result = new JSONObject();
		result.put("code", "0");
		result.put("message","操作成功！");
		try{
			
			Object value = jRedisPoolUtils.getHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId);
			int count = 0;
			if(value == null){
				count = userWorkService.qryUnReadStatusCount(userId);
				jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId,count);
			}else{
				count = Integer.parseInt(value.toString());
			}
			result.put("unReadCount", count);
		}catch(Exception e){
			result.put("code", "999");
			result.put("message","操作失败！"+e.getMessage());
		}
		return result;
	}
	
	
	@RequestMapping("/updateUnReadToRead")
	@ResponseBody
	@Remarks("更新办事为已读状态")
	public JSONObject updateUnReadToRead(@RequestParam String ids,@RequestParam String userId)
			throws Exception {
		JSONObject result = new JSONObject();
		result.put("code", "0");
		result.put("message","操作成功！");
		try{
			int updateCount = userWorkService.updateUnReadToRead(ids);
			
			Object value = jRedisPoolUtils.getHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId);
			int count = 0;
			if(value == null){
				count = userWorkService.qryUnReadStatusCount(userId);
				jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId,count);
			}else{
				count = (Integer.parseInt(value.toString())) - updateCount;
			}
			result.put("unReadCount", count);
			jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId,count);//更新redis统计数
		}catch(Exception e){
			result.put("code", "999");
			result.put("message","操作失败！"+e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/finishWork")
	@ResponseBody
	@Remarks("更新办事为已完成状态")
	public JSONObject finishWork(@RequestParam String id)
			throws Exception {
		JSONObject result = new JSONObject();
		result.put("code", "0");
		result.put("message","操作成功！");
		try{
			UserWork work = userWorkService.find(id);
			String userId = work.getUserId();
			userWorkService.finishWork(id);
			Object value = jRedisPoolUtils.getHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId);
			int count = 0;
			if(value == null){
				count = userWorkService.qryUnReadStatusCount(userId);
				jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId,count);
			}else{
				count = (Integer.parseInt(value.toString())) + 1;
			}
			result.put("unReadCount", count);
			jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_WROK_UNREAD_COUNT, userId,count);//更新redis统计数
		}catch(Exception e){
			result.put("code", "999");
			result.put("message","操作失败！"+e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/getConsultDetail")
	@ResponseBody
	@Remarks("查看沟通详情")
	public AjaxResponse getConsultDetail(@RequestParam String id,String source)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		resp.setCode(0);
		try{
			HotMail hotMail = hotMailService.find(id);
			String modelId = hotMail.getModelId();
			String hotMailDept = "办事咨询";
			if (modelId != null) {
				if("1".equals(modelId)){
					hotMailDept = "市长信箱";
				}else if("4".equals(modelId)){
					hotMailDept = "部门信箱";
				}else if("9".equals(modelId)){
					hotMailDept = "掌上信访";
				}else if("5".equals(modelId)){
					hotMailDept = "办事咨询";
				}
				hotMail.setModelId(hotMailDept);
			}
			String userId = hotMail.getCreateId();
			hotMailService.read(id);
			Object value = jRedisPoolUtils.getHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId);
			int count = 0;
			if(value == null){
				HotMailExample example = new HotMailExample();
				example.createCriteria().andCreateIdEqualTo(userId).andReplyStateEqualTo("1").andIsReadEqualTo("0");
				count = hotMailService.count(example);
				jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId,count);
			}else{
				count = (Integer.parseInt(value.toString())) - 1;
			}
			if (source == null) {
				hotMail.setPhoneNo("我");
			}else{
				hotMail.setPhoneNo("提问者");
			}
			resp.setData(hotMail);
			jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId,count);//更新redis统计数
		}catch(Exception e){
			e.printStackTrace();
			resp.setCode(999);
			resp.setMessage("操作失败:"+e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/replyConsult")
	@ResponseBody
	@Remarks("回复沟通")
	public JSONObject replyConsult(@RequestParam String id,@RequestParam String replyerId,@RequestParam String replyerName,@RequestParam String replyContent)
			throws Exception {
		JSONObject result = new JSONObject();
		result.put("code", "0");
		result.put("message","操作成功！");
		try{
			HotMail hotMail = hotMailService.find(id);
			String userId = hotMail.getCreateId();
			hotMail.setReplyState("1");
			hotMail.setReplyerName(replyerName);
			hotMail.setReplyerId(replyerId);
			hotMail.setReplyTime(new Date());
			hotMail.setReplyContent(replyContent);
			hotMailService.update(hotMail);
			int count = 0;
			
			Object value = jRedisPoolUtils.getHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId);
			if(value == null){
				HotMailExample example = new HotMailExample();
				example.createCriteria().andCreateIdEqualTo(userId).andReplyStateEqualTo("1").andIsReadEqualTo("0");
				count = hotMailService.count(example);
				jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId,count);
			}else{
				count = (Integer.parseInt(value.toString())) + 1;
			}
			result.put("unReadCount", count);
			jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId,count);//更新redis统计数
		}catch(Exception e){
			result.put("code", "999");
			result.put("message","操作失败！"+e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/saveWorkConsult")
	@ResponseBody
	@Remarks("保存办事咨询")
	public AjaxResponse saveWorkConsult(HttpServletRequest request,HotMail hotMail) throws Exception {
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		UserInfo u = (UserInfo)userInfo.getUser();
		
		hotMail.setModelId(WorkConstants.HOTMAIL_MODEL_ID_WORK_GUIDE);
		hotMailService.add(hotMail,u);
		return new AjaxResponse();
	}
	
	@RequestMapping("/selectConsultList")
	@ResponseBody
	@Remarks("沟通查询")
	public AjaxResponse selectConsultList(@RequestParam String userId,
			@RequestParam String curPageNum,
			@RequestParam String pageCount, String queryModelId)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		Page page = new Page();
		page.setPageIndex(Integer.valueOf(curPageNum));
		page.setPageSize(Integer.valueOf(pageCount));
		HotMailExample example = new HotMailExample();
		example.createCriteria().andCreateIdEqualTo(userId);
		example.setOrderByClause("create_date desc");
		List<HotMail> list = hotMailService.select(example, page);
		List<HotMail> list2 = new ArrayList<HotMail>();
		
		if(list != null){
			for(int i=0;i<list.size();i++){
				HotMail mail = list.get(i);
				String modelId = mail.getModelId();
				// 微信端调用 by chenyp
				if (queryModelId != null && StringUtils.isNotBlank(queryModelId)) {
					if (!modelId.equals(queryModelId)) {
						continue;
					}
				}
				String hotMailDept = "办事咨询";
				if("1".equals(modelId)){
					hotMailDept = "市长信箱";
				}else if("4".equals(modelId)){
					hotMailDept = "部门信箱";
				}else if("9".equals(modelId)){
					hotMailDept = "掌上信访";
				}else if("5".equals(modelId)){
					hotMailDept = "办事咨询";
				}
				mail.setHotMailDept(hotMailDept);
				// 微信端调用 by chenyp
				if (queryModelId != null && StringUtils.isNotBlank(queryModelId)) {
					if (mail.getReplyContent() == null || StringUtils.isBlank(mail.getReplyContent())) {
						mail.setReplyContent("未回复");
					}else{
						mail.setReplyContent("已回复");
					}
				}else{
					if (mail.getReplyContent() == null || StringUtils.isBlank(mail.getReplyContent())) {
						mail.setReplyContent("未办结");
					}else{
						mail.setReplyContent("已办结");
					}
				}
				list2.add(mail);
			}
		}
		resp.setData(list2);
		return resp;
	}
	
	@RequestMapping("/qryUnReadConsultCount")
	@ResponseBody
	@Remarks("获取未读取沟通数")
	@User
	public JSONObject qryUnReadConsultCount(@RequestParam String userId )
			throws Exception {
		JSONObject result = new JSONObject();
		result.put("code", "0");
		try{
			
			Object value = jRedisPoolUtils.getHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId);
			int count = 0;
			if(value == null){
				HotMailExample example = new HotMailExample();
				example.createCriteria().andCreateIdEqualTo(userId).andReplyStateEqualTo("1").andIsReadEqualTo("0");
				count = hotMailService.count(example);
				jRedisPoolUtils.setHSet(WorkConstants.REDIS_DOMAIN_CONSULT_UNREAD_COUNT, userId,count);
			}else{
				count = Integer.parseInt(value.toString());
			}
			result.put("unReadCount", count);
		}catch(Exception e){
			result.put("code", "999");
			result.put("message","查询失败:"+e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/queryMyInfo")
	@ResponseBody
	@Remarks("我的信息")
	@User
	public AjaxResponse queryMyInfo(HttpServletRequest request, String phoneNo) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String curDate = ChinaDate.today();
		String curDate2 = ChinaDate.today2();
		Map<String, String> map = new HashMap<String, String>();
		map.put("curDate", curDate);
		map.put("curDate2", curDate2);
		
		String jsonResult = "";
		String city = "";
		
		if (phoneNo != null) {
			city = (String) jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_MY_CITY+"_"+phoneNo);
			jsonResult = (String) jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_MY_WEATHER+"_"+phoneNo);
		}else{
			throw new Exception("请登陆");
		}
		if(StringUtils.isBlank(city)){
			String ipFilePath=getClass().getResource("/").getFile().toString();
			ipFilePath = ipFilePath.replaceAll("/WEB-INF/classes", "");
			ipFilePath += "upload/weatherfile/qqwry.dat";
			logger.info("---ipFilePath="+ipFilePath);
			IPSeeker seeker = new IPSeeker(ipFilePath);
			city = seeker.getCountry(PubTools.getRemortIP(request));
			city = PubTools.strJiequ(city, "省", "市");
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_MY_CITY+"_"+phoneNo, city, 1800);	//有效时间30分钟
			
			String httpArg = "cityname=" + city;
			jsonResult = PubTools.getWeather(PubTools.WEATHER_URL, httpArg);
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_MY_WEATHER+"_"+phoneNo, jsonResult, 1800);	//有效时间30分钟
		}
		map.put("city", city+"市");
		map.put("result", jsonResult);
		resp.setData(map);
		return resp;
	}	
	
}
