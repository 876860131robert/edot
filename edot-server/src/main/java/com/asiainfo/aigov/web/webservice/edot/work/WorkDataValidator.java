package com.asiainfo.aigov.web.webservice.edot.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;

/**
 * @author songxiaoliang
 */
public class WorkDataValidator {
	public static void validatorWorkCount()throws Exception{
		Set<String> servno = new HashSet<String>();
		String page = "1";
		String pagesize = String.valueOf(Integer.MAX_VALUE);
		List<BusinessClass> personClass = WorkWebService.searchBusinessClass(WorkConstants.CLASS_TYPE_PERSON, page, pagesize);
		for (BusinessClass businessClass : personClass) {
			List<ServiceItem> itemList = WorkWebService.searchServiceItemByClass(businessClass.getId(), page, pagesize);
			if(itemList!=null){
				for (ServiceItem serviceItem : itemList) {
					servno.add(serviceItem.getServno());
				}
			}
		}
		List<BusinessClass> companyClass = WorkWebService.searchBusinessClass(WorkConstants.CLASS_TYPE_COMPANY, page, pagesize);
		for (BusinessClass businessClass : companyClass) {
			List<ServiceItem> itemList = WorkWebService.searchServiceItemByClass(businessClass.getId(), page, pagesize);
			if(itemList!=null){
				for (ServiceItem serviceItem : itemList) {
					servno.add(serviceItem.getServno());
				}
			}
		}
		List<WorkDept> deptList = WorkWebService.searchAllDepartment();
		for (WorkDept workDept : deptList) {
			List<ServiceItem> itemList = WorkWebService.searchServiceItemByDeptCode(workDept.getDeptcode(), page, pagesize, "deptcode", "asc");
			if(itemList!=null){
				for (ServiceItem serviceItem : itemList) {
					servno.add(serviceItem.getServno());
				}
			}
		}
		System.out.println("个人分类共计："+personClass.size());
		System.out.println("公司分类共计："+companyClass.size());
		System.out.println("部门共计："+deptList.size());
		System.out.println("办事服务共计："+servno.size());
	}
	
	public static void main(String[] args)throws Exception {
		WorkWebService.isDebug = true;
		WorkWebService.HOST = "http://10.63.32.22:8180";
		validatorWorkCount();
	}
}
