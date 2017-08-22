package com.asiainfo.aigov.web.webservice.edot.work.bean;
/**
 * @author songxiaoliang
 * 咨询
 */
public class Consult {
	private String deptcode;//咨询部门编号
	private String deptname;//咨询部门名称
	private String mobile;//咨询人电话
	private String title;//咨询标题
	private String content;//咨询内容
	private String submitTime;//咨询提交时间
	private String receiver;//咨询人姓名
	
	private String id;//id 
	private String onlymark;//唯一标识
	private String replayContent;//回复内容
	private String replayTime;//回复时间
	private String replayUserName;//回复人姓名
	
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOnlymark() {
		return onlymark;
	}
	public void setOnlymark(String onlymark) {
		this.onlymark = onlymark;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReplayContent() {
		return replayContent;
	}
	public void setReplayContent(String replayContent) {
		this.replayContent = replayContent;
	}
	public String getReplayTime() {
		return replayTime;
	}
	public void setReplayTime(String replayTime) {
		this.replayTime = replayTime;
	}
	public String getReplayUserName() {
		return replayUserName;
	}
	public void setReplayUserName(String replayUserName) {
		this.replayUserName = replayUserName;
	}
}
