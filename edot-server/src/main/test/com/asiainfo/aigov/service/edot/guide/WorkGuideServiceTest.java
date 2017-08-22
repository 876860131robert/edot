package com.asiainfo.aigov.service.edot.guide;


import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.edot.system.Feature;
import com.asiainfo.aigov.service.BaseServiceTest;
import com.asiainfo.aigov.service.edot.work.IWorkGuideService;
import com.asiainfo.aigov.service.edot.work.IWorkService;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;
import com.asiainfo.frame.model.AjaxResponse;

/**
 * @author songxiaoliang
 */
public class WorkGuideServiceTest extends BaseServiceTest{
	@Autowired
    private IWorkGuideService approveInfoService;
	@Autowired
	private IWorkService workService;
	
    @Test
	public void selectDatas()throws Exception{
    	PageWork vo = workService.selectGuideInfo("0001");
    	System.out.println(">>"+JSONObject.toJSONString(vo));
	}
    
	
    public static void main(String[] args)throws Exception {
    	Feature f = new Feature();
    	f.setContent("撒发生非");
    	AjaxResponse resp = new AjaxResponse();
    	resp.setData(f);
    	System.out.println(">>>"+BeanUtils.getProperty(resp, "data.content"));
	}
}
