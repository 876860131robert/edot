package com.asiainfo.aigov.service.edot.lifeSVC.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.lifeSVC.SysDataitemMapper;
import com.asiainfo.aigov.dao.edot.lifeSVC.WebServiceCommentMapper;
import com.asiainfo.aigov.dao.edot.lifeSVC.WebServiceMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.lifeSVC.SysDataitem;
import com.asiainfo.aigov.model.edot.lifeSVC.SysDataitemExample;
import com.asiainfo.aigov.model.edot.lifeSVC.WebService;
import com.asiainfo.aigov.model.edot.lifeSVC.WebServiceExample;
import com.asiainfo.aigov.service.edot.lifeSVC.ILifeSVCService;
import com.asiainfo.frame.utils.AppPropertyUtil;

@Service
@Transactional
public class LifeSVCService implements ILifeSVCService {

	@Autowired
	private SysDataitemMapper sysDataitemMapper;
	
	@Autowired
	private WebServiceMapper webServiceMapper;
	
	@Autowired
	private WebServiceCommentMapper webServiceCommentMapper;
	
	public List<SysDataitem> getDataitem(String itemDid) throws Exception {
		SysDataitemExample sysDataitemExample = new SysDataitemExample();
		sysDataitemExample.setOrderByClause("item_num");
		SysDataitemExample.Criteria sysDataitemCriteria = sysDataitemExample.createCriteria();
		sysDataitemCriteria.andItemDidEqualTo(Integer.parseInt(itemDid));
		return sysDataitemMapper.selectByExample(sysDataitemExample);
	}

	public List<WebService> getServiceList(String serviceType, String serviceScope, String sort, String serviceName, String curPageNum, String pageCount) throws Exception {
		WebServiceExample webServiceExample = new WebServiceExample();
		if("sales".equals(sort)){
			webServiceExample.setOrderByClause("service_sales desc");
		} else if("checknum".equals(sort)){
			webServiceExample.setOrderByClause("service_checknum desc");
		} else {
			webServiceExample.setOrderByClause("create_date desc");
		}
		WebServiceExample.Criteria webServiceCriteria = webServiceExample.createCriteria();
		webServiceCriteria.andServiceStateEqualTo("1");
		webServiceCriteria.andIsDelEqualTo("1");
		if(StringUtils.isNotEmpty(serviceType)){
			webServiceCriteria.andServiceTypeEqualTo(Integer.parseInt(serviceType));
		}
		if(StringUtils.isNotEmpty(serviceScope)){
			webServiceCriteria.andServiceScopeLike("%," + serviceScope + ",%");
		}
		if(StringUtils.isNotEmpty(serviceName)){
			webServiceCriteria.andServiceNameLike("%" + serviceName + "%");
		}
		int count = webServiceMapper.countByExample(webServiceExample);
		if(count>0){
			Page page = new Page();
			page.setPageIndex(Integer.parseInt(curPageNum));
			page.setPageSize(Integer.parseInt(pageCount));
			page.setRowCount(count);
			return webServiceMapper.selectByExampleWithRowbounds(webServiceExample, page);
		}
		return null;
	}

	public Map<String, Object> getServiceInfo(String serviceId) throws Exception {
		//更新点击量
		webServiceMapper.updateChecknumByPrimaryKey(Integer.parseInt(serviceId));
		Map<String, Object> webService = webServiceMapper.selectByServiceId(Integer.parseInt(serviceId));
		//图片前缀
		webService.put("serviceLogoPrefix", AppPropertyUtil.getProperty("LIFE_SERVICE_URL"));
		//服务范围
		String serviceScope = String.valueOf(webService.get("serviceScope"));
		if(serviceScope.startsWith(",") && serviceScope.endsWith(",")){
			serviceScope = serviceScope.substring(1);
			serviceScope = serviceScope.substring(0, serviceScope.length() - 1);
			List<String> serviceScopeNames = new ArrayList<String>();
			String[] serviceScopes = serviceScope.split(",");
			for (String s : serviceScopes) {
				SysDataitem sysDataitem = sysDataitemMapper.selectByPrimaryKey(Integer.parseInt(s));
				if (sysDataitem != null) {
					serviceScopeNames.add(sysDataitem.getItemName());
				}
			}
			if(serviceScopeNames.isEmpty())serviceScopeNames.add("不限");
			webService.put("serviceScopeName", StringUtils.join(serviceScopeNames, "、"));
		}
		//获取评论列表
		List<Map<String, Object>> commentList = webServiceCommentMapper.selectByServiceId(Integer.parseInt(serviceId));
		webService.put("commentList", commentList);
		return webService;
	}

}
