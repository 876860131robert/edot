package com.asiainfo.aigov.service.edot.hotLine.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.common.util.BeanUtils;
import com.asiainfo.aigov.dao.edot.hotLine.CityVoiceMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.hotLine.ICityVoiceService;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.DBUtil;
import com.asiainfo.frame.utils.IdUtils;

@Service
@Transactional
public class CityVoiceSVImpl extends BaseService implements ICityVoiceService{
	private static Logger log = Logger.getLogger(CityVoiceSVImpl.class);
	
	@Autowired
	private CityVoiceMapper cityVoiceMapper;
	
	@Override
	public void add(CityVoice cityVoice,String type) throws Exception {
		if(StringUtils.isBlank(cityVoice.getCityVoiceId())){
			cityVoice.setCityVoiceId(IdUtils.uuid());
			cityVoice.setLikeNum(0);
			cityVoice.setReplyNum(0);
			cityVoice.setState("1");
			cityVoice.setCreateDate(new Date());
			cityVoiceMapper.insert(cityVoice);
			
			//回复
			if("1".equals(type)){
				//更新主题回复数
				CityVoice parent = cityVoiceMapper.selectByPrimaryKey(cityVoice.getParentId());
				int replyNum = parent.getReplyNum()+1;
				parent.setReplyNum(replyNum);
				cityVoiceMapper.updateByPrimaryKeySelective(parent);
			}
			
		}else{
			cityVoiceMapper.updateByPrimaryKeySelective(cityVoice);
		}
	}
	
	public void update(CityVoice cityVoice) throws Exception{
		cityVoiceMapper.updateByPrimaryKey(cityVoice);
	}

	@Override
	public CityVoice find(String cityVoiceId) throws Exception {
		return cityVoiceMapper.selectByPrimaryKey(cityVoiceId);
	}
	@Override
	public void delete(String[] ids)throws Exception{
		if(ids==null || ids.length==0){
			throw new AIException("编号为空！");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update ED_CITY_VOICE set STATE='0' ");
		sb.append(" where CITY_VOICE_ID in (");
		for (int i = 0; i < ids.length; i++) {
			sb.append("'").append(ids[i]).append("'");
			if(i<ids.length-1){
				sb.append(",");
			}
		}
		sb.append(" )");
		
		DBUtil.executeUpdate(DBUtil.getConnection(), sb.toString(), null);
		for (String id : ids) {
			//修改父回复数
			CityVoice cityVoice = this.find(id);
			//修改父类回复数
			if(cityVoice!=null && StringUtils.isNotEmpty(cityVoice.getParentId())){
				CityVoice parent = this.find(cityVoice.getParentId());
				parent.setReplyNum(parent.getReplyNum()-1);
				this.update(parent);
			}
		}
	}
	
	@Override
	public int count(CityVoiceExample example)throws Exception{
		return cityVoiceMapper.countByExample(example);
	}
	
	@Override
	public List<CityVoice> select(CityVoiceExample example) {
		return cityVoiceMapper.selectByExample(example);
	}

	@Override
	public List<CityVoice> select(CityVoiceExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return cityVoiceMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	@Override
	public void like(String cityVoiceId) throws Exception {
		CityVoice city = cityVoiceMapper.selectByPrimaryKey(cityVoiceId);
		int likeNum = city.getLikeNum()+1;
		city.setLikeNum(likeNum);
		cityVoiceMapper.updateByPrimaryKeySelective(city);
	}
	
	@Override
	public void delReply(String cityVoiceId, String userId) throws Exception {
		CityVoice city = cityVoiceMapper.selectByPrimaryKey(cityVoiceId);
		
		city.setCityVoiceId(cityVoiceId);
		city.setState("0");
		
		
		CityVoiceExample example = new CityVoiceExample();
		example.createCriteria().andCityVoiceIdEqualTo(cityVoiceId).andCreateIdEqualTo(userId);
		
		cityVoiceMapper.updateByExampleSelective(city, example);

		//查询有几条子数据
		example = new CityVoiceExample();
		example.createCriteria().andParentIdEqualTo(city.getParentId()).andStateEqualTo("1");
		int replyNum = cityVoiceMapper.countByExample(example);
		
		//更新回复
		CityVoice parent = new CityVoice();
		parent.setCityVoiceId(city.getParentId());
		parent.setReplyNum(replyNum);
		cityVoiceMapper.updateByPrimaryKeySelective(parent);
			
	}
}
