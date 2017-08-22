package com.asiainfo.aigov.dao.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.edot.work.UserWorkExample;
import com.asiainfo.aigov.service.edot.work.model.QryWorkGuideModel;

public interface QueryUserWorkGuideMapper {
	public List<QryWorkGuideModel> qryUserWorkGuide(UserWorkExample example)throws Exception;
}
