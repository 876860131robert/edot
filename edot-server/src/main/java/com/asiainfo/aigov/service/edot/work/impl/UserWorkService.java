package com.asiainfo.aigov.service.edot.work.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.work.QueryUserWorkGuideMapper;
import com.asiainfo.aigov.dao.edot.work.UserWorkMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.UserWork;
import com.asiainfo.aigov.model.edot.work.UserWorkExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.work.IUserWorkService;
import com.asiainfo.aigov.service.edot.work.model.QryWorkGuideModel;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.frame.utils.DBUtil;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class UserWorkService extends BaseService implements IUserWorkService {
	private static Logger log = Logger.getLogger(UserWorkService.class);
	@Autowired
	private UserWorkMapper workMapper;
	@Autowired
	private QueryUserWorkGuideMapper queryUserWorkGuideMapper;
	
	@Override
	public int add(UserWork record)throws Exception{
		record.setReadStatus(WorkConstants.USER_WORK_UNREAD);
		record.setStatus(WorkConstants.USER_WORK_STATUS_APPLY);
		return workMapper.insert(record);
	}
	
	@Override
	public int update(UserWork record)throws Exception{
		UserWorkExample example = new UserWorkExample();
		UserWorkExample.Criteria criteria = example.createCriteria();
		criteria.andUserWorkNoEqualTo(record.getUserWorkNo());
		return workMapper.updateByExample(record, example);	//user为set后面的值，example为where后面的条件
	}

	@Override
	public UserWork find(String id)throws Exception{
		return workMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(UserWorkExample example)throws Exception{
		return workMapper.countByExample(example);
	}
	
	@Override
	public List<UserWork> select(UserWorkExample example) {
		return workMapper.selectByExample(example);
	}

	@Override
	public List<UserWork> select(UserWorkExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return workMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	@Override
	public void read(String userWordCode)throws Exception{
		UserWork uw = this.find(userWordCode);
		if(WorkConstants.USER_WORK_UNREAD.equals(uw.getReadStatus())){
			uw.setReadStatus(WorkConstants.USER_WORK_READ);
			this.update(uw);
		}
	}
	@Override
	public void updateStatus(String userWordCode, String status)throws Exception{
		UserWork uw = this.find(userWordCode);
		if(!status.equals(uw.getStatus())){
			uw.setStatus(status);
			this.update(uw);
		}
	}
	/**
	 * 获取办事列表
	 * @param userId
	 * @param status
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<QryWorkGuideModel> qryUserWorkGuide(String userId)
			throws Exception {
		UserWorkExample example = new UserWorkExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return queryUserWorkGuideMapper.qryUserWorkGuide(example);
	}
	/**
	 * 统计已审批未读取
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@Override
	public int qryUnReadStatusCount(String userId) throws Exception {
		UserWorkExample example = new UserWorkExample();
		example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(WorkConstants.USER_WORK_STATUS_FINISHED).andReadStatusEqualTo(WorkConstants.USER_WORK_UNREAD);
		return workMapper.countByExample(example);
	}
	/**
	 * 更新为已读状态
	 * @param ids
	 * @throws Exception
	 */
	@Override
	public int updateUnReadToRead(String ids) throws Exception {
		int count = 0;
		String[] idArray = ids.split(",");
		for(String id:idArray){
			this.read(id);
		}
		return idArray.length;
	}
	/**
	 * 更新为已完成状态
	 * @param ids
	 * @throws Exception
	 */
	@Override
	public UserWork finishWork(String userWordCode) throws Exception {
		this.updateStatus(userWordCode, WorkConstants.USER_WORK_STATUS_FINISHED);
		UserWork userWork = this.find(userWordCode);
		return userWork;
	}
}
