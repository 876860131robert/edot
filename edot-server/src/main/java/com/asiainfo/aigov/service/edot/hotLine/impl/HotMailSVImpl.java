package com.asiainfo.aigov.service.edot.hotLine.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.dao.edot.hotLine.HotMailMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.hotLine.IHotMailService;
import com.asiainfo.aigov.web.http.edot.HotLineService.api.HotLineServiceAPI;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.aigov.web.webservice.edot.work.UserWorkWebService;
import com.asiainfo.aigov.web.webservice.edot.work.WorkWebService;
import com.asiainfo.frame.bo.IUser;
import com.asiainfo.frame.common.Constants;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.DBUtil;
import com.asiainfo.frame.utils.IdUtils;
import com.asiainfo.frame.utils.TimeUtil;


/**
* @ClassName: HotMailSVImpl
* @Description: 信箱实现类
* @author Administrator
* @date 2017年7月24日 下午4:49:32
* 
*/
@Service
@Transactional
public class HotMailSVImpl extends BaseService implements IHotMailService{
	
	private static Logger log = Logger.getLogger(HotMailSVImpl.class);
	
	@Autowired
	private HotMailMapper hotMailMapper;
	
	@Override
	public void add(HotMail hotMail,UserInfo user) throws Exception {
		if(StringUtils.isBlank(hotMail.getHotMailId())){
			com.asiainfo.aigov.web.http.edot.HotLineService.bean.ReqBean reqBean = new com.asiainfo.aigov.web.http.edot.HotLineService.bean.ReqBean();

			if(user!=null){
				reqBean.setSq_realname(user.getRealName());
				if("female".equals(user.getSex())){
					reqBean.setSq_sex(0);
				}else{
					reqBean.setSq_sex(1);
				}
				reqBean.setSq_phone(user.getPhoneNo());
				reqBean.setSq_address(user.getAddress());
				
				hotMail.setCreateId(user.getUserId());
				hotMail.setPhoneNo(user.getPhoneNo());
			}
			
			if("1".equals(hotMail.getModelId())){
				//市长信箱
				reqBean.setDo_dept("71");
				reqBean.setSubmit_name("市长信箱");
			} else if("4".equals(hotMail.getModelId())){
				//部门信箱
				reqBean.setDo_dept("71");
				reqBean.setSubmit_name("部门信箱");
			} else if("9".equals(hotMail.getModelId())){
				//掌上信访
				reqBean.setDo_dept("34");
				reqBean.setSubmit_name("掌上信访");
			}
			
			reqBean.setSq_content(hotMail.getHotMailContent());
			reqBean.setSq_title(hotMail.getHotMailTitle());
			reqBean.setModel_id(Integer.valueOf(hotMail.getModelId()));
			if(StringUtils.isNoneBlank(hotMail.getHotMailInfo())){
				reqBean.setIs_open(Integer.valueOf(hotMail.getHotMailInfo()));
			}
			
			hotMail.setHotMailId(IdUtils.uuid());
			hotMail.setIsRead("0");
			hotMail.setReplyState("0");
			hotMail.setState("1");
			hotMail.setCreateDate(new Date());//需检查xml里的jdbcType=DATE是否全部替换成jdbcType=TIMESTAMP
			// 在线咨询走另外接口
			if("5".equals(hotMail.getModelId())){
				String submitTime = TimeUtil.format(new Date(), TimeUtil.FORMAT_NORMAL);
				String id = UserWorkWebService.applyConsult(hotMail.getDeptCode(), hotMail.getDeptName(), hotMail.getPhoneNo(), 
						hotMail.getPhoneNo(), hotMail.getHotMailTitle(), hotMail.getHotMailContent(), submitTime);
				hotMail.setQueryCode(id);
				hotMailMapper.insert(hotMail);
			} 
			else {
				com.asiainfo.aigov.web.http.edot.HotLineService.bean.RspBean rsp = HotLineServiceAPI.SQSubmit(reqBean);
				if(rsp==null) throw new AIException("接口返回为空！"); 
				if(StringUtils.isBlank(rsp.getError())){
					//成功
					hotMail.setSqCode(rsp.getSq_code());
					hotMail.setQueryCode(rsp.getQuery_code());
					hotMailMapper.insert(hotMail);
				}else{
					throw new AIException("接口异常："+rsp.getError());
				}
			}
		}else{
			hotMailMapper.updateByPrimaryKeySelective(hotMail);
		}
	}

	@Override
	public HotMail find(String hotMailId) throws Exception {
		return hotMailMapper.selectByPrimaryKey(hotMailId);
	}

	@Override
	public List<HotMail> select(HotMailExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return hotMailMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}

	public List<HotMail> select(HotMailExample example)throws Exception{
		return hotMailMapper.selectByExample(example);
	}
	@Override
	public int count(HotMailExample example) throws Exception {
		return hotMailMapper.countByExample(example);
	}

	@Override
	public void read(String hotMailId) throws Exception {
		HotMail hotMail = this.find(hotMailId);
		hotMail.setIsRead(Constants.YES_CHAR);
		hotMailMapper.updateByPrimaryKeySelective(hotMail);
	}

	@Override
	public void update(HotMail hotMail) throws Exception {
		hotMailMapper.updateByPrimaryKeySelective(hotMail);
	}
	
	@Override
	public void delete(String[] ids)throws Exception{
		if(ids==null || ids.length==0){
			throw new AIException("编号为空！");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update ED_HOT_MAIL set STATE='0' ");
		sb.append(" where HOT_MAIL_ID in (");
		for (int i = 0; i < ids.length; i++) {
			sb.append("'").append(ids[i]).append("'");
			if(i<ids.length-1){
				sb.append(",");
			}
		}
		sb.append(" )");
		
		DBUtil.executeUpdate(DBUtil.getConnection(), sb.toString(), null);
	}
	
	public void reply(String id, String content, IUser user)throws Exception{
		if(StringUtils.isBlank(id)){
			throw new AIException("编号为空！");
		}
		HotMail hotMail = this.find(id);
		if(user!=null){
			hotMail.setReplyerId(user.getUserId());
			hotMail.setReplyerName(user.getUserName());
		}
		hotMail.setReplyContent(content);
		hotMail.setReplyTime(new Date());
		hotMail.setReplyState(Constants.YES_CHAR);
		hotMailMapper.updateByPrimaryKey(hotMail);
	}
}
