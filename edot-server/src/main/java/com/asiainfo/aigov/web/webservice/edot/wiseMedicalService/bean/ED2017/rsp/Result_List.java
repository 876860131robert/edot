/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

import org.apache.commons.lang3.StringUtils;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Result_List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _id;

    private java.lang.String _orderId;

    private java.lang.String _patientId;

    private java.lang.String _orderTime;

    private java.lang.String _orderType;

    private java.lang.String _attendCardNum;

    private java.lang.String _orderFee;

    private java.lang.String _status;

    private java.lang.String _paymentMode;

    private java.lang.String _hid;

    private java.lang.String _amPm;

    private java.lang.String _operateType;

    private java.lang.String _userId;

    private java.lang.String _evaluateStatus;

    private java.lang.String _hospitalCode;

    private java.lang.String _officeCode;

    private java.lang.String _sourceType;

    private java.lang.String _appointNo;

    private java.lang.String _appTime;

    private java.lang.String _hisPatientId;

    private java.lang.String _doctorCode;

    private java.lang.String _payStatus;

    private java.lang.String _visitStatus;

    private java.lang.String _resMsg;

    private java.lang.String _resCode;

    private java.lang.String _receiptNo;

    private java.lang.String _patientName;

    private java.lang.String _patientCertNo;

    private java.lang.String _hospitalName;

    private java.lang.String _officeName;

    private java.lang.String _doctorName;

    private java.lang.String _doctorLevel;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amPm'.
     * 
     * @return the value of field 'amPm'.
    **/
    public java.lang.String getAmPm()
    {
        return this._amPm;
    } //-- java.lang.String getAmPm() 

    /**
     * Returns the value of field 'appTime'.
     * 
     * @return the value of field 'appTime'.
    **/
    public java.lang.String getAppTime()
    {
        return this._appTime;
    } //-- java.lang.String getAppTime() 

    /**
     * Returns the value of field 'appointNo'.
     * 
     * @return the value of field 'appointNo'.
    **/
    public java.lang.String getAppointNo()
    {
        return this._appointNo;
    } //-- java.lang.String getAppointNo() 

    /**
     * Returns the value of field 'attendCardNum'.
     * 
     * @return the value of field 'attendCardNum'.
    **/
    public java.lang.String getAttendCardNum()
    {
        return this._attendCardNum;
    } //-- java.lang.String getAttendCardNum() 

    /**
     * Returns the value of field 'doctorCode'.
     * 
     * @return the value of field 'doctorCode'.
    **/
    public java.lang.String getDoctorCode()
    {
        return this._doctorCode;
    } //-- java.lang.String getDoctorCode() 

    /**
     * Returns the value of field 'doctorLevel'.
     * 
     * @return the value of field 'doctorLevel'.
    **/
    public java.lang.String getDoctorLevel()
    {
        return this._doctorLevel;
    } //-- java.lang.String getDoctorLevel() 

    /**
     * Returns the value of field 'doctorName'.
     * 
     * @return the value of field 'doctorName'.
    **/
    public java.lang.String getDoctorName()
    {
    	if(StringUtils.isNotEmpty(this._doctorName) && this._doctorName.length() > 0){
    		return StringUtils.rightPad(this._doctorName.substring(0, 1), this._doctorName.length(), "*");
    	}
    	return this._doctorName;
    } //-- java.lang.String getDoctorName() 

    /**
     * Returns the value of field 'evaluateStatus'.
     * 
     * @return the value of field 'evaluateStatus'.
    **/
    public java.lang.String getEvaluateStatus()
    {
        return this._evaluateStatus;
    } //-- java.lang.String getEvaluateStatus() 

    /**
     * Returns the value of field 'hid'.
     * 
     * @return the value of field 'hid'.
    **/
    public java.lang.String getHid()
    {
        return this._hid;
    } //-- java.lang.String getHid() 

    /**
     * Returns the value of field 'hisPatientId'.
     * 
     * @return the value of field 'hisPatientId'.
    **/
    public java.lang.String getHisPatientId()
    {
        return this._hisPatientId;
    } //-- java.lang.String getHisPatientId() 

    /**
     * Returns the value of field 'hospitalCode'.
     * 
     * @return the value of field 'hospitalCode'.
    **/
    public java.lang.String getHospitalCode()
    {
        return this._hospitalCode;
    } //-- java.lang.String getHospitalCode() 

    /**
     * Returns the value of field 'hospitalName'.
     * 
     * @return the value of field 'hospitalName'.
    **/
    public java.lang.String getHospitalName()
    {
        return this._hospitalName;
    } //-- java.lang.String getHospitalName() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'id'.
    **/
    public java.lang.String getId()
    {
        return this._id;
    } //-- java.lang.String getId() 

    /**
     * Returns the value of field 'officeCode'.
     * 
     * @return the value of field 'officeCode'.
    **/
    public java.lang.String getOfficeCode()
    {
        return this._officeCode;
    } //-- java.lang.String getOfficeCode() 

    /**
     * Returns the value of field 'officeName'.
     * 
     * @return the value of field 'officeName'.
    **/
    public java.lang.String getOfficeName()
    {
        return this._officeName;
    } //-- java.lang.String getOfficeName() 

    /**
     * Returns the value of field 'operateType'.
     * 
     * @return the value of field 'operateType'.
    **/
    public java.lang.String getOperateType()
    {
        return this._operateType;
    } //-- java.lang.String getOperateType() 

    /**
     * Returns the value of field 'orderFee'.
     * 
     * @return the value of field 'orderFee'.
    **/
    public java.lang.String getOrderFee()
    {
        return this._orderFee;
    } //-- java.lang.String getOrderFee() 

    /**
     * Returns the value of field 'orderId'.
     * 
     * @return the value of field 'orderId'.
    **/
    public java.lang.String getOrderId()
    {
        return this._orderId;
    } //-- java.lang.String getOrderId() 

    /**
     * Returns the value of field 'orderTime'.
     * 
     * @return the value of field 'orderTime'.
    **/
    public java.lang.String getOrderTime()
    {
        return this._orderTime;
    } //-- java.lang.String getOrderTime() 

    /**
     * Returns the value of field 'orderType'.
     * 
     * @return the value of field 'orderType'.
    **/
    public java.lang.String getOrderType()
    {
        return this._orderType;
    } //-- java.lang.String getOrderType() 

    /**
     * Returns the value of field 'patientCertNo'.
     * 
     * @return the value of field 'patientCertNo'.
    **/
    public java.lang.String getPatientCertNo()
    {
        return this._patientCertNo;
    } //-- java.lang.String getPatientCertNo() 

    /**
     * Returns the value of field 'patientId'.
     * 
     * @return the value of field 'patientId'.
    **/
    public java.lang.String getPatientId()
    {
        return this._patientId;
    } //-- java.lang.String getPatientId() 

    /**
     * Returns the value of field 'patientName'.
     * 
     * @return the value of field 'patientName'.
    **/
    public java.lang.String getPatientName()
    {
        return this._patientName;
    } //-- java.lang.String getPatientName() 

    /**
     * Returns the value of field 'payStatus'.
     * 
     * @return the value of field 'payStatus'.
    **/
    public java.lang.String getPayStatus()
    {
        return this._payStatus;
    } //-- java.lang.String getPayStatus() 

    /**
     * Returns the value of field 'paymentMode'.
     * 
     * @return the value of field 'paymentMode'.
    **/
    public java.lang.String getPaymentMode()
    {
        return this._paymentMode;
    } //-- java.lang.String getPaymentMode() 

    /**
     * Returns the value of field 'receiptNo'.
     * 
     * @return the value of field 'receiptNo'.
    **/
    public java.lang.String getReceiptNo()
    {
        return this._receiptNo;
    } //-- java.lang.String getReceiptNo() 

    /**
     * Returns the value of field 'resCode'.
     * 
     * @return the value of field 'resCode'.
    **/
    public java.lang.String getResCode()
    {
        return this._resCode;
    } //-- java.lang.String getResCode() 

    /**
     * Returns the value of field 'resMsg'.
     * 
     * @return the value of field 'resMsg'.
    **/
    public java.lang.String getResMsg()
    {
        return this._resMsg;
    } //-- java.lang.String getResMsg() 

    /**
     * Returns the value of field 'sourceType'.
     * 
     * @return the value of field 'sourceType'.
    **/
    public java.lang.String getSourceType()
    {
        return this._sourceType;
    } //-- java.lang.String getSourceType() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'status'.
    **/
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Returns the value of field 'userId'.
     * 
     * @return the value of field 'userId'.
    **/
    public java.lang.String getUserId()
    {
        return this._userId;
    } //-- java.lang.String getUserId() 

    /**
     * Returns the value of field 'visitStatus'.
     * 
     * @return the value of field 'visitStatus'.
    **/
    public java.lang.String getVisitStatus()
    {
        return this._visitStatus;
    } //-- java.lang.String getVisitStatus() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'amPm'.
     * 
     * @param amPm the value of field 'amPm'.
    **/
    public void setAmPm(java.lang.String amPm)
    {
        this._amPm = amPm;
    } //-- void setAmPm(java.lang.String) 

    /**
     * Sets the value of field 'appTime'.
     * 
     * @param appTime the value of field 'appTime'.
    **/
    public void setAppTime(java.lang.String appTime)
    {
        this._appTime = appTime;
    } //-- void setAppTime(java.lang.String) 

    /**
     * Sets the value of field 'appointNo'.
     * 
     * @param appointNo the value of field 'appointNo'.
    **/
    public void setAppointNo(java.lang.String appointNo)
    {
        this._appointNo = appointNo;
    } //-- void setAppointNo(java.lang.String) 

    /**
     * Sets the value of field 'attendCardNum'.
     * 
     * @param attendCardNum the value of field 'attendCardNum'.
    **/
    public void setAttendCardNum(java.lang.String attendCardNum)
    {
        this._attendCardNum = attendCardNum;
    } //-- void setAttendCardNum(java.lang.String) 

    /**
     * Sets the value of field 'doctorCode'.
     * 
     * @param doctorCode the value of field 'doctorCode'.
    **/
    public void setDoctorCode(java.lang.String doctorCode)
    {
        this._doctorCode = doctorCode;
    } //-- void setDoctorCode(java.lang.String) 

    /**
     * Sets the value of field 'doctorLevel'.
     * 
     * @param doctorLevel the value of field 'doctorLevel'.
    **/
    public void setDoctorLevel(java.lang.String doctorLevel)
    {
        this._doctorLevel = doctorLevel;
    } //-- void setDoctorLevel(java.lang.String) 

    /**
     * Sets the value of field 'doctorName'.
     * 
     * @param doctorName the value of field 'doctorName'.
    **/
    public void setDoctorName(java.lang.String doctorName)
    {
        this._doctorName = doctorName;
    } //-- void setDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'evaluateStatus'.
     * 
     * @param evaluateStatus the value of field 'evaluateStatus'.
    **/
    public void setEvaluateStatus(java.lang.String evaluateStatus)
    {
        this._evaluateStatus = evaluateStatus;
    } //-- void setEvaluateStatus(java.lang.String) 

    /**
     * Sets the value of field 'hid'.
     * 
     * @param hid the value of field 'hid'.
    **/
    public void setHid(java.lang.String hid)
    {
        this._hid = hid;
    } //-- void setHid(java.lang.String) 

    /**
     * Sets the value of field 'hisPatientId'.
     * 
     * @param hisPatientId the value of field 'hisPatientId'.
    **/
    public void setHisPatientId(java.lang.String hisPatientId)
    {
        this._hisPatientId = hisPatientId;
    } //-- void setHisPatientId(java.lang.String) 

    /**
     * Sets the value of field 'hospitalCode'.
     * 
     * @param hospitalCode the value of field 'hospitalCode'.
    **/
    public void setHospitalCode(java.lang.String hospitalCode)
    {
        this._hospitalCode = hospitalCode;
    } //-- void setHospitalCode(java.lang.String) 

    /**
     * Sets the value of field 'hospitalName'.
     * 
     * @param hospitalName the value of field 'hospitalName'.
    **/
    public void setHospitalName(java.lang.String hospitalName)
    {
        this._hospitalName = hospitalName;
    } //-- void setHospitalName(java.lang.String) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
    **/
    public void setId(java.lang.String id)
    {
        this._id = id;
    } //-- void setId(java.lang.String) 

    /**
     * Sets the value of field 'officeCode'.
     * 
     * @param officeCode the value of field 'officeCode'.
    **/
    public void setOfficeCode(java.lang.String officeCode)
    {
        this._officeCode = officeCode;
    } //-- void setOfficeCode(java.lang.String) 

    /**
     * Sets the value of field 'officeName'.
     * 
     * @param officeName the value of field 'officeName'.
    **/
    public void setOfficeName(java.lang.String officeName)
    {
        this._officeName = officeName;
    } //-- void setOfficeName(java.lang.String) 

    /**
     * Sets the value of field 'operateType'.
     * 
     * @param operateType the value of field 'operateType'.
    **/
    public void setOperateType(java.lang.String operateType)
    {
        this._operateType = operateType;
    } //-- void setOperateType(java.lang.String) 

    /**
     * Sets the value of field 'orderFee'.
     * 
     * @param orderFee the value of field 'orderFee'.
    **/
    public void setOrderFee(java.lang.String orderFee)
    {
        this._orderFee = orderFee;
    } //-- void setOrderFee(java.lang.String) 

    /**
     * Sets the value of field 'orderId'.
     * 
     * @param orderId the value of field 'orderId'.
    **/
    public void setOrderId(java.lang.String orderId)
    {
        this._orderId = orderId;
    } //-- void setOrderId(java.lang.String) 

    /**
     * Sets the value of field 'orderTime'.
     * 
     * @param orderTime the value of field 'orderTime'.
    **/
    public void setOrderTime(java.lang.String orderTime)
    {
        this._orderTime = orderTime;
    } //-- void setOrderTime(java.lang.String) 

    /**
     * Sets the value of field 'orderType'.
     * 
     * @param orderType the value of field 'orderType'.
    **/
    public void setOrderType(java.lang.String orderType)
    {
        this._orderType = orderType;
    } //-- void setOrderType(java.lang.String) 

    /**
     * Sets the value of field 'patientCertNo'.
     * 
     * @param patientCertNo the value of field 'patientCertNo'.
    **/
    public void setPatientCertNo(java.lang.String patientCertNo)
    {
        this._patientCertNo = patientCertNo;
    } //-- void setPatientCertNo(java.lang.String) 

    /**
     * Sets the value of field 'patientId'.
     * 
     * @param patientId the value of field 'patientId'.
    **/
    public void setPatientId(java.lang.String patientId)
    {
        this._patientId = patientId;
    } //-- void setPatientId(java.lang.String) 

    /**
     * Sets the value of field 'patientName'.
     * 
     * @param patientName the value of field 'patientName'.
    **/
    public void setPatientName(java.lang.String patientName)
    {
        this._patientName = patientName;
    } //-- void setPatientName(java.lang.String) 

    /**
     * Sets the value of field 'payStatus'.
     * 
     * @param payStatus the value of field 'payStatus'.
    **/
    public void setPayStatus(java.lang.String payStatus)
    {
        this._payStatus = payStatus;
    } //-- void setPayStatus(java.lang.String) 

    /**
     * Sets the value of field 'paymentMode'.
     * 
     * @param paymentMode the value of field 'paymentMode'.
    **/
    public void setPaymentMode(java.lang.String paymentMode)
    {
        this._paymentMode = paymentMode;
    } //-- void setPaymentMode(java.lang.String) 

    /**
     * Sets the value of field 'receiptNo'.
     * 
     * @param receiptNo the value of field 'receiptNo'.
    **/
    public void setReceiptNo(java.lang.String receiptNo)
    {
        this._receiptNo = receiptNo;
    } //-- void setReceiptNo(java.lang.String) 

    /**
     * Sets the value of field 'resCode'.
     * 
     * @param resCode the value of field 'resCode'.
    **/
    public void setResCode(java.lang.String resCode)
    {
        this._resCode = resCode;
    } //-- void setResCode(java.lang.String) 

    /**
     * Sets the value of field 'resMsg'.
     * 
     * @param resMsg the value of field 'resMsg'.
    **/
    public void setResMsg(java.lang.String resMsg)
    {
        this._resMsg = resMsg;
    } //-- void setResMsg(java.lang.String) 

    /**
     * Sets the value of field 'sourceType'.
     * 
     * @param sourceType the value of field 'sourceType'.
    **/
    public void setSourceType(java.lang.String sourceType)
    {
        this._sourceType = sourceType;
    } //-- void setSourceType(java.lang.String) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
    **/
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Sets the value of field 'userId'.
     * 
     * @param userId the value of field 'userId'.
    **/
    public void setUserId(java.lang.String userId)
    {
        this._userId = userId;
    } //-- void setUserId(java.lang.String) 

    /**
     * Sets the value of field 'visitStatus'.
     * 
     * @param visitStatus the value of field 'visitStatus'.
    **/
    public void setVisitStatus(java.lang.String visitStatus)
    {
        this._visitStatus = visitStatus;
    } //-- void setVisitStatus(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
