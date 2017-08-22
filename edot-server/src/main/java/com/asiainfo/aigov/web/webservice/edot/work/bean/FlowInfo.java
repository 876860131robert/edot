package com.asiainfo.aigov.web.webservice.edot.work.bean;
/**
 * @author songxiaoliang
 * 流程数据
 */
public class FlowInfo {
	private String caseno;//办件编号
	private String nodecontent;//环节内容(意见、不通过原因等)
	private String nodeenddate;//环节结束日期
	private String nodename;//环节名称
	private String nodestartdate;//环节开始日期
	private String nodestatus;//环节状态
	private String opuser;//操作人
	
	public String getCaseno() {
		return caseno;
	}
	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}
	public String getNodecontent() {
		return nodecontent;
	}
	public void setNodecontent(String nodecontent) {
		this.nodecontent = nodecontent;
	}
	public String getNodeenddate() {
		return nodeenddate;
	}
	public void setNodeenddate(String nodeenddate) {
		this.nodeenddate = nodeenddate;
	}
	public String getNodename() {
		return nodename;
	}
	public void setNodename(String nodename) {
		this.nodename = nodename;
	}
	public String getNodestartdate() {
		return nodestartdate;
	}
	public void setNodestartdate(String nodestartdate) {
		this.nodestartdate = nodestartdate;
	}
	public String getNodestatus() {
		return nodestatus;
	}
	public void setNodestatus(String nodestatus) {
		this.nodestatus = nodestatus;
	}
	public String getOpuser() {
		return opuser;
	}
	public void setOpuser(String opuser) {
		this.opuser = opuser;
	}
}
