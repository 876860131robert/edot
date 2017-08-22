package com.asiainfo.aigov.web.http.edot.userService.bean;

import java.util.List;

public class GjjBean {

	private Datainfo datainfo;
	
	private List<Data> datasets;
	
	public Datainfo getDatainfo() {
		return datainfo;
	}

	public void setDatainfo(Datainfo datainfo) {
		this.datainfo = datainfo;
	}

	public List<Data> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<Data> datasets) {
		this.datasets = datasets;
	}

	public class Datainfo {
		
		private String dealtime;
		
		private String datacount;
		
		private String serviceid;

		public String getDealtime() {
			return dealtime;
		}

		public void setDealtime(String dealtime) {
			this.dealtime = dealtime;
		}

		public String getDatacount() {
			return datacount;
		}

		public void setDatacount(String datacount) {
			this.datacount = datacount;
		}

		public String getServiceid() {
			return serviceid;
		}

		public void setServiceid(String serviceid) {
			this.serviceid = serviceid;
		}
		
	}
	
	public class Data {
		
		private String ID;
		
        private String COMPANY;
        
        private String COMPANY_CODE;
        
        private String NAME;
        
        private String CODE;
        
        private String MONTH_ADD;
        
        private String SUM;
        
        private String UP_TO_DATE;
        
        private String STATUS;

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getCOMPANY() {
			return COMPANY;
		}

		public void setCOMPANY(String cOMPANY) {
			COMPANY = cOMPANY;
		}

		public String getCOMPANY_CODE() {
			return COMPANY_CODE;
		}

		public void setCOMPANY_CODE(String cOMPANYCODE) {
			COMPANY_CODE = cOMPANYCODE;
		}

		public String getNAME() {
			return NAME;
		}

		public void setNAME(String nAME) {
			NAME = nAME;
		}

		public String getCODE() {
			return CODE;
		}

		public void setCODE(String cODE) {
			CODE = cODE;
		}

		public String getMONTH_ADD() {
			return MONTH_ADD;
		}

		public void setMONTH_ADD(String mONTHADD) {
			MONTH_ADD = mONTHADD;
		}

		public String getSUM() {
			return SUM;
		}

		public void setSUM(String sUM) {
			SUM = sUM;
		}

		public String getUP_TO_DATE() {
			return UP_TO_DATE;
		}

		public void setUP_TO_DATE(String uPTODATE) {
			UP_TO_DATE = uPTODATE;
		}

		public String getSTATUS() {
			return STATUS;
		}

		public void setSTATUS(String sTATUS) {
			STATUS = sTATUS;
		}
        
	}
	
}
