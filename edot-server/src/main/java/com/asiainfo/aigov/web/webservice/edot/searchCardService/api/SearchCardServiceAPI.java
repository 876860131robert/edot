package com.asiainfo.aigov.web.webservice.edot.searchCardService.api;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardService_PortType;
import com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardService_ServiceLocator;
import com.asiainfo.frame.utils.AppPropertyUtil;

@Component
public class SearchCardServiceAPI {
	
	private static String accessUrl;
	
	private static SearchCardService_PortType service;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("CTZBMP_SERVICE_URL")+"/services/searchCardService?wsdl";
		}
		return accessUrl;
	}
	
	private static SearchCardService_PortType getService() throws Exception {
		if(service == null){
			SearchCardService_ServiceLocator locator = new SearchCardService_ServiceLocator();
			service = locator.getCardSearchServiceImplPort(new URL(getAccessUrl()));
		}
		return service;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static SearchCardServiceAPI searchCardServiceAPI;
	
	@PostConstruct
    public void init() {
		searchCardServiceAPI = this;
		searchCardServiceAPI.edHttpLogSV = this.edHttpLogSV;
		/******************* 解决工具类中的注入问题 end *******************/
    }

	/**
	 * 办卡进度查询
	 * @param sfzhm
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.searchCardService.service.CardSearchResult searchCardStatus(String sfzhm) {
		StringWriter out = null;
		StringReader in = null;
		try {
			com.asiainfo.aigov.web.webservice.edot.searchCardService.service.CardSearchResult cardSearchResult = getService().searchCardStatus("", sfzhm);
			JSONObject reqJson = new JSONObject();
			reqJson.put("sfzhm", sfzhm);
			searchCardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " searchCardStatus", reqJson.toJSONString(), JSONObject.toJSONString(cardSearchResult));
			return cardSearchResult;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
}
