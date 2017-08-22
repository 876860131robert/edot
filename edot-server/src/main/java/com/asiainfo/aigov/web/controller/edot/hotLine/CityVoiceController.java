package com.asiainfo.aigov.web.controller.edot.hotLine;

import java.io.File;
import java.io.FileInputStream;
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
import com.asiainfo.aigov.healthcare.model.JkghAppMessage;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceExample;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceLike;
import com.asiainfo.aigov.service.edot.hotLine.ICityVoiceLikeService;
import com.asiainfo.aigov.service.edot.hotLine.ICityVoiceService;
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
@RequestMapping("/cityVoice")
public class CityVoiceController  extends BaseController{
	private static Logger logger = Logger.getLogger(CityVoiceController.class);

	@Autowired  
	private ICityVoiceService cityVoiceService;
	
	@Autowired
	private ICityVoiceLikeService cityVoiceLikeService;
	
	@RequestMapping("/save")
	@ResponseBody
	@Remarks("城市声音保存")
	@User
	public AjaxResponse save(HttpServletRequest request,CityVoice cityVoice,String type,String files) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		cityVoice.setCreateId(u.getUserId());
		cityVoice.setCreateName(u.getPhoneNo());
		cityVoice.setCreateImg(u.getUserPhotoName());
		
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
						cityVoice.setImg1(imgUrl);
					}else if(i==1){
						cityVoice.setImg2(imgUrl);
					}else if(i==2){
						cityVoice.setImg3(imgUrl);
					}else if(i==3){
						cityVoice.setImg4(imgUrl);
					}else if(i==4){
						cityVoice.setImg5(imgUrl);
					}else if(i==5){
						cityVoice.setImg6(imgUrl);
					}else if(i==6){
						cityVoice.setImg7(imgUrl);
					}else if(i==7){
						cityVoice.setImg8(imgUrl);
					}else if(i==8){
						cityVoice.setImg9(imgUrl);
					}
				}
			}
		}
		
		cityVoiceService.add(cityVoice,type);
		resp.setData(cityVoice.getCityVoiceId());
		return resp;
	}
	
	@RequestMapping("/save2")
	@ResponseBody
	@Remarks("城市声音保存2")
	@User
	public AjaxResponse save(HttpServletRequest request,CityVoice cityVoice,String type,@RequestParam("file") CommonsMultipartFile[] files) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);
		
		UserInfo u = (UserInfo)userInfo.getUser();
		cityVoice.setCreateId(u.getUserId());
		cityVoice.setCreateName(u.getPhoneNo());
		cityVoice.setCreateImg(u.getUserPhotoName());
		
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
						cityVoice.setImg1(imgUrl);
					}else if(i==1){
						cityVoice.setImg2(imgUrl);
					}else if(i==2){
						cityVoice.setImg3(imgUrl);
					}else if(i==3){
						cityVoice.setImg4(imgUrl);
					}else if(i==4){
						cityVoice.setImg5(imgUrl);
					}else if(i==5){
						cityVoice.setImg6(imgUrl);
					}else if(i==6){
						cityVoice.setImg7(imgUrl);
					}else if(i==7){
						cityVoice.setImg8(imgUrl);
					}else if(i==8){
						cityVoice.setImg9(imgUrl);
					}
				}
			}
		
		cityVoiceService.add(cityVoice,type);
		resp.setData(cityVoice.getCityVoiceId());
		return resp;
	}
	
	@RequestMapping("/like")
	@ResponseBody
	@Remarks("城市声音点赞")
	public AjaxResponse like(HttpServletRequest request,String cityVoiceId,String mac) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		CityVoiceLike cityVoiceLike=cityVoiceLikeService.findEntity(cityVoiceId, mac);
		if(cityVoiceLike==null){
			cityVoiceLike=new CityVoiceLike();
			cityVoiceLike.setLikeId(IdUtils.uuid());
			cityVoiceLike.setLikeCreateTime(new Date());
			cityVoiceLike.setLikeMac(mac);
			cityVoiceLike.setCityVoiceId(cityVoiceId);
			cityVoiceLikeService.saveEntity(cityVoiceLike);
			cityVoiceService.like(cityVoiceId);
			return resp;
		}else{
			resp.setCode(1);
			resp.setMessage("您已经点赞过了");
			return resp;
		}
		
	}
	
	
	@RequestMapping("/list")
	@ResponseBody
	@Remarks("城市声音列表")
	public AjaxResponse list(HttpServletRequest request,
			@RequestParam String curPageNum,
			@RequestParam String pageCount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		Page page = new Page();
		page.setPageIndex(Integer.valueOf(curPageNum));
		page.setPageSize(Integer.valueOf(pageCount));
		
		CityVoiceExample example = new CityVoiceExample();
		example.setOrderByClause("CREATE_DATE DESC");
		
		CityVoiceExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdIsNull();
		criteria.andStateEqualTo("1");
		
		List<CityVoice> list = cityVoiceService.select(example, page);
		for (CityVoice cityVoice : list) {
			if(cityVoice.getImg1()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg1());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg1_min(s.toString());
			}
			if(cityVoice.getImg2()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg2());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg2_min(s.toString());
			}
			if(cityVoice.getImg3()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg3());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg3_min(s.toString());
			}
			if(cityVoice.getImg4()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg4());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg4_min(s.toString());
			}
			if(cityVoice.getImg5()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg5());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg5_min(s.toString());
			}
			if(cityVoice.getImg6()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg6());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg6_min(s.toString());
			}
			if(cityVoice.getImg7()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg7());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg7_min(s.toString());
			}
			if(cityVoice.getImg8()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg8());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg8_min(s.toString());
			}
			if(cityVoice.getImg9()!=null){
				StringBuffer s= new StringBuffer(cityVoice.getImg9());
				int index=s.lastIndexOf(".");
				s.insert(index, "_min");
				cityVoice.setImg9_min(s.toString());
			}
			
		}
		resp.setData(list);
		return resp;
	}
	
	@RequestMapping("/listReply")
	@ResponseBody
	@Remarks("城市声音回复列表")
	public AjaxResponse listReply(HttpServletRequest request,
			String parentId)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		Map<String,Object> result = new HashMap<String,Object>();
		CityVoice info = cityVoiceService.find(parentId);
		result.put("info", info);
		
		CityVoiceExample example = new CityVoiceExample();
		CityVoiceExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		criteria.andStateEqualTo("1");
		
		example.setOrderByClause("CREATE_DATE DESC");
		
		List<CityVoice> replylist = cityVoiceService.select(example);
		result.put("replylist", replylist);
		resp.setData(result);
		return resp;
	}
	
	@RequestMapping("/delReply")
	@ResponseBody
	@Remarks("城市声音回复撤销")
	@User
	public AjaxResponse delReply(HttpServletRequest request,String cityVoiceId,String userId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		cityVoiceService.delReply(cityVoiceId,userId);
		return resp;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	@Remarks("城市声音撤销")
	public AjaxResponse del(HttpServletRequest request, String cityVoiceId) throws Exception{
		cityVoiceService.delete(new String[]{cityVoiceId});
		return new AjaxResponse();
	}
}
