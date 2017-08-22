package com.asiainfo.aigov.service.edot.common;

public interface IEdHttpLogSV {
	
	public static final String LOG_TYP_WS = "1";
	
	public static final String LOG_TYP_HTTP = "2";

	public void saveHttpLog(String logType, String accessUrl, String reqContent, String rspContent) throws Exception;
	
}
