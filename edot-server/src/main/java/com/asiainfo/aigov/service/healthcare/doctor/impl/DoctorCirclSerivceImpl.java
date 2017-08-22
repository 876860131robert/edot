package com.asiainfo.aigov.service.healthcare.doctor.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.healthcare.doctor.PublicDoctorCircleMapper;
import com.asiainfo.aigov.dao.healthcare.doctor.PublicDoctorCircleVisualMapper;
import com.asiainfo.aigov.dao.healthcare.doctor.QueryPublicDoctorCircleMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircle;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleVisual;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleVisualExample;
import com.asiainfo.aigov.service.healthcare.doctor.IDoctorCirclSerivce;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.DBUtil;
import com.asiainfo.frame.utils.IdUtils;

@Service
@Transactional
public class DoctorCirclSerivceImpl implements IDoctorCirclSerivce{
	@Autowired
	QueryPublicDoctorCircleMapper queryPublicDoctorCircleMapper;
	
	@Autowired
	PublicDoctorCircleMapper publicDoctorCircleMapper;
	
	@Autowired
	PublicDoctorCircleVisualMapper publicDoctorCircleVisualMapper;
	
	public List<?> selectCirclByUserVisual(String userId,Page page){
		List<?> list=null;
		list=queryPublicDoctorCircleMapper.selectCirclByUserVisual(userId, page);
		return list;
	}


	@Override
	public void add(PublicDoctorCircle doctorCircle, String type) {

		if(StringUtils.isBlank(doctorCircle.getDoctorCircleId())){
			doctorCircle.setDoctorCircleId(IdUtils.uuid());
			doctorCircle.setLikeNum(0);
			doctorCircle.setReplyNum(0);
			doctorCircle.setState("1");
			doctorCircle.setCreateDate(new Date());
			publicDoctorCircleMapper.insert(doctorCircle);
			
			//回复
			if("1".equals(type)){
				//更新主题回复数
				PublicDoctorCircle parent = publicDoctorCircleMapper.selectByPrimaryKey(doctorCircle.getParentId());
				int replyNum = parent.getReplyNum()+1;
				parent.setReplyNum(replyNum);
				publicDoctorCircleMapper.updateByPrimaryKeySelective(parent);
			}
			
		}else{
			publicDoctorCircleMapper.updateByPrimaryKeySelective(doctorCircle);
		}
	
		
	}


	@Override
	public void like(String doctorCircleId) {
		PublicDoctorCircle bean = publicDoctorCircleMapper.selectByPrimaryKey(doctorCircleId);
		int likeNum = bean.getLikeNum()+1;
		bean.setLikeNum(likeNum);
		publicDoctorCircleMapper.updateByPrimaryKeySelective(bean);
		
	}


	@Override
	public PublicDoctorCircle find(String doctorCircleId) {
		return publicDoctorCircleMapper.selectByPrimaryKey(doctorCircleId);
	}


	@Override
	public List<?> select(PublicDoctorCircleExample example) {
		return queryPublicDoctorCircleMapper.selectByExample(example);
	}


	@Override
	public void delete(String[] ids) throws AIException {
		if(ids==null || ids.length==0){
			throw new AIException("编号为空！");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update PUBLIC_DOCTOR_CIRCLE set STATE='0' ");
		sb.append(" where DOCTOR_CIRCLE_ID in (");
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
			PublicDoctorCircle bean = this.find(id);
			//修改父类回复数
			if(bean!=null && StringUtils.isNotEmpty(bean.getParentId())){
				PublicDoctorCircle parent = this.find(bean.getParentId());
				parent.setReplyNum(parent.getReplyNum()-1);
				this.update(parent);
			}
		}
		
	}


	private void update(PublicDoctorCircle parent) {
		publicDoctorCircleMapper.updateByPrimaryKey(parent);
	}


	@Override
	public void delReply(String doctorCircleId, String userId)  throws Exception {
		PublicDoctorCircle doctorCircle = publicDoctorCircleMapper.selectByPrimaryKey(doctorCircleId);
		
		doctorCircle.setDoctorCircleId(doctorCircleId);//CityVoiceId(doctorCircleId);
		doctorCircle.setState("0");
		
		
		PublicDoctorCircleExample example = new PublicDoctorCircleExample();
		example.createCriteria().andDoctorCircleIdEqualTo(doctorCircleId).andCreateIdEqualTo(userId);
		
		publicDoctorCircleMapper.updateByExampleSelective(doctorCircle, example);

		//查询有几条子数据
		example = new PublicDoctorCircleExample();
		example.createCriteria().andParentIdEqualTo(doctorCircle.getParentId()).andStateEqualTo("1");
		int replyNum = publicDoctorCircleMapper.countByExample(example);
		
		//更新回复
		PublicDoctorCircle parent = new PublicDoctorCircle();
		parent.setDoctorCircleId(doctorCircle.getParentId());
		parent.setReplyNum(replyNum);
		publicDoctorCircleMapper.updateByPrimaryKeySelective(parent);
			
	}


	@Override
	public void add(PublicDoctorCircle doctorCircle,
			PublicDoctorCircleVisual[] doctorCircleVisual, String type) {
		
		String doctorCircleId=doctorCircle.getDoctorCircleId();
		if(StringUtils.isBlank(doctorCircleId)){
			doctorCircleId=IdUtils.uuid();
			doctorCircle.setDoctorCircleId(doctorCircleId);
			doctorCircle.setLikeNum(0);
			doctorCircle.setReplyNum(0);
			doctorCircle.setState("1");
			doctorCircle.setCreateDate(new Date());
			publicDoctorCircleMapper.insert(doctorCircle);
			
			//回复
			if("1".equals(type)){
				//更新主题回复数
				PublicDoctorCircle parent = publicDoctorCircleMapper.selectByPrimaryKey(doctorCircle.getParentId());
				int replyNum = parent.getReplyNum()+1;
				parent.setReplyNum(replyNum);
				publicDoctorCircleMapper.updateByPrimaryKeySelective(parent);
			}
			PublicDoctorCircleVisualExample example=new PublicDoctorCircleVisualExample();
			example.createCriteria().andDoctorCircleIdEqualTo(doctorCircleId);
			publicDoctorCircleVisualMapper.deleteByExample(example);
			for (int i = 0; i < doctorCircleVisual.length; i++) {
				doctorCircleVisual[i].setDoctorCircleId(doctorCircleId);
				doctorCircleVisual[i].setDoctorCircleVisualId(IdUtils.uuid());
				publicDoctorCircleVisualMapper.insert(doctorCircleVisual[i]);
			}
			
		}else{
			publicDoctorCircleMapper.updateByPrimaryKeySelective(doctorCircle);
		}
		
	}


	@Override
	public List<PublicDoctorCircleVisual> selectVisualDoctor(String doctorCircleId) {
		PublicDoctorCircleVisualExample example=new PublicDoctorCircleVisualExample();
		example.createCriteria().andDoctorCircleIdEqualTo(doctorCircleId);
		
		return publicDoctorCircleVisualMapper.selectByExample(example);
	}
	
}
