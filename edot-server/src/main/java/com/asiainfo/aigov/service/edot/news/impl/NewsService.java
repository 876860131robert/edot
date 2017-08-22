package com.asiainfo.aigov.service.edot.news.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.dao.edot.news.UserNewsCatMapper;
import com.asiainfo.aigov.model.edot.news.UserNewsCat;
import com.asiainfo.aigov.model.edot.news.UserNewsCatExample;
import com.asiainfo.aigov.service.edot.news.INewsService;
import com.asiainfo.aigov.service.system.impl.SysDictManager;

@Service
public class NewsService implements INewsService {
	@Autowired
	private UserNewsCatMapper userNewsCatMapper;

	@Override
	public List<Map> getMyUserNewsCats(String userId, String dictId) throws Exception {
		List<Map> result = new ArrayList<Map>();
		Map catMap = SysDictManager.getInstance().getDict(dictId);
		if (catMap != null && catMap.size() > 0) {
			// userid为空表示查询全部
			if (StringUtils.isEmpty(userId)) {
				Set set = catMap.keySet();
				for (Object key : set) {
					Map map = new HashMap();
					map.put("key", key);
					map.put("value", catMap.get(key));
					result.add(map);
				}
				return result;
			}
			UserNewsCatExample example = new UserNewsCatExample();
			example.createCriteria().andUserIdEqualTo(userId).andDictIdEqualTo(dictId);
			List<UserNewsCat> list = userNewsCatMapper.selectByExample(example);
			if (list != null && list.size() > 0) {
				UserNewsCat userNewsCat = list.get(0);
				if (StringUtils.isNotEmpty(userNewsCat.getCatIds())) {
					String[] catIds = userNewsCat.getCatIds().split(",");
					if (catIds != null && catIds.length > 0) {
						for (String catid : catIds) {
							if (StringUtils.isNotEmpty(catid)) {
								if (catMap.containsKey(catid)) {
									Map map = new HashMap();
									map.put("key", catid);
									map.put("value", catMap.get(catid));
									result.add(map);
								}
							}
						}
					}
				}
			} else {
				// 没有订阅返回全部
				Set set = catMap.keySet();
				for (Object key : set) {
					Map map = new HashMap();
					map.put("key", key);
					map.put("value", catMap.get(key));
					result.add(map);
				}
				return result;
			}
		}
		return result;
	}

	@Override
	public void updateMyUserNewsCats(String userId, String catIds, String dictId) {
		UserNewsCatExample example = new UserNewsCatExample();
		example.createCriteria().andUserIdEqualTo(userId);
		this.userNewsCatMapper.deleteByExample(example);
		UserNewsCat userNewsCat = new UserNewsCat();
		userNewsCat.setUserId(userId);
		userNewsCat.setCatIds(catIds);
		userNewsCat.setDictId(dictId);
		userNewsCat.setCreateTime(new Date());
		userNewsCat.setUserCatId(UUID.randomUUID().toString());
		this.userNewsCatMapper.insert(userNewsCat);
	}
}
