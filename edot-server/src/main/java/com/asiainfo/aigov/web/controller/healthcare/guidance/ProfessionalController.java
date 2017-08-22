package com.asiainfo.aigov.web.controller.healthcare.guidance;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.healthcare.doctor.PublicDoctor;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestion;
import com.asiainfo.aigov.model.healthcare.guidance.PublicReplyQuestionExample;
import com.asiainfo.aigov.model.healthcare.patients.PublicPatients;
import com.asiainfo.aigov.service.healthcare.doctor.IPublicDoctorService;
import com.asiainfo.aigov.service.healthcare.guidance.IPublicReplyQuestionLikeSerivce;
import com.asiainfo.aigov.service.healthcare.guidance.IPublicReplyQuestionSerivce;
import com.asiainfo.aigov.service.healthcare.patients.IPublicPatientSerivce;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.utils.IdUtils;
import com.asiainfo.frame.utils.ImageUtils;
import com.asiainfo.frame.utils.SessionUtil;


@Controller
@Remarks("专业咨询")
@RequestMapping("/guidance/professional")
public class ProfessionalController extends BaseController {
	private static Logger logger = Logger.getLogger(ProfessionalController.class);

	@Autowired  
	private IPublicReplyQuestionSerivce publicReplyQuestionSerivce;
	
	@Autowired
	private IPublicReplyQuestionLikeSerivce publicReplyQuestionLikeSerivce;
	@Autowired
	private IPublicPatientSerivce publicPatientSerivce;
	
	@Autowired  
	IPublicDoctorService publicDoctorService;
	
	@RequestMapping("/save")
	@ResponseBody
	@Remarks("专业咨询保存")
	@User
	public AjaxResponse save(HttpServletRequest request,PublicReplyQuestion replyQuestion,String type,String files) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		replyQuestion.setCreateId(u.getUserId());
		if(replyQuestion.getParentId()==null||"".equals(replyQuestion.getParentId())){
			//replyQuestion.setCreateId(u.getUserId());
			replyQuestion.setCreateName(u.getUserName());

		}else{
			PublicDoctor publicDoctor=publicDoctorService.find(u.getDoctorId());
			replyQuestion.setCreateName(publicDoctor.getName());
			replyQuestion.setDoctorId(u.getDoctorId());
		}
		
		//replyQuestion.setCreateName(u.getUserName());
		replyQuestion.setCreateImg(u.getUserPhotoName());
		
//		replyQuestion.setCreateId("1");
//		replyQuestion.setCreateName("测试");
//		replyQuestion.setCreateImg("UserModule/module/my/style/images/inner_icon26.png");
		
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
						replyQuestion.setImg1(imgUrl);
					}else if(i==1){
						replyQuestion.setImg2(imgUrl);
					}else if(i==2){
						replyQuestion.setImg3(imgUrl);
					}else if(i==3){
						replyQuestion.setImg4(imgUrl);
					}else if(i==4){
						replyQuestion.setImg5(imgUrl);
					}else if(i==5){
						replyQuestion.setImg6(imgUrl);
					}else if(i==6){
						replyQuestion.setImg7(imgUrl);
					}else if(i==7){
						replyQuestion.setImg8(imgUrl);
					}else if(i==8){
						replyQuestion.setImg9(imgUrl);
					}
				}
			}
		}
		replyQuestion.setType((short)2);
		publicReplyQuestionSerivce.add(replyQuestion,type);
		resp.setData(replyQuestion.getReplyQuestionId());
		return resp;
	}
	
	@RequestMapping("/save2")
	@ResponseBody
	@Remarks("专业咨询保存2")
	@User
	public AjaxResponse save(HttpServletRequest request,PublicReplyQuestion replyQuestion,String type,@RequestParam("file") CommonsMultipartFile[] files) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		replyQuestion.setCreateId(u.getUserId());
		replyQuestion.setCreateName(u.getPhoneNo());
		replyQuestion.setCreateImg(u.getUserPhotoName());
		
			if(files!=null && files.length> 0){
				String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/images/";
				String basePath = request.getScheme()+"://"+request.getServerName()+":"+ request.getServerPort()+request.getContextPath();
				File path=new File(filePath);
				if (!path.exists()) {
					 path.mkdirs();
				}
				for (int i = 0;i<files.length;i++) {
					FileInputStream in = (FileInputStream) files[i].getInputStream();
					String name =files[i].getOriginalFilename();
					String ext=name.substring(name.lastIndexOf("."),name.length());
					String fileName=UUID.randomUUID().toString()+ext;
					File file=new File(filePath+fileName);
					files[i].transferTo(file);
					String imgUrl = basePath+"/upload/images/"+fileName;
					if(i==0){
						replyQuestion.setImg1(imgUrl);
					}else if(i==1){
						replyQuestion.setImg2(imgUrl);
					}else if(i==2){
						replyQuestion.setImg3(imgUrl);
					}else if(i==3){
						replyQuestion.setImg4(imgUrl);
					}else if(i==4){
						replyQuestion.setImg5(imgUrl);
					}else if(i==5){
						replyQuestion.setImg6(imgUrl);
					}else if(i==6){
						replyQuestion.setImg7(imgUrl);
					}else if(i==7){
						replyQuestion.setImg8(imgUrl);
					}else if(i==8){
						replyQuestion.setImg9(imgUrl);
					}
				}
			}
			replyQuestion.setType((short)2);

		publicReplyQuestionSerivce.add(replyQuestion,type);
		resp.setData(replyQuestion.getReplyQuestionId());
		return resp;
	}
	
	@RequestMapping("/like")
	@ResponseBody
	@Remarks("专业咨询点赞")
	@User
	public AjaxResponse like(HttpServletRequest request,String replyQuestionId,String mac) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		/*PublicReplyQuestionLike replyQuestionLike=publicReplyQuestionLikeSerivce.findEntity(replyQuestionId, mac);
		if(replyQuestionLike==null){
			replyQuestionLike=new PublicReplyQuestionLike();
			replyQuestionLike.setLikeId(IdUtils.uuid());
			replyQuestionLike.setLikeCreateTime(new Date());
			replyQuestionLike.setLikeMac(mac);
			replyQuestionLike.setPublicReplyQuestionId(replyQuestionId);
			publicReplyQuestionLikeSerivce.saveEntity(replyQuestionLike);
			publicReplyQuestionSerivce.like(replyQuestionId);
			return resp;
		}else{
			resp.setCode(1);
			resp.setMessage("您已经点赞过了");
			return resp;
		}
		*/
		resp.setCode(1);
		resp.setMessage("您已经点赞过了");
		return resp;
	}
	
	
	@RequestMapping("/list")
	@ResponseBody
	@Remarks("专业咨询列表")
	@User
	public AjaxResponse list(HttpServletRequest request,
			@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		AjaxResponse resp = new AjaxResponse();
		Page page = new Page();
		page.setPageIndex(Integer.valueOf(curPageNum));
		page.setPageSize(Integer.valueOf(pageCount));
		
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		example.setOrderByClause("CREATE_DATE  DESC");
		
		PublicReplyQuestionExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdIsNull();
		criteria.andStateEqualTo("1");
		criteria.andTypeEqualTo((short)2);
		criteria.andDoctorIdEqualTo(u.getDoctorId());
		
		
		List<PublicReplyQuestion> list = publicReplyQuestionSerivce.select(example, page);
		if(list==null){
			list=new ArrayList<PublicReplyQuestion>();
		}
		
		for (PublicReplyQuestion replyQuestion : list) {
			if(replyQuestion.getImg1()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg1());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg1(s.toString());
			}
			if(replyQuestion.getImg2()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg2());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg2(s.toString());
			}
			if(replyQuestion.getImg3()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg3());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg3(s.toString());
			}
			if(replyQuestion.getImg4()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg4());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg4(s.toString());
			}
			if(replyQuestion.getImg5()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg5());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg5(s.toString());
			}
			if(replyQuestion.getImg6()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg6());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg6(s.toString());
			}
			if(replyQuestion.getImg7()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg7());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg7(s.toString());
			}
			if(replyQuestion.getImg8()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg8());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg8(s.toString());
			}
			if(replyQuestion.getImg9()!=null){
				StringBuffer s= new StringBuffer(replyQuestion.getImg9());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				replyQuestion.setImg9(s.toString());
			}
			
		}
		resp.setData(list);
		return resp;
	}
	
	@RequestMapping("/listReply")
	@ResponseBody
	@Remarks("专业咨询回复列表")
	@User
	public AjaxResponse listReply(HttpServletRequest request,
			String parentId)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		Map<String,Object> result = new HashMap<String,Object>();
		PublicReplyQuestion info = publicReplyQuestionSerivce.find(parentId);
		result.put("info", info);
		
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		PublicReplyQuestionExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		criteria.andStateEqualTo("1");
		criteria.andTypeEqualTo((short)2);
		
		PublicPatients publicPatients=publicPatientSerivce.find(info.getPatientsId());
		if(publicPatients.getSex().equals("0")){
			publicPatients.setSex("男");
		}else{
			publicPatients.setSex("女");
		}
		 // SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		  
		  //getAge(sdf.parse(publicPatients.getBirthDate()));
		result.put("patient", publicPatients);
		example.setOrderByClause("CREATE_DATE");
		
		List<PublicReplyQuestion> replylist = publicReplyQuestionSerivce.select(example);
		result.put("replylist", replylist);
		resp.setData(result);
		return resp;
	}
	 public  int getAge(Date birthDay) throws Exception {  
	        Calendar cal = Calendar.getInstance();  
	  
	        if (cal.before(birthDay)) {  
	            throw new IllegalArgumentException(  
	                    "The birthDay is before Now.It's unbelievable!");  
	        }  
	        int yearNow = cal.get(Calendar.YEAR);  
	        int monthNow = cal.get(Calendar.MONTH);  
	        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);  
	        cal.setTime(birthDay);  
	  
	        int yearBirth = cal.get(Calendar.YEAR);  
	        int monthBirth = cal.get(Calendar.MONTH);  
	        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);  
	  
	        int age = yearNow - yearBirth;  
	  
	        if (monthNow <= monthBirth) {  
	            if (monthNow == monthBirth) {  
	                if (dayOfMonthNow < dayOfMonthBirth) age--;  
	            }else{  
	                age--;  
	            }  
	        }  
	        return age;  
	    }  
	@RequestMapping("/delReply")
	@ResponseBody
	@Remarks("专业咨询回复撤销")
	@User
	public AjaxResponse delReply(HttpServletRequest request,String replyQuestionId,String userId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		publicReplyQuestionSerivce.delReply(replyQuestionId,userId);
		return resp;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	@Remarks("专业咨询撤销")
	@User
	public AjaxResponse del(HttpServletRequest request, String replyQuestionId) throws Exception{
		publicReplyQuestionSerivce.delete(new String[]{replyQuestionId});
		return new AjaxResponse();
	}
	
	@RequestMapping("/unReplyCount")
	@ResponseBody
	@Remarks("互动交流回复列表")
	@User
	public AjaxResponse unReplyCount(HttpServletRequest request)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		PublicReplyQuestionExample example = new PublicReplyQuestionExample();
		example.setOrderByClause("CREATE_DATE DESC");
UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		PublicReplyQuestionExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdIsNull();
		criteria.andStateEqualTo("1");
		criteria.andReplyNumEqualTo(0);
		criteria.andDoctorIdEqualTo(u.getDoctorId());
		criteria.andTypeEqualTo((short)2);
		Map<String,Object> result = new HashMap<String,Object>();
		int info = publicReplyQuestionSerivce.count(example);
		result.put("info", info);
		resp.setData(result);
		return resp;
	} 
}
