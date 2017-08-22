package com.asiainfo.aigov.web.controller.healthcare.doctor;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceExample;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLike;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircle;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleExample;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleLike;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctorCircleVisual;
import com.asiainfo.aigov.model.healthcare.doctor.PublicHospital;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestion;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestionExample;
import com.asiainfo.aigov.service.healthcare.doctor.IDoctorCirclSerivce;
import com.asiainfo.aigov.service.healthcare.doctor.IDoctorCircleLikeService;
import com.asiainfo.aigov.service.healthcare.doctor.IHospitalService;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.guidance.IPublicReplyQuestionLikeSerivce;
import com.asiainfo.aigov.service.healthcare.guidance.IPublicReplyQuestionSerivce;
import com.asiainfo.aigov.web.controller.healthcare.guidance.ProfessionalController;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.IdUtils;
import com.asiainfo.frame.utils.ImageUtils;
import com.asiainfo.frame.utils.SessionUtil;

@Controller
@Remarks("医生圈")
@RequestMapping("/doctor/circle")
public class DoctorCircleController {
	private static Logger logger = Logger.getLogger(DoctorCircleController.class);

	
	
	@Autowired  
	private IDoctorCirclSerivce doctorCirclSerivce;
	
	@Autowired  
	private IDoctorCircleLikeService doctorCircleLikeService;
	@Autowired  
	private IPublicDoctorService doctorService;
	@Autowired
	private IPublicReplyQuestionLikeSerivce publicReplyQuestionLikeSerivce;
	@Autowired
	private IHospitalService hospitalSV;
	
	@RequestMapping("/list")
	@ResponseBody
	@Remarks("医生圈列表")
	public AjaxResponse list(HttpServletRequest request,
			@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		Page page = new Page();
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		
		//15859053781 5396
		page.setPageIndex(Integer.valueOf(curPageNum));
		page.setPageSize(Integer.valueOf(pageCount));
		List<?> list=null;
		list=doctorCirclSerivce.selectCirclByUserVisual(u.getDoctorId(),page);
		if(list==null){
			list=new ArrayList<PublicDoctorCircle>();
		}
		
		/*
		
		
		
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		example.setOrderByClause("CREATE_DATE DESC");
		
		PublicReplyQuestionExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdIsNull();
		criteria.andStateEqualTo("1");
		criteria.andTypeEqualTo((short)2);
		criteria.andDoctorIdEqualTo(u.getUserId());
		
		//List<PublicReplyQuestion> list = publicReplyQuestionSerivce.select(example, page);
	
		*/
//		for (PublicDoctorCircle base : list) {
//			if(base.getImg1()!=null){
//				StringBuffer s= new StringBuffer(base.getImg1());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg1(s.toString());
//			}
//			if(base.getImg2()!=null){
//				StringBuffer s= new StringBuffer(base.getImg2());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg2(s.toString());
//			}
//			if(base.getImg3()!=null){
//				StringBuffer s= new StringBuffer(base.getImg3());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg3(s.toString());
//			}
//			if(base.getImg4()!=null){
//				StringBuffer s= new StringBuffer(base.getImg4());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg4(s.toString());
//			}
//			if(base.getImg5()!=null){
//				StringBuffer s= new StringBuffer(base.getImg5());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg5(s.toString());
//			}
//			if(base.getImg6()!=null){
//				StringBuffer s= new StringBuffer(base.getImg6());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg6(s.toString());
//			}
//			if(base.getImg7()!=null){
//				StringBuffer s= new StringBuffer(base.getImg7());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg7(s.toString());
//			}
//			if(base.getImg8()!=null){
//				StringBuffer s= new StringBuffer(base.getImg8());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg8(s.toString());
//			}
//			if(base.getImg9()!=null){
//				StringBuffer s= new StringBuffer(base.getImg9());
//				int index=s.lastIndexOf(".");
//				s.insert(index, "_min");
//				base.setImg9(s.toString());
//			}
//			
//		}
		resp.setData(list);
		return resp;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	@Remarks("医生圈保存")
	@User
	public AjaxResponse save(HttpServletRequest request,PublicDoctorCircle doctorCircle,String type,String files) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		doctorCircle.setCreateId(u.getDoctorId());
		doctorCircle.setCreateName(u.getUserName());
		doctorCircle.setCreateImg(u.getUserPhotoName());
		PublicDoctorCircleVisual []doctorCircleVisual=null;
		if(doctorCircle.getType()==2){
		
			String doctorsT=request.getParameter("doctors");
			String doctors[]=doctorsT.split(",");
			doctorCircleVisual=new PublicDoctorCircleVisual[doctors.length];
			for (int i = 0; i < doctors.length; i++) {
				doctorCircleVisual[i]=new PublicDoctorCircleVisual();
				doctorCircleVisual[i].setUserId(doctors[i]);
			}
		}
		
		
//		cityVoice.setCreateId("1");
//		cityVoice.setCreateName("测试");
//		cityVoice.setCreateImg("UserModule/module/my/style/images/inner_icon26.png");
		
		if(!StringUtils.isEmpty(files)){
			JSONArray list = JSONObject.parseArray(files);
			if(list!=null&&list.size()>0){
				String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/images/";
				String basePath = request.getScheme()+"://"+request.getServerName()+":"+ request.getServerPort()+request.getContextPath();
				for (int i = 0;i<list.size();i++) {
					JSONObject fileObj = list.getJSONObject(i);
					String file64 = fileObj.getString("file64");
					String fileName = ImageUtils.createPic(file64, filePath);
					
					String imgUrl = basePath+"/upload/images/"+fileName;
					if(i==0){
						doctorCircle.setImg1(imgUrl);
					}else if(i==1){
						doctorCircle.setImg2(imgUrl);
					}else if(i==2){
						doctorCircle.setImg3(imgUrl);
					}else if(i==3){
						doctorCircle.setImg4(imgUrl);
					}else if(i==4){
						doctorCircle.setImg5(imgUrl);
					}else if(i==5){
						doctorCircle.setImg6(imgUrl);
					}else if(i==6){
						doctorCircle.setImg7(imgUrl);
					}else if(i==7){
						doctorCircle.setImg8(imgUrl);
					}else if(i==8){
						doctorCircle.setImg9(imgUrl);
					}
				}
			}
		}
		if(doctorCircleVisual==null){
			doctorCirclSerivce.add(doctorCircle,type);
		}else{
			doctorCirclSerivce.add(doctorCircle,doctorCircleVisual,type);
		}
		
		resp.setData(doctorCircle.getDoctorCircleId());
		return resp;
	}
	
	@RequestMapping("/like")
	@ResponseBody
	@Remarks("医生圈点赞")
	public AjaxResponse like(HttpServletRequest request,String doctorCircleId,String mac) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		PublicDoctorCircleLike doctorCircleLike=doctorCircleLikeService.findEntity(doctorCircleId, mac);
		if(doctorCircleLike==null){
			doctorCircleLike=new PublicDoctorCircleLike();
			doctorCircleLike.setLikeId(IdUtils.uuid());
			doctorCircleLike.setLikeCreateTime(new Date());
			doctorCircleLike.setLikeMac(mac);
			doctorCircleLike.setDoctorCircleId(doctorCircleId);
			doctorCircleLikeService.saveEntity(doctorCircleLike);
			doctorCirclSerivce.like(doctorCircleId);
			return resp;
		}else{
			resp.setCode(1);
			resp.setMessage("您已经点赞过了");
			return resp;
		}
		
	}
	
	
	
	
	
	@RequestMapping("/listReply")
	@ResponseBody
	@Remarks("医生圈回复列表")
	public AjaxResponse listReply(HttpServletRequest request,
			String parentId)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		
		Map<String,Object> result = new HashMap<String,Object>();
		PublicDoctorCircle info = doctorCirclSerivce.find(parentId);
		result.put("info", info);
		
		PublicDoctor  doctorInfo =doctorService.find(info.getCreateId());
		doctorInfo.getOfficeCode();
		doctorInfo.getOfficeCode();
		result.put("doctorInfo", doctorInfo);
		
		PublicHospital hospitalInfo=hospitalSV.getPublicHospital(doctorInfo.getHospitalId().longValue());
		PublicOffice officeInfo=hospitalSV.getPublicOffice(doctorInfo.getOfficeCode(),doctorInfo.getHospitalId().longValue());
		
		result.put("hospitalInfo", hospitalInfo);
		result.put("officeInfo", officeInfo);
		result.put("userInfo", userInfo);
		PublicDoctorCircleExample example = new PublicDoctorCircleExample();
		PublicDoctorCircleExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		criteria.andStateEqualTo("1");
		
		example.setOrderByClause("CREATE_DATE DESC");
		
		List<?> replylist = doctorCirclSerivce.select(example);
		result.put("replylist", replylist);
		resp.setData(result);
		return resp;
	}
	
	@RequestMapping("/delReply")
	@ResponseBody
	@Remarks("医生圈回复撤销")
	@User
	public AjaxResponse delReply(HttpServletRequest request,String doctorCircleId,String userId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		doctorCirclSerivce.delReply(doctorCircleId,userId);
		return resp;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	@Remarks("医生圈撤销")
	public AjaxResponse del(HttpServletRequest request, String doctorCircleId) throws Exception{
		doctorCirclSerivce.delete(new String[]{doctorCircleId});
		return new AjaxResponse();
	}
	@RequestMapping("/visualList")
	@ResponseBody
	@Remarks("医生圈可见列表")
	public AjaxResponse visualList(HttpServletRequest request, String doctorCircleId) throws Exception{
		List<PublicDoctorCircleVisual> list=doctorCirclSerivce.selectVisualDoctor(doctorCircleId);
		List<Map<String,String>> r=new ArrayList();
		Map<String,String> m=null;

		for (int i = 0; i < list.size(); i++) {
			m=new HashMap<String,String>();
			PublicDoctor  doctorInfo =doctorService.find(list.get(i).getUserId());
			doctorInfo.getOfficeCode();
			doctorInfo.getOfficeCode();
			
			
			PublicHospital hospitalInfo=hospitalSV.getPublicHospital(doctorInfo.getHospitalId().longValue());
			PublicOffice officeInfo=hospitalSV.getPublicOffice(doctorInfo.getOfficeCode(),doctorInfo.getHospitalId().longValue());
			 m.put("doctorName", doctorInfo.getName());
			 m.put("hospitalName", hospitalInfo.getName());
			 m.put("officeName", officeInfo.getName());

			r.add(m);
		}
		AjaxResponse resp = new AjaxResponse();
		resp.setData(r);
		return resp;
	}
	
}
