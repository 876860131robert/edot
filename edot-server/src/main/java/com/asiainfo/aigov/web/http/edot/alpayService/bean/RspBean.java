package com.asiainfo.aigov.web.http.edot.alpayService.bean;

import java.io.Serializable;

public class RspBean implements Serializable {

	private static final long serialVersionUID = 2093595253567544927L;

	private String respCode;
	
	private String respDesc;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	
}
