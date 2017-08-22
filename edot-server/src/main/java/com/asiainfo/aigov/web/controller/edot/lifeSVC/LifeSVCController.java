package com.asiainfo.aigov.web.controller.edot.lifeSVC;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.edot.lifeSVC.SysDataitem;
import com.asiainfo.aigov.model.edot.lifeSVC.WebService;
import com.asiainfo.aigov.service.edot.lifeSVC.ILifeSVCService;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;

@Controller
@RequestMapping("/lifeSVC")
public class LifeSVCController extends BaseController {

	@Autowired
	private ILifeSVCService lifeSVCService;
	
	/**
	 * 服务列表：57 所属地区：54
	 * @param itemDid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getDataitem")
	@ResponseBody
	@Remarks("获取数据字典")
	public AjaxResponse getDataitem(String itemDid) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		List<SysDataitem> list = lifeSVCService.getDataitem(itemDid);
		ajaxResponse.setData(list);
		return ajaxResponse;
	}
	
	@RequestMapping("/getServiceList")
	@ResponseBody
	@Remarks("获取服务列表")
	public AjaxResponse getServiceList(String serviceType, String serviceScope, String sort, String serviceName, String curPageNum, String pageCount) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		List<WebService> list = lifeSVCService.getServiceList(serviceType, serviceScope, sort, serviceName, curPageNum, pageCount);
		ajaxResponse.setData(list);
		return ajaxResponse;
	}
	
	@RequestMapping("/getServiceInfo")
	@ResponseBody
	@Remarks("获取服务详情")
	public AjaxResponse getServiceInfo(String serviceId) throws Exception {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		Map<String, Object> webService = lifeSVCService.getServiceInfo(serviceId);
		ajaxResponse.setData(webService);
		return ajaxResponse;
	}
	
}
