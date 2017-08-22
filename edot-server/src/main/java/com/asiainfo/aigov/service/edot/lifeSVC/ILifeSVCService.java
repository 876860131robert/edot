package com.asiainfo.aigov.service.edot.lifeSVC;

import java.util.List;
import java.util.Map;

import com.asiainfo.aigov.model.edot.lifeSVC.SysDataitem;
import com.asiainfo.aigov.model.edot.lifeSVC.WebService;

public interface ILifeSVCService {

	List<SysDataitem> getDataitem(String itemDid) throws Exception;

	List<WebService> getServiceList(String serviceType, String serviceScope, String sort, String serviceName, String curPageNum, String pageCount) throws Exception;

	Map<String, Object> getServiceInfo(String serviceId) throws Exception;

}
