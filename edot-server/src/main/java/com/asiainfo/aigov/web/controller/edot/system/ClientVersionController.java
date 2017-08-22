package com.asiainfo.aigov.web.controller.edot.system;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.common.util.BeanUtils;
import com.asiainfo.aigov.model.edot.system.ClientVersion;
import com.asiainfo.aigov.model.system.SysFile;
import com.asiainfo.aigov.service.edot.system.IClientVersionService;
import com.asiainfo.aigov.service.edot.system.impl.ClientVersionManager;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.ApplicationContextUtil;
import com.asiainfo.frame.utils.FileDownloadHandler;
import com.asiainfo.frame.utils.FileUtil;
/**
 * 
 * @author songxiaoliang
 *
 */
/** 
 * @Title        ClientVersionController.java
 * @Description: 客户端版本的Controller
 * @author:      Administrator
 * @date:        2017年8月3日下午4:33:44 
 *  
 */
@Controller
@RequestMapping("/system/clientver")
public class ClientVersionController extends BaseController{
	private static Logger log = Logger.getLogger(ClientVersionController.class);

	@Autowired
	private IClientVersionService clientVersionService;
		
	@RequestMapping("/find/{osn}")
	@ResponseBody
	@Remarks("客户端版本查询")
	public AjaxResponse find(HttpServletRequest request,@PathVariable("osn") String osn) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		ClientVersion version = ClientVersionManager.getInstance().getClientVersion(osn);
		ClientVersion version1 = new ClientVersion();
		BeanUtils.copyProperties(version, version1);
		
		if(version.getDownloadUrl().indexOf(AdminClientVersionController.CLIENT_FILE_SUFFIX_NAME_IOS)!=-1){
			String downloadUrl = version1.getDownloadUrl();
			downloadUrl = downloadUrl.substring(0, downloadUrl.length()-3)+"plist";
			version1.setDownloadUrl("itms-services://?action=download-manifest&url="
					+ ApplicationContextUtil.getBasePath(request)
//					+ "/upload/client/edot.plist");
					+ "/"+downloadUrl);
		}
		else if(version.getDownloadUrl().indexOf(AdminClientVersionController.CLIENT_FILE_SUFFIX_NAME_ANDROID)!=-1){
			version1.setDownloadUrl(ApplicationContextUtil.getBasePath(request) 
//					+ "/upload/client/edot.apk");
					+ "/"+version1.getDownloadUrl());
		}
		
		resp.setData(version1);
		
		return resp;
	}
	
	@RequestMapping("/download/{osn}")
	@Remarks("客户端版本下载")
	public void download(HttpServletRequest request,HttpServletResponse response,@PathVariable("osn") String osn) throws Exception {
		ClientVersion version = ClientVersionManager.getInstance().getClientVersion(osn);
		String filePath = version.getDownloadUrl();
		String isLocal = AppPropertyUtil.getProperty("IS_LOCAL");
		if("true".equals(isLocal)){
			filePath = FileUtil.joinPath(ApplicationContextUtil.getAppPath(request),filePath);
		}
		FileDownloadHandler handler = new FileDownloadHandler();
		String suffixName = getSuffixName(filePath);
		String downloadFileName = version.getOsName()+version.getLatestVer()+".";
		if(filePath.indexOf(AdminClientVersionController.CLIENT_FILE_NAME_IOS)!=-1){
			filePath = filePath.replace(AdminClientVersionController.CLIENT_FILE_SUFFIX_NAME_IOS, ".plist");
			downloadFileName += "plist";
		}
		else{
			downloadFileName += suffixName;
		}
		System.out.println(filePath);
		System.out.println(downloadFileName);
		handler.download(response, downloadFileName, filePath);
	}
	
	private String getSuffixName(String fileName){
		int lastPointIndex = fileName.lastIndexOf(".");
		if(lastPointIndex!=-1){
			return fileName.substring(lastPointIndex+1, fileName.length());
		}
		
		return "";
	}
}
