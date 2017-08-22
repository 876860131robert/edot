package com.asiainfo.aigov.web.vo;

import java.util.List;

public class DeptListVo {

	private String letterName;
	
	private List<?> departList;

	public String getLetterName() {
		return letterName;
	}

	public void setLetterName(String letterName) {
		this.letterName = letterName;
	}

	public List<?> getDepartList() {
		return departList;
	}

	public void setDepartList(List<?> departList) {
		this.departList = departList;
	}
	
}
