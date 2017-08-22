package com.asiainfo.aigov.web.controller.edot.layout;




import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.model.edot.layout.PageItemCfg;
import com.asiainfo.aigov.service.edot.layout.IPageItemCfgService;
import com.asiainfo.aigov.service.edot.work.IWorkGuideService;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
/**
 * 
 * @author songxiaoliang
 *
 */
@Controller
@RequestMapping("/layout")
public class LayoutController extends BaseController{
	private static Logger logger = Logger.getLogger(LayoutController.class);

	@Autowired
	private IPageItemCfgService pageItemCfgService;
	
	@RequestMapping("/selectPageItem")
	@ResponseBody
	@Remarks("")
	public AjaxResponse selectPageItem(String workCode) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		List<PageItemCfg> list = pageItemCfgService.selectByWorkCode(workCode);
		resp.setData(list);
		return resp;
	}
}
