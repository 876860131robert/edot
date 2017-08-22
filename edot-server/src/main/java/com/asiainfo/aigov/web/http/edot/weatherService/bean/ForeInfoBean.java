package com.asiainfo.aigov.web.http.edot.weatherService.bean;

/**
 * 天气预报信息
 * @author chenyp
 */
public class ForeInfoBean {
	
	public static String filter(String str){
		str = str.replaceAll("站号", "areaId");
		str = str.replaceAll("区域", "areaName");
		str = str.replaceAll("发布时间", "createDate");
		str = str.replaceAll("天气_24小时", "weather1");
		str = str.replaceAll("温度_24小时", "temperature1");
		str = str.replaceAll("天气_48小时", "weather2");
		str = str.replaceAll("温度_48小时", "temperature2");
		str = str.replaceAll("天气_72小时", "weather3");
		str = str.replaceAll("温度_72小时", "temperature3");
		str = str.replaceAll("天气_96小时", "weather4");
		str = str.replaceAll("温度_96小时", "temperature4");
		str = str.replaceAll("天气_120小时", "weather5");
		str = str.replaceAll("温度_120小时", "temperature5");
		return str;
	}
	
	//站号
	private String areaId;
	
	//区域
	private String areaName;
	
	//发布时间
	private String createDate;
	
	//天气24小时
	private String weather1;
	
	//温度24小时
	private String temperature1;
	
	//天气48小时
	private String weather2;
	
	//温度48小时
	private String temperature2;
	
	//天气72小时
	private String weather3;
	
	//温度72小时
	private String temperature3;

	//天气96小时
	private String weather4;
	
	//温度96小时
	private String temperature4;

	//天气120小时
	private String weather5;
	
	//温度120小时
	private String temperature5;
	
	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getWeather1() {
		return weather1;
	}

	public void setWeather1(String weather1) {
		this.weather1 = weather1;
	}

	public String getTemperature1() {
		return temperature1;
	}

	public void setTemperature1(String temperature1) {
		this.temperature1 = temperature1;
	}

	public String getWeather2() {
		return weather2;
	}

	public void setWeather2(String weather2) {
		this.weather2 = weather2;
	}

	public String getTemperature2() {
		return temperature2;
	}

	public void setTemperature2(String temperature2) {
		this.temperature2 = temperature2;
	}

	public String getWeather3() {
		return weather3;
	}

	public void setWeather3(String weather3) {
		this.weather3 = weather3;
	}

	public String getTemperature3() {
		return temperature3;
	}

	public void setTemperature3(String temperature3) {
		this.temperature3 = temperature3;
	}

	public String getWeather4() {
		return weather4;
	}

	public void setWeather4(String weather4) {
		this.weather4 = weather4;
	}

	public String getTemperature4() {
		return temperature4;
	}

	public void setTemperature4(String temperature4) {
		this.temperature4 = temperature4;
	}

	public String getWeather5() {
		return weather5;
	}

	public void setWeather5(String weather5) {
		this.weather5 = weather5;
	}

	public String getTemperature5() {
		return temperature5;
	}

	public void setTemperature5(String temperature5) {
		this.temperature5 = temperature5;
	}
	
}
