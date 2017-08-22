package com.asiainfo.aigov.service.edot.hotLine;


import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLike;
import com.asiainfo.frame.bo.IUser;

/**
 * 点赞接口类
 * @author keyz@asiainfo.com
 *
 */
public interface ICityVoiceLikeService {
	
	public void saveEntity(CityVoiceLike cityVoicelike) throws Exception;
	
	public CityVoiceLike findEntity(String cityVoiceId,String mac) throws Exception;
	
}
