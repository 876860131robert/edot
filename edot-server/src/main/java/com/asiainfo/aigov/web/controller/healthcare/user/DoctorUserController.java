/**
 * DoctorUserController.java	  V1.0   2017年4月20日 上午11:01:27
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.web.controller.healthcare.user;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.common.util.MD5Util;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.edot.tklogin.LoginToken;
import com.asiainfo.aigov.model.healthcare.user.PublicUser;
import com.asiainfo.aigov.service.edot.tklogin.ILoginTokenSV;
import com.asiainfo.aigov.service.healthcare.user.IPublicUserService;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.bo.IUser;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.servlet.ImageServlet;
import com.asiainfo.frame.utils.ErrorCode;
import com.asiainfo.frame.utils.SessionUtil;

@Controller
@RequestMapping("/doctor/user")
public class DoctorUserController {
	@Autowired
	private IPublicUserService publicUserService;
	
	@Autowired
	private ILoginTokenSV loginTokenSV;
	
	@RequestMapping("/login")
	@ResponseBody
	@Remarks("医生端用户登录")
	public AjaxResponse login(HttpServletRequest request, String userName, String password, String code, String mac) throws Exception {
		AjaxResponse resp=login(request, userName, password, code, mac, true);
		return resp;
	}

	
	public AjaxResponse login(HttpServletRequest request, String userName, String password, String code, String mac, boolean verify) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		try {
			if(verify && !ImageServlet.validateCode(request, code)){
				throw new AIException("验证码不正确！");
			}
			if(StringUtils.isBlank(userName)){
				throw new AIException("用户名不能为空！");
			}
			if(StringUtils.isBlank(password)){
				throw new AIException("密码不能为空！");
			}			
			PublicUser user=publicUserService.getPublicUserByUserName(userName, "doctor");

			if(user!=null){
				if(user.getPasswd().equals(MD5Util.getMD5Str(password))){
					String json=JSONObject.toJSONString(user);
					UserInfo userInfo=JSONObject.parseObject(json,UserInfo.class);
					UserSessionInfo userSessionInfo = new UserSessionInfo();
					userSessionInfo.setSessionId(request.getSession().getId());
					userSessionInfo.setUser(userInfo);
					SessionUtil.setUserSessionInfo(request, userSessionInfo);
					if(mac != null && !mac.isEmpty()){
						loginTokenSV.saveEntity(new LoginToken(userName, mac, userSessionInfo.getSessionId(), new Date()));
					}
					resp.setData(userSessionInfo);
				}else{
					resp.setCode(-3);
					resp.setMessage("密码错误，请重新输入！");
				}
				
			}else{
				resp.setCode(-1);
				resp.setMessage("帐号未注册，请先注册！");
			}
		} catch(AIException e) {
			resp.setCode(e.getErrorCode());
			resp.setMessage(e.getErrorMessage());
		}
		return resp;
	}
	
	
	@RequestMapping("/changePwd")
	@ResponseBody
	@User
	@Remarks("修改密码")
	public AjaxResponse changePwd(HttpServletRequest request, HttpSession session, @RequestParam String pwd, @RequestParam String opwd, String mac) throws Exception {
		UserSessionInfo user=SessionUtil.getUserSessionInfo(request);
		AjaxResponse resp = new AjaxResponse();
		IUser userinfo= user.getUser();
		String userid=userinfo.getUserId();
		PublicUser publicUser= publicUserService.find(userid);
		pwd=MD5Util.getMD5Str(pwd);
		opwd=MD5Util.getMD5Str(opwd);
		if(publicUser.getPasswd().equals(opwd)){
			publicUser.setPasswd(pwd);
			publicUserService.update(publicUser);
			
			String json=JSONObject.toJSONString(publicUser);
			UserInfo userInfo=JSONObject.parseObject(json,UserInfo.class);
			user.setSessionId(request.getSession().getId());
			user.setUser(userInfo);
			SessionUtil.setUserSessionInfo(request, user);
			resp.setData(userInfo);
		}else{
			resp.setCode(-1);
			resp.setMessage("旧密码不对");
		}
		
		return resp;
		
	}
	
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
			return login(request, userName, password, null, mac, false);
		}else{
			return new AjaxResponse(ErrorCode.ERROR_DEF,"只能识别登入用户");
		}
	}
}
