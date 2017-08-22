package com.asiainfo.aigov.service.edot.common.impl;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.common.EdHttpLogMapper;
import com.asiainfo.aigov.model.edot.common.EdHttpLog;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.StringUtil;

@Service
@Transactional
public class EdHttpLogSVImpl implements IEdHttpLogSV {
	
	@Autowired
	private EdHttpLogMapper edHttpLogMapper;
	
	private Random random = new Random();

	public void saveHttpLog(String logType, String accessUrl, String reqContent, String rspContent) throws Exception {
		EdHttpLog record = new EdHttpLog();
		record.setLogMonth(Integer.parseInt(DateUtils.getDateString("yyyyMM")));
		String logId = String.valueOf(System.currentTimeMillis())+StringUtils.leftPad(String.valueOf(random.nextInt(10000)), 4, "0");
		record.setLogId(Long.parseLong(logId));
		record.setLogType(logType);
		record.setAccessUrl(StringUtil.disposeString(accessUrl, 4000));
		if(StringUtils.isNotEmpty(reqContent))
			record.setReqContent(StringUtil.disposeString(reqContent, 4000));
		record.setRspContent(rspContent);
		record.setLogTime(new Date());
		edHttpLogMapper.insert(record);
	}

}
