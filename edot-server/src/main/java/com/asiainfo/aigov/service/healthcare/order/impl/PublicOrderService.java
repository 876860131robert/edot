package com.asiainfo.aigov.service.healthcare.order.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.healthcare.order.PublicOrderMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.order.PublicOrder;
import com.asiainfo.aigov.model.healthcare.order.PublicOrderExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.healthcare.order.IPublicOrderService;
import com.asiainfo.frame.utils.IdUtils;
/**
 * 
 * @author 柯永锥
 *
 */
@Service
public class PublicOrderService extends BaseService implements IPublicOrderService {

	@Autowired
	private PublicOrderMapper publicUserMapper;

	@Override
	public int add(PublicOrder record)throws Exception{
		return publicUserMapper.insert(record);
	}
	
	@Override
	public int save(PublicOrder bean)throws Exception{
		String appointNo=bean.getAppointNo();
		String hospitalId=bean.getHospitalId();
		PublicOrder order=find(appointNo, hospitalId);
		if(order!=null){
			PublicOrderExample example=new PublicOrderExample();
			PublicOrderExample.Criteria criteria=example.createCriteria();
			criteria.andAppointNoEqualTo(appointNo);
			criteria.andHospitalIdEqualTo(hospitalId);
			bean.setOrderId(order.getOrderId());
			return publicUserMapper.updateByExample(bean, example);
		}else{
			String uuid=IdUtils.uuid();
			bean.setId(uuid);
			return publicUserMapper.insert(bean);
		}
		
	}
	@Override
	public int update(PublicOrder record)throws Exception{
		return publicUserMapper.updateByPrimaryKey(record);
	}

	public PublicOrder find(String appointNo,String hospitalId)throws Exception{
		PublicOrder publicOrder=null;
		PublicOrderExample example=new PublicOrderExample();
		PublicOrderExample.Criteria criteria=example.createCriteria();
		criteria.andAppointNoEqualTo(appointNo);
		criteria.andHospitalIdEqualTo(hospitalId);
		List<PublicOrder> publicOrderList= publicUserMapper.selectByExample(example);
		if(publicOrderList!=null && !publicOrderList.isEmpty()){
			publicOrder=publicOrderList.get(0);
		}
		return publicOrder;
	}
	
	public PublicOrder find(String id)throws Exception{
		return publicUserMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(PublicOrderExample example)throws Exception{
		return publicUserMapper.countByExample(example);
	}
	
	@Override
	public List<PublicOrder> select(PublicOrderExample example) {
		return publicUserMapper.selectByExample(example);
	}

	@Override
	public List<PublicOrder> select(PublicOrderExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return publicUserMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
	@Override
	public List<PublicOrder> queryOrder(String userId,String orderId)throws Exception{
		PublicOrderExample example=new PublicOrderExample();
		PublicOrderExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		example.setOrderByClause("ORDER_TIME DESC");
		if(orderId!=null && !orderId.isEmpty()){
			criteria.andOrderIdEqualTo(orderId);
		}
		
		return select(example);
	}

	@Override
	public List<PublicOrder> queryEvaluateList(String userId,String status) throws Exception {
		PublicOrderExample example=new PublicOrderExample();
		PublicOrderExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andEvaluateStatusEqualTo(status);
		return select(example);
	}
	
	
	
}
