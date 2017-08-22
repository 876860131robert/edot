package com.asiainfo.aigov.healthcare.service;

import com.asiainfo.aigov.healthcare.model.JkghAppMessage;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;

/**
* @ClassName: IHealthCareSV
* @Description:健康关怀的持久化层
* @author Administrator
* @date 2017年7月25日 上午11:56:56
* 
*/
public interface IHealthCareSV {

	/**
	 * @param pager
	 * @param jkghAppMessage
	 * @return
	 */
	PagedList<JkghAppMessage> find(Page pager, JkghAppMessage jkghAppMessage);
	PagedList<JkghAppMessage> find(Page pager, JkghAppMessage jkghAppMessage, String orderBy);
	int mod(JkghAppMessage jkghAppMessage);
	int mod(JkghAppMessage jkghAppMessage, String ids);
	int add(JkghAppMessage jkghAppMessage);
}
