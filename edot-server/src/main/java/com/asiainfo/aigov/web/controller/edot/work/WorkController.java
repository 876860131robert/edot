package com.asiainfo.aigov.web.controller.edot.work;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ai.common.cache.redis.JRedisPoolUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.PagedList;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import com.asiainfo.aigov.service.edot.work.IMaterialService;
import com.asiainfo.aigov.service.edot.work.IServiceItemService;
import com.asiainfo.aigov.service.edot.work.IWorkService;
import com.asiainfo.aigov.service.system.impl.SysDictManager;
import com.asiainfo.aigov.web.controller.edot.layout.LayoutConstants;
import com.asiainfo.aigov.web.controller.edot.layout.page.Item;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageMaterial;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;
import com.asiainfo.aigov.web.controller.edot.layout.page.PieceHeadItems;
import com.asiainfo.aigov.web.webservice.edot.work.UserWorkWebService;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ApplyFile;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ApplyInfo;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ApplyMaterialInfo;
import com.asiainfo.aigov.web.webservice.edot.work.bean.WorkResponse;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.ApplicationContextUtil;
import com.asiainfo.frame.utils.ErrorCode;
import com.asiainfo.frame.utils.FileDownloadHandler;
import com.asiainfo.frame.utils.ImgDownloadHandler;
import com.asiainfo.frame.utils.IpUtil;

/**
 * 
 * @author songxiaoliang
 *
 */
@Controller
@RequestMapping("/work")
public class WorkController extends BaseController{
	private static Logger log = Logger.getLogger(WorkController.class);

	@Autowired
	private IWorkService workService;
	@Autowired
	private JRedisPoolUtils jRedisPoolUtils;
	
	@Autowired
	private IServiceItemService serviceItemService;
	@Autowired
	private IMaterialService matertialService;
	
	/**
	 * 
	 * @param type			办事类型：   个人、办事、部门
	 * @param pageIndex		办事类型当前页
	 * @param pageSize		办事类型每页数
	 * @param workSize		每个办事类型显示办事数
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/guide/selectGuides")
	@ResponseBody
	@Remarks("查询办事指南[首页]")
	public AjaxResponse selectGuides(String type, Integer pageIndex
			, Integer pageSize, Integer workSize) throws Exception {
		if(pageSize==null){
			pageSize = Integer.parseInt(AppPropertyUtil.getProperty("workTypePageSize"));
		}
		if(workSize==null){
			workSize = Integer.parseInt(AppPropertyUtil.getProperty("workSizeByIndex"));
		}
		
		Object value = jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_WORK_LIST + "_" + type + "@@" + pageIndex + "@@" + pageSize + "@@" + workSize);
//		value = null;
		if(value == null){
			AjaxResponse resp = new AjaxResponse();
			Page page = new Page(pageSize, pageIndex);
			if(WorkConstants.WORK_TYPE_DEPT.equals(type)){
				List<PieceHeadItems> pieceHeadItems = workService.selectGuidesWithDept(page, workSize);
				resp.setData(new PagedList<PieceHeadItems>(pieceHeadItems, page));
			}else{
				List<PieceHeadItems> pieceHeadItems = workService.selectGuidesWithType(type, page, workSize);
				resp.setData(new PagedList<PieceHeadItems>(pieceHeadItems, page));
			}
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_WORK_LIST + "_" + type + "@@" + pageIndex + "@@" + pageSize + "@@" + workSize, resp, 3600 * 24);
			return resp;
		} else {
			return (AjaxResponse)value;
		}
	}

	@RequestMapping("/guide/selectMoreGuides")
	@ResponseBody
	@Remarks("办事指南列表查询[更多]")
	public AjaxResponse selectMoreGuides(String type, String type2, String code, String name, Integer pageIndex, Integer pageSize) throws Exception {
		Object value = jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_WORK_MORE + "_" + type + "@@" + code + "@@" + pageIndex + "@@" + pageSize);
		value = null;
		if(value == null){
			AjaxResponse resp = new AjaxResponse();
			ServiceItemExample example = new ServiceItemExample();
			ServiceItemExample.Criteria serviceItemCriteria = example.createCriteria();
			serviceItemCriteria.andEnableEqualTo("是");	//是否可用
			if(StringUtils.isNotEmpty(name)){
				serviceItemCriteria.andServnameLike("%"+name+"%");
			} else {
				if(WorkConstants.WORK_TYPE_DEPT.equals(type)){
					serviceItemCriteria.andDeptcodeEqualTo(code);
					if(WorkConstants.WORK_TYPE_PERSON.equals(type2)){
						serviceItemCriteria.andServapplicanttypeLike("%个人%");
					} else {
						serviceItemCriteria.andServapplicanttypeLike("%企业%");
						ServiceItemExample.Criteria serviceItemCriteria2 = example.createCriteria();
						serviceItemCriteria2.andEnableEqualTo("是");
						if(StringUtils.isNotEmpty(name)){
							serviceItemCriteria.andServnameLike("%"+name+"%");
						}
						serviceItemCriteria2.andDeptcodeEqualTo(code);
						serviceItemCriteria2.andServapplicanttypeLike("%其他团体%");
						example.or(serviceItemCriteria2);
					}
				} else{
					serviceItemCriteria.andBusinessClassIdLike("%"+code+"%");
				}
			}
			example.setOrderByClause("SERVNO");
			if(pageSize==null){
				pageSize = Integer.parseInt(AppPropertyUtil.getProperty("workPageSize"));
			}
			Page page = new Page();
			page.setPageSize(pageSize);
			List<ServiceItem> itemList = serviceItemService.select(example, page);
			if(itemList!=null){
				String head = "";
				try {
					if(WorkConstants.WORK_TYPE_DEPT.equals(type)){
						head = SysDictManager.getInstance().getDict("work_dept").get(code).toString();
					}
					else{
						head = SysDictManager.getInstance().getDict("business_class").get(code).toString();
					}
				} catch (Exception e) {
				}
				PieceHeadItems pieceItems = new PieceHeadItems(head);
				for (ServiceItem serviceItem : itemList) {
					Item item = new Item();
					item.setId(serviceItem.getServno());
					item.setLabel(serviceItem.getServname());
					item.setDesc(serviceItem.getDeptname());
//					item.setValue(value);
					pieceItems.getItems().add(item);
				}
				Map<String,Object> map = new HashMap<String, Object>();
				map.put("results", pieceItems);
				map.put("page", page);
				resp.setData(map);
			}
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_WORK_MORE + "_" + type + "@@" + code + "@@" + pageIndex + "@@" + pageSize, resp, 3600 * 24);
			return resp;
		} else {
			return (AjaxResponse)value;
		}
	}
	@RequestMapping("/guide/selectGuideInfo1")
	@ResponseBody
	@Remarks("办事指南查询1")
	public AjaxResponse selectGuideInfo1(HttpServletRequest request, String workCode) throws Exception {
		if(StringUtils.isBlank(workCode)){
			throw new AIException("办事编码为空！");
		}
		AjaxResponse resp = new AjaxResponse();
		PageWork vo = workService.selectGuideInfo(workCode, ApplicationContextUtil.getBasePath(request));
		resp.setData(vo);
		return resp;
	}
	//在线申报页数据
	@RequestMapping("/material/selectMaterialCfg1")
	@ResponseBody
	@Remarks("申请材料配置查询1")
	@User
	public AjaxResponse selectMaterialCfg1(String workCode) throws Exception {
		if(StringUtils.isBlank(workCode)){
			throw new AIException("办事编码为空！");
		}
		AjaxResponse resp = new AjaxResponse();
		
		List<Material> list = workService.selectMaterialItems(workCode);
		if(list!=null && list.size()>0){
			PageMaterial material = new PageMaterial();
			material.getDatas().put("servno", workCode);
			
			int i=1;
			for (Material item : list) {
				PieceHeadItems pieceItems = new PieceHeadItems(item.getMatename());
				pieceItems.setRegionName(String.valueOf(i));
//				pieceItems.getItems().add(new Item("证照编号", null, LayoutConstants.ITEM_TYPE_INPUT_TEXT));
				pieceItems.getItems().add(new Item(item.getMateno(), null, LayoutConstants.ITEM_TYPE_INPUT_FILE));
				material.getTitleItemsList().add(pieceItems);
				i++;
			}
			resp.setData(material);
		}
		return resp;
	}
	
	@RequestMapping("/material/getFlowImg")
	@Remarks("查看流程图")
	public void getFlowImg(HttpServletResponse response, String id)throws Exception{
		ServiceItem item = serviceItemService.find(id);
		if(item!=null){
			byte[] content = item.getFlowimg();
			ByteArrayInputStream inputStream = new ByteArrayInputStream(content);
			ImgDownloadHandler handler = new ImgDownloadHandler();
			handler.download(response, inputStream);
		}
	}
	
	@RequestMapping("/material/downloadMaterial")
	@Remarks("下载办事材料")
	public void downloadMaterial(HttpServletResponse response, String id)throws Exception{
		Material item = matertialService.find(id);
		if(item!=null){
			String fileName = item.getMatetemplatename();
			byte[] content = item.getMatetemplate();
			ByteArrayInputStream inputStream = new ByteArrayInputStream(content);
			FileDownloadHandler handler = new FileDownloadHandler();
			handler.download(response, inputStream, fileName);
		}
	}
	
	/**
	 * 
	 * @param applyInfo
	 * @param files			
	 * 文件json数组，元素key-材料编号，元素value-base64串
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/apply")
	@ResponseBody
	@Remarks("办事申请")
	public AjaxResponse apply(ApplyInfo applyInfo, String files)throws Exception{
		log.info("用户办事申请提交数据：\n"+JSONObject.toJSONString(applyInfo,true));
		List<ApplyFile> applyFiles = new ArrayList<ApplyFile>();
		if(StringUtils.isNotEmpty(files)){
			JSONArray arr = JSONObject.parseArray(files);
			for (int i = 0; i < arr.size(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				if(obj != null){
					log.info(i+"文件数据：\n"+obj.toJSONString().substring(0, 200));
					String mateno = obj.getString("mateno");
					String file64 = obj.getString("file64");
					ApplyFile applyFile = new ApplyFile();
					applyFile.setMateno(mateno);
					setFileAttr(file64, applyFile);
					applyFiles.add(applyFile);
				}
			}
		}
		
		List<Material> materialItems = workService.selectMaterialItems(applyInfo.getServno());
		if(materialItems!=null && materialItems.size()>0){
			for (Material materialItem : materialItems) {
				//申请材料
				if(StringUtils.isNotBlank(materialItem.getMatename())){
					ApplyMaterialInfo mateInfo = new ApplyMaterialInfo();
					mateInfo.setMatename(materialItem.getMatename());
					mateInfo.setMateno(materialItem.getMateno());
					applyInfo.getMateList().add(mateInfo);
				}
			}
		}
		
		WorkResponse workResponse = UserWorkWebService.workApply(applyInfo, applyFiles);
		if(workResponse.isSuccess()){
			return new AjaxResponse(ErrorCode.SUCCESS,"申请成功！");
		}else{
			return new AjaxResponse(ErrorCode.OTHER_ERROR, "操作失败，失败原因："+workResponse.getMessage());
		}
//		return new AjaxResponse(ErrorCode.OTHER_ERROR,"失败了");
	}
	/**
	 * 
	 * @param file64		实际数据格式：data:image/jpeg;base64,文件base64数据
	 * data:;base64,文件base64数据
	 * @param applyFile
	 * @throws Exception
	 */
	public static void setFileAttr(String file64, ApplyFile applyFile) throws Exception {
		if (file64.indexOf("base64") != -1) {
			String[] args = file64.split(",");		//data:image/jpeg;base64,文件base64数据
			String[] args1 = args[0].split("/");	//data:image/jpeg;base64
			String fileExtName = "";
			if(args1.length==1){
				fileExtName = "jpg";
			}else{
				String[] args2 = args1[1].split(";");	//jpeg;base64
				if ("jpeg".equalsIgnoreCase(args2[0]) || "jpg".equalsIgnoreCase(args2[0])) {
					fileExtName = "jpg";
				}
				if ("png".equalsIgnoreCase(args2[0])) {
					fileExtName = "png";
				}
				if ("gif".equalsIgnoreCase(args2[0])) {
					fileExtName = "gif";
				}
			}
			String fileName = UUID.randomUUID().toString() + "." + fileExtName;
			applyFile.setOriginalName(fileName);
			Base64 base64 = new Base64();
			byte[] buffer = base64.decodeBase64(new String(args[1]).getBytes());
			applyFile.setBuffer(buffer);
		}
	}
	public static void main(String[] args)throws Exception{
		String file64 = "data:image/jpeg;base64,文件base64数据";
		file64 = "data:;base64,文件base64数据";
		setFileAttr(file64, new ApplyFile());
	}
	@RequestMapping("/showIps")
	@ResponseBody
	@Remarks("IP查看")
	public AjaxResponse showIps()throws Exception{
		AjaxResponse resp = new AjaxResponse();
		resp.setData(IpUtil.getMachineIps());
		return resp;
	}
	
	/**
	 * 测试办事申请，测试httpClient文件提交是否有效
	 * @param file
	 * @param request
	 * @param response
	 * @param relationalTable
	 * @param relationalColumn
	 * @throws Exception
	 */
	@RequestMapping("/testWorkApply")
	@ResponseBody
	public AjaxResponse testWorkApply(@RequestParam("file")MultipartFile[] file, HttpServletRequest request,HttpServletResponse response,
			 String relationalTable, String relationalColumn) throws Exception {
		Map<String,String[]> map = request.getParameterMap();
		for(Map.Entry<String, String[]> entry: map.entrySet()){
			String key = entry.getKey();
			String[] value = entry.getValue();
			StringBuffer sb = new StringBuffer();
			for (String v : value) {
				sb.append(v).append(",");
			}
			System.out.println(key+":"+sb.toString()+"\n");
		}
		
		for (MultipartFile multipartFile : file) {
			String originalFilename = multipartFile.getOriginalFilename();
			System.out.println(originalFilename);
			String savePath = "C:/vincent/"+originalFilename;
			multipartFile.transferTo(new File(savePath));
		}
		
		return new AjaxResponse();
	}
}
