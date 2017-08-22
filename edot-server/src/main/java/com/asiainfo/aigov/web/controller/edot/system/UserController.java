package com.asiainfo.aigov.web.controller.edot.system;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.edot.tklogin.LoginToken;
import com.asiainfo.aigov.service.edot.tklogin.ILoginTokenSV;
import com.asiainfo.aigov.web.http.edot.userService.api.UserServiceAPI;
import com.asiainfo.aigov.web.http.edot.userService.bean.RspBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.ErrorCode;
import com.asiainfo.frame.utils.IpUtil;
import com.asiainfo.frame.utils.SessionUtil;
import com.asiainfo.frame.utils.https.HttpsClient;
/**
 * 
 * @author songxiaoliang
 * 用户登录入口Controller
 *
 */
@Controller
@RequestMapping("/system/user")
public class UserController extends BaseController{
	
	@Autowired
	private ILoginTokenSV loginTokenSV;
	
	@RequestMapping("/login")
	@ResponseBody
	@Remarks("用户登录")
	public AjaxResponse login(HttpServletRequest request, String userName, String password, String code,String mac) throws Exception {
//		if(!ImageServlet.validateCode(request, code)){
//			throw new AIException("验证码不正确！");
//		}
		if(StringUtils.isBlank(userName)){
			throw new AIException("用户名不能为空！");
		}
		if(StringUtils.isBlank(password)){
			throw new AIException("密码不能为空！");
		}
		RspBean rsp = UserServiceAPI.login(userName, password, null);
		if("0".equals(rsp.getRetCode())){
			UserSessionInfo userSessionInfo = new UserSessionInfo();
			userSessionInfo.setSessionId(request.getSession().getId());
			userSessionInfo.setUser(rsp.getData().getUserInfo());
			SessionUtil.setUserSessionInfo(request, userSessionInfo);
			if(mac != null && !mac.isEmpty()){
				loginTokenSV.saveEntity(new LoginToken(userName, mac, userSessionInfo.getSessionId(), new Date()));
				String ip=IpUtil.getRemoteHost(request);
				String url = "https://ic.xy12345.cn/ecardportal/wifi/connH3C.ajax?ip="+ip+"&mac="+mac+"&userName="+userName;
				HttpsClient.doGetByHttps(url);
				
			}
			AjaxResponse resp = new AjaxResponse();
			resp.setData(userSessionInfo);
			return resp;
		}else{
			return new AjaxResponse(ErrorCode.ERROR_DEF, rsp.getRetMsg());
		}
	}
	
	/**
	 * 
	 * 会话过时重新登入
	 * @param request
	 * @param userName
	 * @param password
	 * @param mac
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/relogin")
	@ResponseBody
	@Remarks("会话过时重新登入")
	public AjaxResponse relogin(HttpServletRequest request, String userName, String password,String mac,String id) throws Exception {
		
		if(StringUtils.isBlank(mac)){
			return new AjaxResponse(ErrorCode.ERROR_DEF, "MAC地下不能空");
		}
		
		LoginToken loginToken=new LoginToken(userName, mac, request.getSession().getId(), new Date());
		
		//验证是否可以重新登入
		if(loginTokenSV.reloadToken(loginToken, id)){
			if(StringUtils.isBlank(userName)){
				throw new AIException("用户名不能为空！");
			}
			if(StringUtils.isBlank(password)){
				throw new AIException("密码不能为空！");
			}
			RspBean rsp = UserServiceAPI.login(userName, password, null);
			if("0".equals(rsp.getRetCode())){
				UserSessionInfo userSessionInfo = new UserSessionInfo();
				userSessionInfo.setSessionId(request.getSession().getId());
				userSessionInfo.setUser(rsp.getData().getUserInfo());
				SessionUtil.setUserSessionInfo(request, userSessionInfo);
				loginTokenSV.saveEntity(loginToken);
				AjaxResponse resp = new AjaxResponse();
				resp.setData(userSessionInfo);
				return resp;
				
			}else{
				return new AjaxResponse(ErrorCode.ERROR_DEF, rsp.getRetMsg());
			}
		}else{
			return new AjaxResponse(ErrorCode.ERROR_DEF,"只能识别登入用户");
		}
	}
	
	@RequestMapping("/loginautoTest")
	@ResponseBody
	public AjaxResponse loginautoTest(HttpServletRequest request) throws Exception {
			UserSessionInfo userSessionInfo = new UserSessionInfo();
			UserInfo info = new UserInfo();
			info.setUserId("1111");
			info.setUserName("vincent");
			userSessionInfo.setSessionId(request.getSession().getId());
			userSessionInfo.setUser(info);
			SessionUtil.setUserSessionInfo(request, userSessionInfo);
			AjaxResponse resp = new AjaxResponse();
			resp.setData(userSessionInfo);
			return resp;
	}
	@RequestMapping("/logoutautoTest")
	@ResponseBody
	public AjaxResponse logoutautoTest(HttpServletRequest request) throws Exception {
		SessionUtil.removeUserSessionInfo(request);
		AjaxResponse resp = new AjaxResponse();
		resp.setMessage("登出成功!");
		return resp;
	}
	
	@RequestMapping("/logintest")
	@ResponseBody
	@Remarks("用户登录测试")
	@User
	public AjaxResponse logintest(HttpServletRequest request) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		resp.setData(SessionUtil.getUserSessionInfo(request));
		return resp;
	}
}
