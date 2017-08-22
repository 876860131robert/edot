/*
 * Copyright(C) Asiainfo All rights Reserved
 *
 * Modification  History:
 * Date          Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2016年9月6日        zhangxin       1.0            1.0
 * <修改原因描述>: 
 */
package com.asiainfo.aigov.healthcare.web.controller;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.healthcare.model.JkghAppMessage;
import com.asiainfo.aigov.healthcare.service.IHealthCareSV;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.aigov.web.webservice.edot.jkghService.api.JkghServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.jkghService.bean.ED7001.rsp.Record;
import com.asiainfo.aigov.web.webservice.edot.jkghService.bean.ED7001.rsp.RecordList;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.SessionUtil;
import com.asiainfo.frame.utils.TimeUtil;

/** 
 * @Description: 健康关怀的Controller
 * @author:      zhangxin
 * @date:        2016年9月6日 下午5:47:10 
 *  
 */
@Controller
public class HealthCareController extends BaseController {
	
	@Autowired
	private IHealthCareSV healthCareSV;
	
	@RequestMapping(value = "/healthcare/count")
	@ResponseBody
	@Remarks("获取健康关怀未读信息")
	public PagedList<JkghAppMessage> count(HttpServletRequest request, Page pager){
		pager.setPageSize(20);
		JkghAppMessage bean = new JkghAppMessage();
		UserInfo userInfo = (UserInfo) SessionUtil.getUserSessionInfo(request).getUser();
		bean.setIdNo(userInfo.getIdCardNo());
		bean.setIsReaded("0");
		PagedList<JkghAppMessage> list = healthCareSV.find(pager, bean);
		return list;
	}

	@RequestMapping(value = "/healthcare")
	@ResponseBody
	@Remarks("获取健康关怀")
	public PagedList<JkghAppMessage> find(HttpServletRequest request, Page pager){
		pager.setPageSize(20);
		JkghAppMessage bean = new JkghAppMessage();
		UserInfo userInfo = (UserInfo) SessionUtil.getUserSessionInfo(request).getUser();
		bean.setIdNo(userInfo.getIdCardNo());
		PagedList<JkghAppMessage> list = healthCareSV.find(pager, bean, " create_time desc ");
		return list;
	}
	
	@RequestMapping(value = "/healthcare/read")
	@ResponseBody
	@Remarks("设置健康关怀已读标识")
	public AjaxResponse read(HttpServletRequest request, String ids){
		JkghAppMessage jkghAppMessage;
//		for (String id : ids.split(",")) {
//			if(StringUtils.isNotBlank(id)){
//				jkghAppMessage = new JkghAppMessage();
//				jkghAppMessage.setId(id);
//				jkghAppMessage.setIsReaded("1");
//				healthCareSV.mod(jkghAppMessage);
//			}
//		} 
		jkghAppMessage = new JkghAppMessage();
		jkghAppMessage.setIsReaded("1");
		healthCareSV.mod(jkghAppMessage, ids.substring(0,ids.length()-1));
		return new AjaxResponse();
	}
	
	/**
	 * 同步健康关怀信息
	 */
	@Scheduled(cron="0 */50 * * * ?")//每小时执行
	public void syncMsg(){
		logger.info("同步健康关怀信息开始......");
		Date begin = new Date();
		try {
			com.asiainfo.aigov.web.webservice.edot.jkghService.bean.ED7001.rsp.Response rsp = JkghServiceAPI.getAppMessage();
			if(rsp != null && "0000".equals(rsp.getResult_Code())){
				JkghAppMessage jkghAppMessage;
				RecordList list = rsp.getRecordList();
				if(list != null){
					for (Record record : list.getRecord()) {
						jkghAppMessage = new JkghAppMessage();
						jkghAppMessage.setId(record.getId());
						jkghAppMessage.setPatientId(record.getPatientId());
						jkghAppMessage.setPatientName(record.getPatientName());
						jkghAppMessage.setIdNo(record.getIdNo());
						jkghAppMessage.setSex(record.getSex());
						jkghAppMessage.setPhone(record.getPhone());
						jkghAppMessage.setMessage(record.getMessage());
						jkghAppMessage.setIsReaded(record.getIsReaded());
						jkghAppMessage.setCreateTime( DateUtils.getDate(record.getCreateTime(),"yyyy-MM-dd HH:mm:ss") );
						healthCareSV.add(jkghAppMessage);
					}
				}
			}
		} catch (Exception e) {
			logger.error("同步健康关怀信息失败：",e);
		}
		Date end = new Date();
		logger.info("同步健康关怀信息结束，耗时："+TimeUtil.getTimeDifferenceDesc(begin, end));
	}
	
}
