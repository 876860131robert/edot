package com.asiainfo.aigov.dao.healthcare.guidance;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.asiainfo.aigov.model.healthcare.guidance.QueryPublicReplyQuestion;

public interface QueryPublicReplyQuestionMapper {
	int countMyQuestion(String replyQuestionId);
    List<QueryPublicReplyQuestion> queryMyQuestionWithRowbounds(String userId, RowBounds rowBounds);
}