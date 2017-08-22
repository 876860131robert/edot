package com.asiainfo.aigov.web.controller.edot.api;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.core.shiro.cache.RedisManager;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;

/**
 * 提供外部服务
 * @author songxiaoliang
 *
 */
@Controller
@RequestMapping("/api")
public class APIController extends BaseController{
	private static Logger log = Logger.getLogger(APIController.class);
	@Autowired
	private RedisManager redisManager;
	
	@RequestMapping("/news/updateone")
	@ResponseBody
	@Remarks("更新单条咨询缓存")
	public AjaxResponse newsUpdateone(String infoId) throws Exception {
		clearByStartWidthKey(WorkConstants.REDIS_DOMAIN_NEWS_INFO + "_" + infoId);
		return new AjaxResponse();
	}
	
	@RequestMapping("/news/updatelist")
	@ResponseBody
	@Remarks("更新咨询列表缓存")
	public AjaxResponse newsUpdatelist() throws Exception {
		clearByStartWidthKey(WorkConstants.REDIS_DOMAIN_NEWS_LIST);
		
		return new AjaxResponse();
	}
	
	private void clearByStartWidthKey(String cacheKey)throws Exception{
		Set<String> keys = redisManager.keys(cacheKey + "*");
		if(keys!=null){
			for (String key : keys) {
				log.info("清除缓存："+key);
				redisManager.del(key);
			}
		}
	}
	
	public static void main(String[] args)throws Exception{
		System.out.println(JSONObject.toJSONString(new AjaxResponse()));
	}
}
