package com.asiainfo.frame.servlet;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.asiainfo.aigov.dao.edot.hotLine.HotMailMapper;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.web.http.edot.HotLineService.api.HotLineServiceAPI;
import com.asiainfo.aigov.web.http.edot.HotLineService.bean.SQInfo;
import com.asiainfo.frame.utils.ApplicationContextUtil;

public class SQReplyServlet extends javax.servlet.http.HttpServlet {

	private static final long			serialVersionUID	= 1L;

	private static Logger				logger				= Logger.getLogger(SQReplyServlet.class);

	private ScheduledExecutorService	executorService		= Executors.newSingleThreadScheduledExecutor();

	private HotMailMapper				hotMailMapper		= (HotMailMapper) ApplicationContextUtil.getInstance().getBean("hotMailMapper");

	public void init() {
		logger.info("信件回复状态轮询线程开始启动...");
		executorService.scheduleAtFixedRate(new Runnable() {

			public void run() {
				HotMailExample example = new HotMailExample();
				HotMailExample.Criteria criteria = example.createCriteria();
				criteria.andIsReadEqualTo("0");
				criteria.andReplyStateEqualTo("0");
				List<HotMail> list = hotMailMapper.selectByExample(example);
				for(HotMail hotMail : list) {
					if(StringUtils.isNotEmpty(hotMail.getSqCode()) && StringUtils.isNotEmpty(hotMail.getQueryCode())) {
						List<SQInfo> infoList = HotLineServiceAPI.SQList(hotMail.getModelId(), "1", hotMail.getHotMailDept(), "1", hotMail.getSqCode(), hotMail.getQueryCode(), SQInfo.class);
						if(infoList != null && infoList.size() > 0) {
							SQInfo sqInfo = infoList.get(0);
							if(sqInfo.getSq_status() == 3) {
								hotMail.setReplyContent(sqInfo.getSq_reply());
								hotMail.setReplyState("1");
								hotMailMapper.updateByPrimaryKey(hotMail);
							}
						}
					}
				}
			}

		}, 0, 1, TimeUnit.HOURS);
		logger.info("信件回复状态轮询线程启动成功...");
	}

}
