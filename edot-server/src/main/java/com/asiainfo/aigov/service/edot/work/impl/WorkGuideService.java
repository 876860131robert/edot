package com.asiainfo.aigov.service.edot.work.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.work.WorkGuideMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.layout.PageItemCfg;
import com.asiainfo.aigov.model.edot.work.WorkGuide;
import com.asiainfo.aigov.model.edot.work.WorkGuideExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.layout.IPageItemCfgService;
import com.asiainfo.aigov.service.edot.work.IWorkGuideService;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageFactory;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class WorkGuideService extends BaseService implements IWorkGuideService {
	private static Logger log = Logger.getLogger(WorkGuideService.class);
	
	@Autowired
	private WorkGuideMapper workGuideMapper;
	
	@Override
	public int add(WorkGuide record)throws Exception{
		return workGuideMapper.insert(record);
	}
	
	@Override
	public int delete(String id)throws Exception{
		return workGuideMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String[] ids)throws Exception{
		WorkGuideExample example = new WorkGuideExample();
		WorkGuideExample.Criteria criteria = example.createCriteria();
		criteria.andWorkCodeIn(Arrays.asList(ids));
		return workGuideMapper.deleteByExample(example);
	}
	
	@Override
	public int update(WorkGuide record)throws Exception{
		WorkGuideExample example = new WorkGuideExample();
		WorkGuideExample.Criteria criteria = example.createCriteria();
		criteria.andWorkCodeEqualTo(record.getWorkCode());
		return workGuideMapper.updateByExample(record, example);	//user为set后面的值，example为where后面的条件
	}

	@Override
	public WorkGuide find(String id)throws Exception{
		return workGuideMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(WorkGuideExample example)throws Exception{
		return workGuideMapper.countByExample(example);
	}
	
	@Override
	public List<WorkGuide> select(WorkGuideExample example) {
		return workGuideMapper.selectByExample(example);
	}

	@Override
	public List<WorkGuide> select(WorkGuideExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return workGuideMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
}
