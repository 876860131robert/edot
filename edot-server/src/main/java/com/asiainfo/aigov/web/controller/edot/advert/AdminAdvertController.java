package com.asiainfo.aigov.web.controller.edot.advert;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.net.InetAddress;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.utils.SystemUtil;

/** 
 * @Title        AdminAdvertController.java
 * @Description: 系统信息的Controller类，前端对应的是configuration_manager.jsp页面用EL表达式接收map
 * @author:      Administrator
 * @date:        2017年8月14日下午3:00:09 
 *  
 */
@Controller
@RequestMapping("/admin/system/advert")
public class AdminAdvertController extends BaseController{
		private static Logger log = Logger.getLogger(AdminAdvertController.class);
		@RequestMapping("/toList")
		@Remarks("系統基本信息")
		public ModelAndView toList()throws Exception{
			ModelMap map = new ModelMap();
			OperatingSystemMXBean mem = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
			 @SuppressWarnings("restriction")
			String totalSpace=((com.sun.management.OperatingSystemMXBean) mem).getTotalPhysicalMemorySize() / 1024 / 1024 + "MB";
	         @SuppressWarnings("restriction")
			String aviableSpace=((com.sun.management.OperatingSystemMXBean) mem).getFreePhysicalMemorySize() / 1024 / 1024 + "MB";
	         InetAddress addr = InetAddress.getLocalHost();   
	         String ip=addr.getHostAddress().toString(); //获取本机ip
	         String hostName=addr.getHostName().toString(); //获取本机计算机名称
			map.put("IP", ip);
			map.put("hostName", hostName);
			map.put("MAC", SystemUtil.getLocalMac(addr));
			map.put("totalSpace", totalSpace);
			map.put("aviableSpace", aviableSpace);
			map.put("systemName", SystemUtil.getSystemName());//当前系统名称
			return new ModelAndView("admin/system/configuration_manager", map);
		}
}
