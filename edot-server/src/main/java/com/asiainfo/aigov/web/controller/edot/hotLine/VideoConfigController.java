package com.asiainfo.aigov.web.controller.edot.hotLine;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
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

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;
import com.asiainfo.aigov.model.edot.hotLine.VideoConfig;
import com.asiainfo.aigov.model.edot.hotLine.VideoConfigExample;
import com.asiainfo.aigov.service.edot.hotLine.IVideoConfigService;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.IdUtils;
import com.asiainfo.frame.utils.PubTools;

/**
 * 视频配置app接口和后台管理控制类
 * @author jiangyujie
 *
 */
@Controller
@RequestMapping("/videoConfig")
public class VideoConfigController extends BaseController {
	private static Logger logger = Logger.getLogger(VideoConfigController.class);

	@Autowired
	private IVideoConfigService videoConfigService;
	/*******************************后台管理******************************************/
//	/** 视频 **/
//	@RequestMapping("/toVideoConfig")
//	@Remarks("至视频配置页")
//	public ModelAndView toHotMailList()throws Exception{	
//		ModelMap map = new ModelMap();
//		
//		return new ModelAndView("admin/hotLine/video_config", map);
//	}
	
	/**
	 * 有分页功能的
	 * @param request
	 * @param curPageNum
	 * @param pageCount
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getPageVideoConfig")
	@ResponseBody
	@Remarks("视频配置列表分页")
	public AjaxResponse getAllVideoConfig(HttpServletRequest request,VideoConfig videoConfig, Page page) throws Exception {
		AjaxResponse resp = new AjaxResponse();
//		page.setPageIndex(Integer.valueOf(page));
//		page.setPageSize(Integer.valueOf(pageSize));
		VideoConfigExample example = new VideoConfigExample();
		VideoConfigExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isNoneBlank(videoConfig.getTitle())){
			criteria.andTitleEqualTo(videoConfig.getTitle());
		}
		
		if (StringUtils.isBlank(page.getOrderBy())) {
			example.setOrderByClause("title desc");
		}else {
			example.setOrderByClause(PubTools.camel4underline(page.getOrderBy()));
		}
		List<VideoConfig> list = videoConfigService.findAll(example, page);
//		Map<String,String> fieldDictMap = new HashMap<String, String>();
//		fieldDictMap.put("title", "title");
//		List<Map<String, String>> results = BeanUtil.toList(list, fieldDictMap);
		resp.setData(new PagedList<VideoConfig>(list, page));
		return resp;
	}
	@RequestMapping("/saveVideoConfig")
	@ResponseBody
	@Remarks("保存视频配置")
	public AjaxResponse saveVideoConfig(HttpServletRequest request,VideoConfig videoConfig,@RequestParam("file") CommonsMultipartFile[] files) throws Exception{
		AjaxResponse resp = new AjaxResponse();
		if(null == videoConfig){
			videoConfig = new VideoConfig();
		}
		videoConfig.setId(IdUtils.uuid());
		if(files != null && files.length> 0){
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
					videoConfig.setImg(imgUrl);
				}else{
					videoConfig.setMapImg(imgUrl);
				}
			}
			
		}
		videoConfigService.save(videoConfig);
		resp.setData(videoConfig);
		return resp;
	}
	
	@RequestMapping("/updateVideoConfig")
	@ResponseBody
	@Remarks("修改视频配置")
	public AjaxResponse updateVideoConfig(HttpServletRequest request,VideoConfig videoConfig,@RequestParam("file") CommonsMultipartFile[] files) throws Exception{
		AjaxResponse resp = new AjaxResponse();
		if(files != null && files.length> 0){
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
					videoConfig.setImg(imgUrl);
				}else{
					videoConfig.setMapImg(imgUrl);
				}
			}
			
		}
		VideoConfigExample example = new VideoConfigExample();
		VideoConfigExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(videoConfig.getId());
		videoConfigService.update(videoConfig, example);
		resp.setData(videoConfig);
		return resp;
	}
	
	@RequestMapping("/deleteVideoConfig")
	@ResponseBody
	@Remarks("删除视频配置")
	public AjaxResponse deleteVideoConfig(HttpServletRequest request,String ids) throws Exception{
		AjaxResponse resp = new AjaxResponse();
		String id[] = null;
		VideoConfigExample example = null;
		String filePath = request.getSession().getServletContext().getRealPath("/") ;
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+ request.getServerPort()+request.getContextPath();
		String imgPath = null;
		String baseImg = null;
		VideoConfig videoConfig = null;
		List<VideoConfig> list = null;
		if(null != ids && !"".equals(ids)){
			 id = ids.split(",");
			 
			 for(int i = 0 ; i < id.length ; i++){
				 if(null != id && !"".equals(id)){
					 example =  new VideoConfigExample();
					 VideoConfigExample.Criteria criteria = example.createCriteria();
					 criteria.andIdEqualTo(id[i]);
					 list = videoConfigService.findAll(example);
					 if(!list.isEmpty()){
						 videoConfig = list.get(0);
						 if(null != videoConfig){
							 imgPath = videoConfig.getImg();
							 baseImg = videoConfig.getMapImg();
							 imgPath = imgPath.substring(basePath.length(), imgPath.length());
							 baseImg = baseImg.substring(basePath.length(), baseImg.length());
							 File file = new File(filePath+imgPath);
							 if(file.exists()){
								 file.delete();
							 }
							 file = new File(filePath+baseImg);
							 if(file.exists()){
								 file.delete();
							 }
						 }
					 }
				 }
				 videoConfigService.delete(id[i]);
			 }
		}
		resp.setData("0");
		return resp;
	}
	
	/*******************************App接口******************************************/
	
	/**
	 * 没有分页功能的
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getAllVideoConfig")
	@ResponseBody
	@Remarks("视频配置列表全部")
	public AjaxResponse getAllVideoConfig(HttpServletRequest request) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		VideoConfigExample example = new VideoConfigExample();
		List<VideoConfig> list = videoConfigService.findAll(example);
		resp.setData(list);
		return resp;
	}
	
}
