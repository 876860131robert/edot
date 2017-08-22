package com.asiainfo.aigov.web.http.edot.HotLineService.bean;

public class ReqBean {

	private int model_id;//1：市长信箱；4：部门信箱；5：在线咨询；9：掌上信访；
	
	private int me_id = 0;//默认0
	
	private String do_dept;//收件部门id：市长信箱、部门信箱71；掌上信访34
	
	private String submit_name;//业务名称市长或者部门信箱
	
	private String sq_atta_name = "";//默认空
	
	private String sq_atta_path = "";//默认空
	
	private String action_type = "insertSQ";//默认insertSQ
	
	private int pur_id = 0;//默认0
	
	private String sq_title;//信件标题
	
	private String sq_content;//信件内容
	
	private String sq_realname;//真实名称
	
	private int sq_sex;//性别：女0；男1
	
	private String sq_phone;//电话
	
	private String sq_address;//地址
	
	private int is_open;//是否公开：不公开0；公开1

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int modelId) {
		model_id = modelId;
	}

	public String getDo_dept() {
		return do_dept;
	}

	public void setDo_dept(String doDept) {
		do_dept = doDept;
	}

	public String getSubmit_name() {
		return submit_name;
	}

	public void setSubmit_name(String submitName) {
		submit_name = submitName;
	}

	public String getSq_title() {
		return sq_title;
	}

	public void setSq_title(String sqTitle) {
		sq_title = sqTitle;
	}

	public String getSq_content() {
		return sq_content;
	}

	public void setSq_content(String sqContent) {
		sq_content = sqContent;
	}

	public String getSq_realname() {
		return sq_realname;
	}

	public void setSq_realname(String sqRealname) {
		sq_realname = sqRealname;
	}

	public int getSq_sex() {
		return sq_sex;
	}

	public void setSq_sex(int sqSex) {
		sq_sex = sqSex;
	}

	public String getSq_phone() {
		return sq_phone;
	}

	public void setSq_phone(String sqPhone) {
		sq_phone = sqPhone;
	}

	public String getSq_address() {
		return sq_address;
	}

	public void setSq_address(String sqAddress) {
		sq_address = sqAddress;
	}

	public int getIs_open() {
		return is_open;
	}

	public void setIs_open(int isOpen) {
		is_open = isOpen;
	}

	public int getMe_id() {
		return me_id;
	}

	public String getSq_atta_name() {
		return sq_atta_name;
	}

	public String getSq_atta_path() {
		return sq_atta_path;
	}

	public String getAction_type() {
		return action_type;
	}

	public int getPur_id() {
		return pur_id;
	}

}
