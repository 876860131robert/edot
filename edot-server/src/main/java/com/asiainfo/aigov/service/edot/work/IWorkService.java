package com.asiainfo.aigov.service.edot.work;

import java.util.List;

import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.Work;
import com.asiainfo.aigov.model.edot.work.WorkExample;
import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.WorkDept;
import com.asiainfo.aigov.web.controller.edot.layout.page.PageWork;
import com.asiainfo.aigov.web.controller.edot.layout.page.PieceHeadItems;

/**
 * 
 * @author songxiaoliang
 *
 */
public interface IWorkService {
	
	public int add(Work bean)throws Exception;

	public int delete(String id)throws Exception;
	
	public int delete(String[] ids)throws Exception;

	public int update(Work bean)throws Exception;
	
	public Work find(String id)throws Exception;
	
	public int count(WorkExample example)throws Exception;
	
	public List<Work> select(WorkExample example)throws Exception;
	
	public List<Work> select(WorkExample example, Page page)throws Exception;
	
	public PageWork selectGuideInfo(String workCode)throws Exception;
	/**
	 * 办事信息查询（不包含blob数据）
	 * @param workCode
	 * @return
	 * @throws Exception
	 */
	public ServiceItem getServiceItem(String servno)throws Exception;
	/**
	 * 办事信息查询（包含blob数据）
	 * @param workCode
	 * @return
	 * @throws Exception
	 */
	public ServiceItem getServiceItemIncludeBlobs(String servno)throws Exception;
	/**
	 * 办事材料查询（不包含blob数据）
	 * @param workCode
	 * @return
	 * @throws Exception
	 */
	public List<Material> selectMaterialItems(String workCode)throws Exception;
	/**
	 * 查询办事分类
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public List<BusinessClass> selectBusinessClass(String ids)throws Exception;
	/**
	 * 查询部门
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public List<WorkDept> selectWorkDepts(String deptcodes)throws Exception;
	/**
	 * 办事指南详细页
	 * @param workCode
	 * @param appBasePath
	 * @return
	 * @throws Exception
	 */
	public PageWork selectGuideInfo(String servno, String appBasePath)throws Exception;
	/**
	 * 办事指南首页(显示若干类型及其若干办事指南信息)
	 * @param workTypeParentId
	 * @param page
	 * @param workPageSize
	 * @return
	 * @throws Exception
	 */
	public List<PieceHeadItems> selectGuidesWithType(String workTypeParentId, Page page, Integer workSize)throws Exception;
	/**
	 * 办事指南首页(显示若干类型及其若干办事指南信息)
	 * @param page
	 * @param workPageSize
	 * @return
	 * @throws Exception
	 */
	public List<PieceHeadItems> selectGuidesWithDept(Page page, Integer workSize)throws Exception;
}
