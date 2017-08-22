package com.asiainfo.aigov.web.webservice.edot.jkghService.api;

import java.io.StringReader;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.WebServiceUtils;

@Component
public class JkghServiceAPI {
	
	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("JKGH_SERVICE_URL")+"/services/JkghService?wsdl";
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static JkghServiceAPI jkghServiceAPI;
	
	@PostConstruct
    public void init() {
		jkghServiceAPI = this;
		jkghServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/
	
	/**
	 * 获取app信息记录
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.jkghService.bean.ED7001.rsp.Response getAppMessage() {
		StringReader in = null;
		try {
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getAppMessage", null);
			jkghServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getAppMessage", null, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.jkghService.bean.ED7001.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
}
