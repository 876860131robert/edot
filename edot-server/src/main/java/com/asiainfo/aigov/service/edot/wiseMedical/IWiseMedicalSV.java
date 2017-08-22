package com.asiainfo.aigov.service.edot.wiseMedical;

import java.util.List;

import com.asiainfo.aigov.web.vo.DeptListVo;
import com.asiainfo.aigov.web.vo.DiseaseListVo;
import com.asiainfo.aigov.web.vo.DoctorListVo;

public interface IWiseMedicalSV {

	public List<DeptListVo> getDepartList(
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info[] list, String extraCon)
			throws Exception;

	public List<DoctorListVo> getDoctorList(
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List[] list,
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List[] list2,
			String hospitalCode, String startDate, String endDate)
			throws Exception;
	
	public List<DiseaseListVo> getDiseaseList(
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List[] list)
			throws Exception;

	public List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info> getRegistHidList(
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info[] list) throws Exception;
	
}
