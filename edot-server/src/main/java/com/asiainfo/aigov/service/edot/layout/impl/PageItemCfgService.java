package com.asiainfo.aigov.service.edot.layout.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.layout.PageItemCfgMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.layout.PageItemCfg;
import com.asiainfo.aigov.model.edot.layout.PageItemCfgExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.layout.IPageItemCfgService;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class PageItemCfgService extends BaseService implements IPageItemCfgService {
	private static Logger log = Logger.getLogger(PageItemCfgService.class);
	
	@Autowired
	private PageItemCfgMapper pageItemCfgMapper;
	
	@Override
	public int add(PageItemCfg record)throws Exception{
		return pageItemCfgMapper.insert(record);
	}
	
	@Override
	public int count(PageItemCfgExample example)throws Exception{
		return pageItemCfgMapper.countByExample(example);
	}
	
	@Override
	public List<PageItemCfg> select(PageItemCfgExample example) {
		return pageItemCfgMapper.selectByExample(example);
	}

	@Override
	public List<PageItemCfg> select(PageItemCfgExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return pageItemCfgMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	@Override
	public List<PageItemCfg> selectByWorkCode(String workCode)throws Exception{
		PageItemCfgExample example = new PageItemCfgExample();
		PageItemCfgExample.Criteria criteria = example.createCriteria();
		criteria.andWorkCodeEqualTo(workCode);
		example.setOrderByClause("ORDER_NO");
		
		return this.select(example);
	}
	
}
