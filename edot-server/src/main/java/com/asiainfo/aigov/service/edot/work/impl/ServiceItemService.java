package com.asiainfo.aigov.service.edot.work.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.work.ServiceItemMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.BusinessClassExample;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.model.edot.work.WorkDeptExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.work.IBusinessClassService;
import com.asiainfo.aigov.service.edot.work.IServiceItemService;
import com.asiainfo.aigov.service.edot.work.IWorkDeptService;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.frame.utils.DBUtil;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class ServiceItemService extends BaseService implements IServiceItemService {
	private static Logger log = Logger.getLogger(ServiceItemService.class);
	
	@Autowired
	private ServiceItemMapper serviceItemMapper;
	@Autowired
	private IBusinessClassService businessClassService;
	@Autowired
	private IWorkDeptService workDeptService;
	
	@Override
	public int add(ServiceItem record)throws Exception{
		return serviceItemMapper.insert(record);
	}
	
	@Override
	public int delete(String id)throws Exception{
		return serviceItemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String[] ids)throws Exception{
		ServiceItemExample example = new ServiceItemExample();
		ServiceItemExample.Criteria criteria = example.createCriteria();
		criteria.andServnoIn(Arrays.asList(ids));
		return serviceItemMapper.deleteByExample(example);
	}
	
	@Override
	public int update(ServiceItem record, boolean withBLOBs)throws Exception{
		if(withBLOBs){
			return serviceItemMapper.updateByPrimaryKeyWithBLOBs(record);
		}else{
			return serviceItemMapper.updateByPrimaryKey(record);
		}
	}

	@Override
	public ServiceItem find(String id)throws Exception{
		return serviceItemMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(ServiceItemExample example)throws Exception{
		return serviceItemMapper.countByExample(example);
	}
	
	@Override
	public List<ServiceItem> select(ServiceItemExample example) {
		return serviceItemMapper.selectByExample(example);
	}
	@Override
	public List<ServiceItem> selectWithBLOBs(ServiceItemExample example)throws Exception{
		return serviceItemMapper.selectByExampleWithBLOBs(example);
	}
	@Override
	public List<ServiceItem> select(ServiceItemExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return serviceItemMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	@Override
	public void deleteAll()throws Exception{
		DBUtil.execute(super.getConnection(), "truncate table ED_WORK_SERVICE_ITEM");
	}
	
	public boolean updateByRemote()throws Exception{
		deleteAll();
		String page = "1";
		String maxPagesize = String.valueOf(Integer.MAX_VALUE);
		boolean classSuccess = false;
		boolean deptSuccess = false;
		//根据分类更新
		List<BusinessClass> classList = businessClassService.select(new BusinessClassExample());
		if(classList!=null && classList.size()>0){
			for (BusinessClass businessClass : classList) {
				List<ServiceItem> list = WorkWebService.searchServiceItemByClass(businessClass.getId(), page, maxPagesize);
				if(list!=null && list.size()>0){
					for (ServiceItem serviceItem : list) {
						ServiceItem old = this.find(serviceItem.getServno());
						if(old==null){
							serviceItem.setUpdateTime(new Date());
							this.add(serviceItem);
						}else{
							String businessClassId = old.getBusinessClassId();
							businessClassId += ","+businessClass.getId();
							old.setUpdateTime(new Date());
							old.setBusinessClassId(businessClassId);
							this.update(old, false);
						}
					}
				}
			}
			classSuccess = true;
		}
		//根据部门更新
		List<WorkDept> deptList = workDeptService.select(new WorkDeptExample());
		if(deptList!=null && deptList.size()>0){
			for (WorkDept dept : deptList) {
				List<ServiceItem> list = WorkWebService.searchServiceItemByDeptCode(dept.getDeptcode(), page, maxPagesize, "deptcode", "asc");
				if(list!=null && list.size()>0){
					for (ServiceItem serviceItem : list) {
						ServiceItem old = this.find(serviceItem.getServno());
						if(old==null){
							serviceItem.setUpdateTime(new Date());
							serviceItem.setDeptname(dept.getDeptname());
							this.add(serviceItem);
						}else{
							old.setDeptname(dept.getDeptname());
							old.setUpdateTime(new Date());
							this.update(old, false);
						}
					}
				}
			}
			deptSuccess = true;
		}
		return classSuccess && deptSuccess;
	}
	
	public void deleteByDateBefore(String date)throws Exception{
		String sql = "delete ED_WORK_SERVICE_ITEM where TO_CHAR(UPDATE_TIME, 'yyyy-mm-dd hh24:mi:ss')<'"+date+"'";
		DBUtil.execute(super.getConnection(), sql);
	}
}
