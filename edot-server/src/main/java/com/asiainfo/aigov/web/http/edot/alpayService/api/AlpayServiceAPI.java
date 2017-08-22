package com.asiainfo.aigov.web.http.edot.alpayService.api;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.http.edot.alpayService.bean.RspBean;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.https.HttpsClient;

@Component
public class AlpayServiceAPI {

	private static String accessUrl;

	private static String getAccessUrl() {
		if(accessUrl == null) {
			accessUrl = AppPropertyUtil.getProperty("ALPAY_SERVICE_URL");
		}
		return accessUrl;
	}

	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV				edHttpLogSV;

	private static AlpayServiceAPI		alpayServiceAPI;

	@PostConstruct
	public void init() throws Exception {
		alpayServiceAPI = this;
		alpayServiceAPI.edHttpLogSV = this.edHttpLogSV;
	}
	/******************* 解决工具类中的注入问题 end *******************/
	
	/**
	 * 查询订单状态
	 * @param outTradeNo
	 * @param orderType
	 * @return
	 */
	public static RspBean payStatus(String outTradeNo, String orderType) {
		try {
			String url = getAccessUrl() + "/alipayCommPay!payStatus.action";
			Map<String, String> params = new HashMap<String, String>();
			params.put("out_trade_no", outTradeNo);
			params.put("order_type", orderType);
			String result = HttpsClient.doPost(url, params);
			alpayServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
