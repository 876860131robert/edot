package com.asiainfo.aigov.web.http.edot.userService.bean;

import java.io.Serializable;

import com.asiainfo.frame.bo.IUser;

public class UserInfo implements IUser, Serializable {
	
	private static final long serialVersionUID = 2809425998912641016L;

	private String idCardNo;

	private String birthday;

	private String passwd;

	private String sex;

	private String remark;

	private String acctSecurityLevel;

	private String idCardExpire;

	private String addressProvinceArea;

	private String addressCounty;

	private String healthNo;

	private int figureId;

	private String userType;

	private String creator;

	private String addressCountyArea;

	private String created;

	private String userId;

	private String addressTown;

	private String userName;

	private String addressProvince;

	private String userPhotoName;

	private String addressCity;

	private String status;

	private String addressVillageArea;

	private int marriage;

	private int deleted;

	private String modified;

	private String addressCityArea;

	private int isForever;

	private String modifier;

	private String phoneNo;

	private int idCardLife;

	private String bloodType;

	private String addressTownArea;

	private int isAuth;

	private String address;

	private String doctorId;

	private String email;

	private String realName;

	private String registType;

	private String addressVillage;

	private String registTime;

	private String cardNum;

	private String orgName;

	private String orgCode;

	public String getIdCardNo() {
		if("\"null\"".equals(idCardNo)){
			return "";
		}
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAcctSecurityLevel() {
		return acctSecurityLevel;
	}

	public void setAcctSecurityLevel(String acctSecurityLevel) {
		this.acctSecurityLevel = acctSecurityLevel;
	}

	public String getIdCardExpire() {
		return idCardExpire;
	}

	public void setIdCardExpire(String idCardExpire) {
		this.idCardExpire = idCardExpire;
	}

	public String getAddressProvinceArea() {
		return addressProvinceArea;
	}

	public void setAddressProvinceArea(String addressProvinceArea) {
		this.addressProvinceArea = addressProvinceArea;
	}

	public String getAddressCounty() {
		return addressCounty;
	}

	public void setAddressCounty(String addressCounty) {
		this.addressCounty = addressCounty;
	}

	public String getHealthNo() {
		return healthNo;
	}

	public void setHealthNo(String healthNo) {
		this.healthNo = healthNo;
	}

	public int getFigureId() {
		return figureId;
	}

	public void setFigureId(int figureId) {
		this.figureId = figureId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getAddressCountyArea() {
		return addressCountyArea;
	}

	public void setAddressCountyArea(String addressCountyArea) {
		this.addressCountyArea = addressCountyArea;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddressTown() {
		return addressTown;
	}

	public void setAddressTown(String addressTown) {
		this.addressTown = addressTown;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddressProvince() {
		return addressProvince;
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}

	public String getUserPhotoName() {
		return userPhotoName;
	}

	public void setUserPhotoName(String userPhotoName) {
		this.userPhotoName = userPhotoName;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddressVillageArea() {
		return addressVillageArea;
	}

	public void setAddressVillageArea(String addressVillageArea) {
		this.addressVillageArea = addressVillageArea;
	}

	public int getMarriage() {
		return marriage;
	}

	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getAddressCityArea() {
		return addressCityArea;
	}

	public void setAddressCityArea(String addressCityArea) {
		this.addressCityArea = addressCityArea;
	}

	public int getIsForever() {
		return isForever;
	}

	public void setIsForever(int isForever) {
		this.isForever = isForever;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getIdCardLife() {
		return idCardLife;
	}

	public void setIdCardLife(int idCardLife) {
		this.idCardLife = idCardLife;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAddressTownArea() {
		return addressTownArea;
	}

	public void setAddressTownArea(String addressTownArea) {
		this.addressTownArea = addressTownArea;
	}

	public int getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(int isAuth) {
		this.isAuth = isAuth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		if("\"null\"".equals(realName)){
			return phoneNo;
		}
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRegistType() {
		return registType;
	}

	public void setRegistType(String registType) {
		this.registType = registType;
	}

	public String getAddressVillage() {
		return addressVillage;
	}

	public void setAddressVillage(String addressVillage) {
		this.addressVillage = addressVillage;
	}

	public String getRegistTime() {
		return registTime;
	}

	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	
}
