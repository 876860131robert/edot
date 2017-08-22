package com.asiainfo.aigov.web.http.edot.weatherService.bean;

/**
 * 天气实况信息
 * @author chenyp
 */
public class ShiKuangInfoBean {

	public static String filter(String str){
		str = str.replaceAll("站号", "areaId");
		str = str.replaceAll("城市", "areaName");
		str = str.replaceAll("观测时间", "createDate");
		str = str.replaceAll("温度", "temperature");
		str = str.replaceAll("最高温度", "maxTemperature");
		str = str.replaceAll("最低温度", "minTemperature");
		str = str.replaceAll("降水", "precipitation");
		str = str.replaceAll("湿度", "humidity");
		str = str.replaceAll("风速", "windSpeed");
		str = str.replaceAll("风向", "windDirection");
		str = str.replaceAll("气压", "pressure");
		str = str.replaceAll("能见度", "visibility");
		return str;
	}
	
	//站号
	private String areaId;
	
	//区域
	private String areaName;
	
	//观测时间
	private String createDate;
	
	//温度
	private String temperature;
	
	//最高温度
	private String maxTemperature;
	
	//最低温度
	private String minTemperature;
	
	//降水
	private String precipitation;
	
	//湿度
	private String humidity;
	
	//风速
	private String windSpeed;
	
	//风向
	private String windDirection;
	
	//气压
	private String pressure;
	
	//能见度
	private String visibility;

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

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(String maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public String getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(String minTemperature) {
		this.minTemperature = minTemperature;
	}

	public String getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
}
