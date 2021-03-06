package com.asiainfo.aigov.model.healthcare.schedule;

import java.math.BigDecimal;
import java.util.Date;

public class PublicDoctorSchedule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.HOSPITAL_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String hospitalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.SCHEDULE_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String scheduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.DEPT_CODE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String deptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.DEPT_NAME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.STANDARD_OFFICE_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String standardOfficeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.DOCTOR_CODE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String doctorCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.DOCTOR_NAME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String doctorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.MARK_TYPE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String markType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.MARK_DESC
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String markDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.HB_DATE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private Date hbDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.AM_PM
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String amPm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.LIMIT
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private Short limit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.SUM_FEE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private BigDecimal sumFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.CLINIC_FEE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private BigDecimal clinicFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.AVERAGE_MINUTE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String averageMinute;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.IS_STOPDIAGNOSTIC
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private String isStopdiagnostic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.USED
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private Short used;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.CREATE_TIME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_SCHEDULE.UPDATE_TIME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.HOSPITAL_ID
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.HOSPITAL_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getHospitalId() {
        return hospitalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.HOSPITAL_ID
     *
     * @param hospitalId the value for PUBLIC_DOCTOR_SCHEDULE.HOSPITAL_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.SCHEDULE_ID
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.SCHEDULE_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.SCHEDULE_ID
     *
     * @param scheduleId the value for PUBLIC_DOCTOR_SCHEDULE.SCHEDULE_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.DEPT_CODE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.DEPT_CODE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.DEPT_CODE
     *
     * @param deptCode the value for PUBLIC_DOCTOR_SCHEDULE.DEPT_CODE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.DEPT_NAME
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.DEPT_NAME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.DEPT_NAME
     *
     * @param deptName the value for PUBLIC_DOCTOR_SCHEDULE.DEPT_NAME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.STANDARD_OFFICE_ID
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.STANDARD_OFFICE_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getStandardOfficeId() {
        return standardOfficeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.STANDARD_OFFICE_ID
     *
     * @param standardOfficeId the value for PUBLIC_DOCTOR_SCHEDULE.STANDARD_OFFICE_ID
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setStandardOfficeId(String standardOfficeId) {
        this.standardOfficeId = standardOfficeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.DOCTOR_CODE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.DOCTOR_CODE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.DOCTOR_CODE
     *
     * @param doctorCode the value for PUBLIC_DOCTOR_SCHEDULE.DOCTOR_CODE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.DOCTOR_NAME
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.DOCTOR_NAME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.DOCTOR_NAME
     *
     * @param doctorName the value for PUBLIC_DOCTOR_SCHEDULE.DOCTOR_NAME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.MARK_TYPE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.MARK_TYPE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getMarkType() {
        return markType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.MARK_TYPE
     *
     * @param markType the value for PUBLIC_DOCTOR_SCHEDULE.MARK_TYPE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setMarkType(String markType) {
        this.markType = markType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.MARK_DESC
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.MARK_DESC
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getMarkDesc() {
        return markDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.MARK_DESC
     *
     * @param markDesc the value for PUBLIC_DOCTOR_SCHEDULE.MARK_DESC
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setMarkDesc(String markDesc) {
        this.markDesc = markDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.HB_DATE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.HB_DATE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public Date getHbDate() {
        return hbDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.HB_DATE
     *
     * @param hbDate the value for PUBLIC_DOCTOR_SCHEDULE.HB_DATE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setHbDate(Date hbDate) {
        this.hbDate = hbDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.AM_PM
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.AM_PM
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getAmPm() {
        return amPm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.AM_PM
     *
     * @param amPm the value for PUBLIC_DOCTOR_SCHEDULE.AM_PM
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setAmPm(String amPm) {
        this.amPm = amPm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.LIMIT
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.LIMIT
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public Short getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.LIMIT
     *
     * @param limit the value for PUBLIC_DOCTOR_SCHEDULE.LIMIT
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setLimit(Short limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.SUM_FEE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.SUM_FEE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public BigDecimal getSumFee() {
        return sumFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.SUM_FEE
     *
     * @param sumFee the value for PUBLIC_DOCTOR_SCHEDULE.SUM_FEE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setSumFee(BigDecimal sumFee) {
        this.sumFee = sumFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.CLINIC_FEE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.CLINIC_FEE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public BigDecimal getClinicFee() {
        return clinicFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.CLINIC_FEE
     *
     * @param clinicFee the value for PUBLIC_DOCTOR_SCHEDULE.CLINIC_FEE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setClinicFee(BigDecimal clinicFee) {
        this.clinicFee = clinicFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.AVERAGE_MINUTE
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.AVERAGE_MINUTE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getAverageMinute() {
        return averageMinute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.AVERAGE_MINUTE
     *
     * @param averageMinute the value for PUBLIC_DOCTOR_SCHEDULE.AVERAGE_MINUTE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setAverageMinute(String averageMinute) {
        this.averageMinute = averageMinute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.IS_STOPDIAGNOSTIC
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.IS_STOPDIAGNOSTIC
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public String getIsStopdiagnostic() {
        return isStopdiagnostic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.IS_STOPDIAGNOSTIC
     *
     * @param isStopdiagnostic the value for PUBLIC_DOCTOR_SCHEDULE.IS_STOPDIAGNOSTIC
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setIsStopdiagnostic(String isStopdiagnostic) {
        this.isStopdiagnostic = isStopdiagnostic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.USED
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.USED
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public Short getUsed() {
        return used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.USED
     *
     * @param used the value for PUBLIC_DOCTOR_SCHEDULE.USED
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setUsed(Short used) {
        this.used = used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.CREATE_TIME
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.CREATE_TIME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.CREATE_TIME
     *
     * @param createTime the value for PUBLIC_DOCTOR_SCHEDULE.CREATE_TIME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_SCHEDULE.UPDATE_TIME
     *
     * @return the value of PUBLIC_DOCTOR_SCHEDULE.UPDATE_TIME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_SCHEDULE.UPDATE_TIME
     *
     * @param updateTime the value for PUBLIC_DOCTOR_SCHEDULE.UPDATE_TIME
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_DOCTOR_SCHEDULE
     *
     * @mbggenerated Fri Apr 21 09:58:33 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", deptName=").append(deptName);
        sb.append(", standardOfficeId=").append(standardOfficeId);
        sb.append(", doctorCode=").append(doctorCode);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", markType=").append(markType);
        sb.append(", markDesc=").append(markDesc);
        sb.append(", hbDate=").append(hbDate);
        sb.append(", amPm=").append(amPm);
        sb.append(", limit=").append(limit);
        sb.append(", sumFee=").append(sumFee);
        sb.append(", clinicFee=").append(clinicFee);
        sb.append(", averageMinute=").append(averageMinute);
        sb.append(", isStopdiagnostic=").append(isStopdiagnostic);
        sb.append(", used=").append(used);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}