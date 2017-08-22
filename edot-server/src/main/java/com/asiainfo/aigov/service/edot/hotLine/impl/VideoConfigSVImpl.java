package com.asiainfo.aigov.service.edot.hotLine.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.hotLine.VideoConfigMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.model.edot.hotLine.VideoConfig;
import com.asiainfo.aigov.model.edot.hotLine.VideoConfigExample;
import com.asiainfo.aigov.service.edot.hotLine.IVideoConfigService;
/**
 * 视频配置实现类
 * @author jiangyujie
 *
 */
@Service
@Transactional
public class VideoConfigSVImpl implements IVideoConfigService {

	private static Logger log = Logger.getLogger(VideoConfigSVImpl.class);
	
	@Autowired
	private VideoConfigMapper videoConfigMapper;
	
	@Override
	public List<VideoConfig> findAll(VideoConfigExample example, Page page) throws Exception {
		// TODO Auto-generated method stub
		long count = count(example);
		if(count>0){
			page.setRowCount((int)count);
			return videoConfigMapper.selectByExampleWithRowbounds(example, page);
		}
		
		return videoConfigMapper.selectByExampleWithRowbounds(example, page);
	}
	@Override
	public List<VideoConfig> findAll(VideoConfigExample example) throws Exception {
		// TODO Auto-generated method stub
		return videoConfigMapper.selectByExample(example);
		
	}

	@Override
	public void save(VideoConfig viodeConfig) throws Exception {
		// TODO Auto-generated method stub
		videoConfigMapper.insert(viodeConfig);
	}
	
	
	@Override
	public long count(VideoConfigExample example) throws Exception {
		return videoConfigMapper.countByExample(example);
	}
	@Override
	public void update(VideoConfig viodeConfig,VideoConfigExample example) throws Exception {
		// TODO Auto-generated method stub
		videoConfigMapper.updateByExample(viodeConfig, example);
		
	}
	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		videoConfigMapper.deleteByPrimaryKey(id);
	}

}
