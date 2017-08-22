package com.asiainfo.aigov.service.healthcare.guidance;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestion;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestionExample;
import com.asiainfo.aigov.model.healthcare.guidance.QueryPublicReplyQuestion;

public interface IPublicReplyQuestionSerivce {
	public List<PublicReplyQuestion> select(PublicReplyQuestionExample example, Page page)throws Exception;

	void add(PublicReplyQuestion replyQuestion, String type) throws Exception;

	void like(String replyQuestionId) throws Exception;

	void delReply(String replyQuestionId, String userId) throws Exception;

	List<PublicReplyQuestion> select(PublicReplyQuestionExample example);

	int count(PublicReplyQuestionExample example) throws Exception;

	void delete(String[] ids) throws Exception;

	PublicReplyQuestion find(String replyQuestionId) throws Exception;
	
	/**
	 * 
	 * 功能描述：我的咨询列表
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月22日 下午8:23:00</p>
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public List<PublicReplyQuestion> qryMyQuerstion(String userId, Page page) throws Exception;
	public List<QueryPublicReplyQuestion> qryMyQuestion(String userId, Page page) throws Exception;
	
	/**
	 * 
	 * 功能描述：咨询问题的回答
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年4月22日 下午8:34:33</p>
	 *
	 * @param replyQuestionId
	 * @param page
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public List<PublicReplyQuestion> qryQuestionReplys(String replyQuestionId, Page page) throws Exception;
	
	public PublicReplyQuestion browse(String replyQuestionId) throws Exception;

}
