package com.asiainfo.aigov.web.controller.edot.system;



import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;
import com.asiainfo.aigov.model.edot.system.ClientVersion;
import com.asiainfo.aigov.model.edot.system.ClientVersionExample;
import com.asiainfo.aigov.model.system.SysFile;
import com.asiainfo.aigov.service.edot.system.IClientVersionService;
import com.asiainfo.aigov.service.edot.system.impl.ClientVersionManager;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.ApplicationContextUtil;
import com.asiainfo.frame.utils.FileUploadHandler;
import com.asiainfo.frame.utils.FileUtil;
import com.asiainfo.frame.utils.ServletUtil;
/**
 * 
 * @author songxiaoliang
 *
 */
@Controller
@RequestMapping("/admin/system/clientver")
public class AdminClientVersionController extends BaseController{
	private static Logger log = Logger.getLogger(AdminClientVersionController.class);

	public static final String CLIENT_FILE_NAME_ANDROID 		= "edot.apk";
	public static final String CLIENT_FILE_SUFFIX_NAME_ANDROID 	= ".apk";
	public static final String CLIENT_FILE_NAME_IOS 			= "edot.ipa";
	public static final String CLIENT_FILE_SUFFIX_NAME_IOS 		= ".ipa";
	
	
	@Autowired
	private IClientVersionService clientVersionService;
		
	@RequestMapping("/toList")
	@Remarks("至客户端版本查询页")
	public ModelAndView toList()throws Exception{
		ModelMap map = new ModelMap();
		return new ModelAndView("admin/system/clientver_list", map);
	}
	@RequestMapping("/toEdit")
	@Remarks("至客户端版本修改页")
	public ModelAndView toEdit(String id)throws Exception{
		ModelMap map = new ModelMap();
		if(StringUtils.isNotBlank(id)){
			map.put("bean", ClientVersionManager.getInstance().getClientVersion(id));
			map.put("isNew", false);
		}else{
			map.put("isNew", true);
		}
		return new ModelAndView("admin/system/clientver_edit", map);
	}
	@RequestMapping("/detail")
	@Remarks("至客户端版本详细页")
	public ModelAndView detail(String osn)throws Exception{
		ModelMap map = new ModelMap();
		ClientVersion clientVersion = ClientVersionManager.getInstance().getClientVersion(osn);
		map.put("bean", clientVersion);
		return new ModelAndView("admin/system/_detail", map);
	}
	@RequestMapping("/select")
	@ResponseBody
	@Remarks("客户端版本列表查询")
	public AjaxResponse select(HttpServletRequest request, Page page) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		ClientVersionExample example = new ClientVersionExample();
		List<ClientVersion> list = clientVersionService.select(example, page);
		resp.setData(new PagedList<ClientVersion>(list, page));
		return resp;
	}
	@RequestMapping("/disable")
	@ResponseBody
	@Remarks("客户端版本废除")
	public AjaxResponse disable(HttpServletRequest request,String ids) throws Exception {
		if(StringUtils.isNotBlank(ids)){
			clientVersionService.disable(ids.split(","));
			ClientVersionManager.getInstance().reload();
		}
		return new AjaxResponse();
	}
	@RequestMapping("/enable")
	@ResponseBody
	@Remarks("客户端版本激活")
	public AjaxResponse enable(HttpServletRequest request,String ids) throws Exception {
		if(StringUtils.isNotBlank(ids)){
			clientVersionService.enable(ids.split(","));
			ClientVersionManager.getInstance().reload();
		}
		return new AjaxResponse();
	}
	@RequestMapping("/delete")
	@ResponseBody
	@Remarks("客户端版本删除")
	public AjaxResponse delete(HttpServletRequest request,String ids) throws Exception {
		if(StringUtils.isNotBlank(ids)){
			clientVersionService.delete(ids.split(","));
			ClientVersionManager.getInstance().reload();
		}
		return new AjaxResponse();
	}
	@RequestMapping("/save")
	@ResponseBody
	@Remarks("客户端版本保存")
	public AjaxResponse save(HttpServletRequest request,ClientVersion bean, Boolean isNew) throws Exception {
		if(isNew!=null && isNew){
			clientVersionService.add(bean);
		}else{
			clientVersionService.update(bean);
		}
		ClientVersionManager.getInstance().reload();
		return new AjaxResponse();
	}
	
	@RequestMapping("/flushCache")
	@ResponseBody
	@Remarks("刷新缓存")
	public AjaxResponse flushCache(HttpServletRequest request) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		ClientVersionManager.getInstance().reload();
		resp.setData(ClientVersionManager.getInstance().selectAll());
		return resp;
	}
	
	/**
	 * 
	 * @param file
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upload")
	@Remarks("文件上传")
	public void upload(@RequestParam("file")MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		if(file==null || file.isEmpty()){
			throw new AIException("文件为空！");
		}
		String fileName = file.getOriginalFilename();
		if(fileName.toLowerCase().indexOf(CLIENT_FILE_SUFFIX_NAME_ANDROID)==-1 
				&& fileName.toLowerCase().indexOf(CLIENT_FILE_SUFFIX_NAME_IOS)==-1){
			throw new AIException("无效客户端文件："+fileName);
		}
		FileUploadHandler handler = new FileUploadHandler(file){
			@Override
			public void validate(MultipartFile file) {
			}
		};
		
		//一点通客户端特殊处理
		String osName = request.getParameter("osName");
		if("android".equals(osName)){
			handler.setSaveName(CLIENT_FILE_NAME_ANDROID);
		}
		else if("ios".equals(osName)){
			handler.setSaveName(CLIENT_FILE_NAME_IOS);
		}
		//非一点通客户端
		else{
			String suffixName = getSuffixName(fileName).toLowerCase();
			handler.setSaveName(osName+"."+suffixName);
		}
		
		String saveDir = AppPropertyUtil.getProperty("FILE_SAVE_BASE_PATH");
		saveDir = FileUtil.joinPath(saveDir, "client");
		String realFilePath = saveDir;
		//如果是本地环境，则加上应用路径
		String isLocal = AppPropertyUtil.getProperty("IS_LOCAL");
		if("true".equals(isLocal)){
			saveDir = FileUtil.joinPath(ApplicationContextUtil.getAppPath(request),saveDir);
		}
		handler.upload(saveDir);
		realFilePath = FileUtil.joinPath(realFilePath,handler.getSaveName());
		SysFile sysFile = new SysFile();
		sysFile.setId(new Random().nextInt(999999));
		sysFile.setFileName(file.getOriginalFilename());
		sysFile.setFilePath(realFilePath);
		sysFile.setFileSize(String.valueOf(file.getSize()));
		resp.setData(sysFile);
		ServletUtil.writeJson2Client(response, resp);
	}
	
	private String getSuffixName(String fileName){
		int lastPointIndex = fileName.lastIndexOf(".");
		if(lastPointIndex!=-1){
			return fileName.substring(lastPointIndex+1, fileName.length());
		}
		
		return "";
	}
}
