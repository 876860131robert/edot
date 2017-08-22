package com.asiainfo.aigov.service.edot.work.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.dao.edot.work.WorkMapper;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.BusinessClassExample;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.MaterialExample;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import com.asiainfo.aigov.model.edot.work.Work;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.model.edot.work.WorkDeptExample;
import com.asiainfo.aigov.model.edot.work.WorkExample;
import com.asiainfo.aigov.model.edot.work.WorkGuide;
import com.asiainfo.aigov.service.BaseService;
import com.asiainfo.aigov.service.edot.work.IBusinessClassService;
import com.asiainfo.aigov.service.edot.work.IMaterialService;
import com.asiainfo.aigov.service.edot.work.IServiceItemService;
import com.asiainfo.aigov.service.edot.work.IWorkDeptService;
import com.asiainfo.aigov.service.edot.work.IWorkGuideService;
import com.asiainfo.aigov.service.edot.work.IWorkService;
import com.asiainfo.aigov.service.system.impl.SysDictManager;
import com.asiainfo.aigov.web.controller.edot.layout.LayoutConstants;
import com.asiainfo.aigov.web.controller.edot.layout.page.Item;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;
import com.asiainfo.aigov.web.controller.edot.layout.page.PieceHeadItems;
import com.asiainfo.frame.common.Constants;
import com.asiainfo.frame.exception.AIException;

/**
 * 
 * @author songxiaoliang
 *
 */
@Service
public class WorkService extends BaseService implements IWorkService {
	private static Logger log = Logger.getLogger(WorkService.class);
	
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private IWorkGuideService workGuideService;
	@Autowired
	private IServiceItemService serviceItemService;
	@Autowired
	private IMaterialService matertialService;
	@Autowired
	private IBusinessClassService businessClassService;
	@Autowired
	private IWorkDeptService workDeptService;
	
	@Override
	public int add(Work record)throws Exception{
		return workMapper.insert(record);
	}
	
	@Override
	public int delete(String id)throws Exception{
		return workMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String[] ids)throws Exception{
		WorkExample example = new WorkExample();
		WorkExample.Criteria criteria = example.createCriteria();
		criteria.andWorkCodeIn(Arrays.asList(ids));
		return workMapper.deleteByExample(example);
	}
	
	@Override
	public int update(Work record)throws Exception{
		WorkExample example = new WorkExample();
		WorkExample.Criteria criteria = example.createCriteria();
		criteria.andWorkCodeEqualTo(record.getWorkCode());
		return workMapper.updateByExample(record, example);	//user为set后面的值，example为where后面的条件
	}

	@Override
	public Work find(String id)throws Exception{
		return workMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int count(WorkExample example)throws Exception{
		return workMapper.countByExample(example);
	}
	
	@Override
	public List<Work> select(WorkExample example) {
		return workMapper.selectByExample(example);
	}

	@Override
	public List<Work> select(WorkExample example, Page page)throws Exception{
		int count = count(example);
		if(count>0){
			page.setRowCount(count);
			return workMapper.selectByExampleWithRowbounds(example, page);
		}
		return null;
	}
	
	@Override
	public PageWork selectGuideInfo(String workCode)throws Exception{
		PageWork pageWork = new PageWork();
		
		Work work = this.find(workCode);
		pageWork.getBaseinfo().add(new Item("事项编号", work.getSxbh(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getBaseinfo().add(new Item("事项名称", work.getSxmc(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getBaseinfo().add(new Item("办理部门", work.getBlbm(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getBaseinfo().add(new Item("受理地点", work.getSldd(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getBaseinfo().add(new Item("联系电话", work.getLxdh(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getBaseinfo().add(new Item("监督电话", work.getJddh(), LayoutConstants.ITEM_TYPE_TEXT));
		if(Constants.YES_CHAR.equals(work.getApplyFlag())){
			pageWork.getBaseinfo().add(new Item("在线申报", work.getJddh(), LayoutConstants.ITEM_TYPE_BTN));
			
		}
		WorkGuide guide = workGuideService.find(workCode);
		PieceHeadItems xsyj = new PieceHeadItems("行使依据");
		xsyj.getItems().add(new Item(null, guide.getXsyj(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getOtherinfo().add(xsyj);
		PieceHeadItems sltj = new PieceHeadItems("受理条件");
		sltj.getItems().add(new Item(null, guide.getSltj(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getOtherinfo().add(sltj);
		PieceHeadItems sfyj = new PieceHeadItems("收费依据和标准");
		sfyj.getItems().add(new Item(null, guide.getSfyj(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getOtherinfo().add(sfyj);
		PieceHeadItems sqcl = new PieceHeadItems("申请材料");
		sqcl.getItems().add(new Item(null, guide.getSqcl(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getOtherinfo().add(sqcl);
		PieceHeadItems lct = new PieceHeadItems("流程图");
		lct.getItems().add(new Item(null, guide.getLct(), LayoutConstants.ITEM_TYPE_IMG));
		pageWork.getOtherinfo().add(lct);
		PieceHeadItems blsx = new PieceHeadItems("办理时限");
		blsx.getItems().add(new Item(null, guide.getBlsx(), LayoutConstants.ITEM_TYPE_TEXT));
		pageWork.getOtherinfo().add(blsx);
		PieceHeadItems bgxz = new PieceHeadItems("表格下载");
		Map<String,String> bgxzMap = JSONObject.parseObject(guide.getBgxz(), LinkedHashMap.class);
		if(bgxzMap.size()>0){
			for(Map.Entry<String, String> entry: bgxzMap.entrySet()){
				bgxz.getItems().add(new Item(entry.getKey(), entry.getValue(), LayoutConstants.ITEM_TYPE_FILE));
			}
		}
		pageWork.getOtherinfo().add(bgxz);
		
		return pageWork;
	}
	
	public ServiceItem getServiceItem(String servno)throws Exception{
		ServiceItemExample example = new ServiceItemExample();
		ServiceItemExample.Criteria criteria = example.createCriteria();
		criteria.andServnoEqualTo(servno);
		criteria.andEnableEqualTo("是");	//是否可用
		List<ServiceItem> itemList = serviceItemService.select(example);
		if(itemList!=null && itemList.size()>0){
			if(itemList.size()==1){
				return itemList.get(0);
			}else{
				throw new AIException("查找到多条办事记录："+servno);
			}
		}
		return null;
	}
	
	public ServiceItem getServiceItemIncludeBlobs(String workCode)throws Exception{
		ServiceItem item = this.getServiceItem(workCode);
		if(item!=null){
			ServiceItemExample example = new ServiceItemExample();
			ServiceItemExample.Criteria criteria = example.createCriteria();
			criteria.andServnoEqualTo(workCode);
			criteria.andEnableEqualTo("是");	//是否可用
			List<ServiceItem> itemList = serviceItemService.selectWithBLOBs(example);
			
			ServiceItem itemBlob = itemList.get(0);
			item.setBylaw(itemBlob.getBylaw());//法律依据
			item.setServcondition(itemBlob.getServcondition());//申报条件
			item.setServfeelawcondition(itemBlob.getServfeelawcondition());//收费依据及标准
			return item;
		}
		return null;
	}
	
	public List<Material> selectMaterialItems(String servcode)throws Exception{
		MaterialExample example = new MaterialExample();
		MaterialExample.Criteria criteria = example.createCriteria();
		criteria.andServcodeEqualTo(servcode);
		criteria.andEnableEqualTo("是");	//是否可用
		example.setOrderByClause("MATENO");
		return matertialService.select(example);
	}
	public List<BusinessClass> selectBusinessClass(String ids)throws Exception{
		if(StringUtils.isNotBlank(ids)){
			String[] idArr = ids.split(",");
			BusinessClassExample example = new BusinessClassExample();
			BusinessClassExample.Criteria criteria = example.createCriteria();
			criteria.andIdIn(Arrays.asList(idArr));
			return businessClassService.select(example);
		}
		return null;
	}
	
	public List<WorkDept> selectWorkDepts(String deptcodes)throws Exception{
		if(StringUtils.isNotBlank(deptcodes)){
			String[] arr = deptcodes.split(",");
			WorkDeptExample example = new WorkDeptExample();
			WorkDeptExample.Criteria criteria = example.createCriteria();
			criteria.andDeptcodeIn(Arrays.asList(arr));
			return workDeptService.select(example);
		}
		return null;
	}
	public PageWork selectGuideInfo(String workCode, String appBasePath)throws Exception{
		PageWork pageWork = new PageWork();
		ServiceItem serviceItem = this.getServiceItemIncludeBlobs(workCode);
		if(serviceItem!=null){
			pageWork.getBaseinfo().add(new Item("事项编号", serviceItem.getServno(), LayoutConstants.ITEM_TYPE_TEXT));
			pageWork.getBaseinfo().add(new Item("事项名称", serviceItem.getServsimplename(), LayoutConstants.ITEM_TYPE_TEXT));
			String deptCode = serviceItem.getDeptcode();
			String deptName = deptCode;
			Map<String,String> dictMap = SysDictManager.getInstance().getDict("work_dept");
			if(dictMap!=null && dictMap.get(deptCode)!=null){
				deptName = dictMap.get(deptCode);
			}
			pageWork.getBaseinfo().add(new Item("办理部门", deptName, LayoutConstants.ITEM_TYPE_TEXT));
			pageWork.getBaseinfo().add(new Item("受理地点", serviceItem.getServhandleplace(), LayoutConstants.ITEM_TYPE_TEXT));
			pageWork.getBaseinfo().add(new Item("联系电话", serviceItem.getLinkphone(), LayoutConstants.ITEM_TYPE_TEXT));
			pageWork.getBaseinfo().add(new Item("监督电话", serviceItem.getServsuperphone(), LayoutConstants.ITEM_TYPE_TEXT));
			if("是".equals(serviceItem.getServifnetapp())){
				pageWork.getBaseinfo().add(new Item("在线申报", "在线申报", LayoutConstants.ITEM_TYPE_BTN));
			}
			PieceHeadItems xsyj = new PieceHeadItems("行使依据");
			xsyj.addTextItems(serviceItem.getBylaw(), "\n");
			pageWork.getOtherinfo().add(xsyj);
			PieceHeadItems sltj = new PieceHeadItems("受理条件");
			sltj.addTextItems(serviceItem.getServcondition(), "\n");
			pageWork.getOtherinfo().add(sltj);
			PieceHeadItems sfyj = new PieceHeadItems("收费依据和标准");
			sfyj.addTextItems(serviceItem.getServfeelawcondition(), "\n");
			pageWork.getOtherinfo().add(sfyj);
			PieceHeadItems lct = new PieceHeadItems("流程图");
			lct.getItems().add(new Item(null, appBasePath+"/work/material/getFlowImg?id="+serviceItem.getServno(), LayoutConstants.ITEM_TYPE_IMG));
			pageWork.getOtherinfo().add(lct);
			PieceHeadItems blsx = new PieceHeadItems("办理时限");
			String blsxStr = serviceItem.getServdaybylaw().toString();
			if(StringUtils.isNotBlank(blsxStr)){
				blsxStr += " 工作日";
			}
			blsx.getItems().add(new Item(null, blsxStr, LayoutConstants.ITEM_TYPE_TEXT));
			pageWork.getOtherinfo().add(blsx);
			
			
			List<Material> materialItems = this.selectMaterialItems(workCode);
			
			StringBuffer sqclSb = new StringBuffer();//申请材料
			PieceHeadItems bgxz = new PieceHeadItems("表格下载");
			if(materialItems!=null && materialItems.size()>0){
				for (Material materialItem : materialItems) {
					//申请材料
					String matename = materialItem.getMatename();
					if(StringUtils.isNotBlank(matename)){
						sqclSb.append(matename).append("\n");
					}
					
					//表格下载
					String matetemplatename = materialItem.getMatetemplatename();
					if(StringUtils.isNotBlank(matetemplatename)){
						String downloadPath = appBasePath+"/work/material/downloadMaterial?id="+materialItem.getMateno();
						bgxz.getItems().add(new Item(matetemplatename, downloadPath, LayoutConstants.ITEM_TYPE_FILE));
					}
				}
			}
			PieceHeadItems sqcl = new PieceHeadItems("申请材料");
			sqcl.addTextItems(sqclSb.toString(), "\n");
			pageWork.getOtherinfo().add(sqcl);
			pageWork.getOtherinfo().add(bgxz);
		}
		return pageWork;
	}
	
	public List<PieceHeadItems> selectGuidesWithType(String workTypeParentId, Page page, Integer workSize)throws Exception{
		BusinessClassExample example = new BusinessClassExample();
		BusinessClassExample.Criteria criteria = example.createCriteria(); 
		criteria.andColuparentidEqualTo(workTypeParentId);
		example.setOrderByClause("COLUSORT");
		List<BusinessClass> workTypeList = businessClassService.select(example, page);
		if(workTypeList!=null){
			List<PieceHeadItems> pieceList = new ArrayList<PieceHeadItems>();
			for (BusinessClass workType : workTypeList) {
				PieceHeadItems pieceItems = new PieceHeadItems(workType.getImgurl(), workType.getColuname());
				pieceItems.setId(workType.getId());
				if(workSize != 0){
					ServiceItemExample serviceItemExample = new ServiceItemExample();
					ServiceItemExample.Criteria serviceItemCriteria = serviceItemExample.createCriteria();
					serviceItemCriteria.andEnableEqualTo("是");	//是否可用
					serviceItemCriteria.andBusinessClassIdLike("%"+workType.getId()+"%");
					serviceItemExample.setOrderByClause("SERVNO");
					Page serviceItemPage = new Page();
					serviceItemPage.setPageSize(workSize);
					List<ServiceItem> itemList = serviceItemService.select(serviceItemExample, serviceItemPage);
					if(itemList!=null && itemList.size()>0){
						for (ServiceItem serviceItem : itemList) {
							Item item = new Item();
							item.setId(serviceItem.getServno());
							item.setLabel(serviceItem.getServname());
//							item.setValue(value);
							pieceItems.getItems().add(item);
						}
					}
				}
				pieceList.add(pieceItems);
			}
			return pieceList;
		}
		return null;
	}
	
	public List<PieceHeadItems> selectGuidesWithDept(Page page, Integer workSize)throws Exception{
		WorkDeptExample example = new WorkDeptExample();
		example.setOrderByClause("DEPTCODE");
		List<WorkDept> workDeptList = workDeptService.select(example, page);
		if(workDeptList!=null){
			List<PieceHeadItems> pieceList = new ArrayList<PieceHeadItems>();
			for (WorkDept workDept : workDeptList) {
				PieceHeadItems pieceItems = new PieceHeadItems(workDept.getDeptname());
				pieceItems.setId(workDept.getDeptcode());
				if(workSize != 0){
					ServiceItemExample serviceItemExample = new ServiceItemExample();
					ServiceItemExample.Criteria serviceItemCriteria = serviceItemExample.createCriteria();
					serviceItemCriteria.andEnableEqualTo("是");	//是否可用
					serviceItemCriteria.andDeptcodeEqualTo(workDept.getDeptcode());
					serviceItemExample.setOrderByClause("DEPTCODE");
					Page serviceItemPage = new Page();
					serviceItemPage.setPageSize(workSize);
					List<ServiceItem> itemList = serviceItemService.select(serviceItemExample, serviceItemPage);
					if(itemList!=null && itemList.size()>0){
						for (ServiceItem serviceItem : itemList) {
							Item item = new Item();
							item.setId(serviceItem.getServno());
							item.setLabel(serviceItem.getServname());
//							item.setValue(value);
							pieceItems.getItems().add(item);
						}
					}
				}
				pieceList.add(pieceItems);
			}
			return pieceList;
		}
		
		return null;
	}
	
}
