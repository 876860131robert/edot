package com.asiainfo.aigov.healthcare.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.aigov.healthcare.dao.JkghAppMessageMapper;
import com.asiainfo.aigov.healthcare.model.JkghAppMessage;
import com.asiainfo.aigov.healthcare.model.JkghAppMessageExample;
import com.asiainfo.aigov.healthcare.service.IHealthCareSV;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;

/**
* @ClassName: HealthCareSVImpl
* @Description: 健康关怀的接口实现类
* @author Administrator
* @date 2017年7月25日 上午11:58:31
* 
*/
@Service
public class HealthCareSVImpl implements IHealthCareSV {
	
	@Autowired
	private JkghAppMessageMapper jkghAppMessageMapper;
	
	@Override
	public PagedList<JkghAppMessage> find(Page pager, JkghAppMessage jkghAppMessage) {
		return find(pager, jkghAppMessage, null);
	}

	/* (non-Javadoc)
	 * 
	 * 获取健康关怀信息
	 * @see com.asiainfo.aigov.healthcare.service.IHealthCareSV#find(com.asiainfo.aigov.model.Page, com.asiainfo.aigov.healthcare.model.JkghAppMessage, java.lang.String)
	 */
	@Override
	public PagedList<JkghAppMessage> find(Page pager, JkghAppMessage jkghAppMessage, String orderBy) {
		
		JkghAppMessageExample example = new JkghAppMessageExample();
		JkghAppMessageExample.Criteria criteria = example.createCriteria();
		criteria.andIdNoEqualTo(jkghAppMessage.getIdNo());
		if(StringUtils.isNotBlank(jkghAppMessage.getIsReaded()))
			criteria.andIsReadedEqualTo(jkghAppMessage.getIsReaded());
		if(StringUtils.isNotBlank(orderBy))
			example.setOrderByClause(orderBy);
		
		int count = jkghAppMessageMapper.countByExample(example);
		pager.setRowCount(count);
		
		List list =jkghAppMessageMapper.selectByExampleWithRowbounds(example, pager);
		PagedList<JkghAppMessage> pagedList = new PagedList<JkghAppMessage>();		
		pagedList.setPage(pager);
		pagedList.setResults(list);
		
		return pagedList;
	}

	@Override
	public int mod(JkghAppMessage jkghAppMessage) {
		return jkghAppMessageMapper.updateByPrimaryKeySelective(jkghAppMessage);
	}

	@Override
	public int mod(JkghAppMessage jkghAppMessage, String ids) {
		JkghAppMessageExample example = new JkghAppMessageExample();
		JkghAppMessageExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(Arrays.asList(ids.split(",")));
		return jkghAppMessageMapper.updateByExampleSelective(jkghAppMessage, example);
	}

	@Override
	public int add(JkghAppMessage jkghAppMessage) {
		JkghAppMessage bean = jkghAppMessageMapper.selectByPrimaryKey(jkghAppMessage.getId());
		if(bean == null)
			return jkghAppMessageMapper.insert(jkghAppMessage);
		return 0;
	}

}
