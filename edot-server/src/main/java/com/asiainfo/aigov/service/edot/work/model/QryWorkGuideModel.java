package com.asiainfo.aigov.service.edot.work.model;

import java.util.Date;

import com.asiainfo.aigov.model.edot.work.WorkGuide;

public class QryWorkGuideModel extends WorkGuide {
	private String userWorkNo;
	private String userId;
	private Date createTime;
	private String status;
	private String statusName;
	private String readStatus;
	public String getUserWorkNo() {
		return userWorkNo;
	}
	public void setUserWorkNo(String userWorkNo) {
		this.userWorkNo = userWorkNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}
}
