package com.asiainfo.aigov.web.controller.edot.card;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.web.webservice.edot.cardService.api.CardServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.searchCardService.api.SearchCardServiceAPI;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.servlet.ImageServlet;
import com.asiainfo.frame.utils.AppPropertyUtil;

@Controller
@RequestMapping("/card")

public class CardController extends BaseController {
	
	@RequestMapping("/queryCardStatus")
	@ResponseBody
	@Remarks("卡状态查询")
	public AjaxResponse queryCardStatus(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.req.Request req)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Response rsp = CardServiceAPI.queryCardStatus(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/queryRechargeInfo")
	@ResponseBody
	@Remarks("缴费信息查询")
	@User
	public AjaxResponse queryRechargeInfo(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.req.Request req,@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		req.setCurrentPage(curPageNum);
		req.setPageSize(pageCount);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Response rsp = CardServiceAPI.queryRechargeInfo(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/syncCardInfo")
	@ResponseBody
	@Remarks("口头挂失接口")
	@User
	public AjaxResponse queryConsumeInfo(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4004.req.Request req)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4004.rsp.Response rsp = CardServiceAPI.syncCardInfo(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/savePadSmppCard")
	@ResponseBody
	@Remarks("卡申领接口")
	@User
	public AjaxResponse savePadSmppCard(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4005.req.Request req)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4005.rsp.Response rsp = CardServiceAPI.savePadSmppCard(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/updatePadSmppCard")
	@ResponseBody
	@Remarks("补换卡接口")
	@User
	public AjaxResponse updatePadSmppCard(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4006.req.Request req)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4006.rsp.Response rsp = CardServiceAPI.updatePadSmppCard(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/queryCardAmount")
	@ResponseBody
	@Remarks("卡余额查询")
	@User
	public AjaxResponse queryCardAmount(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request req)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response rsp = CardServiceAPI.queryCardAmount(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/saveCardPayOrder")
	@ResponseBody
	@Remarks("卡充值")
	@User
	public AjaxResponse saveCardPayOrder(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4008.req.Request req)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4008.rsp.Response rsp = CardServiceAPI.saveCardPayOrder(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/queryConsumeInfo")
	@ResponseBody
	@Remarks("消费信息查询")
	@User
	public AjaxResponse queryConsumeInfo(
			com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.req.Request req,@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		String USER_NAME = AppPropertyUtil.getProperty("USER_NAME");
		String PASS_WORD = AppPropertyUtil.getProperty("PASS_WORD");
		String APP_ID = AppPropertyUtil.getProperty("APP_ID");
		req.setUserName(USER_NAME);
		req.setPassWord(PASS_WORD);
		req.setAppId(APP_ID);
		req.setCurrentPage(curPageNum);
		req.setPageSize(pageCount);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Response rsp = CardServiceAPI.queryConsumeInfo(req);
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/searchCardStatus")
	@ResponseBody
	@Remarks("办卡进度查询")
	@User
	public AjaxResponse searchCardStatus(String sfzhm) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.searchCardService.service.CardSearchResult cardSearchResult = SearchCardServiceAPI.searchCardStatus(sfzhm);
		resp.setData(cardSearchResult);
		return resp;
	}
	
	@RequestMapping("/checkPersonalCard")
	@ResponseBody
	@Remarks("卡申领前验卡接口")
	public AjaxResponse checkPersonalCard(HttpServletRequest request,com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4009.req.Request req, String code) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		if(/*!"XLHS".equals(code) &&*/ !ImageServlet.validateCode(request, code)){
			throw new AIException(-1, "验证码不正确！");
		}
		req.setAppId(AppPropertyUtil.getProperty("APP_ID"));
		req.setUserName(AppPropertyUtil.getProperty("USER_NAME"));
		req.setPassWord(AppPropertyUtil.getProperty("PASS_WORD"));
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4009.rsp.Response rsp = CardServiceAPI.checkPersonalCard(req);
		
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/queryTradeInfo")
	@ResponseBody
	@Remarks("交易信息(缴费/消费)查询")
	@User
	public AjaxResponse queryTradeInfo(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4010.req.Request req, @RequestParam String curPageNum,
			@RequestParam String pageCount) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		req.setAppId(AppPropertyUtil.getProperty("APP_ID"));
		req.setUserName(AppPropertyUtil.getProperty("USER_NAME"));
		req.setPassWord(AppPropertyUtil.getProperty("PASS_WORD"));
		req.setCurrentPage(curPageNum);
		req.setPageSize(pageCount);
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4010.rsp.Response rsp = CardServiceAPI.queryTradeInfo(req);
		
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/queryCardProgressList")
	@ResponseBody
	@Remarks("办卡进度查询")
	public AjaxResponse queryCardProgressList(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.req.Request req) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		req.setAppId(AppPropertyUtil.getProperty("APP_ID"));
		req.setUserName(AppPropertyUtil.getProperty("USER_NAME"));
		req.setPassWord(AppPropertyUtil.getProperty("PASS_WORD"));
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Response rsp = CardServiceAPI.queryCardProgressList(req);
		
		if(rsp.getOrderList() != null){
			resp.setData(rsp.getOrderList().getOrder());
		}
		return resp;
	}
	
	@RequestMapping("/queryCardProgressList2")
	@ResponseBody
	@Remarks("办卡进度查询-微信端")
	public AjaxResponse queryCardProgressList2(HttpServletRequest request, com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.req.Request req, String code) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		if(!ImageServlet.validateCode(request, code)){
			throw new AIException(-1, "验证码不正确！");
		}
		req.setAppId(AppPropertyUtil.getProperty("APP_ID"));
		req.setUserName(AppPropertyUtil.getProperty("USER_NAME"));
		req.setPassWord(AppPropertyUtil.getProperty("PASS_WORD"));
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Response rsp = CardServiceAPI.queryCardProgressList(req);
		
		if(rsp.getOrderList() != null){
			resp.setData(rsp.getOrderList().getOrder());
		}
		return resp;
	}
	
	@RequestMapping("/saveSelfApply")
	@ResponseBody
	@Remarks("卡申领接口")
	@User
	public AjaxResponse saveSelfApply(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request req) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		req.setAppId(AppPropertyUtil.getProperty("APP_ID"));
		req.setUserName(AppPropertyUtil.getProperty("USER_NAME"));
		req.setPassWord(AppPropertyUtil.getProperty("PASS_WORD"));
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.rsp.Response rsp = CardServiceAPI.saveSelfApply(req);
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/cardApply")
	@ResponseBody
	@Remarks("卡申领")
	public AjaxResponse cardApply(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request req) throws Exception {
		AjaxResponse resp = new AjaxResponse();
//		String cardFront = req.getIdFront();
//		String cardBack = req.getIdBack();
//		String cardHand = req.getIdHand();
		
		req.setAppId(AppPropertyUtil.getProperty("APP_ID"));
		req.setUserName(AppPropertyUtil.getProperty("USER_NAME"));
		req.setPassWord(AppPropertyUtil.getProperty("PASS_WORD"));
		com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.rsp.Response rsp = CardServiceAPI.saveSelfApply(req);
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/getDictItemCondition")
	@ResponseBody
	@Remarks("查询数据字典条件")
	@SuppressWarnings("unchecked")
	public AjaxResponse getDictItemCondition(HttpServletRequest request) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		Map<String, String> params = new HashMap<String, String>();
		Enumeration<String> pNames = request.getParameterNames();
		while(pNames.hasMoreElements()){
		    String name = pNames.nextElement();
		    params.put(name, request.getParameter(name));
		}
		JSONObject jsonObject = CardServiceAPI.getDictItemCondition(params);
		resp.setData(jsonObject);
		return resp;
	}
	
	
	
}
