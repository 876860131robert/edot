package com.asiainfo.aigov.web.controller.edot.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.edot.tklogin.LoginToken;
import com.asiainfo.aigov.service.edot.tklogin.ILoginTokenSV;
import com.asiainfo.aigov.web.http.edot.userService.api.UserServiceAPI;
import com.asiainfo.aigov.web.http.edot.userService.bean.GjjBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.RealBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.RspBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.servlet.ImageServlet;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.ErrorCode;
import com.asiainfo.frame.utils.SessionUtil;

@Controller("UserCont")
@RequestMapping("/user")
public class UserController extends BaseController {

	private static String MSG_CODE_PRE = "MSG_CODE";
	
	@Autowired
	private ILoginTokenSV loginTokenSV;
	
	@RequestMapping("/registe")
	@ResponseBody
	@Remarks("用户注册")
	public AjaxResponse registe(HttpServletRequest request, @RequestParam String userName, @RequestParam String phoneNo, @RequestParam String passwd, String idCardNo, String realName, String regisType, String userType,@RequestParam String mac, @RequestParam String code) throws Exception {
		AjaxResponse result = this.checkMobileCode(request.getSession(), phoneNo, code);
		if(result.getCode() != ErrorCode.SUCCESS) {
			return result;
		}
		AjaxResponse resp = new AjaxResponse();
		RspBean rspBean = UserServiceAPI.registe(userName, phoneNo, passwd, idCardNo, realName, regisType, userType);
		if(rspBean.getRetCode().equals("0")){
			rspBean=UserServiceAPI.login(userName, passwd, null);
			if("0".equals(rspBean.getRetCode())){
				UserSessionInfo userSessionInfo = new UserSessionInfo();
				userSessionInfo.setSessionId(request.getSession().getId());
				userSessionInfo.setUser(rspBean.getData().getUserInfo());
				loginTokenSV.saveEntity(new LoginToken(userName, mac, userSessionInfo.getSessionId(), new Date()));
				SessionUtil.setUserSessionInfo(request, userSessionInfo);
				resp.setData(userSessionInfo);
				return resp;
			}
		}
		return new AjaxResponse(ErrorCode.ERROR_DEF, rspBean.getRetMsg());
	}

	@RequestMapping("/pushMsg")
	@ResponseBody
	@Remarks("短信验证码接口")
	public AjaxResponse pushMsg(HttpSession session, @RequestParam String phoneNo, @RequestParam String businessType) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		RspBean rspBean = null;
		// 重置密码需判断手机号是否注册
		if("UPDATE_PASSWD".equals(businessType)) {
			rspBean = UserServiceAPI.checkUserRegisted(phoneNo, null);
			if("0".equals(rspBean.getRetCode())) {
				// 未注册
				if("0".equals(rspBean.getRegisterState())) {
					throw new AIException("该手机号未注册！");
				}
			}
		}

		rspBean = UserServiceAPI.pushMsg(phoneNo, businessType);
		if("0".equals(rspBean.getRetCode())) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("code", rspBean.getMsgCode());
			map.put("date", DateUtils.addMinute(new Date(), 10));
			session.setAttribute(MSG_CODE_PRE + phoneNo, map);
			rspBean.setMsgCode("");
		}
		resp.setData(rspBean);
		return resp;
	}
	
	@RequestMapping("/saveRealAuthen")
	@ResponseBody
	@User
	@Remarks("保存认证信息")
	public AjaxResponse saveRealAuthen(HttpServletRequest hReq,String realName,String phoneNo, String idFrontImage, String idBackImage, String idHandImage, String cardNo){
		AjaxResponse resp = new AjaxResponse();
		String userId=SessionUtil.getUser(hReq).getUserId();
		RspBean rspBean = UserServiceAPI.saveRealAuthen(userId, realName, phoneNo, idFrontImage, idBackImage, idHandImage, cardNo);
		if(rspBean.getRetCode().equals("0")){
			if("0".equals(rspBean.getRetCode())){
				return resp;
			}
		}
		return new AjaxResponse(ErrorCode.ERROR_DEF, rspBean.getRetMsg());
	}
	@RequestMapping("/getRealAuthen")
	@ResponseBody
	@User
	@Remarks("得到用户认证信息")
	public AjaxResponse getRealAuthen(HttpServletRequest hReq){
		AjaxResponse resp = new AjaxResponse();
		String userId=SessionUtil.getUser(hReq).getUserId();
		RealBean rspBean = UserServiceAPI.getRealAuthen(userId);
		if(rspBean.getRetCode().equals("0")){
			resp.setData(rspBean.getRealAuthenBean());
			return resp;
		}
		return new AjaxResponse(ErrorCode.ERROR_DEF, rspBean.getRetMsg());
	}
	
	@RequestMapping("/fastCheckUser")
	@ResponseBody
	@User
	@Remarks("快速认证信息")
	public AjaxResponse fastCheckUser(HttpServletRequest hReq,String realName,String phoneNo, String cardNo,String code){
		AjaxResponse result = this.checkMobileCode(hReq.getSession(), phoneNo, code);
		if(result.getCode() != ErrorCode.SUCCESS) {
			return result;
		}
		AjaxResponse resp = new AjaxResponse();
		String userId=SessionUtil.getUser(hReq).getUserId();
		RspBean rspBean = UserServiceAPI.fastCheckUser(userId, realName, phoneNo, cardNo);
		if(rspBean.getRetCode().equals("0")){
			if("0".equals(rspBean.getRetCode())){
				return resp;
			}
		}
		return new AjaxResponse(ErrorCode.ERROR_DEF, rspBean.getRetMsg());
	}
	
	@RequestMapping("/changePhone")
	@ResponseBody
	@Remarks("修改手机号码")
	public AjaxResponse changePhone(HttpServletRequest request, HttpSession session, String userId, String userName, String newPhone, String code) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		AjaxResponse result = this.checkMobileCode(session, newPhone, code);
		if(result.getCode() != ErrorCode.SUCCESS) {
			return result;
		}
		RspBean rspBean = UserServiceAPI.changePhone(userId, userName, newPhone, "normal");
		if(rspBean.getRetCode().equals("0")){
			UserSessionInfo userSessionInfo = SessionUtil.getUserSessionInfo(request);
			UserInfo userInfo = (UserInfo)userSessionInfo.getUser();
			userInfo.setPhoneNo(newPhone);
			userSessionInfo.setUser(userInfo);
			SessionUtil.setUserSessionInfo(request, userSessionInfo);
			resp.setData(userSessionInfo);
			return resp;
		}
		return new AjaxResponse(ErrorCode.ERROR_DEF, rspBean.getRetMsg());
	}	
	
	@RequestMapping("/changePwd")
	@ResponseBody
	@Remarks("修改密码")
	public AjaxResponse changePwd(HttpServletRequest request, HttpSession session, @RequestParam String phoneNo, @RequestParam String pwd, @RequestParam String code, String mac) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		AjaxResponse result = this.checkMobileCode(session, phoneNo, code);
		if(result.getCode() != ErrorCode.SUCCESS) {
			return result;
		}
		RspBean rspBean = UserServiceAPI.changePwd(phoneNo, pwd);
		if(rspBean.getRetCode().equals("0")){
			RspBean rsp = UserServiceAPI.login(phoneNo, pwd, null);
			if("0".equals(rsp.getRetCode())){
				UserSessionInfo userSessionInfo = new UserSessionInfo();
				userSessionInfo.setSessionId(request.getSession().getId());
				userSessionInfo.setUser(rsp.getData().getUserInfo());
				SessionUtil.setUserSessionInfo(request, userSessionInfo);
				if(mac != null && !mac.isEmpty()){
					loginTokenSV.saveEntity(new LoginToken(phoneNo, mac, userSessionInfo.getSessionId(), new Date()));
				}
				SessionUtil.setUserSessionInfo(request, userSessionInfo);
				resp.setData(userSessionInfo);
				return resp;
			}
		}
		return new AjaxResponse(ErrorCode.ERROR_DEF, rspBean.getRetMsg());
	}

	@RequestMapping("/selectGJJ")
	@ResponseBody
	@Remarks("公积金查询")
	@User
	public AjaxResponse selectGJJ(@RequestParam String idCode, @RequestParam String name) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		GjjBean rspBean = UserServiceAPI.gjj(idCode, name);
		resp.setData(rspBean);
		return resp;
	}
	
	@RequestMapping("/selectGJJ2")
	@ResponseBody
	@Remarks("公积金查询")
	public AjaxResponse selectGJJ2(HttpServletRequest request,@RequestParam String idCode, @RequestParam String name,@RequestParam String checkCode) throws Exception {
		if(!ImageServlet.validateCode(request, checkCode)){
			throw new AIException("验证码不正确！");
		}
		AjaxResponse resp = new AjaxResponse();
		GjjBean rspBean = UserServiceAPI.gjj(idCode, name);
		resp.setData(rspBean);
		return resp;
	}
	
	/**
	 * 又提供新接口查询
	 * @param request
	 * @param idCode
	 * @param name
	 * @param checkCode
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectGJJ3")
	@ResponseBody
	@Remarks("公积金查询")
	public AjaxResponse selectGJJ3(HttpServletRequest request,@RequestParam String idCode, @RequestParam String name,@RequestParam String checkCode) throws Exception {
		if(!ImageServlet.validateCode(request, checkCode)){
			throw new AIException("验证码不正确！");
		}
		AjaxResponse resp = new AjaxResponse();
		Map<String, String> map = UserServiceAPI.gjj2(idCode, name);
		resp.setData(map);
		return resp;
	}

	private AjaxResponse checkMobileCode(HttpSession session, String phoneNo, String code) {
		AjaxResponse resp = new AjaxResponse();
		Map mobileCode = (Map) session.getAttribute(MSG_CODE_PRE + phoneNo);
		if(mobileCode != null) {
			Date now = new Date();
			Date codeDate = (Date) mobileCode.get("date");
			if(codeDate.before(now)) {
				resp.setCode(1);
				resp.setMessage("验证码超时，请重新验证");
				return resp;
			}
			String checkCode = (String) mobileCode.get("code");
			if(!code.equals(checkCode) /*&& !"123456".equals(code)*/) {
				resp.setCode(1);
				resp.setMessage("验证码错误");
			}
		} else {
			resp.setCode(1);
			resp.setMessage("请发送验证码");
		}
		return resp;
	}
}
