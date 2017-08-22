package com.asiainfo.aigov.web.controller.edot.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.edot.system.Region;
import com.asiainfo.aigov.service.edot.system.IRegionSV;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;

/** 
 * @Title        RegionController.java
 * @Description: 用户注册Controller
 * @author:      Administrator
 * @date:        2017年8月3日下午4:31:16 
 *  
 */
@Controller
@RequestMapping("/system/region")
public class RegionController extends BaseController{

	@Autowired
	private IRegionSV regionSV;
	
	@RequestMapping("/getRegionList")
	@ResponseBody
	@Remarks("根据父编码获取区域列表")
	public AjaxResponse getRegionList(String level, String parentCode) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		List<Region> list = regionSV.getRegionList(level, parentCode);
		
		resp.setData(list);
		return resp;
	}
	
}
