/**
 * IZwzdService.java	  V1.0   2017年5月2日 下午4:39:37
 *
 * Copyright (c) 2017 AsiaInfo, All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.asiainfo.aigov.service.healthcare.guidance;

import java.util.List;

import com.asiainfo.aigov.model.healthcare.guidance.ZwzdDisease;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdParty;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibing;
import com.asiainfo.aigov.model.healthcare.guidance.ZwzdPartyJibingQuest;

public interface IZwzdService {
	/**
	 * 
	 * 功能描述：查询自我导诊部位列表
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年5月2日 下午4:43:38</p>
	 *
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public List<ZwzdParty> queryZwzdParty() throws Exception;
	
	public ZwzdParty getZwzdParty(Long partyid) throws Exception;
	
	/**
	 * 
	 * 功能描述：部位包含疾病列表
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年5月2日 下午4:46:54</p>
	 *
	 * @param partyId
	 * @param sex
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public List<ZwzdPartyJibing> queryZwzdPartyJbing(Long partyid, Long sex) throws Exception;
	
	/**
	 * 
	 * 功能描述：获取疾病的首个问题
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年5月2日 下午5:18:22</p>
	 *
	 * @param jibingcode
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public ZwzdPartyJibingQuest findPartyJibingFirstQuestion(Long jibingcode) throws Exception;
	
	/**
	 * 
	 * 功能描述：获取疾病下一个问题
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年5月2日 下午5:25:32</p>
	 *
	 * @param jibingcode
	 * @param nextQuestId
	 * @param parentAnswer
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public ZwzdPartyJibingQuest findPartyJibingNextQuestion(Long jibingcode, String nextQuestId, String parentAnswer) throws Exception;
	
	/**
	 * 
	 * 功能描述：获取疾病信息
	 *
	 * @author  zhangly
	 * <p>创建日期 ：2017年5月4日 下午3:51:59</p>
	 *
	 * @param diseaseid
	 * @return
	 * @throws Exception
	 *
	 * <p>修改历史 ：(修改人，修改时间，修改原因/内容)</p>
	 */
	public ZwzdDisease getZwzdDisease(String diseaseid) throws Exception;
}
