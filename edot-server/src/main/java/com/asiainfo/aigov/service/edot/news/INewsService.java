package com.asiainfo.aigov.service.edot.news;

import java.util.List;
import java.util.Map;

public interface INewsService {
	/**
	 * 获取我订阅的新闻分类
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<Map> getMyUserNewsCats(String userId, String dictId) throws Exception;

	/**
	 * 更新或者订阅我的新闻分类
	 * 
	 * @param userId
	 * @param catIds
	 * @return
	 */
	public void updateMyUserNewsCats(String userId, String catIds, String dictId);

}
