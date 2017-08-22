package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.UserWork;
import com.asiainfo.aigov.model.edot.work.UserWorkExample;
import com.asiainfo.aigov.service.edot.work.model.QryWorkGuideModel;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IUserWorkService {
	
	public int add(UserWork bean)throws Exception;

	public int update(UserWork bean)throws Exception;
	
	public UserWork find(String id)throws Exception;
	
	public int count(UserWorkExample example)throws Exception;
	
	public List<UserWork> select(UserWorkExample example)throws Exception;
	
	public List<UserWork> select(UserWorkExample example, Page page)throws Exception;
	
	public void read(String userWordCode)throws Exception;

	public void updateStatus(String userWordCode, String status)throws Exception;
	/**
	 * 获取办事列表
	 * @param userId
	 * @param status
	 * @return
	 * @throws Exception
	 */
	public List<QryWorkGuideModel> qryUserWorkGuide(String userId)throws Exception;
	/**
	 * 统计已审批未读取
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public int qryUnReadStatusCount(String userId)throws Exception;
	/**
	 * 更新为已读状态
	 * @param ids
	 * @throws Exception
	 */
	public int updateUnReadToRead(String ids) throws Exception;
	/**
	 * 更新为已完成状态
	 * @param ids
	 * @throws Exception
	 */
	public UserWork finishWork(String userWordCode) throws Exception;
}
