package com.asiainfo.aigov.web.controller.edot.news;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.common.cache.redis.JRedisPoolUtils;
import com.asiainfo.aigov.service.edot.news.INewsService;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.aigov.web.http.edot.newsService.api.NewsServiceAPI;
import com.asiainfo.aigov.web.http.edot.newsService.bean.NewsInfo;
import com.asiainfo.aigov.web.http.edot.newsService.bean.NewsList;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;

@Controller
@RequestMapping("/news/info")
public class NewsInfoController extends BaseController {

	@Autowired
	private INewsService newsService;
	
	@Autowired
	private JRedisPoolUtils jRedisPoolUtils;

	@RequestMapping("/selectInfoList")
	@ResponseBody
	@Remarks("资讯查询")
	@SuppressWarnings("unchecked")
	public AjaxResponse selectInfoList(@RequestParam String catId,
			@RequestParam String curPageNum,
			@RequestParam String pageCount,
			@RequestParam String dictId,
			@RequestParam String isShowThumb)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		Object value = jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_NEWS_LIST + "_" + catId + "@@" + curPageNum + "@@" + pageCount + "@@" + isShowThumb);
		List<NewsList> list = null;
		if(value == null){
			list = NewsServiceAPI.infoList(catId, curPageNum, pageCount, dictId, isShowThumb);
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_NEWS_LIST + "_" + catId + "@@" + curPageNum + "@@" + pageCount + "@@" + isShowThumb, list, 3600);
		} else {
			list = (List<NewsList>) value;
		}
		
		// 过滤掉没有图片缩略图的新闻
		for (int i = 0; i < list.size(); i++) {
			if ("http://www.xianyang.gov.cn/".equals(list.get(i).getThumb_url())) {
				list.remove(i);
				i--;
			}
		}
		
		resp.setData(list);
		return resp;
	}

	@RequestMapping("/getInfoDetail")
	@ResponseBody
	@Remarks("资讯详情")
	public AjaxResponse selectInfoDetail(@RequestParam String infoId)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		Object value = jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_NEWS_INFO + "_" + infoId);
		NewsInfo newInfo = null;
		if(value == null){
			newInfo = NewsServiceAPI.infoContentn(infoId);
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_NEWS_INFO + "_" + infoId, newInfo, 3600 * 24 * 7);
		} else {
			newInfo = (NewsInfo) value;
			jRedisPoolUtils.expire(WorkConstants.REDIS_DOMAIN_NEWS_INFO + "_" + infoId, 3600 * 24 * 7);
		}
		
		resp.setData(newInfo);
		return resp;
	}

	@RequestMapping("/selectNewsCatList")
	@ResponseBody
	@Remarks("订阅的新闻分类")
	@SuppressWarnings("rawtypes")
	public AjaxResponse selectNewsCatList(String userId, String dictId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		List<Map> result = newsService.getMyUserNewsCats(userId, dictId);
		resp.setData(result);
		return resp;
	}

	@RequestMapping("/setUserNewsCat")
	@ResponseBody
	@Remarks("订阅新闻分类")
	@User
	public AjaxResponse setUserNewsCat(String userId, String dictId, String catIds) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		newsService.updateMyUserNewsCats(userId, catIds, dictId);
		return resp;
	}
}
