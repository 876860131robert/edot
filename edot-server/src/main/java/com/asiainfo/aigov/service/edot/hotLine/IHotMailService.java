package com.asiainfo.aigov.service.edot.hotLine;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.bo.IUser;

/**
* @ClassName: IHotMailService
* @Description: 信息接口类
* @author Administrator
* @date 2017年7月24日 下午4:49:04
* 
*/
public interface IHotMailService {
	
	public void add(HotMail hotMail,UserInfo u) throws Exception;
	
	public void update(HotMail hotMail) throws Exception;
	
	public HotMail find(String hotMailId) throws Exception;
	
	public List<HotMail> select(HotMailExample example, Page page)throws Exception;

	public List<HotMail> select(HotMailExample example)throws Exception;
	
	public int count(HotMailExample example)throws Exception;
	
	public void read(String hotMailId)throws Exception;
	
	public void delete(String[] ids)throws Exception;
	
	public void reply(String id, String content, IUser user)throws Exception;
}
