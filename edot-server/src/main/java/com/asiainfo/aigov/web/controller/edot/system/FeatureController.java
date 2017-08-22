package com.asiainfo.aigov.web.controller.edot.system;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.common.cache.redis.JRedisPoolUtils;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.system.Feature;
import com.asiainfo.aigov.service.edot.system.IFeatureService;
import com.asiainfo.aigov.service.edot.system.IRegionSV;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.ApplicationContextUtil;
/**
 * 
 * @author songxiaoliang
 *
 */
@Controller
@RequestMapping("/system/feature")
public class FeatureController extends BaseController{
	private static Logger log = Logger.getLogger(FeatureController.class);

	@Autowired
	private IFeatureService featureService;
	@Autowired
	private IRegionSV regionSV;
	@Autowired
	private JRedisPoolUtils jRedisPoolUtils;
	
	@RequestMapping("/selectDatas")
	@ResponseBody
	@Remarks("功能查询")
	public AjaxResponse selectDatas(HttpServletRequest request, String id) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		if(StringUtils.isNotBlank(id)){
			String[] ids = id.split(",");
			List<Feature> list = featureService.selectDatas(ids);
			updateIcon(request, list);
			resp.setData(list);
		}
		return resp;
	}
	
	@RequestMapping("/selectDatasByZone")
	@ResponseBody
	@Remarks("分区域功能查询")
	public AjaxResponse selectDatasByZone(HttpServletRequest request, String id, String zoneName) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		if(StringUtils.isNotBlank(id)){
			String[] ids = id.split(",");
			Object value = jRedisPoolUtils.getHSet(WorkConstants.GET_REGION_CODE_BY_NAME, zoneName);
			String regionCode = null;
			if(value == null){
				regionCode = regionSV.getRegionCodeByName(zoneName);
				jRedisPoolUtils.setHSet(WorkConstants.GET_REGION_CODE_BY_NAME, zoneName, regionCode);
			} else {
				regionCode = String.valueOf(value);
			}
			List<Feature> list = featureService.selectDatasByZone(ids, regionCode);
			updateIcon(request, list);
			resp.setData(list);
		}
		return resp;
	}
	
	
	private void updateIcon(HttpServletRequest request, Feature feature){
		String icon = feature.getIcon();
		if(StringUtils.isNotBlank(icon)){
			if(NumberUtils.isNumber(icon)){
				feature.setIcon(ApplicationContextUtil.getBasePath(request)+"/sys/file/downloadImg?id="+feature.getIcon());
			} else {
				feature.setIcon(ApplicationContextUtil.getBasePath(request)+"/images/icon/"+feature.getIcon());
			}
		}else{
			feature.setIcon(ApplicationContextUtil.getBasePath(request)+"/images/icon/"+feature.getId());
		}
		List<Feature> children = feature.getChild();
		if(children!=null && children.size()>0){
			updateIcon(request, children);
		}
	}

	private void updateIcon(HttpServletRequest request, List<Feature> list){
		for (Feature feature : list) {
			updateIcon(request, feature);
		}
	}
	
	
}
