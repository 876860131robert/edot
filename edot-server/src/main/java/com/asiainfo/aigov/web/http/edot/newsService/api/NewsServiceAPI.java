package com.asiainfo.aigov.web.http.edot.newsService.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.http.edot.newsService.bean.NewsInfo;
import com.asiainfo.aigov.web.http.edot.newsService.bean.NewsList;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.https.HttpsClient;

@Component
public class NewsServiceAPI {

	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("NEWS_SERVICE_URL");
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static NewsServiceAPI newsServiceAPI;
	
	@PostConstruct
    public void init() throws Exception {
		newsServiceAPI = this;
		newsServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/
	
	/**
	 * 资讯列表
	 * @param catId
	 * @param curPage
	 * @param size
	 * @param isShowThumb
	 * @return
	 */
	public static List<NewsList> infoList(String catId, String curPage, String size, String dictId, String isShowThumb) {
		try {
			String url = getAccessUrl() + "/info/brow/infoListBySite.jsp";
			Map<String, String> params = new HashMap<String, String>();
			params.put("cat_id", catId);
			params.put("cur_page", curPage);
			params.put("size", size);
			if("news_cat".equals(dictId)){
				params.put("site_id", "CMSxy");
			} else if("invest_cat".equals(dictId)){
				params.put("site_id", "CMSzsj");
			} else if("tour_cat".equals(dictId)){
				params.put("site_id", "CMSwwly");
			}
			if("true".equals(isShowThumb))
				params.put("is_show_thumb", isShowThumb);
			String result = HttpsClient.doPost(url, params, false);
			newsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONArray.parseArray(result, NewsList.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 资讯信息
	 * @param infoId
	 * @return
	 */
	public static NewsInfo infoContentn(String infoId) {
		try {
			String url = getAccessUrl() + "/info/brow/infoContentn.jsp";
			Map<String, String> params = new HashMap<String, String>();
			params.put("info_id", infoId);
			String result = HttpsClient.doPost(url, params, false);
			newsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, NewsInfo.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
