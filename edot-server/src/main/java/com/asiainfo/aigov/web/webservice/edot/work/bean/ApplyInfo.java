package com.asiainfo.aigov.web.webservice.edot.work.bean;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户办事申请
 * @author songxiaoliang
 */
public class ApplyInfo {
	private String netcaseapplicant;//个人/企业名称(必填)
	private String netcaseapplicanttype;//申报类型：个人、企业(必填)
	private String netcaseapplicantpapertype;//证件类型：身份证、组织机关代码(必填)
	private String netcaseapplicantpapercode;//证件号码(必填)
	private String netcaseapplicantphone;//申报人电话
	private String netcaseapplicantmobile;//手机号码(必填)
	private String netcaseapplicantaddress;//联系地址
	private String netcaseapplicantzipcode;//邮政编码
	private String netcaseapplicantemail;//电子邮箱
	private String loginName;//登陆用户名（如果不登录申报，直接给手机号）(必填)
	private String servno;//事项编号(必填)

	private List<ApplyMaterialInfo> mateList = new ArrayList<ApplyMaterialInfo>();

	private static Map<String,String> sblx;
	public static Map<String,String> getSblx(){
		if(sblx==null){
			sblx = new LinkedHashMap<String, String>();
			sblx.put("身份证", "身份证");
			sblx.put("组织机构代码", "组织机构代码");
			sblx.put("护照", "护照");
			sblx.put("回乡证", "回乡证");
			sblx.put("居住证", "居住证");
			sblx.put("军官证", "军官证");
			sblx.put("特区护照", "特区护照");
			sblx.put("通行证", "通行证");
			sblx.put("台胞证", "台胞证");
			sblx.put("营业执照", "营业执照");
			sblx.put("注册证书", "注册证书");
			sblx.put("其他", "其他");
		}
		return sblx;
	}
	
	
	public String getNetcaseapplicant() {
		return netcaseapplicant;
	}

	public void setNetcaseapplicant(String netcaseapplicant) {
		this.netcaseapplicant = netcaseapplicant;
	}

	public String getNetcaseapplicanttype() {
		return netcaseapplicanttype;
	}

	public void setNetcaseapplicanttype(String netcaseapplicanttype) {
		this.netcaseapplicanttype = netcaseapplicanttype;
	}

	public String getNetcaseapplicantpapertype() {
		return netcaseapplicantpapertype;
	}

	public void setNetcaseapplicantpapertype(String netcaseapplicantpapertype) {
		this.netcaseapplicantpapertype = netcaseapplicantpapertype;
	}

	public String getNetcaseapplicantpapercode() {
		return netcaseapplicantpapercode;
	}

	public void setNetcaseapplicantpapercode(String netcaseapplicantpapercode) {
		this.netcaseapplicantpapercode = netcaseapplicantpapercode;
	}

	public String getNetcaseapplicantphone() {
		return netcaseapplicantphone;
	}

	public void setNetcaseapplicantphone(String netcaseapplicantphone) {
		this.netcaseapplicantphone = netcaseapplicantphone;
	}

	public String getNetcaseapplicantmobile() {
		return netcaseapplicantmobile;
	}

	public void setNetcaseapplicantmobile(String netcaseapplicantmobile) {
		this.netcaseapplicantmobile = netcaseapplicantmobile;
	}

	public String getNetcaseapplicantaddress() {
		return netcaseapplicantaddress;
	}

	public void setNetcaseapplicantaddress(String netcaseapplicantaddress) {
		this.netcaseapplicantaddress = netcaseapplicantaddress;
	}

	public String getNetcaseapplicantzipcode() {
		return netcaseapplicantzipcode;
	}

	public void setNetcaseapplicantzipcode(String netcaseapplicantzipcode) {
		this.netcaseapplicantzipcode = netcaseapplicantzipcode;
	}

	public String getNetcaseapplicantemail() {
		return netcaseapplicantemail;
	}

	public void setNetcaseapplicantemail(String netcaseapplicantemail) {
		this.netcaseapplicantemail = netcaseapplicantemail;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getServno() {
		return servno;
	}

	public void setServno(String servno) {
		this.servno = servno;
	}

	public List<ApplyMaterialInfo> getMateList() {
		return mateList;
	}

	public void setMateList(List<ApplyMaterialInfo> mateList) {
		this.mateList = mateList;
	}
	
}
