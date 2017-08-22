package com.asiainfo.aigov.web.webservice.edot.work.bean;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.MaterialExample;
import com.asiainfo.aigov.service.edot.work.IMaterialService;
import com.asiainfo.aigov.service.system.impl.SysDictManager;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.ApplicationContextUtil;

/**
 * @author songxiaoliang
 * 办件数据
 */
public class CaseInfo {
	private String caseapplicant;//申报人
	private String caseapplicantmobile;//申报人电话
	private String caseapplicantpapercode;//申报人证件号
	private String caseapplicantpapertype;//申报人证件类型
	private String caseapplicanttype;//申报主体
	private String caseenddate;//办结日期
	private String casefeeflag;//是否收费
	private String caselawdays;//法定期限
	private String caseno;//办件编号
	private String casenodestatusflag;//办件节点状态
	private String casenumber;//办件数量
	private String caseprimosedays;//承诺期限
	private String casepromisedate;//承诺日期
	private String casestartdate;//开始日期
	/*
	 * 待办状态：待办、补正
	 * 通过状态：许可
	 * 不通过状态：不予许可、退件、不予受理
	 * 完成状态：已发证
	 */
	private String casestatus;//办件状态：待办，许可，不予许可，发证，退件，补办，不予受理；
	private String casestatusflag;//办件状态字典
	private String casetype;//项目类型
	private String deptsimplename;//部门简称
	private String flowinstanceid;//流程实例id
	private String id;//
	private String nodeinstanceid;//节点实例id
	private String remaindays;//剩余天数
	private String servcode;//事项编码
	private String servname;//事项名称
	private String tachename;//环节名称
	private String taskinstanceid;//任务实例id
	private String caseapplydate;//收件时间
	private String surplusday;//剩余天数，负数是超期了
	private String deptname;//单位名称
	
	private List<CaseMaterial> caseMaterials = new ArrayList<CaseMaterial>();
	private List<FlowInfo> flowInfos = new ArrayList<FlowInfo>();
	
	/**
	 * 是否完成
	 * @return
	 */
	public boolean isFinished(){
		return "已发证,".indexOf(casestatus)!=-1 ? true : false;
	}
	/**
	 * 是否审核通过
	 * @return
	 */
	public boolean isPass(){
		return "许可,".indexOf(casestatus)!=-1 ? true : false;
	}
	/**
	 * 是否审核不通过
	 * @return
	 */
	public boolean isUnPass(){
		return "不予许可,退件,不予受理,".indexOf(casestatus)!=-1 ? true : false;
	}
	/**
	 * 前端展现描述
	 * @return
	 */
	public String getDescription(){
		StringBuffer sb = new StringBuffer();
		try {
			sb.append("您于<label>").append(caseapplydate).append("</label>");
			sb.append("申请的<label><").append(servname).append("></label>业务");
			sb.append("当前为<label>[").append(casestatus).append("]</label>状态。");
			if(isPass() && !surplusday.startsWith("-")){
				sb.append("预计<label>").append(surplusday).append("</label>天后办结，");
				sb.append("请携带好以下材料前往<label>").append(SysDictManager.getInstance().getDictValue("work_address", servcode)).append("</label>领取:");
				//携带材料 
				MaterialExample example = new MaterialExample();
				MaterialExample.Criteria criteria = example.createCriteria();
				criteria.andServcodeEqualTo(servcode);
				criteria.andEnableEqualTo("是");	//是否可用
				criteria.andMatenameIsNotNull();
				example.setOrderByClause("MATENO");
				IMaterialService materialService = ApplicationContextUtil.getInstance().getBean(IMaterialService.class);
				List<Material> materialList = materialService.select(example);
				if(materialList!=null){
					int i=0;
					for (Material material : materialList) {
						sb.append("<br/>").append(material.getMatename());
						if(i<materialList.size()-1){
							sb.append("；");
						}
						i++;
					}
					sb.append("。");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString(); 
	}
	
	public String getCaseapplicant() {
		return caseapplicant;
	}
	public void setCaseapplicant(String caseapplicant) {
		this.caseapplicant = caseapplicant;
	}
	public String getCaseapplicantmobile() {
		return caseapplicantmobile;
	}
	public void setCaseapplicantmobile(String caseapplicantmobile) {
		this.caseapplicantmobile = caseapplicantmobile;
	}
	public String getCaseapplicantpapercode() {
		return caseapplicantpapercode;
	}
	public void setCaseapplicantpapercode(String caseapplicantpapercode) {
		this.caseapplicantpapercode = caseapplicantpapercode;
	}
	public String getCaseapplicantpapertype() {
		return caseapplicantpapertype;
	}
	public void setCaseapplicantpapertype(String caseapplicantpapertype) {
		this.caseapplicantpapertype = caseapplicantpapertype;
	}
	public String getCaseapplicanttype() {
		return caseapplicanttype;
	}
	public void setCaseapplicanttype(String caseapplicanttype) {
		this.caseapplicanttype = caseapplicanttype;
	}
	public String getCaseenddate() {
		return caseenddate;
	}
	public void setCaseenddate(String caseenddate) {
		this.caseenddate = caseenddate;
	}
	public String getCasefeeflag() {
		return casefeeflag;
	}
	public void setCasefeeflag(String casefeeflag) {
		this.casefeeflag = casefeeflag;
	}
	public String getCaselawdays() {
		return caselawdays;
	}
	public void setCaselawdays(String caselawdays) {
		this.caselawdays = caselawdays;
	}
	public String getCaseno() {
		return caseno;
	}
	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}
	public String getCasenodestatusflag() {
		return casenodestatusflag;
	}
	public void setCasenodestatusflag(String casenodestatusflag) {
		this.casenodestatusflag = casenodestatusflag;
	}
	public String getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(String casenumber) {
		this.casenumber = casenumber;
	}
	public String getCaseprimosedays() {
		return caseprimosedays;
	}
	public void setCaseprimosedays(String caseprimosedays) {
		this.caseprimosedays = caseprimosedays;
	}
	public String getCasepromisedate() {
		return casepromisedate;
	}
	public void setCasepromisedate(String casepromisedate) {
		this.casepromisedate = casepromisedate;
	}
	public String getCasestartdate() {
		return casestartdate;
	}
	public void setCasestartdate(String casestartdate) {
		this.casestartdate = casestartdate;
	}
	public String getCasestatus() {
		return casestatus;
	}
	public void setCasestatus(String casestatus) {
		this.casestatus = casestatus;
	}
	public String getCasestatusflag() {
		return casestatusflag;
	}
	public void setCasestatusflag(String casestatusflag) {
		this.casestatusflag = casestatusflag;
	}
	public String getCasetype() {
		return casetype;
	}
	public void setCasetype(String casetype) {
		this.casetype = casetype;
	}
	public String getDeptsimplename() {
		return deptsimplename;
	}
	public void setDeptsimplename(String deptsimplename) {
		this.deptsimplename = deptsimplename;
	}
	public String getFlowinstanceid() {
		return flowinstanceid;
	}
	public void setFlowinstanceid(String flowinstanceid) {
		this.flowinstanceid = flowinstanceid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNodeinstanceid() {
		return nodeinstanceid;
	}
	public void setNodeinstanceid(String nodeinstanceid) {
		this.nodeinstanceid = nodeinstanceid;
	}
	public String getRemaindays() {
		return remaindays;
	}
	public void setRemaindays(String remaindays) {
		this.remaindays = remaindays;
	}
	public String getServname() {
		return servname;
	}
	public void setServname(String servname) {
		this.servname = servname;
	}
	public String getTachename() {
		return tachename;
	}
	public void setTachename(String tachename) {
		this.tachename = tachename;
	}
	public String getTaskinstanceid() {
		return taskinstanceid;
	}
	public void setTaskinstanceid(String taskinstanceid) {
		this.taskinstanceid = taskinstanceid;
	}
	public List<CaseMaterial> getCaseMaterials() {
		return caseMaterials;
	}
	public void setCaseMaterials(List<CaseMaterial> caseMaterials) {
		this.caseMaterials = caseMaterials;
	}
	public List<FlowInfo> getFlowInfos() {
		return flowInfos;
	}
	public void setFlowInfos(List<FlowInfo> flowInfos) {
		this.flowInfos = flowInfos;
	}
	public String getCaseapplydate() {
		return caseapplydate;
	}
	public void setCaseapplydate(String caseapplydate) {
		this.caseapplydate = caseapplydate;
	}
	public String getSurplusday() {
		return surplusday;
	}
	public void setSurplusday(String surplusday) {
		this.surplusday = surplusday;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getServcode() {
		return servcode;
	}
	public void setServcode(String servcode) {
		this.servcode = servcode;
	}
}
