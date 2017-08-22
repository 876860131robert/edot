package com.asiainfo.aigov.web.controller.edot.hotLine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.aigov.core.shiro.SessionUser;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;
import com.asiainfo.aigov.model.edot.hotLine.CityVoice;
import com.asiainfo.aigov.model.edot.hotLine.CityVoiceExample;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.service.edot.hotLine.ICityVoiceLikeService;
import com.asiainfo.aigov.service.edot.hotLine.ICityVoiceService;
import com.asiainfo.aigov.service.edot.hotLine.IHotMailService;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.bo.IUser;
import com.asiainfo.frame.common.Constants;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.BeanUtil;
import com.asiainfo.frame.utils.PubTools;
import com.asiainfo.frame.utils.SessionUtil;

/**
* @ClassName: AdminHotLineController
* @Description: 信箱管理
* @author Administrator
* @date 2017年7月24日 下午4:45:06
* 
*/
@Controller
@RequestMapping("/admin/hotLine")
public class AdminHotLineController extends BaseController{
	private static Logger logger = Logger.getLogger(AdminHotLineController.class);

	/** 视频 **/
	@RequestMapping("/toVideoConfig")
	@Remarks("至视频配置页")
	public ModelAndView toVideoConfig()throws Exception{
		ModelMap map = new ModelMap();
		
		return new ModelAndView("admin/hotLine/video_config", map);
	}
	
	@Autowired
	private ICityVoiceService cityVoiceService;
	
	@Autowired
	private ICityVoiceLikeService cityVoiceLikeService;
	
	@Autowired
	private IHotMailService hotMailService;
	
	/** 城市声音 **/
	@RequestMapping("/toCityVoiceList")
	@Remarks("至城市声音查询页")
	public ModelAndView toCityVoiceList()throws Exception{
		ModelMap map = new ModelMap();
		
		return new ModelAndView("admin/hotLine/cityvoice_list", map);
	}
	@RequestMapping("/cityVoiceDetail")
	@Remarks("至城市声音详细页")
	public ModelAndView cityVoiceDetail(String id)throws Exception{
		ModelMap map = new ModelMap();
		CityVoice cityVoice = cityVoiceService.find(id);
		map.put("bean", cityVoice);
		
		return new ModelAndView("admin/hotLine/cityvoice_detail", map);
	}
	@RequestMapping("/toCityVoiceReviewDetail")
	@Remarks("至城市声音评论详细页")
	public ModelAndView toCityVoiceReviewDetail(String id)throws Exception{
		ModelMap map = new ModelMap();
		map.put("id", id);
		return new ModelAndView("admin/hotLine/cityvoice_review_list", map);
	}
	@RequestMapping("/cityVoiceReviewSelect")
	@ResponseBody
	@Remarks("城市声音评论详细列表")
	public AjaxResponse cityVoiceReviewSelect(String id, Page page)throws Exception{
		AjaxResponse resp = new AjaxResponse();
		CityVoiceExample example = new CityVoiceExample();
		CityVoiceExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.YES_CHAR);//有效
		criteria.andParentIdEqualTo(id);
		example.setOrderByClause("CREATE_DATE DESC");
		List<CityVoice> list = cityVoiceService.select(example, page);
		resp.setData(new PagedList<CityVoice>(list, page));
		return resp;
	}
	
	@RequestMapping("/cityVoiceSelect")
	@ResponseBody
	@Remarks("城市声音列表查询")
	public AjaxResponse cityVoiceSelect(HttpServletRequest request,CityVoice cityVoice, Page page) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		CityVoiceExample example = new CityVoiceExample();
		CityVoiceExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.YES_CHAR);//有效
		criteria.andParentIdIsNull();
		if (StringUtils.isBlank(page.getOrderBy())) {
			example.setOrderByClause("CREATE_DATE desc");
		}else {
			example.setOrderByClause(PubTools.camel4underline(page.getOrderBy()));
		}
		List<CityVoice> list = cityVoiceService.select(example, page);
		resp.setData(new PagedList<CityVoice>(list, page));
		return resp;
	}
	@RequestMapping("/cityVoiceDelete")
	@ResponseBody
	@Remarks("城市声音删除")
	public AjaxResponse cityVoiceDelete(HttpServletRequest request,String ids) throws Exception {
		if(StringUtils.isNoneBlank(ids)){
			cityVoiceService.delete(ids.split(","));
		}
		return new AjaxResponse();
	}
	
	
	
	/** 信箱 **/
	@RequestMapping("/toHotMailList")
	@Remarks("至信箱查询页")
	public ModelAndView toHotMailList()throws Exception{
		ModelMap map = new ModelMap();
		
		return new ModelAndView("admin/hotLine/hotmail_list", map);
	}
	@RequestMapping("/hotMailDetail")
	@Remarks("至信箱详细页")
	public ModelAndView hotMailDetail(String id)throws Exception{
		ModelMap map = new ModelMap();
		HotMail hotMail = hotMailService.find(id);
		if(!Constants.YES_CHAR.equals(hotMail.getIsRead())){
			hotMail.setIsRead(Constants.YES_CHAR);
			hotMailService.update(hotMail);
		}
		Map<String,String> fieldDictMap = new HashMap<String, String>();
		BeanUtil.toMap(hotMail, fieldDictMap);
		fieldDictMap.put("modelId", "HOT_MAIL-MODEL_ID");
		fieldDictMap.put("hotMailAim", "HOT_MAIL_AIM");
		map.put("bean", hotMail);
		return new ModelAndView("admin/hotLine/hotmail_detail", map);
	}
	
	@RequestMapping("/hotMailSelect")
	@ResponseBody
	@Remarks("信箱列表查询")
	public AjaxResponse hotMailSelect(HttpServletRequest request,HotMail hotMail, Page page) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		HotMailExample example = new HotMailExample();
		HotMailExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.YES_CHAR);
		if(StringUtils.isNoneBlank(hotMail.getModelId())){
			criteria.andModelIdEqualTo(hotMail.getModelId());
		}
		if(StringUtils.isNoneBlank(hotMail.getHotMailAim())){
			criteria.andHotMailAimEqualTo(hotMail.getHotMailAim());
		}
		if(StringUtils.isNoneBlank(hotMail.getReplyState())){
			criteria.andReplyStateEqualTo(hotMail.getReplyState());
		}
		if(StringUtils.isNoneBlank(hotMail.getIsRead())){
			criteria.andIsReadEqualTo(hotMail.getIsRead());
		}
		
		if (StringUtils.isBlank(page.getOrderBy())) {
			example.setOrderByClause("CREATE_DATE desc");
		}else {
			example.setOrderByClause(PubTools.camel4underline(page.getOrderBy()));
		}
		List<HotMail> list = hotMailService.select(example, page);
		Map<String,String> fieldDictMap = new HashMap<String, String>();
		fieldDictMap.put("modelId", "HOT_MAIL-MODEL_ID");
		fieldDictMap.put("hotMailAim", "HOT_MAIL_AIM");
		List<Map<String, String>> results = BeanUtil.toList(list, fieldDictMap);
		resp.setData(new PagedList<Map<String, String>>(results, page));
		
		return resp;
	}
	@RequestMapping("/hotMailDelete")
	@ResponseBody
	@Remarks("信箱删除")
	public AjaxResponse hotMailDelete(HttpServletRequest request,String ids) throws Exception {
		if(StringUtils.isNoneBlank(ids)){
			hotMailService.delete(ids.split(","));
		}
		return new AjaxResponse();
	}
	@RequestMapping("/toHotMailReply")
	@Remarks("至信箱回复页")
	public ModelAndView toHotMailReply(String id)throws Exception{
		ModelMap map = new ModelMap();
		HotMail bean = hotMailService.find(id);
		map.put("bean", bean);
		return new ModelAndView("admin/hotLine/hotmail_reply", map);
	}
	@RequestMapping("/hotMailReply")
	@ResponseBody
	@Remarks("信箱回复")
	public AjaxResponse hotMailReply(HttpServletRequest request,String id, String content) throws Exception {
		IUser user = SessionUtil.getUser(request);
		hotMailService.reply(id, content, user);
		return new AjaxResponse();
	}
}
