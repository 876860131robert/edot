package com.asiainfo.aigov.web.http.edot.ngariHealthService.api;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.MD5Util;

@Component
public class NgariHealthServiceAPI {

	private static String accessUrl;

	private static String getAccessUrl() {
		if(accessUrl == null) {
			accessUrl = AppPropertyUtil.getProperty("NGARI_HEALTH_SERVICE_URL");
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV				 edHttpLogSV;

	private static NgariHealthServiceAPI ngariHealthServiceAPI;

	@PostConstruct
	public void init() throws Exception {
		ngariHealthServiceAPI = this;
		ngariHealthServiceAPI.edHttpLogSV = this.edHttpLogSV;
	}
	/******************* 解决工具类中的注入问题 end *******************/
	
	public static String createPageUrl(String idcard, String mobile, String patientName, String tid) {
		String url = getAccessUrl();
		String appkey = AppPropertyUtil.getProperty("NGARI_HEALTH_APPKEY");
		String appsecret = AppPropertyUtil.getProperty("NGARI_HEALTH_APPSECRET");
		StringBuffer temp = new StringBuffer("appkey=").append(appkey).append("&idcard=").append(idcard).append("&mobile=")
				.append(mobile).append("&patientName=").append(patientName).append("&tid=").append(tid);
		String tempStr = temp.toString();
		String signature = MD5Util.getMD5(temp.append(appsecret).toString());
		return url + "?" + tempStr + "&signature=" + signature;
	}
	
	public static void main(String[] args) {
		System.out.println(createPageUrl("330101199912249351", "13584675644", "张一天", "6654"));
	}
	
}
