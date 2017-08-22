package com.asiainfo.aigov.web.http.edot.weatherService.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONArray;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.http.edot.weatherService.bean.ForeInfoBean;
import com.asiainfo.aigov.web.http.edot.weatherService.bean.ShiKuangInfoBean;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.https.HttpsClient;
import com.thoughtworks.xstream.XStream;

/**
 * 咸阳天气预报信息接口
 * @author chenyp
 *
 */
@Component
public class WeatherServiceAPI2 {
	
	private static Logger logger = Logger.getLogger(WeatherServiceAPI2.class);
	
	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("WEATHER_SERVICE_URL2");
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static WeatherServiceAPI2 weatherServiceAPI;
	
	@PostConstruct
    public void init() throws Exception {
		weatherServiceAPI = this;
		weatherServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/
	
	public static void main(String[] args) {
		/*List<ForeInfoBean> list = getForeInfo("53929");
		for (ForeInfoBean foreInfo : list) {
			System.out.println(foreInfo.getAreaName());
		}
		
		ShiKuangInfoBean info = getShiKuangInfoByStationNum("53929");
		System.out.println(info.getTemperature());*/
		
		System.out.println((int)Math.ceil(Double.valueOf("21.5")));
		
	}
	
	/**
	 * 获取天气预报
	 * @return
	 */
	public static List<ForeInfoBean> getForeInfo(String areaId){
		try {
			String url = getAccessUrl();
			//String url = "http://10.48.255.195:8999/WebServ.asmx";
			Map<String, String> params = new HashMap<String, String>();
			if (areaId == null || StringUtils.isBlank(areaId)) {
				url += "/getForeInfoAll";
			}else{
				params.put("strNum", areaId);
				url += "/getForeInfoByStation";				
			}
			String result = HttpsClient.doPost(url, params,false);
			logger.debug("---result:" + result);
			weatherServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, Collections.EMPTY_MAP.toString(), result);
			result = ForeInfoBean.filter(xmlFilter(result));
			return JSONArray.parseArray(result, ForeInfoBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 根据站号获取天气实况
	 * @param areaName
	 * @return
	 */
	public static ShiKuangInfoBean getShiKuangInfoByStationNum(String areaId){
		try {
			String url = getAccessUrl() + "/getShiKuangInfoByStationNum";
			//String url = "http://10.48.255.195:8999/WebServ.asmx/getShiKuangInfoByStationNum";
			Map<String, String> params = new HashMap<String, String>();
			params.put("strNum", areaId);
			String result = HttpsClient.doPost(url, params, false);
			logger.debug("---result:" + result);
			weatherServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, Collections.EMPTY_MAP.toString(), result);
			result = ShiKuangInfoBean.filter(xmlFilter(result));
			List<ShiKuangInfoBean> list = JSONArray.parseArray(result, ShiKuangInfoBean.class);
			if (list.size() > 0) {
				return list.get(0);
			}else{
				return  null;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String xmlFilter(String str){
		XStream xStream = new XStream();
		str = (String) xStream.fromXML(str);
		return str;
	}
	
}
