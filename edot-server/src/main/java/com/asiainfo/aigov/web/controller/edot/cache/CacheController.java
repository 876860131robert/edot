package com.asiainfo.aigov.web.controller.edot.cache;


import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.aigov.core.shiro.cache.RedisManager;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;


/**
 * 
 * @author songxiaoliang
 *
 */
@Controller
@RequestMapping("/admin/system/cache")
public class CacheController extends BaseController{
	private static Logger log = Logger.getLogger(CacheController.class);

	@Autowired
	private RedisManager redisManager;
	
	@RequestMapping("/toCacheManager")
	@Remarks("至缓存清除页")
	public ModelAndView toClear()throws Exception{
		ModelMap map = new ModelMap();
		return new ModelAndView("admin/system/cache_manager", map);
	}
	
	@RequestMapping("/clear")
	@ResponseBody
	@Remarks("缓存清除")
	public AjaxResponse clear(String type) throws Exception {
		//咨询
		if(StringUtils.isEmpty(type)){
			throw new AIException("缓存类型为空！");
		}
		if(WorkConstants.CACHE_TYPE_NEWS.equals(type.toLowerCase())){
			clearByStartWidthKey(WorkConstants.REDIS_DOMAIN_NEWS_LIST);
			clearByStartWidthKey(WorkConstants.REDIS_DOMAIN_NEWS_INFO);
		}
        
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
}
