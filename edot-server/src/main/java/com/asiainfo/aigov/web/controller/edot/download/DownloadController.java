package com.asiainfo.aigov.web.controller.edot.download;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asiainfo.frame.controller.BaseController;

@Controller
public class DownloadController extends BaseController {

	@RequestMapping("/download/index")
	public String index(){
		return "download/index";
	}
	
}
