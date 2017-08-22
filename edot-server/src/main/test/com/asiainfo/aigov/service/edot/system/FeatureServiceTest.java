package com.asiainfo.aigov.service.edot.system;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.edot.system.Feature;
import com.asiainfo.aigov.service.BaseServiceTest;
import com.asiainfo.aigov.service.edot.system.IFeatureService;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.BeanUtil;
import com.asiainfo.frame.utils.FileUtil;

/**
 * @author songxiaoliang
 */
public class FeatureServiceTest extends BaseServiceTest{
	@Autowired
    private IFeatureService featureService;
	
	@Test
    public void test()throws Exception{
		String fileDir = "C:/vincent/asiainfo/工作项目/一点通/菜单配置";
		File dirFile = new File(fileDir);
		for (File file: dirFile.listFiles()) {
			System.out.println("开始导入文件："+file.getName());
			String filePath = file.getPath();
			System.out.println(filePath);
			byte[] b = FileUtil.readFileAsByteArray(filePath);
			String content = new String(b);
//			System.out.println(content);
//			if(true) continue;
			FeatureRoot root = JSONObject.parseObject(content, FeatureRoot.class);
			List<Feature> list = root.getData();
			int level = 1;
			int orderNo = 1;
			String replace  = "UserModule/module/service/style/images/";
			String replace1 = "UserModule/module/index/style/images/";
			
			for (Feature f : list) {
				f.setIcon(f.getIcon().replace(replace, "").replace(replace1, ""));
				f.setLevelNo(Short.valueOf(String.valueOf(level)));
				f.setOrderNo(Short.valueOf(String.valueOf(orderNo++)));
				System.out.println("插入数据："+f.getId());
				featureService.add(f);
				List<Feature> child = f.getChild();
				
				int orderNo1 = 1;
				for (Feature feature : child) {
					feature.setIcon(feature.getIcon().replace(replace, "").replace(replace1, ""));
					feature.setParentId(f.getId());
					feature.setLevelNo(Short.valueOf(String.valueOf(level+1)));
					feature.setOrderNo(Short.valueOf(String.valueOf(orderNo1++)));
					System.out.println("插入数据："+feature.getId());
					featureService.add(feature);
				}
			}
		}
    }
	
//    @Test
	public void selectDatas()throws Exception{
		String[] ids = new String[]{"01","02","03","04"};
		List<Feature> list = featureService.selectDatas(ids);
		System.out.println(JSONObject.toJSONString(list));
	}
    
//    @Test
    public void find()throws Exception{
    	Feature feature = featureService.find("01");
    	feature.getChild().size();
    	System.out.println(JSONObject.toJSONString(feature));
    }
    
	
    public static void main(String[] args)throws Exception {
    	Feature f = new Feature();
    	f.setContent("撒发生非");
    	AjaxResponse resp = new AjaxResponse();
    	resp.setData(f);
    	System.out.println(">>>"+BeanUtils.getProperty(resp, "data.content"));
	}
}
