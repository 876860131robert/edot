package com.asiainfo.aigov.web.http.edot.weatherService.api;

import java.util.Collections;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.http.edot.weatherService.bean.RspBean;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.https.HttpsClient;

@Component
public class WeatherServiceAPI {
	
	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("WEATHER_SERVICE_URL");
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static WeatherServiceAPI weatherServiceAPI;
	
	@PostConstruct
    public void init() throws Exception {
		weatherServiceAPI = this;
		weatherServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/
	
	/**
	 * 首页天气查询
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static RspBean index() {
		try {
			String url = getAccessUrl() + "/appcls/index";
			String result = HttpsClient.doPost(url, Collections.EMPTY_MAP, false);
			weatherServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, Collections.EMPTY_MAP.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 某县7天预报查询
	 * @param localNum
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static RspBean forecast7(String localNum) {
		try {
			String url = getAccessUrl() + "/appcls/forecast7/" + localNum;
			String result = HttpsClient.doPost(url, Collections.EMPTY_MAP, false);
			weatherServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, Collections.EMPTY_MAP.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 生活指数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static RspBean livingIndex() {
		try {
			String url = getAccessUrl() + "/appcls/livingIndex";
			String result = HttpsClient.doPost(url, Collections.EMPTY_MAP, false);
			weatherServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, Collections.EMPTY_MAP.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 24/48小时雨温实况查询
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static RspBean rainTempCount(String hour) {
		try {
			String url = getAccessUrl() + "/appcls/rainTempCount/" + hour;
			String result = HttpsClient.doPost(url, Collections.EMPTY_MAP, false);
			weatherServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, Collections.EMPTY_MAP.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
