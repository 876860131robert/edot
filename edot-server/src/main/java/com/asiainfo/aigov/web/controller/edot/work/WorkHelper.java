package com.asiainfo.aigov.web.controller.edot.work;



import java.beans.ExceptionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.BASE64Util;
import com.asiainfo.frame.utils.DBUtil;
import com.asiainfo.frame.utils.ExcelUtils;
import com.asiainfo.frame.utils.TimeUtil;

public class WorkHelper{
	private static Logger log = LoggerFactory.getLogger(WorkHelper.class);

	
	/**
	 * 更新类型：删除所有记录再更新
	 */
	public static void updateBusinessClass()throws Exception{
		System.out.println("更新类型开始......");
		String page = "1";
		String maxPagesize = String.valueOf(Integer.MAX_VALUE);
		List<BusinessClass> personClass = WorkWebService.searchBusinessClass(WorkConstants.CLASS_TYPE_PERSON, page, maxPagesize);
		List<BusinessClass> companyClass = WorkWebService.searchBusinessClass(WorkConstants.CLASS_TYPE_COMPANY, page, maxPagesize);
		if(personClass!=null && personClass.size()>0 && companyClass!=null && companyClass.size()>0){
			DBUtil.executeUpdate(getConnection(), "DELETE FROM ED_WORK_BUSINESS_CLASS", null);
			//添加个人办事类型
			BusinessClass person = new BusinessClass();
			person.setId(WorkConstants.WORK_TYPE_PERSON);
			person.setColuname("个人办事");
			person.setColusort("1");
			person.setUpdateTime(new Date());
			DBUtil.insert(getConnection(), "ED_WORK_BUSINESS_CLASS", person);
			//添加企业办事类型
			BusinessClass company = new BusinessClass();
			company.setId(WorkConstants.WORK_TYPE_COMPANY);
			company.setColuname("企业办事");
			company.setColusort("2");
			company.setUpdateTime(new Date());
			DBUtil.insert(getConnection(), "ED_WORK_BUSINESS_CLASS", company);
			
			for (BusinessClass businessClass : personClass) {
				businessClass.setColuparentid(WorkConstants.WORK_TYPE_PERSON);
				businessClass.setUpdateTime(new Date());
				DBUtil.insert(getConnection(), "ED_WORK_BUSINESS_CLASS", businessClass);
			}
			for (BusinessClass businessClass : companyClass) {
				businessClass.setColuparentid(WorkConstants.WORK_TYPE_COMPANY);
				businessClass.setUpdateTime(new Date());
				DBUtil.insert(getConnection(), "ED_WORK_BUSINESS_CLASS", businessClass);
			}
		}
		log.info("更新类型结束！");
	}
	/**
	 * 更新部门:删除所有记录再更新
	 * @return
	 * @throws Exception
	 */
	public static void updateDept()throws Exception{
		System.out.println("更新部门开始......");
		List<WorkDept> list = WorkWebService.searchAllDepartment();
		if(list!=null && list.size()>0){
			DBUtil.executeUpdate(getConnection(), "DELETE FROM ED_WORK_DEPT", null);
			for (WorkDept workDept : list) {
				workDept.setUpdateTime(new Date());
				DBUtil.insert(getConnection(), "ED_WORK_DEPT", workDept);
			}
		}
		System.out.println("更新部门结束！");
	}
	/**
	 * 更新办事服务：逐条删除更新
	 * @param startTime	格式: 2016-08-09 10:00:00
	 * @return
	 * @throws Exception
	 */
	public static void updateServiceItem()throws Exception{
		Date currDate = new Date();
		System.out.println("更新办事服务开始......");
		String pagesize = AppPropertyUtil.getProperty("updateServiceItemPageSize");
		if(StringUtils.isEmpty(pagesize)){
			pagesize = "5";
		}
		//根据分类更新
		List<Map<String, Object>> classList = DBUtil.selectListWithMap(getConnection(), "select * from ED_WORK_BUSINESS_CLASS", null);
		if(classList!=null && classList.size()>0){
			int index=0;
			for (Map<String, Object> businessClass : classList) {
				System.out.println("for businessClassList:"+(index++)+"/"+classList.size());
				int page = 1;
				List<ServiceItem> list = WorkWebService.searchServiceItemByClass(businessClass.get("id").toString(), String.valueOf(page++), pagesize);
				while(list !=null && list.size()>0){
					for (ServiceItem serviceItem : list) {
						Map<String,Object> old = DBUtil.selectMap(getConnection(), "select * from ED_WORK_SERVICE_ITEM where servno=?", new Object[]{serviceItem.getServno()});
						if(old==null){
							serviceItem.setBusinessClassId(businessClass.get("id").toString());
							//获取流程图
							String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
							if(StringUtils.isNotBlank(flowImg)){
								serviceItem.setFlowimg(BASE64Util.decode(flowImg));
							}
							serviceItem.setUpdateTime(new Date());
							DBUtil.insert(getConnection(), "ED_WORK_SERVICE_ITEM", serviceItem);
						}else{
							Date lastUpdateTime = (Date)old.get("update_time");
//							lastUpdateTime = new Date();
							//如果不是本次更新记录，则先删后增
							if(TimeUtil.compareDate(currDate, lastUpdateTime)>0){
								serviceItem.setBusinessClassId(businessClass.get("id").toString());
								//获取流程图
								String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
								if(StringUtils.isNotBlank(flowImg)){
									serviceItem.setFlowimg(BASE64Util.decode(flowImg));
								}
								//先删除
								DBUtil.executeUpdate(getConnection(), "delete from ED_WORK_SERVICE_ITEM where SERVNO=?", new Object[]{old.get("servno")});
								//再增加
								serviceItem.setUpdateTime(new Date());
								DBUtil.insert(getConnection(), "ED_WORK_SERVICE_ITEM", serviceItem);
							}
							//如果是本次更新记录，则修改
							else{
								String businessClassId = old.get("business_class_id")==null ? "" : old.get("business_class_id").toString();
								if(StringUtils.isNotEmpty(businessClassId)){
									businessClassId += ","+businessClass.get("id").toString();
								}else{
									businessClassId = businessClass.get("id").toString();
								}
								StringBuffer updateSql = new StringBuffer();
								updateSql.append("update ED_WORK_SERVICE_ITEM");
								updateSql.append(" set BUSINESS_CLASS_ID=?,UPDATE_TIME=?");
								updateSql.append(" where SERVNO=?");
								DBUtil.executeUpdate(getConnection(), updateSql.toString(), new Object[]{
										businessClassId,new Date(),old.get("servno").toString()
								});
							}
						}
					}
					list = WorkWebService.searchServiceItemByClass(businessClass.get("id").toString(), String.valueOf(page++), pagesize);
				}
			}
		}
		//根据部门更新
		List<Map<String, Object>> deptList = DBUtil.selectListWithMap(getConnection(), "select * from ED_WORK_DEPT", null);
		if(deptList!=null && deptList.size()>0){
			int index=0;
			for (Map<String, Object> dept : deptList) {
				System.out.println("for deptList:"+(index++)+"/"+deptList.size());
				int page = 1;
				List<ServiceItem> list = WorkWebService.searchServiceItemByDeptCode(dept.get("deptcode").toString(), String.valueOf(page++), pagesize, "deptcode", "asc");
				while(list!=null && list.size()>0){
					for (ServiceItem serviceItem : list) {
						Map<String,Object> old = DBUtil.selectMap(getConnection(), "select * from ED_WORK_SERVICE_ITEM where servno=?", new Object[]{serviceItem.getServno()});
						if(old==null){
							//获取流程图
							String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
							if(StringUtils.isNotBlank(flowImg)){
								serviceItem.setFlowimg(BASE64Util.decode(flowImg));
							}
							serviceItem.setUpdateTime(new Date());
							DBUtil.insert(getConnection(), "ED_WORK_SERVICE_ITEM", serviceItem);
						}else{
							Date lastUpdateTime = (Date)old.get("update_time");
//							lastUpdateTime = new Date();
							//如果不是本次更新记录，则先删后增
							if(TimeUtil.compareDate(currDate, lastUpdateTime)>0){
								//获取流程图
								String flowImg = WorkWebService.getServiceItemFlowImg(serviceItem.getServno());
								if(StringUtils.isNotBlank(flowImg)){
									serviceItem.setFlowimg(BASE64Util.decode(flowImg));
								}
								
								//先删除
								DBUtil.executeUpdate(getConnection(), "delete from ED_WORK_SERVICE_ITEM where SERVNO=?", new Object[]{old.get("servno")});
								//再增加
								serviceItem.setUpdateTime(new Date());
								DBUtil.insert(getConnection(), "ED_WORK_SERVICE_ITEM", serviceItem);
							}
						}
					}
					list = WorkWebService.searchServiceItemByDeptCode(dept.get("deptcode").toString(), String.valueOf(page++), pagesize, "deptcode", "asc");
				}
			}
		}
		
		System.out.println("更新办事服务结束！");
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
	public static void updateMaterial()throws Exception{
		System.out.println("更新办事服务材料开始......");
		int pageIndex = 1;
		Page page = new Page();
		page.setPageIndex(pageIndex);
		page.setPageSize(20);
		
		List<String[]> list = DBUtil.selectListWithString(getConnection(), "select servno from ED_WORK_SERVICE_ITEM ", null);
		if(list!=null && list.size()>0){
			//servno:610400000000FG000-QR-0001  52/743
			for (int i = 218; i < list.size(); i++) {
				String servno = list.get(i)[0];
				System.out.println("servno:"+servno+"  "+(i)+"/"+list.size());
				//添加事项材料
				List<Material> matertialList = WorkWebService.searchServiceItemMatertias(servno);
				if(matertialList!=null && matertialList.size()>0){
					//删除服务对应材料
					DBUtil.executeUpdate(getConnection(), "delete from ED_WORK_MATERIAL where SERVCODE=?", new Object[]{servno});
					//添加
					for (Material matertial : matertialList) {
						matertial.setServcode(servno);
						matertial.setUpdateTime(new Date());
						try {
							DBUtil.insert(getConnection(), "ED_WORK_MATERIAL", matertial);
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
				//添加表格下载
			    matertialList = WorkWebService.searchServiceItemTables(servno);
				if(matertialList!=null){
					for (Material matertial : matertialList) {
						matertial.setServcode(servno);
						matertial.setUpdateTime(new Date());
						//获取表格数据
						String tableData = WorkWebService.getServiceItemTable(matertial.getMateno());
						if(StringUtils.isNotBlank(tableData)){
							matertial.setMatetemplate(BASE64Util.decode(tableData));
						}
						Map<String,Object> old = DBUtil.selectMap(getConnection(), "select * from ED_WORK_MATERIAL where mateno=?", new Object[]{matertial.getMateno()});
						try {
							if(old==null){
								DBUtil.insert(getConnection(), "ED_WORK_MATERIAL", matertial);
							}else{
								StringBuffer updateSql = new StringBuffer();
								updateSql.append("update ED_WORK_MATERIAL");
								updateSql.append(" set MATETEMPLATENAME=?,MATETEMPLATE=?");
								updateSql.append(" where mateno=?");
								DBUtil.executeUpdate(getConnection(), updateSql.toString(), new Object[]{
										matertial.getMatetemplatename(),matertial.getMatetemplate(),matertial.getMateno()
								});
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		System.out.println("更新办事服务材料结束！");
	}
	
	public static Connection getConnection()throws Exception{
		String driver   = "com.mysql.jdbc.Driver";
		String url      = "jdbc:mysql://10.1.234.213:31306/cjcloud?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&rewriteBatchedStatements=true";
		String user     = "cj_testgov_user";
		String password = "Cj2K0F1ncbj_9testgov_urjfS";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,password);

		return con;
	}
	//excel为一点通oracle导出数据
	public static void updateBusinessClassId()throws Exception{
		List<List<String>> list = ExcelUtils.readSheet(0, 1, new FileInputStream(new File("C:/vincent/ED_WORK_SERVICE_ITEM.xls")));
		int index = 0;
		for (List<String> datas : list) {
			System.out.println("update:"+(index++)+"/"+list.size());
			String servno = datas.get(0);
			String businessClassId = datas.get(1);
			DBUtil.executeUpdate(getConnection(), "update ED_WORK_SERVICE_ITEM set BUSINESS_CLASS_ID=? where servno=?", businessClassId, servno);
		}
	}
	
	public static void main(String[] args)throws Exception{
		WorkWebService.isDebug = true;
		Date beginTime = new Date(); 
//		updateBusinessClass();
//		updateDept();
//		updateServiceItem();
//		updateMaterial();
//		updateBusinessClassId();
		System.out.println("更新办事结束，耗时："+TimeUtil.getTimeDifferenceDesc(beginTime, new Date()));
	}
}
