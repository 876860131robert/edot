package com.asiainfo.aigov.web.controller.healthcare.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
import com.asiainfo.aigov.web.http.edot.userService.api.UserServiceAPI;
import com.asiainfo.aigov.web.http.edot.userService.bean.GjjBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.RealBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.RspBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.bo.IUser;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.servlet.ImageServlet;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.ErrorCode;
import com.asiainfo.frame.utils.IpUtil;
import com.asiainfo.frame.utils.SessionUtil;
import com.asiainfo.frame.utils.https.HttpsClient;

import net.sf.json.groovy.GJson;

@Controller
@RequestMapping("/healthcare/user")
public class HealthcareUserController extends BaseController {
	private static String MSG_CODE_PRE = "MSG_CODE";
	
	@Autowired
	private IPublicUserService publicUserService;
	
	@Autowired
	private ILoginTokenSV loginTokenSV;
	
	@RequestMapping("/registe")
	@ResponseBody
	@Remarks("用户注册")
	public AjaxResponse registe(HttpServletRequest request, @RequestParam String userName, @RequestParam String phoneNo, @RequestParam String passwd, String idCardNo, String realName, String regisType, String userType,@RequestParam String mac, @RequestParam String code) throws Exception {
		
		PublicUser userBean=new PublicUser();
		userBean.setUserName(userName);
		userBean.setPhoneNo(phoneNo);
		userBean.setPasswd(passwd);
		userBean.setIdCardNo(idCardNo);
		userBean.setRealName(realName);
		userBean.setRegistType(regisType);
		userBean.setUserType(userType);
		
		AjaxResponse resp = new AjaxResponse();
		if(userBean != null && userBean.getPhoneNo() != null && userBean.getUserType() != null){
			//检测是否已被注册
			if(!publicUserService.isRegisterUser(userBean.getUserName(),userBean.getUserType())){
				String  md5Passwd=MD5Util.getMD5Str(userBean.getPasswd());
				userBean.setPasswd(md5Passwd);
				publicUserService.add(userBean);
				
				//添加成功转session用户对象
				String json=JSONObject.toJSONString(userBean);
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
				resp.setCode(-4);
				resp.setMessage("已注册，不能重复注册！");
			}
		}else{
			resp.setCode(-3);
			resp.setMessage("参数有误！");
		}

		return resp;
	}
	
	
	@RequestMapping("/login")
	@ResponseBody
	@Remarks("用户登录")
	public AjaxResponse login(HttpServletRequest request, String userName, String password,String regisType,String code,String mac) throws Exception {
		AjaxResponse resp=login(request, userName, password, regisType, mac);
		return resp;
	}

	
	public AjaxResponse login(HttpServletRequest request, String userName, String password,String regisType,String mac) throws Exception {
		if(StringUtils.isBlank(userName)){
			throw new AIException("用户名不能为空！");
		}
		if(StringUtils.isBlank(password)){
			throw new AIException("密码不能为空！");
		}
		AjaxResponse resp = new AjaxResponse();
		PublicUser user=publicUserService.getPublicUserByUserName(userName, regisType);

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
	public AjaxResponse relogin(HttpServletRequest request, String userName, String password,String mac,String id,String regisType) throws Exception {
		
		if(StringUtils.isBlank(mac)){
			return new AjaxResponse(ErrorCode.ERROR_DEF, "MAC地下不能空");
		}
		
		LoginToken loginToken=new LoginToken(userName, mac, request.getSession().getId(), new Date());
		
		//验证是否可以重新登入
		if(loginTokenSV.reloadToken(loginToken, id)){
			return login(request, userName, password, regisType, mac);
			/*RspBean rsp = UserServiceAPI.login(userName, password, null);
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
			}*/
		}else{
			return new AjaxResponse(ErrorCode.ERROR_DEF,"只能识别登入用户");
		}
	}

}
