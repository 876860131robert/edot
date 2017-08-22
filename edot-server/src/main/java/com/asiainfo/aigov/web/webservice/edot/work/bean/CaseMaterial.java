package com.asiainfo.aigov.web.webservice.edot.work.bean;
/**
 * @author songxiaoliang
 * 用户提交的办件材料
 */
public class CaseMaterial {
	private String caseno;//办件编号
	private String ischeck;//是否验证
	private String materialname;//材料名称
	private String materialno;//材料编号
	private String servno;//所属事项编号
	
	public String getCaseno() {
		return caseno;
	}
	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}
	public String getIscheck() {
		return ischeck;
	}
	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	public String getMaterialno() {
		return materialno;
	}
	public void setMaterialno(String materialno) {
		this.materialno = materialno;
	}
	public String getServno() {
		return servno;
	}
	public void setServno(String servno) {
		this.servno = servno;
	}
	
}
