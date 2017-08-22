package com.asiainfo.aigov.web.controller.edot.work;



import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample.Criteria;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.BusinessClassExample;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.model.edot.work.WorkDeptExample;
import com.asiainfo.aigov.service.edot.hotLine.IHotMailService;
import com.asiainfo.aigov.service.edot.work.IBusinessClassService;
import com.asiainfo.aigov.service.edot.work.IMaterialService;
import com.asiainfo.aigov.service.edot.work.IServiceItemService;
import com.asiainfo.aigov.service.edot.work.IWorkDeptService;
import com.asiainfo.aigov.web.webservice.edot.work.UserWorkWebService;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.aigov.web.webservice.edot.work.bean.Consult;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.BASE64Util;
import com.asiainfo.frame.utils.TimeUtil;

@Controller
@RequestMapping("/work")
public class WorkScheduler{
	/**日志 */
	private static Logger log = LoggerFactory.getLogger(WorkScheduler.class);

	@Autowired
	private IBusinessClassService businessClassService;
	@Autowired
	private IWorkDeptService workDeptService;
	@Autowired
	private IServiceItemService serviceItemService;
	@Autowired
	private IMaterialService matertialService;
	@Autowired
	private IHotMailService hotMailService;
	
	/**
	 * 办事服务更新
	 */
	@Scheduled(cron="0 0 04 * * ?")//每天晚上X点执行
	public void updateWorkStart(){
		log.info("办事更新开始......");
		Date begin = new Date();
		try {
			updateWorkAll();
		} catch (Exception e) {
			log.error("更新办事失败：",e);
		}
		Date end = new Date();
		log.info("办事更新结束，耗时："+TimeUtil.getTimeDifferenceDesc(begin, end));
	}
	
	/**
	 * 用户办事咨询更新
	 */
	@Scheduled(cron="0 0 02 * * ?")//每天晚上X点执行   //0 * * * * * 代表每分钟执行一次 
	public void updateWorkConsultStart(){
		try {
			updateWorkConsult();
		} catch (Exception e) {
			log.error("更新咨询失败：",e);
		}
	}
	
	/**
	 * 更新类型：删除所有记录再更新
	 */
	@RequestMapping("/updateWorkAll")
	@ResponseBody
	@Remarks("更新办事所有")
	public AjaxResponse updateWorkAll()throws Exception{
		log.info("更新办事开始......");
		Date beginTime = new Date(); 
		updateBusinessClass();
		updateDept();
		updateServiceItem();
		updateMaterial();
		log.info("更新办事结束，耗时："+TimeUtil.getTimeDifferenceDesc(beginTime, new Date()));
		return new AjaxResponse();
	}
	
	/**
	 * 更新类型：删除所有记录再更新
	 */
	@RequestMapping("/updateBusinessClass")
	@ResponseBody
	@Remarks("更新类型")
	public AjaxResponse updateBusinessClass()throws Exception{
		log.info("更新类型开始......");
		String page = "1";
		String maxPagesize = String.valueOf(Integer.MAX_VALUE);
		List<BusinessClass> personClass = WorkWebService.searchBusinessClass(WorkConstants.CLASS_TYPE_PERSON, page, maxPagesize);
		List<BusinessClass> companyClass = WorkWebService.searchBusinessClass(WorkConstants.CLASS_TYPE_COMPANY, page, maxPagesize);
		if(personClass!=null && personClass.size()>0 && companyClass!=null && companyClass.size()>0){
			businessClassService.deleteAll();
			//添加个人办事类型
			BusinessClass person = new BusinessClass();
			person.setId(WorkConstants.WORK_TYPE_PERSON);
			person.setColuname("个人办事");
			person.setColusort("1");
			person.setUpdateTime(new Date());
			businessClassService.add(person);
			//添加企业办事类型
			BusinessClass company = new BusinessClass();
			company.setId(WorkConstants.WORK_TYPE_COMPANY);
			company.setColuname("企业办事");
			company.setColusort("2");
			company.setUpdateTime(new Date());
			businessClassService.add(company);
			
			log.info(JSONObject.toJSONString(personClass));
			for (BusinessClass businessClass : personClass) {
				businessClass.setColuparentid(WorkConstants.WORK_TYPE_PERSON);
				businessClass.setUpdateTime(new Date());
				businessClassService.add(businessClass);
			}
			for (BusinessClass businessClass : companyClass) {
				businessClass.setColuparentid(WorkConstants.WORK_TYPE_COMPANY);
				businessClass.setUpdateTime(new Date());
				businessClassService.add(businessClass);
			}
		}
		log.info("更新类型结束！");
		return new AjaxResponse();
	}
	/**
	 * 更新部门:删除所有记录再更新
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateDept")
	@ResponseBody
	@Remarks("更新部门")
	public AjaxResponse updateDept()throws Exception{
		log.info("更新部门开始......");
		List<WorkDept> list = WorkWebService.searchAllDepartment();
		if(list!=null && list.size()>0){
			workDeptService.deleteAll();
			for (WorkDept workDept : list) {
				workDept.setUpdateTime(new Date());
				workDeptService.add(workDept);
			}
		}
		log.info("更新部门结束！");
		return new AjaxResponse();
	}
	/**
	 * 更新办事服务：逐条删除更新
	 * @param startTime	格式: 2016-08-09 10:00:00
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateServiceItem")
	@ResponseBody
	@Remarks("更新办事服务")
	public AjaxResponse updateServiceItem()throws Exception{
		Date currDate = new Date();
		log.info("更新办事服务开始......");
		String pagesize = AppPropertyUtil.getProperty("updateServiceItemPageSize");
		if(StringUtils.isEmpty(pagesize)){
			pagesize = "5";
		}
		//根据分类更新
		List<BusinessClass> classList = businessClassService.select(new BusinessClassExample());
		if(classList!=null && classList.size()>0){
			for (BusinessClass businessClass : classList) {
				int page = 1;
				List<ServiceItem> list = WorkWebService.searchServiceItemByClass(businessClass.getId(), String.valueOf(page++), pagesize);
				while(list !=null && list.size()>0){
					for (ServiceItem serviceItem : list) {
						ServiceItem old = serviceItemService.find(serviceItem.getServno());
						if(old==null){
							serviceItem.setBusinessClassId(businessClass.getId());
							//获取流程图
							String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
							if(StringUtils.isNotBlank(flowImg)){
								serviceItem.setFlowimg(BASE64Util.decode(flowImg));
							}
							serviceItem.setUpdateTime(new Date());
							serviceItemService.add(serviceItem);
						}else{
							Date lastUpdateTime = old.getUpdateTime();
							//如果不是本次更新记录，则先删后增
							if(TimeUtil.compareDate(currDate, lastUpdateTime)>0){
								serviceItem.setBusinessClassId(businessClass.getId());
								//获取流程图
								String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
								if(StringUtils.isNotBlank(flowImg)){
									serviceItem.setFlowimg(BASE64Util.decode(flowImg));
								}
								//先删除
								serviceItemService.delete(old.getServno());
								//再增加
								serviceItem.setUpdateTime(new Date());
								serviceItemService.add(serviceItem);
							}
							//如果是本次更新记录，则修改
							else{
								String businessClassId = old.getBusinessClassId();
								if(StringUtils.isNotEmpty(businessClassId)){
									businessClassId += ","+businessClass.getId();
								}else{
									businessClassId = businessClass.getId();
								}
								old.setBusinessClassId(businessClassId);
								old.setUpdateTime(new Date());
								serviceItemService.update(old, false);
							}
						}
					}
					list = WorkWebService.searchServiceItemByClass(businessClass.getId(), String.valueOf(page++), pagesize);
				}
			}
		}
		//根据部门更新
		List<WorkDept> deptList = workDeptService.select(new WorkDeptExample());
		if(deptList!=null && deptList.size()>0){
			for (WorkDept dept : deptList) {
				int page = 1;
				List<ServiceItem> list = WorkWebService.searchServiceItemByDeptCode(dept.getDeptcode(), String.valueOf(page++), pagesize, "deptcode", "asc");
				while(list!=null && list.size()>0){
					for (ServiceItem serviceItem : list) {
						ServiceItem old = serviceItemService.find(serviceItem.getServno());
						if(old==null){
							//获取流程图
							String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
							if(StringUtils.isNotBlank(flowImg)){
								serviceItem.setFlowimg(BASE64Util.decode(flowImg));
							}
							serviceItem.setUpdateTime(new Date());
							serviceItemService.add(serviceItem);
						}else{
							Date lastUpdateTime = old.getUpdateTime();
							//如果不是本次更新记录，则先删后增
							if(TimeUtil.compareDate(currDate, lastUpdateTime)>0){
								//获取流程图
								String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
								if(StringUtils.isNotBlank(flowImg)){
									serviceItem.setFlowimg(BASE64Util.decode(flowImg));
								}
								//先删除
								serviceItemService.delete(old.getServno());
								//再增加
								serviceItem.setUpdateTime(new Date());
								serviceItemService.add(serviceItem);
							}
						}
					}
					list = WorkWebService.searchServiceItemByDeptCode(dept.getDeptcode(), String.valueOf(page++), pagesize, "deptcode", "asc");
				}
			}
		}
		
		log.info("更新办事服务结束！");
		return new AjaxResponse();
	}
	/**
	 * 更新办事服务材料：
	 * 1、轮询服务
	 * 2、删除服务对应材料
	 * 3、从接口查询对应服务材料并插入
	 * @param startTime	格式: 2016-08-09 10:00:00
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateMaterial")
	@ResponseBody
	@Remarks("更新办事服务材料")
	public AjaxResponse updateMaterial()throws Exception{
		log.info("更新办事服务材料开始......");
		int pageIndex = 1;
		Page page = new Page();
		page.setPageIndex(pageIndex);
		page.setPageSize(20);
		List<ServiceItem> list = serviceItemService.select(new ServiceItemExample(), page);
		while(list!=null && list.size()>0){
//			System.out.println(page);
			for (ServiceItem serviceItem : list) {
				
				//添加事项材料
				List<Material> matertialList = WorkWebService.searchServiceItemMatertias(serviceItem.getServno());
				if(matertialList!=null && matertialList.size()>0){
					//删除服务对应材料
					matertialService.deleteByServcode(serviceItem.getServno());
				}
				if(matertialList!=null){
					for (Material matertial : matertialList) {
						matertial.setServcode(serviceItem.getServno());
						matertial.setUpdateTime(new Date());
						try {
							matertialService.add(matertial);
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
				//添加表格下载
				matertialList = WorkWebService.searchServiceItemTables(serviceItem.getServno());
				if(matertialList!=null){
					for (Material matertial : matertialList) {
						matertial.setServcode(serviceItem.getServno());
						matertial.setUpdateTime(new Date());
						//获取表格数据
						String tableData = WorkWebService.getServiceItemTable(matertial.getMateno());
						if(StringUtils.isNotBlank(tableData)){
							matertial.setMatetemplate(BASE64Util.decode(tableData));
						}
						Material old = matertialService.find(matertial.getMateno());
						try {
							if(old==null){
								matertialService.add(matertial);
							}else{
								old.setMatetemplatename(matertial.getMatetemplatename());
								old.setMatetemplate(matertial.getMatetemplate());
								matertialService.update(old, true);
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
			}
			page.setPageIndex(++pageIndex);
			list = serviceItemService.select(new ServiceItemExample(), page);
		}
		log.info("更新办事服务材料结束！");
		return new AjaxResponse();
	}
	
	@RequestMapping("/updateWorkConsult")
	@ResponseBody
	@Remarks("更新办事咨询")
	public AjaxResponse updateWorkConsult()throws Exception{
		log.info("更新办事咨询开始......");
		HotMailExample example = new HotMailExample();
		Criteria criteria = example.createCriteria();
		criteria.andModelIdEqualTo("5");//办事咨询
		criteria.andReplyStateEqualTo("0");//待回复
		List<HotMail> list = hotMailService.select(example);
		if(list!=null){
			for (HotMail hotMail : list) {
				String id = hotMail.getQueryCode();
				Consult consult = UserWorkWebService.getConsult(id);
				if(StringUtils.isNotEmpty(consult.getReplayContent())){
					hotMail.setReplyContent(consult.getReplayContent());
					hotMail.setReplyerName(consult.getReplayUserName());
					try {
						Date replyTime = TimeUtil.parse(consult.getReplayTime(), TimeUtil.FORMAT_NORMAL);
						hotMail.setReplyTime(replyTime);
					} catch (Exception e) {
						// ignore
					}
					hotMail.setReplyState("1");
					hotMailService.update(hotMail);
				}
			}
		}
			
		log.info("更新办事咨询结束");
		return new AjaxResponse();
	}
	
}
