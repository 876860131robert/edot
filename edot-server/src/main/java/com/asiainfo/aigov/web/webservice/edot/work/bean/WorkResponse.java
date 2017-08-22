package com.asiainfo.aigov.web.webservice.edot.work.bean;
/**
 * @author songxiaoliang
 */
public class WorkResponse {
	private String datasize;//数据长度，当type为list，返回list大小
	private String valid;	//是否有效  1有效返回  -1无效返回（无返回数据）
	private String pagesize;//分页大小，提供分页的接口有效
	private String page;	//分页号，提供分页的接口有效
	private String type;	//数据类型，list 列表数据，pojo，对象数据
	private String data;	//业务数据
	private String matedata;//业务数据
	private String subdata;//业务数据
	private String prodata;	//业务数据
	private String processsize;
	private String subdatavalid;
	private String matesize;
	private String message;
	
	public boolean isSuccess(){
		return "1".equals(valid) ? true : false;
	}
	
	public String getDatasize() {
		return datasize;
	}
	public void setDatasize(String datasize) {
		this.datasize = datasize;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMatedata() {
		return matedata;
	}

	public void setMatedata(String matedata) {
		this.matedata = matedata;
	}

	public String getProdata() {
		return prodata;
	}

	public void setProdata(String prodata) {
		this.prodata = prodata;
	}

	public String getProcesssize() {
		return processsize;
	}

	public void setProcesssize(String processsize) {
		this.processsize = processsize;
	}

	public String getSubdatavalid() {
		return subdatavalid;
	}

	public void setSubdatavalid(String subdatavalid) {
		this.subdatavalid = subdatavalid;
	}

	public String getMatesize() {
		return matesize;
	}

	public void setMatesize(String matesize) {
		this.matesize = matesize;
	}

	public String getSubdata() {
		return subdata;
	}

	public void setSubdata(String subdata) {
		this.subdata = subdata;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
