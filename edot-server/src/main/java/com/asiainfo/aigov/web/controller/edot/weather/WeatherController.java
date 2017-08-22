package com.asiainfo.aigov.web.controller.edot.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.web.http.edot.weatherService.api.WeatherServiceAPI2;
import com.asiainfo.aigov.web.http.edot.weatherService.bean.ForeInfoBean;
import com.asiainfo.aigov.web.http.edot.weatherService.bean.ShiKuangInfoBean;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.DateUtils;

/**
 * 天气预报
 * @author chenyp
 *
 */
@Controller
@RequestMapping("/weather")
public class WeatherController extends BaseController {

	private static Logger logger = Logger.getLogger(WeatherController.class);
	@Autowired
	private WeatherServiceAPI2 weatherServiceAPI;
	
	//咸阳地区编码
	//private final String[] areaIds = {"53929","53938","57023","57029","57030","57031","57033","57034","57035","57038","57041","57048"};
	private final String[] areaIds = {"57048","57038","57034","57035","57029","57033","57041","57030","57023","53929","53938","57031"};
	//咸阳地区名称
	//private final String[] areaNames = {"长武","旬邑","彬县","礼泉","永寿","淳化","泾阳","武功","乾县","兴平","三原","秦都"};
	private final String[] areaNames = {"秦都区", "兴平市","武功县","乾县","礼泉县","泾阳县","三原县","永寿县","彬县","长武县","旬邑县","淳化县"};
	//默认地区为秦都
	private final String areaIdDefault = "57048";
	//显示的星期
	private final String[] weeks = {"日","一","二","三","四","五","六","日","一","二","三","四","五","六"};
	//天气枚举值
	private final String[] weathers = {"晴","多云","阴天","阵雨","雷阵雨","雷阵雨伴有冰雹","雨夹雪","小雨","中雨","大雨","暴雨","大暴雨","特大暴雨","阵雪","小雪","中雪","大雪","暴雪","雾","冻雨","沙尘暴","小到中雨","中到大雨","大到暴雨","暴雨到大暴雨","大暴雨到特大暴雨","小到中雪","中到大雪","大到暴雪","浮尘","强沙尘暴","霾","无"};
	//天气图片枚举值
	private final String[] weatherImgs = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","53"};
	//能见度值枚举
	private final double[] visibilityVals = {0.1, 0.3, 1, 5, 10, 15, 20, 25, 30};
	//能见度说明枚举
	private final String[] visibilityNames = {
			"浓雾 能见度极差",
			"重雾 能见度极差",
			"大雾 能见度很差",
			"轻雾 能见度差 视野不清晰",
			"能见度较差 视野不清晰",
			"能见度一般",
			"能见度好 视野较清晰",
			"能见度极好 视野清晰",
			"能见度极好 视野清晰",
			};
	
	@RequestMapping("/queryWeatherInfo")
	@ResponseBody
	@Remarks("查询天气预报信息")
	public AjaxResponse queryForeInfo(String areaId, String areaName) throws Exception {
		if (areaName != null) {
			logger.info("areaName=" + areaName);
			for (int i = 0; i < areaIds.length; i++) {
				if (areaName.indexOf(areaNames[i]) >= 0) {
					areaId = areaIds[i];
					break;
				}
			}
		}
		if (areaId == null || StringUtils.isBlank(areaId)) {
			areaId = areaIdDefault;
		}
		logger.info("areaId=" + areaId);
		AjaxResponse resp = new AjaxResponse();
		String d = DateUtils.getDateString("yyyy年MM月dd日(EE)");
		d = d.replace("星期", "周");
		Map<String,Object> result = new HashMap<String,Object>();
		//时间
		result.put("time", d);
		//5天内的天气信息
		List<ForeInfoBean> foreInfos = weatherServiceAPI.getForeInfo(areaId);
		if (foreInfos.size() > 0) {
			result.put("curWeather", foreInfos.get(0).getWeather1());
			result.put("fortInfo", getWeekInfo(d,foreInfos));
		}
		//天气实况
		ShiKuangInfoBean shikuangInfo = weatherServiceAPI.getShiKuangInfoByStationNum(areaId);
		shikuangInfo.setTemperature(formatCurTemp(shikuangInfo.getTemperature()));
		result.put("shikuangInfo", shikuangInfo);
		//能见度
		result.put("visibility", getVisibilityName(shikuangInfo.getVisibility()));
		//地区
		result.put("areas", areaList(areaId));
		//天气背景图
		result.put("weatherImg", getWeatherBgImg(foreInfos.get(0).getWeather1()));
		resp.setData(result);
		return resp;
	}
	
	/**
	 * 整理5天天气信息
	 * @param time
	 * @param foreInfos
	 * @return
	 */
	private List<Map<String, String>> getWeekInfo(String time, List<ForeInfoBean> foreInfos){
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		ForeInfoBean foreInfoBean = null;
		if (foreInfos.size() > 0) {
			foreInfoBean = foreInfos.get(0);
			int i = time.indexOf("周");
			String day = time.substring(i + 1, i + 2);
			for (int j = 0; j < weeks.length; j++) {
				if (day.equals(weeks[j])) {
					for (int k = 0; k < 5; k++,j++) {
						Map<String, String> map = new HashMap<String, String>();
						if (k == 0) {
							map.put("day", "今天");
							map.put("temperature", formatTemperature(foreInfoBean.getTemperature1()));
							map.put("weather", weatherToImg(foreInfoBean.getWeather1()));
						}else if(k == 1){
							map.put("day", "周" + weeks[j]);
							map.put("temperature", formatTemperature(foreInfoBean.getTemperature2()));
							map.put("weather", weatherToImg(foreInfoBean.getWeather2()));
						}else if(k == 2){
							map.put("day", "周" + weeks[j]);
							map.put("temperature", formatTemperature(foreInfoBean.getTemperature3()));
							map.put("weather", weatherToImg(foreInfoBean.getWeather3()));
						}else if(k == 3){
							map.put("day", "周" + weeks[j]);
							map.put("temperature", formatTemperature(foreInfoBean.getTemperature4()));
							map.put("weather", weatherToImg(foreInfoBean.getWeather4()));
						}else if(k == 4){
							map.put("day", "周" + weeks[j]);
							map.put("temperature", formatTemperature(foreInfoBean.getTemperature5()));
							map.put("weather", weatherToImg(foreInfoBean.getWeather5()));
						}
						list.add(map);
					}
					break;
				}
			}
		}
		return list;
	}
	
	/**
	 * 天气转图片编码
	 * @param weather
	 * @return
	 */
	private String weatherToImg(String weather){
		String weatherImg = "53";
		if (weather.indexOf("转") > 0) {
			weather = weather.substring(0,weather.indexOf("转"));
		}
		for (int i = 0; i < weathers.length; i++) {
			if (weather.equals(weathers[i])) {
				weatherImg = weatherImgs[i];
				break;
			}
		}
		return weatherImg;
	}
	
	/**
	 * 当前温度格式化(去掉小数点，四舍五入)
	 * @param temperature
	 * @return
	 */
	private String formatCurTemp(String temperature){
		if(StringUtils.isBlank(temperature)) return "";
		int t = (int)Math.ceil(Double.valueOf(temperature));
		return String.valueOf(t);
	}
	
	/**
	 * 温度格式化(去掉小数点,四舍五入)
	 * @param temperature
	 * @return
	 */
	private String formatTemperature(String temperature){
		if(StringUtils.isBlank(temperature)) return "";
		String[] t = temperature.split("~");
		if (t.length < 2) return temperature;
		int val1 = (int)Math.ceil(Double.valueOf(t[0]));
		int val2 = (int)Math.ceil(Double.valueOf(t[1]));
		return val1 + "~" + val2;
	}
	
	/**
	 * 能见度解析
	 * @param visibility
	 * @return
	 */
	private String getVisibilityName(String visibility){
		if(StringUtils.isBlank(visibility)) return "";
		double v = Double.valueOf(visibility);
		String visibilityName = visibilityNames[visibilityNames.length-1];
		for (int i = 0; i < visibilityVals.length-1; i++) {
			if(visibilityVals[i] < v && v <= visibilityVals[i+1]){
				visibilityName = visibilityNames[i];
				break;
			}
		}
		return visibilityName;
	}
	
	/**
	 * 返回咸阳城市列表
	 * @return
	 */
	private List<Map<String, String>> areaList(String areaId){
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		for (int i = 0; i < areaIds.length; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("areaId", areaIds[i]);
			map.put("areaName", areaNames[i]);
			map.put("current", areaId.equals(areaIds[i]) ? "current" : "");
			list.add(map);
		}
		return list;
	}
	
	/**
	 * 天气背景图
	 * @param weather
	 * @return
	 */
	private String getWeatherBgImg(String weather){
		String weatherImg = "3";
		if (weather.indexOf("转") > 0) {
			weather = weather.substring(0,weather.indexOf("转"));
		}
		if(weather.indexOf("晴") >= 0){
			weatherImg = "1";
		}else if(weather.indexOf("雨") >= 0){
			weatherImg = "2";
		}else if(weather.indexOf("雪") >= 0){
			weatherImg = "4";
		}
		return weatherImg;
	}
	
}
