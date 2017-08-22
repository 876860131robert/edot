package com.asiainfo.aigov.service.edot.wiseMedical.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.aigov.service.edot.wiseMedical.IWiseMedicalSV;
import com.asiainfo.aigov.web.vo.DeptListVo;
import com.asiainfo.aigov.web.vo.DiseaseListVo;
import com.asiainfo.aigov.web.vo.DoctorListVo;
import com.asiainfo.aigov.web.vo.DoctorListVo.Regist_Info;
import com.asiainfo.aigov.web.webservice.edot.mpsService.api.MpsServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.api.WiseMedicalServiceAPI;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.DateUtils;
import com.asiainfo.frame.utils.PinYinUtils;

@Service
@Transactional
public class WiseMedicalSVImpl implements IWiseMedicalSV {

	public List<DeptListVo> getDepartList(
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info[] list, String extraCon)
			throws Exception {
		//将科室名称按字典排序
		Collections.sort(Arrays.asList(list), new Comparator<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>() {

			public int compare(
					com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info o1,
					com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info o2) {
				String s1 = PinYinUtils.getPingYin(o1.getDept_Name());
				String s2 = PinYinUtils.getPingYin(o2.getDept_Name());
				String[] s = new String[]{s1, s2};
				Arrays.sort(s);
				if(s[0].equals(s1)){
					return -1;
				} else {
					return 1;
				}
			}
			
		});
		//按首字母分组
		TreeMap<String, List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>> map = new TreeMap<String, List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>>();
		for (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info s : list) {
			String firstString = Character.toString(Character.toUpperCase(PinYinUtils.getFirstSpell(s.getDept_Name()).charAt(0)));
			List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info> departList = map.get(firstString);
			if(departList == null){
				departList = new ArrayList<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>();
				departList.add(s);
				map.put(firstString, departList);
			} else {
				departList.add(s);
			}
		}
		//封装成前端格式
		List<DeptListVo> list2 = new ArrayList<DeptListVo>();
		Iterator<Map.Entry<String, List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>>> it = map.entrySet().iterator();
        while(it.hasNext()){
			Map.Entry<String, List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>> entry = (Map.Entry<String, List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>>) it
					.next();
            String key = entry.getKey();
            List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info> value = entry.getValue();
            if(StringUtils.isNotEmpty(extraCon)){
            	List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info> value2 = new ArrayList<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info>();
            	for (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Record_Info record_Info : value) {
					if(record_Info.getDept_Name().contains(extraCon)){
						value2.add(record_Info);
					}
				}
            	if(value2.size() > 0){
            		DeptListVo deptListVo = new DeptListVo();
                    deptListVo.setLetterName(key);
            		deptListVo.setDepartList(value2);
                    list2.add(deptListVo);
            	}
            } else {
            	DeptListVo deptListVo = new DeptListVo();
                deptListVo.setLetterName(key);
                deptListVo.setDepartList(value);
                list2.add(deptListVo);
            }
        }
		return list2;
	}

	public List<DoctorListVo> getDoctorList(
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List[] list,
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List[] list2,
			String hospitalCode, String startDate, String endDate)
			throws Exception {
		//处理我的关注
		Map<String, String> map = new HashMap<String, String>();
		if(list != null && list.length > 0){
			for (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List resultInfo : list) {
				map.put(resultInfo.getDoctorId(), resultInfo.getAttentionId());
			}
		}
		
		List<DoctorListVo> doctorList = new ArrayList<DoctorListVo>();
		if(list2 != null && list2.length > 0){
			for (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List resultInfo : list2) {
				//可预约医生查询
				com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.req.Request req = new com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.req.Request();
			    req.setHospital_Mark(hospitalCode);
			    req.setServiceName("queryAppointDoctor");
			    req.setDept_Code(resultInfo.getOfficeCode());
			    req.setDoctor_Code(resultInfo.getDoctorCode());
			    req.setDoctor_Name(resultInfo.getName());
			    req.setAppoint_Start_Date(startDate);
			    req.setAppoint_End_Date(endDate);
			    req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
				req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
				req.setToken(AppPropertyUtil.getProperty("TOKEN"));
				com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.rsp.Response rsp = MpsServiceAPI.queryAppointDoctor(req);
				
				//只返回有可预约号源的医生
				if("0000".equals(rsp.getResult_Code())){
					DoctorListVo doctorListVo = new DoctorListVo();
					doctorListVo.setDoctor_Id(resultInfo.getDoctorId());
					doctorListVo.setDoctor_Img(resultInfo.getDoctorImg());
					doctorListVo.setDoctor_Code(resultInfo.getDoctorCode());
					doctorListVo.setDoctor_Name(resultInfo.getName());
					doctorListVo.setMark_Type(resultInfo.getNoType());
					doctorListVo.setMark_Desc(resultInfo.getSpecaility());
					doctorListVo.setAttentionId(map.get(resultInfo.getDoctorId()));
					
					List<Regist_Info> registList = new ArrayList<Regist_Info>();
					if(rsp.getResult_Data() != null && rsp.getResult_Data().getRecord_List() != null){
						com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.rsp.Record_Info[] recordList = rsp.getResult_Data().getRecord_List().getRecord_Info();
						if(recordList != null && recordList.length > 0){
							Date now = new Date();
							for (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.rsp.Record_Info recordInfo : recordList) {
								Regist_Info registInfo = doctorListVo.new Regist_Info();
								
								String hbDate = recordInfo.getHb_Date();
								String amPm = recordInfo.getAm_Pm();
								String dateStr = hbDate;
								if(amPm.endsWith("上午")){
									dateStr += " 12:00:00";
								} else if(amPm.endsWith("下午")){
									dateStr += " 24:00:00";
								}
								Date date = DateUtils.getDate(dateStr, "yyyy-MM-dd HH:mm:ss");
								//判断当前时间是否已超过
								if(now.after(date)){
									continue;
								}
								registInfo.setSum_Fee(recordInfo.getSum_Fee());
								registInfo.setClinic_Fee(recordInfo.getClinic_Fee());
								registInfo.setHb_Date(hbDate);
								registInfo.setAm_Pm(amPm);
								registInfo.setFlag_Available(recordInfo.getFlag_Available());
								registList.add(registInfo);
							}
						}
					}
					
					doctorListVo.setRegist_List(registList);
					doctorList.add(doctorListVo);
				}
			}
		}
		return doctorList;
	}

	public List<DiseaseListVo> getDiseaseList(
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List[] list)
			throws Exception {
		List<DiseaseListVo> list2 = new ArrayList<DiseaseListVo>();
		for (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List result_List : list) {
			DiseaseListVo diseaseListVo = new DiseaseListVo();
			diseaseListVo.setDiseaseId(result_List.getDiseaseId());
			diseaseListVo.setName(result_List.getName());
			diseaseListVo.setDescription(result_List.getDescription());
			diseaseListVo.setCause(result_List.getCause());
			diseaseListVo.setExamine(result_List.getExamine());
			diseaseListVo.setFeature(result_List.getFeature());
			diseaseListVo.setSchedule(result_List.getSchedule());
			diseaseListVo.setAdvice(result_List.getAdvice());
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list[] office_listList = result_List.getOffice_list();
			List<com.asiainfo.aigov.web.vo.DiseaseListVo.Result_List> result_list2List = new ArrayList<com.asiainfo.aigov.web.vo.DiseaseListVo.Result_List>();
			for (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list office_list : office_listList) {
				com.asiainfo.aigov.web.vo.DiseaseListVo.Result_List result_List2 = diseaseListVo.new Result_List();
				result_List2.setOfficeId(office_list.getOfficeId());
				result_List2.setOfficeName(office_list.getOfficeName());
				result_list2List.add(result_List2);
			}
			diseaseListVo.setResult_List(result_list2List);
			
			//病因查询
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5005.req.Request req = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5005.req.Request();
			req.setNewsId(diseaseListVo.getCause());
			req.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
			req.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
			req.setToken(AppPropertyUtil.getProperty("TOKEN"));
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5005.rsp.Response rsp = WiseMedicalServiceAPI.queryCauseDisease(req);
			diseaseListVo.setCauseUrl(rsp.getRecord().getUrl());
			
			//治疗方案
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5006.req.Request req2 = new com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5006.req.Request();
			req2.setNewsId(diseaseListVo.getSchedule());
			req2.setSysType(AppPropertyUtil.getProperty("SYS_TYPE"));
			req2.setConsumer(AppPropertyUtil.getProperty("CONSUMER"));
			req2.setToken(AppPropertyUtil.getProperty("TOKEN"));
			com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5006.rsp.Response rsp2 = WiseMedicalServiceAPI.querySchedule(req2);
			diseaseListVo.setScheduleUrl(rsp2.getRecord().getUrl());
			
			list2.add(diseaseListVo);
		}
		return list2;
	}
	
	public List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info> getRegistHidList(
			com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info[] list) throws Exception {
		List<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info> record_InfoList = new ArrayList<com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info>();
		if(list != null && list.length > 0){
			Calendar calendar = new GregorianCalendar();
			for (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Record_Info record_Info : list) {
				String hbDate = record_Info.getHb_Date();
				String amPm = record_Info.getAm_Pm();
				int curHour = calendar.get(Calendar.HOUR_OF_DAY);
				String today = DateUtils.getDateString("yyyy-MM-dd");
				//下午不能挂上午的号
				if(today.equals(hbDate) && curHour >= 12 && amPm.endsWith("上午")){
					continue;
				} else {
					record_InfoList.add(record_Info);
				}
			}
		}
		return record_InfoList;
	}

}
