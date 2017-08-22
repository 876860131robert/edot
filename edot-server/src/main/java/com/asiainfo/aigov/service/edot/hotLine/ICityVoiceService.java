package com.asiainfo.aigov.service.edot.hotLine;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceExample;

public interface ICityVoiceService {
	
	public void add(CityVoice cityVoice,String type) throws Exception;
	
	public void update(CityVoice cityVoice) throws Exception;
	
	public void delete(String[] ids)throws Exception;
	
	public void like(String cityVoiceId) throws Exception;
	
	public CityVoice find(String cityVoiceId) throws Exception;
	
	public int count(CityVoiceExample example)throws Exception;
	
	public List<CityVoice> select(CityVoiceExample example) throws Exception;
	
	public List<CityVoice> select(CityVoiceExample example, Page page)throws Exception;
	
	public void delReply(String cityVoiceId,String userId)throws Exception;
}
