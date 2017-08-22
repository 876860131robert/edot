package com.asiainfo.aigov.service.healthcare.order;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.order.PublicOrder;
import com.asiainfo.aigov.model.healthcare.order.PublicOrderExample;
/**
 * 
 * @author 柯永锥
 *
 */
public interface IPublicOrderService {
	
	public int add(PublicOrder bean)throws Exception;
	
	public int update(PublicOrder bean)throws Exception;
	
	public int save(PublicOrder bean)throws Exception;
	
	public PublicOrder find(String id)throws Exception;
	
	public int count(PublicOrderExample example)throws Exception;
	
	public List<PublicOrder> select(PublicOrderExample example)throws Exception;
	
	public List<PublicOrder> select(PublicOrderExample example, Page page)throws Exception;
	
	public List<PublicOrder> queryOrder(String userId,String orderId)throws Exception;
	
	public List<PublicOrder> queryEvaluateList(String userId,String status)throws Exception;
}
