package com.asiainfo.aigov.web.http.edot.HotLineService.bean;

import java.io.Serializable;

/**
 * 公开信箱列表
 * 
 * @author pany
 */
public class SQList implements Serializable{

	private static final long serialVersionUID = 1L;

	private int		sq_id;

	private String	sq_title2;

	private int		model_id;

	private String	model_cname;

	private int		sq_status;

	private String	sq_status_name;

	private String	sq_dtime;

	public int getSq_id() {
		return sq_id;
	}

	public void setSq_id(int sq_id) {
		this.sq_id = sq_id;
	}

	public String getSq_title2() {
		return sq_title2;
	}

	public void setSq_title2(String sq_title2) {
		this.sq_title2 = sq_title2;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

	public String getModel_cname() {
		return model_cname;
	}

	public void setModel_cname(String model_cname) {
		this.model_cname = model_cname;
	}

	public int getSq_status() {
		return sq_status;
	}

	public void setSq_status(int sq_status) {
		this.sq_status = sq_status;
	}

	public String getSq_status_name() {
		return sq_status_name;
	}

	public void setSq_status_name(String sq_status_name) {
		this.sq_status_name = sq_status_name;
	}

	public String getSq_dtime() {
		return sq_dtime;
	}

	public void setSq_dtime(String sq_dtime) {
		this.sq_dtime = sq_dtime;
	}

}
