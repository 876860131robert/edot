package com.asiainfo.aigov.service.healthcare.guidance.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.common.util.DateUtils;
import com.asiainfo.aigov.dao.healthcare.guidance.PublicReplyQuestionMapper;
import com.asiainfo.aigov.dao.healthcare.guidance.QueryPublicReplyQuestionMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestion;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestionExample;
import com.asiainfo.aigov.model.healthcare.guidance.QueryPublicReplyQuestion;
import com.asiainfo.aigov.service.healthcare.guidance.IPublicReplyQuestionSerivce;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.DBUtil;
import com.asiainfo.frame.utils.IdUtils;
@Service
@Transactional
public class PublicReplyQuestionSerivceImpl implements IPublicReplyQuestionSerivce{

	@Autowired
	private PublicReplyQuestionMapper replyQuestionMapper;
	@Autowired
	private QueryPublicReplyQuestionMapper qryReplyQuestionMapper;
	

	private static Logger log = Logger.getLogger(PublicReplyQuestionSerivceImpl.class);
	

	@Override
	public void add( PublicReplyQuestion  replyQuestion,String type) throws Exception {
		if(StringUtils.isBlank(replyQuestion.getReplyQuestionId())){
			replyQuestion.setReplyQuestionId(IdUtils.uuid());
			replyQuestion.setLikeNum(0);
			replyQuestion.setReplyNum(0);
			replyQuestion.setState("1");
			replyQuestion.setCreateDate(new Date());
			replyQuestionMapper.insert(replyQuestion);
			
			//回复
			if("1".equals(type)){
				//更新主题回复数
				PublicReplyQuestion parent = replyQuestionMapper.selectByPrimaryKey(replyQuestion.getParentId());
				int replyNum = parent.getReplyNum()+1;
				parent.setReplyNum(replyNum);
				replyQuestionMapper.updateByPrimaryKeySelective(parent);
			}
			
		}else{
			replyQuestionMapper.updateByPrimaryKeySelective(replyQuestion);
		}
	}
	
	public void update(PublicReplyQuestion replyQuestion) throws Exception{
		replyQuestionMapper.updateByPrimaryKey(replyQuestion);
	}

	@Override
	public PublicReplyQuestion find(String replyQuestionId) throws Exception {
		return replyQuestionMapper.selectByPrimaryKey(replyQuestionId);
	}
	@Override
	public void delete(String[] ids)throws Exception{
		if(ids==null || ids.length==0){
			throw new AIException("编号为空！");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update ED_CITY_VOICE set STATE='0' ");
		sb.append(" where CITY_VOICE_ID in (");
		for (int i = 0; i < ids.length; i++) {
			sb.append("'").append(ids[i]).append("'");
			if(i<ids.length-1){
				sb.append(",");
			}
		}
		sb.append(" )");
		
		DBUtil.executeUpdate(DBUtil.getConnection(), sb.toString(), null);
		for (String id : ids) {
			//修改父回复数
			PublicReplyQuestion replyQuestion = this.find(id);
			//修改父类回复数
			if(replyQuestion!=null && StringUtils.isNotEmpty(replyQuestion.getParentId())){
				PublicReplyQuestion parent = this.find(replyQuestion.getParentId());
				parent.setReplyNum(parent.getReplyNum()-1);
				this.update(parent);
			}
		}
	}
	
	@Override
	public int count(PublicReplyQuestionExample example)throws Exception{
		return replyQuestionMapper.countByExample(example);
	}
	
	@Override
	public List<PublicReplyQuestion> select(PublicReplyQuestionExample example) {
		return replyQuestionMapper.selectByExample(example);
	}

	@Override
	public List<PublicReplyQuestion> select(PublicReplyQuestionExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return replyQuestionMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public void like(String replyQuestionId) throws Exception {
		PublicReplyQuestion replyQuestion = replyQuestionMapper.selectByPrimaryKey(replyQuestionId);
		int likeNum = replyQuestion.getLikeNum()+1;
		replyQuestion.setLikeNum(likeNum);
		replyQuestionMapper.updateByPrimaryKeySelective(replyQuestion);
	}
	
	@Override
	public void delReply(String replyQuestionId, String userId) throws Exception {
		PublicReplyQuestion replyQuestion = replyQuestionMapper.selectByPrimaryKey(replyQuestionId);
		replyQuestion.setReplyQuestionId(replyQuestionId);
		replyQuestion.setState("0");
		
		
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		example.createCriteria().andReplyQuestionIdEqualTo(replyQuestionId).andCreateIdEqualTo(userId);
		
		replyQuestionMapper.updateByExampleSelective(replyQuestion, example);

		//查询有几条子数据
		example = new PublicReplyQuestionExample();
		example.createCriteria().andParentIdEqualTo(replyQuestion.getParentId()).andStateEqualTo("1");
		int replyNum = replyQuestionMapper.countByExample(example);
		
		//更新回复
		PublicReplyQuestion parent = new PublicReplyQuestion();
		parent.setReplyQuestionId(replyQuestion.getParentId());
		parent.setReplyNum(replyNum);
		replyQuestionMapper.updateByPrimaryKeySelective(parent);
			
	}

	@Override
	public List<PublicReplyQuestion> qryMyQuerstion(String userId, Page page) throws Exception {
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		PublicReplyQuestionExample.Criteria cr = example.createCriteria();
		cr.andCreateIdEqualTo(userId);
		cr.andParentIdIsNull();
		List<Short> values = new ArrayList<Short>();
		values.add((short)1);
		values.add((short)2);
		cr.andTypeIn(values);
		example.setOrderByClause("CREATE_DATE DESC");
		return replyQuestionMapper.selectByExampleWithRowbounds(example, page);
	}
	
	@Override
	public List<QueryPublicReplyQuestion> qryMyQuestion(String userId, Page page) throws Exception {
		return qryReplyQuestionMapper.queryMyQuestionWithRowbounds(userId, page);
	}

	@Override
	public List<PublicReplyQuestion> qryQuestionReplys(String replyQuestionId, Page page) throws Exception {
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		PublicReplyQuestionExample.Criteria cr = example.createCriteria();
		cr.andStateEqualTo("1");
		cr.andParentIdEqualTo(replyQuestionId);
		example.setOrderByClause("CREATE_DATE DESC");
		if(null!=page) {
			return replyQuestionMapper.selectByExampleWithRowbounds(example, page);
		} else {
			return replyQuestionMapper.selectByExample(example);
		}
	}

	@Override
	public PublicReplyQuestion browse(String replyQuestionId) throws Exception {
		PublicReplyQuestion bean = replyQuestionMapper.selectByPrimaryKey(replyQuestionId);
		
		PublicReplyQuestion record = new PublicReplyQuestion();
		record.setReplyQuestionId(replyQuestionId);
		record.setLastBrowseTime(DateUtils.getTime());
		replyQuestionMapper.updateByPrimaryKeySelective(record);
		return bean;
	}

}
