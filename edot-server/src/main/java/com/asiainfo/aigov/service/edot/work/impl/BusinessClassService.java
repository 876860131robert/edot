package com.asiainfo.aigov.service.edot.work.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.dao.edot.work.BusinessClassMapper;
import com.asiainfo.aigov.dao.edot.work.ServiceItemMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.BusinessClassExample;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.work.IBusinessClassService;
import com.asiainfo.aigov.service.edot.work.IServiceItemService;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.frame.utils.DBUtil;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class BusinessClassService extends BaseService implements IBusinessClassService {
	private static Logger log = Logger.getLogger(BusinessClassService.class);
	
	@Autowired
	private BusinessClassMapper businessClassMapper;
	
	@Override
	public int add(BusinessClass record)throws Exception{
		return businessClassMapper.insert(record);
	}
	
	@Override
	public int delete(String id)throws Exception{
		return businessClassMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String[] ids)throws Exception{
		BusinessClassExample example = new BusinessClassExample();
		BusinessClassExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(Arrays.asList(ids));
		return businessClassMapper.deleteByExample(example);
	}
	
	@Override
	public int update(BusinessClass record)throws Exception{
		return businessClassMapper.updateByPrimaryKey(record);
	}

	@Override
	public BusinessClass find(String id)throws Exception{
		return businessClassMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(BusinessClassExample example)throws Exception{
		return businessClassMapper.countByExample(example);
	}
	
	@Override
	public List<BusinessClass> select(BusinessClassExample example) {
		return businessClassMapper.selectByExample(example);
	}

	@Override
	public List<BusinessClass> select(BusinessClassExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return businessClassMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	@Override
	public void deleteAll()throws Exception{
		DBUtil.execute(super.getConnection(), "truncate table ED_WORK_BUSINESS_CLASS");
	}
	@Override
	public boolean updateByRemote()throws Exception{
		log.info("更新类型开始......");
		String page = "1";
		String maxPagesize = String.valueOf(Integer.MAX_VALUE);
		List<BusinessClass> personClass = WorkWebService.searchBusinessClass(WorkConstants.WORK_TYPE_PERSON, page, maxPagesize);
		List<BusinessClass> companyClass = WorkWebService.searchBusinessClass(WorkConstants.WORK_TYPE_COMPANY, page, maxPagesize);
		if(personClass!=null && personClass.size()>0 && companyClass!=null && companyClass.size()>0){
			this.deleteAll();
			//添加个人办事类型
			BusinessClass person = new BusinessClass();
			person.setId(WorkConstants.WORK_TYPE_PERSON);
			person.setColuname("个人办事");
			person.setColusort("1");
			person.setUpdateTime(new Date());
			this.add(person);
			//添加企业办事类型
			BusinessClass company = new BusinessClass();
			company.setId(WorkConstants.WORK_TYPE_COMPANY);
			company.setColuname("企业办事");
			company.setColusort("2");
			company.setUpdateTime(new Date());
			this.add(company);
			
			log.info(JSONObject.toJSONString(personClass));
			for (BusinessClass businessClass : personClass) {
				businessClass.setColuparentid(WorkConstants.WORK_TYPE_PERSON);
				businessClass.setUpdateTime(new Date());
				this.add(businessClass);
			}
			for (BusinessClass businessClass : companyClass) {
				businessClass.setColuparentid(WorkConstants.WORK_TYPE_COMPANY);
				businessClass.setUpdateTime(new Date());
				this.add(businessClass);
			}
			
			return true;
		}
		log.info("更新类型结束！");
		
		return false;
	}
}
