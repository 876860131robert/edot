/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _patientId;

    private java.lang.String _hisPatientId;

    private java.lang.String _userId;

    private java.lang.String _officeId;

    private java.lang.String _officeCode;

    private java.lang.String _hospitalId;

    private java.lang.String _regDate;

    private java.lang.String _doctorId;

    private java.lang.String _doctorCode;

    private java.lang.String _medicalCard;

    private java.lang.String _regFee;

    private java.lang.String _paymentMode;

    private java.lang.String _hid;

    private java.lang.String _amPm;

    private java.lang.String _optionFlag;

    private java.lang.String _markType;

    private java.lang.String _patientName;

    private java.lang.String _patientCertNo;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request()


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
     * Returns the value of field 'consumer'.
     * 
     * @return the value of field 'consumer'.
    **/
    public java.lang.String getConsumer()
    {
        return this._consumer;
    } //-- java.lang.String getConsumer() 

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
     * Returns the value of field 'doctorId'.
     * 
     * @return the value of field 'doctorId'.
    **/
    public java.lang.String getDoctorId()
    {
        return this._doctorId;
    } //-- java.lang.String getDoctorId() 

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
     * Returns the value of field 'hospitalId'.
     * 
     * @return the value of field 'hospitalId'.
    **/
    public java.lang.String getHospitalId()
    {
        return this._hospitalId;
    } //-- java.lang.String getHospitalId() 

    /**
     * Returns the value of field 'markType'.
     * 
     * @return the value of field 'markType'.
    **/
    public java.lang.String getMarkType()
    {
        return this._markType;
    } //-- java.lang.String getMarkType() 

    /**
     * Returns the value of field 'medicalCard'.
     * 
     * @return the value of field 'medicalCard'.
    **/
    public java.lang.String getMedicalCard()
    {
        return this._medicalCard;
    } //-- java.lang.String getMedicalCard() 

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
     * Returns the value of field 'officeId'.
     * 
     * @return the value of field 'officeId'.
    **/
    public java.lang.String getOfficeId()
    {
        return this._officeId;
    } //-- java.lang.String getOfficeId() 

    /**
     * Returns the value of field 'optionFlag'.
     * 
     * @return the value of field 'optionFlag'.
    **/
    public java.lang.String getOptionFlag()
    {
        return this._optionFlag;
    } //-- java.lang.String getOptionFlag() 

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
     * Returns the value of field 'paymentMode'.
     * 
     * @return the value of field 'paymentMode'.
    **/
    public java.lang.String getPaymentMode()
    {
        return this._paymentMode;
    } //-- java.lang.String getPaymentMode() 

    /**
     * Returns the value of field 'regDate'.
     * 
     * @return the value of field 'regDate'.
    **/
    public java.lang.String getRegDate()
    {
        return this._regDate;
    } //-- java.lang.String getRegDate() 

    /**
     * Returns the value of field 'regFee'.
     * 
     * @return the value of field 'regFee'.
    **/
    public java.lang.String getRegFee()
    {
        return this._regFee;
    } //-- java.lang.String getRegFee() 

    /**
     * Returns the value of field 'sysType'.
     * 
     * @return the value of field 'sysType'.
    **/
    public java.lang.String getSysType()
    {
        return this._sysType;
    } //-- java.lang.String getSysType() 

    /**
     * Returns the value of field 'token'.
     * 
     * @return the value of field 'token'.
    **/
    public java.lang.String getToken()
    {
        return this._token;
    } //-- java.lang.String getToken() 

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
     * Sets the value of field 'consumer'.
     * 
     * @param consumer the value of field 'consumer'.
    **/
    public void setConsumer(java.lang.String consumer)
    {
        this._consumer = consumer;
    } //-- void setConsumer(java.lang.String) 

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
     * Sets the value of field 'doctorId'.
     * 
     * @param doctorId the value of field 'doctorId'.
    **/
    public void setDoctorId(java.lang.String doctorId)
    {
        this._doctorId = doctorId;
    } //-- void setDoctorId(java.lang.String) 

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
     * Sets the value of field 'hospitalId'.
     * 
     * @param hospitalId the value of field 'hospitalId'.
    **/
    public void setHospitalId(java.lang.String hospitalId)
    {
        this._hospitalId = hospitalId;
    } //-- void setHospitalId(java.lang.String) 

    /**
     * Sets the value of field 'markType'.
     * 
     * @param markType the value of field 'markType'.
    **/
    public void setMarkType(java.lang.String markType)
    {
        this._markType = markType;
    } //-- void setMarkType(java.lang.String) 

    /**
     * Sets the value of field 'medicalCard'.
     * 
     * @param medicalCard the value of field 'medicalCard'.
    **/
    public void setMedicalCard(java.lang.String medicalCard)
    {
        this._medicalCard = medicalCard;
    } //-- void setMedicalCard(java.lang.String) 

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
     * Sets the value of field 'officeId'.
     * 
     * @param officeId the value of field 'officeId'.
    **/
    public void setOfficeId(java.lang.String officeId)
    {
        this._officeId = officeId;
    } //-- void setOfficeId(java.lang.String) 

    /**
     * Sets the value of field 'optionFlag'.
     * 
     * @param optionFlag the value of field 'optionFlag'.
    **/
    public void setOptionFlag(java.lang.String optionFlag)
    {
        this._optionFlag = optionFlag;
    } //-- void setOptionFlag(java.lang.String) 

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
     * Sets the value of field 'paymentMode'.
     * 
     * @param paymentMode the value of field 'paymentMode'.
    **/
    public void setPaymentMode(java.lang.String paymentMode)
    {
        this._paymentMode = paymentMode;
    } //-- void setPaymentMode(java.lang.String) 

    /**
     * Sets the value of field 'regDate'.
     * 
     * @param regDate the value of field 'regDate'.
    **/
    public void setRegDate(java.lang.String regDate)
    {
        this._regDate = regDate;
    } //-- void setRegDate(java.lang.String) 

    /**
     * Sets the value of field 'regFee'.
     * 
     * @param regFee the value of field 'regFee'.
    **/
    public void setRegFee(java.lang.String regFee)
    {
        this._regFee = regFee;
    } //-- void setRegFee(java.lang.String) 

    /**
     * Sets the value of field 'sysType'.
     * 
     * @param sysType the value of field 'sysType'.
    **/
    public void setSysType(java.lang.String sysType)
    {
        this._sysType = sysType;
    } //-- void setSysType(java.lang.String) 

    /**
     * Sets the value of field 'token'.
     * 
     * @param token the value of field 'token'.
    **/
    public void setToken(java.lang.String token)
    {
        this._token = token;
    } //-- void setToken(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
