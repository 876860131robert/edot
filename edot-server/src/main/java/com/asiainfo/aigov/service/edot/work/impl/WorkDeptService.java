package com.asiainfo.aigov.service.edot.work.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.work.WorkDeptMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.model.edot.work.WorkDeptExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.work.IWorkDeptService;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.frame.utils.DBUtil;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class WorkDeptService extends BaseService implements IWorkDeptService {
	private static Logger log = Logger.getLogger(WorkDeptService.class);
	
	@Autowired
	private WorkDeptMapper workDeptMapper;
	
	@Override
	public int add(WorkDept record)throws Exception{
		return workDeptMapper.insert(record);
	}
	
	@Override
	public int delete(String id)throws Exception{
		return workDeptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String[] ids)throws Exception{
		WorkDeptExample example = new WorkDeptExample();
		WorkDeptExample.Criteria criteria = example.createCriteria();
		criteria.andDeptcodeIn(Arrays.asList(ids));
		return workDeptMapper.deleteByExample(example);
	}
	
	@Override
	public int update(WorkDept record)throws Exception{
		return workDeptMapper.updateByPrimaryKey(record);
	}

	@Override
	public WorkDept find(String id)throws Exception{
		return workDeptMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(WorkDeptExample example)throws Exception{
		return workDeptMapper.countByExample(example);
	}
	
	@Override
	public List<WorkDept> select(WorkDeptExample example) {
		return workDeptMapper.selectByExample(example);
	}

	@Override
	public List<WorkDept> select(WorkDeptExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return workDeptMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	@Override
	public void deleteAll()throws Exception{
		DBUtil.execute(super.getConnection(), "truncate table ED_WORK_DEPT");
	}
	@Override
	public boolean updateByRemote()throws Exception{
		List<WorkDept> list = WorkWebService.searchAllDepartment();
		if(list!=null && list.size()>0){
			deleteAll();
			for (WorkDept workDept : list) {
				workDept.setUpdateTime(new Date());
				add(workDept);
			}
			return true;
		}
		
		return false;
	}
}
