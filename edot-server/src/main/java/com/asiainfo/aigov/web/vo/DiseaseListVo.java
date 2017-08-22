package com.asiainfo.aigov.web.vo;

import java.util.List;

public class DiseaseListVo {

	private String diseaseId;

	private String name;

	private String description;

	private String cause;

	private String examine;

	private String feature;

	private String schedule;

	private String advice;
	
	private String causeUrl;

	private String scheduleUrl;

	private List<Result_List> result_List;

	public String getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(String diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getExamine() {
		return examine;
	}

	public void setExamine(String examine) {
		this.examine = examine;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getCauseUrl() {
		return causeUrl;
	}

	public void setCauseUrl(String causeUrl) {
		this.causeUrl = causeUrl;
	}

	public String getScheduleUrl() {
		return scheduleUrl;
	}

	public void setScheduleUrl(String scheduleUrl) {
		this.scheduleUrl = scheduleUrl;
	}
	
	public List<Result_List> getResult_List() {
		return result_List;
	}

	public void setResult_List(List<Result_List> resultList) {
		result_List = resultList;
	}

	public class Result_List {
		
		private String officeId;

		private String officeName;

		public String getOfficeId() {
			return officeId;
		}

		public void setOfficeId(String officeId) {
			this.officeId = officeId;
		}

		public String getOfficeName() {
			return officeName;
		}

		public void setOfficeName(String officeName) {
			this.officeName = officeName;
		}

	}
	
}
