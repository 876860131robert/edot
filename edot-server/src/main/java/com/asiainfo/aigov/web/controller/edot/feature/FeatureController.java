package com.asiainfo.aigov.web.controller.edot.feature;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.PagedList;
import com.asiainfo.aigov.model.edot.system.Feature;
import com.asiainfo.aigov.model.edot.system.FeatureExample;
import com.asiainfo.aigov.service.edot.system.IFeatureService;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;

@Controller("featureController2")
public class FeatureController extends BaseController {
	
	@Autowired
	private IFeatureService featureService;

	@RequestMapping("/admin/feature")
	public String index(){
		return "feature/index";
	}
	
	@RequestMapping(value = "/admin/feature/features", method = RequestMethod.GET)
	@ResponseBody
	public PagedList<Feature> find(Feature feature, String kind) throws Exception {
		FeatureExample example = getFeatureExample(feature, kind);
		List<Feature> list = featureService.select(example);
		PagedList<Feature> pagedList = new PagedList<Feature>();		
		pagedList.setResults(list);
		
		return pagedList;
	}
	
	@RequestMapping(value = "/admin/feature/model/add", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResponse add(@RequestBody Feature feature) throws Exception{
		featureService.add(feature);
		return new AjaxResponse();
	}
	
	@RequestMapping(value = "/admin/feature/model/mod", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResponse mod(@RequestBody Feature feature) throws Exception{
		featureService.update(feature);
		return new AjaxResponse();
	}
	
	@RequestMapping(value = "/admin/feature/processChecked/{action}", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResponse del(@PathVariable("action") String action, @RequestBody Feature[] features) throws Exception{
		if(StringUtils.equals(action, "del")) {
            for (Feature feature : features) {
            	featureService.delete(feature.getId());
			}
        }
		return new AjaxResponse();
	}
	
	@RequestMapping(value = "/admin/feature/advert/add", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResponse add2(@RequestBody Feature feature) throws Exception{
		featureService.add(feature);
		return new AjaxResponse();
	}
	
	@RequestMapping(value = "/admin/feature/advert/mod", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResponse mod2(@RequestBody Feature feature) throws Exception{
		featureService.update(feature);
		return new AjaxResponse();
	}
	
	private FeatureExample getFeatureExample(Feature feature, String kind) {
		FeatureExample example = new FeatureExample();
		FeatureExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isNotEmpty(kind)){
			criteria.andIdLike(kind + "%");
		}
		
		example.setOrderByClause(" order_no ");
		return example;
	}
	
	@RequestMapping(value = "/admin/feature/advert/getIdByZone", method = RequestMethod.GET)
	@ResponseBody
	public AjaxResponse getIdByZone(String parentId, String zone) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		String id = featureService.getIdByZone(parentId, zone);
		ajaxResponse.setData(id);
		return ajaxResponse;
	}
	
}
