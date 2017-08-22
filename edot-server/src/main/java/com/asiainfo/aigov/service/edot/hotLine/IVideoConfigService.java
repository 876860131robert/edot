package com.asiainfo.aigov.service.edot.hotLine;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.VideoConfig;
import com.asiainfo.aigov.model.edot.hotLine.VideoConfigExample;

/**
 * 
 * @author jiangyujie
 *
 */
public interface IVideoConfigService {
	public List<VideoConfig> findAll(VideoConfigExample example, Page page) throws Exception;
	public List<VideoConfig> findAll(VideoConfigExample example) throws Exception;
	public void save(VideoConfig viodeConfig) throws Exception;
	public long count(VideoConfigExample example) throws Exception;
	public void update(VideoConfig viodeConfig,VideoConfigExample example) throws Exception;
	public void delete(String id) throws Exception;
}
