/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp;

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
public class Result_List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _attentionId;

    private java.lang.String _hospitalName;

    private java.lang.String _userId;

    private java.lang.String _doctorLevel;

    private java.lang.String _doctorId;

    private java.lang.String _hospitalLevel;

    private java.lang.String _officeName;

    private java.lang.String _totalScore;

    private java.lang.String _doctorName;

    private java.lang.String _hospitalId;

    private java.lang.String _hospitalCode;

    private java.lang.String _officeCode;

    private java.lang.String _doctorCode;

    private java.lang.String _markType;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'attentionId'.
     * 
     * @return the value of field 'attentionId'.
    **/
    public java.lang.String getAttentionId()
    {
        return this._attentionId;
    } //-- java.lang.String getAttentionId() 

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
        return this._doctorName;
    } //-- java.lang.String getDoctorName() 

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
     * Returns the value of field 'hospitalId'.
     * 
     * @return the value of field 'hospitalId'.
    **/
    public java.lang.String getHospitalId()
    {
        return this._hospitalId;
    } //-- java.lang.String getHospitalId() 

    /**
     * Returns the value of field 'hospitalLevel'.
     * 
     * @return the value of field 'hospitalLevel'.
    **/
    public java.lang.String getHospitalLevel()
    {
        return this._hospitalLevel;
    } //-- java.lang.String getHospitalLevel() 

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
     * Returns the value of field 'markType'.
     * 
     * @return the value of field 'markType'.
    **/
    public java.lang.String getMarkType()
    {
        return this._markType;
    } //-- java.lang.String getMarkType() 

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
     * Returns the value of field 'totalScore'.
     * 
     * @return the value of field 'totalScore'.
    **/
    public java.lang.String getTotalScore()
    {
        return this._totalScore;
    } //-- java.lang.String getTotalScore() 

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
     * Sets the value of field 'attentionId'.
     * 
     * @param attentionId the value of field 'attentionId'.
    **/
    public void setAttentionId(java.lang.String attentionId)
    {
        this._attentionId = attentionId;
    } //-- void setAttentionId(java.lang.String) 

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
     * Sets the value of field 'hospitalCode'.
     * 
     * @param hospitalCode the value of field 'hospitalCode'.
    **/
    public void setHospitalCode(java.lang.String hospitalCode)
    {
        this._hospitalCode = hospitalCode;
    } //-- void setHospitalCode(java.lang.String) 

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
     * Sets the value of field 'hospitalLevel'.
     * 
     * @param hospitalLevel the value of field 'hospitalLevel'.
    **/
    public void setHospitalLevel(java.lang.String hospitalLevel)
    {
        this._hospitalLevel = hospitalLevel;
    } //-- void setHospitalLevel(java.lang.String) 

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
     * Sets the value of field 'markType'.
     * 
     * @param markType the value of field 'markType'.
    **/
    public void setMarkType(java.lang.String markType)
    {
        this._markType = markType;
    } //-- void setMarkType(java.lang.String) 

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
     * Sets the value of field 'totalScore'.
     * 
     * @param totalScore the value of field 'totalScore'.
    **/
    public void setTotalScore(java.lang.String totalScore)
    {
        this._totalScore = totalScore;
    } //-- void setTotalScore(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
