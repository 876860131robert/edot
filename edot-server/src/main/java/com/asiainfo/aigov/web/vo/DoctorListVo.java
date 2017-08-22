package com.asiainfo.aigov.web.vo;

import java.util.List;

public class DoctorListVo {
	
	private String doctor_Id;

	private String doctor_Img;

	private String doctor_Code;

	private String doctor_Name;

	private String mark_Type;

	private String mark_Desc;
	
	private String attentionId;

	private List<Regist_Info> regist_List;
	
	public String getDoctor_Id() {
		return doctor_Id;
	}

	public void setDoctor_Id(String doctorId) {
		doctor_Id = doctorId;
	}

	public String getDoctor_Img() {
		return doctor_Img;
	}

	public void setDoctor_Img(String doctorImg) {
		doctor_Img = doctorImg;
	}

	public String getDoctor_Code() {
		return doctor_Code;
	}

	public void setDoctor_Code(String doctorCode) {
		doctor_Code = doctorCode;
	}

	public String getDoctor_Name() {
		return doctor_Name;
	}

	public void setDoctor_Name(String doctorName) {
		doctor_Name = doctorName;
	}

	public String getMark_Type() {
		return mark_Type;
	}

	public void setMark_Type(String markType) {
		mark_Type = markType;
	}

	public String getMark_Desc() {
		return mark_Desc;
	}

	public void setMark_Desc(String markDesc) {
		mark_Desc = markDesc;
	}

	public String getAttentionId() {
		return attentionId;
	}

	public void setAttentionId(String attentionId) {
		this.attentionId = attentionId;
	}

	public List<Regist_Info> getRegist_List() {
		return regist_List;
	}

	public void setRegist_List(List<Regist_Info> registList) {
		regist_List = registList;
	}

	public class Regist_Info {
		
		private String sum_Fee;
		
		private String clinic_Fee;
		
		private String hb_Date;

		private String am_Pm;

		private String flag_Available;

		public String getSum_Fee() {
			return sum_Fee;
		}

		public void setSum_Fee(String sumFee) {
			sum_Fee = sumFee;
		}

		public String getClinic_Fee() {
			return clinic_Fee;
		}

		public void setClinic_Fee(String clinicFee) {
			clinic_Fee = clinicFee;
		}

		public String getHb_Date() {
			return hb_Date;
		}

		public void setHb_Date(String hbDate) {
			hb_Date = hbDate;
		}

		public String getAm_Pm() {
			return am_Pm;
		}

		public void setAm_Pm(String amPm) {
			am_Pm = amPm;
		}

		public String getFlag_Available() {
			return flag_Available;
		}

		public void setFlag_Available(String flagAvailable) {
			flag_Available = flagAvailable;
		}

	}
	
}
