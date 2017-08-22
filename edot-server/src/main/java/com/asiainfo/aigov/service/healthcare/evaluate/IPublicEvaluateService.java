package com.asiainfo.aigov.service.healthcare.evaluate;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.evaluate.PublicEvaluate;
import com.asiainfo.aigov.model.healthcare.evaluate.PublicEvaluateExample;
/**
 * 
 * @author 柯永锥
 *
 */
public interface IPublicEvaluateService {
	
	public int add(PublicEvaluate bean)throws Exception;
	
	public int update(PublicEvaluate bean)throws Exception;
	
	public PublicEvaluate find(String id)throws Exception;
	
	public int count(PublicEvaluateExample example)throws Exception;
	
	public List<PublicEvaluate> select(PublicEvaluateExample example)throws Exception;
	
	public List<PublicEvaluate> select(PublicEvaluateExample example, Page page)throws Exception;
	
	public List<PublicEvaluate> queryQuestionnaire(String userId,String orderId)throws Exception;
}
