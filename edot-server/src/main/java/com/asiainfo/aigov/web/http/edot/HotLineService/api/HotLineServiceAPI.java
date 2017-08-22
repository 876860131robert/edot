package com.asiainfo.aigov.web.http.edot.HotLineService.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.http.edot.HotLineService.bean.ReqBean;
import com.asiainfo.aigov.web.http.edot.HotLineService.bean.RspBean;
import com.asiainfo.aigov.web.http.edot.HotLineService.bean.SQInfo;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.https.HttpsClient;

@Component
public class HotLineServiceAPI {

	private static String accessUrl;

	private static String getAccessUrl() {
		if(accessUrl == null) {
			accessUrl = AppPropertyUtil.getProperty("NEWS_SERVICE_URL");
		}
		return accessUrl;
	}

	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV				edHttpLogSV;

	private static HotLineServiceAPI	hotLineServiceAPI;

	@PostConstruct
	public void init() throws Exception {
		hotLineServiceAPI = this;
		hotLineServiceAPI.edHttpLogSV = this.edHttpLogSV;
	}

	/******************* 解决工具类中的注入问题 end *******************/

	/**
	 * 信箱提交
	 * 
	 * @param reqBean
	 * @return
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static RspBean SQSubmit(ReqBean reqBean) {
		try {
			String url = getAccessUrl() + "/info/brow/SQSubmit.jsp";
			String result = HttpsClient.doPost(url, (Map) JSONObject.toJSON(reqBean), false);
			result = result.replace("null([", "").replace("])", "");
			hotLineServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, JSONObject.toJSONString(reqBean), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 信箱列表
	 * 
	 * @param modelId
	 * @param size
	 * @param deptId
	 * @param curPage
	 * @param sqCode
	 * @param queryCode
	 * @param clazz SQList or SQInfo
	 * @return
	 */
	public static <T> List<T> SQList(String modelId, String size, String deptId, String curPage, String sqCode, String queryCode, Class<T> clazz) {
		try {
			String url = getAccessUrl() + "/info/brow/SQList.jsp";
			Map<String, String> params = new HashMap<String, String>();
			params.put("model_id", modelId);
			params.put("size", size);
			if(StringUtils.isEmpty(deptId))
				params.put("dept_id", "");
			else
				params.put("dept_id", deptId);
			params.put("cur_page", curPage);
			params.put("sq_code", sqCode);
			params.put("query_code", queryCode);
			String result = HttpsClient.doPost(url, params, false);
			hotLineServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONArray.parseArray(result, clazz);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 获取某一信件内容
	 * 
	 * @param sqId
	 * @return
	 */
	public static SQInfo getAppealConent(String sqId) {
		try {
			String url = getAccessUrl() + "/info/brow/xinxiang/getAppealConent.jsp";
			Map<String, String> params = new HashMap<String, String>();
			params.put("sq_id", sqId);
			String result = HttpsClient.doPost(url, params, false);
			hotLineServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONArray.parseArray(result, SQInfo.class).get(0);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

}
