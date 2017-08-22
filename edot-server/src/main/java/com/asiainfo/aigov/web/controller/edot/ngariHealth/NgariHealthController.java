package com.asiainfo.aigov.web.controller.edot.ngariHealth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.web.http.edot.ngariHealthService.api.NgariHealthServiceAPI;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;

@Controller
public class NgariHealthController extends BaseController {

	@RequestMapping("/ngariHealth/createPageUrl")
	@ResponseBody
	@Remarks("获取纳里健康链接地址")
	public AjaxResponse createPageUrl(String idcard, String mobile, String patientName, String tid) {
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(NgariHealthServiceAPI.createPageUrl(idcard, mobile, patientName, tid));
		return ajaxResponse;
	}
	
}
