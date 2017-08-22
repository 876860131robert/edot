package com.asiainfo.aigov.web.webservice.edot.work;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ServiceItemWithMaterial;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.web.webservice.edot.work.bean.WorkResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.HttpClientUtil;

/**
 * @author songxiaoliang
 * 
 * 办事接口
 * 
 */
public class WorkWebService {
	public static boolean isDebug = false;
//	public static String HOST = "http://61.190.16.10:8180";	//测试
	public static String HOST = "http://10.63.32.22:8180";	//正式
	
	public static String getHost(){
		if(isDebug){
			return HOST;
		}else{
			return AppPropertyUtil.getProperty("WORK_WEBSERVICE_HOST");
		}
	}
	/**
	 * 服务事项分类查询
	 * @param classtype
	 * @param page
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public static List<BusinessClass> searchBusinessClass(String classtype, String page, String pagesize)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/businessClass";
		Map<String,String> params = new HashMap<String,String>();
		params.put("classtype", classtype);
		params.put("page", page);
		params.put("pagesize", pagesize);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			List<BusinessClass> list = JSONObject.parseArray(data , BusinessClass.class);
			return list;
		}
		return null;
	}
	/**
	 * 服务事项分类查询
	 * 
	 * @param classid	分类id
	 * @param page
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public static List<ServiceItem> searchServiceItemByClass(String classid, String page, String pagesize)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/getServiceItemByClass";
		Map<String,String> params = new HashMap<String,String>();
		params.put("classid", classid);
		params.put("page", page);
		params.put("pagesize", pagesize);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			System.out.println("数量："+resp.getDatasize());
			String data = resp.getData();
			List<ServiceItem> list = JSONObject.parseArray(data , ServiceItem.class);
			return list;
		}
		return null;
	}
	/**
	 * 获取所有部门
	 * @return
	 * @throws Exception
	 */
	public static List<WorkDept> searchAllDepartment()throws Exception{
		String url = getHost()+"/xzspserver/services/interface/allDepartment";
		
		String content = HttpClientUtil.getResponseBodyAsString(url);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			List<WorkDept> list = JSONObject.parseArray(data, WorkDept.class);
			return list;
		}
		return null;
	}
	/**
	 * 根据部门编号查询事项类表数据，带分页参数。
	 * @param deptCode	部门编号
	 * @param page
	 * @param pagesize
	 * @param orderby	排序字段
	 * @param sort		排序类型，asc、desc
	 * @return
	 * @throws Exception
	 */
	public static List<ServiceItem> searchServiceItemByDeptCode(String deptCode,
			String page, String pagesize, String orderby, String sort)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/serviceItemByDeptCode";
		Map<String,String> params = new HashMap<String,String>();
		params.put("deptCode", deptCode);
		params.put("page", page);
		params.put("pagesize", pagesize);
		if(StringUtils.isNotEmpty(orderby)){
			params.put("orderby", orderby);
			params.put("sort", sort);
		}
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			List<ServiceItem> list = JSONObject.parseArray(data , ServiceItem.class);
			return list;
		}
		return null;
	}
	/**
	 * 根据事项编号获取该事项关联的事项材料列表数据
	 * @param servno	事项编号
	 * @return
	 * @throws Exception
	 */
	public static List<Material> searchServiceItemMatertias(String servno)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/matertialList";
		Map<String,String> params = new HashMap<String,String>();
		params.put("servno", servno);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			List<Material> list = JSONObject.parseArray(data , Material.class);
			return list;
		}
		return null;
	}
	/**
	 * 根据事项编号查询事项数据
	 * @param servNo	事项编号
	 * @return
	 * @throws Exception
	 */
	public static ServiceItem getServiceItem(String servNo)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/serviceItem";
		Map<String,String> params = new HashMap<String,String>();
		params.put("servNo", servNo);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			ServiceItem bean = JSONObject.parseObject(data , ServiceItem.class);
			return bean;
		}
		return null;
	}
	/**
	 * 获取事项流程图数据(base64编码)
	 * @param servNo
	 * @return
	 * @throws Exception
	 */
	public static String getServiceItemFlowImg(String servNo)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/serviceItemFlowImg";
		Map<String,String> params = new HashMap<String,String>();
		params.put("servNo", servNo);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			return data;
		}
		return null;
	}
	/**
	 * 服务事项的表格下载
	 * @param servno
	 * @return
	 * @throws Exception
	 */
	public static List<Material> searchServiceItemTables(String servno)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/servicetables";
		Map<String,String> params = new HashMap<String,String>();
		params.put("servno", servno);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			List<Material> list = JSONObject.parseArray(data , Material.class);
			return list;
		}
		return null;
	}
	/**
	 * 获取表格数据(base64编码)
	 * @param mateno
	 * @return
	 * @throws Exception
	 */
	public static String getServiceItemTable(String mateno)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/getServiceTableByMateId";
		Map<String,String> params = new HashMap<String,String>();
		params.put("mateno", mateno);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			String data = resp.getData();
			return data;
		}
		return null;
	}
	/**
	 * 根据事项编号查询事项数据和关联的事项材料数据
	 * @param servNo	事项编号
	 * @return
	 * @throws Exception
	 */
	public static ServiceItemWithMaterial getServiceItemWithMaterial(String servNo)throws Exception{
		String url = getHost()+"/xzspserver/services/interface/serviceItemWithMatertial";
		Map<String,String> params = new HashMap<String,String>();
		params.put("servNo", servNo);
		
		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if(resp.isSuccess()){
			ServiceItemWithMaterial bean = new ServiceItemWithMaterial();
			ServiceItem item = JSONObject.parseObject(resp.getData() , ServiceItem.class);
			bean.setServiceItem(item);
			List<Material> matertials = JSONObject.parseArray(resp.getSubdata() , Material.class);
			bean.setMaterials(matertials);
			return bean;
		}
		return null;
	}
	
	public static void main(String[] args)throws Exception{
		isDebug = true;
		String page = "1";
		String pagesize = "2";
		String pagesizeMax = String.valueOf(Integer.MAX_VALUE);
		
//		List<BusinessClass> list = searchBusinessClass(WorkConstants.CLASS_TYPE_COMPANY, page, pagesizeMax);
//		System.out.println("【分类查询】：\n"+JSONObject.toJSONString(list,true));
//
//		List<ServiceItem> list1 = searchServiceItemByClass("4028808b41484a02014148aa1e350021", page, pagesizeMax);
//		List<ServiceItem> list1 = searchServiceItemByClass("4028808b41484a02014148aa1e350021", "30", "1");
//		System.out.println("【分类事项查询】：\n"+JSONObject.toJSONString(list1,true));
		
		List<WorkDept> list2 = searchAllDepartment();
		System.out.println("【部门查询】：\n"+JSONObject.toJSONString(list2,true));
		
		List<ServiceItem> list3 = searchServiceItemByDeptCode("610400000000GS100", page, pagesize, "deptcode", "asc");
		System.out.println("【部门事项查询】：\n"+JSONObject.toJSONString(list3,true));
		
//		List<Material> list4 = searchServiceItemMatertias("610400000000YJ000-XK-0012");
//		System.out.println("【材料查询】：\n"+JSONObject.toJSONString(list4,true));
		
//		ServiceItem bean = getServiceItem("610400000000MZ000-XK-0002");
//		System.out.println("【事项查询】：\n"+JSONObject.toJSONString(bean,true));
		
//		ServiceItemWithMaterial bean1 = getServiceItemWithMaterial("610400000000GS100-XK-0001");
//		System.out.println("【事项查询】：\n"+JSONObject.toJSONString(bean1,true));
//		
//		String flowImg = getServiceItemFlowImg("610400000000GS100-XK-0001");
//		System.out.println("【事项流程图查询】：\n"+flowImg);
		
//		List<Material> list8 = searchServiceItemTables("610400000000MZ000-XK-0002");
//		System.out.println("【事项表格下载列表查询】：\n"+JSONObject.toJSONString(list8,true));
		
//		String table = getServiceItemTable("610400000000JY000-QT-0008-CL003");
//		System.out.println("【事项表格下载数据查询】：\n"+table);
		
	}
	
}
