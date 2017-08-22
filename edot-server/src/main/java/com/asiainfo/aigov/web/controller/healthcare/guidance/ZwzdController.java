/**
 * ZwzdController.java	  V1.0   2017年5月3日 下午2:05:30
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.web.controller.healthcare.guidance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.healthcare.guidance.ZwzdDisease;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdParty;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibing;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibingQuest;
import com.asiainfo.aigov.service.healthcare.guidance.IZwzdService;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.model.AjaxResponse;

@Controller
@Remarks("智能导诊")
@RequestMapping("/guidance/zwzd")
public class ZwzdController {
	@Autowired
	private IZwzdService zwzdService;
	
	@RequestMapping("/queryZwzdParty")
	@ResponseBody
	@Remarks("查询部位列表")
	public AjaxResponse queryZwzdParty(HttpServletRequest request) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			List<ZwzdParty> partys = zwzdService.queryZwzdParty();
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("partys", partys);
			resp.setData(data);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/queryZwzdPartyJbing")
	@ResponseBody
	@Remarks("某部位疾病")
	public AjaxResponse queryZwzdPartyJbing(HttpServletRequest request, Long partyid, Long sex) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			ZwzdParty party = zwzdService.getZwzdParty(partyid);
			List<ZwzdPartyJibing> jibings = zwzdService.queryZwzdPartyJbing(partyid, sex);
			data.put("party", party);
			data.put("jibings", jibings);
			resp.setData(data);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/findPartyJibingFirstQuestion")
	@ResponseBody
	@Remarks("某部位疾病首个问题")
	public AjaxResponse findPartyJibingFirstQuestion(HttpServletRequest request, 
			@RequestParam(value="jibingcode") Long jibingcode) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			ZwzdPartyJibingQuest question = zwzdService.findPartyJibingFirstQuestion(jibingcode);
			resp.setData(question);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/findPartyJibingNextQuestion")
	@ResponseBody
	@Remarks("某部位疾病下一个问题")
	public AjaxResponse findPartyJibingNextQuestion(HttpServletRequest request, 
			@RequestParam(value="jibingcode") Long jibingcode, 
			@RequestParam(value="nextQuestId") String nextQuestId, 
			@RequestParam(value="parentAnswer") String parentAnswer) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			ZwzdPartyJibingQuest question = zwzdService.findPartyJibingNextQuestion(jibingcode, nextQuestId, parentAnswer);
			resp.setData(question);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
	
	@RequestMapping("/getZwzdDisease")
	@ResponseBody
	@Remarks("查询某疾病")
	public AjaxResponse getZwzdDisease(HttpServletRequest request, String diseaseid) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			ZwzdDisease disease = zwzdService.getZwzdDisease(diseaseid);
			resp.setData(disease);
		} catch(Exception e){
			resp.setCode(1);
			resp.setMessage(e.getMessage());
		}
		return resp;
	}
}
