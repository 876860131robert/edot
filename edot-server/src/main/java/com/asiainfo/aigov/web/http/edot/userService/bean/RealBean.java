package com.asiainfo.aigov.web.http.edot.userService.bean;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class RealBean {

	private String retCode;// 返回0表示登陆成功
	
	private String retMsg;
	
	private JSONObject realAuthenBean;

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	public JSONObject getRealAuthenBean() {
		return realAuthenBean;
	}

	public void setRealAuthenBean(JSONObject realAuthenBean) {
		this.realAuthenBean = realAuthenBean;
	}
	
	
}
