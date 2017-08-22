/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp;

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

    private java.lang.String _patientId;

    private java.lang.String _patientName;

    private java.lang.String _sex;

    private java.lang.String _birthDate;

    private java.lang.String _defaultFlag;

    private java.lang.String _certCode;

    private java.lang.String _cardNum;

    private java.lang.String _hisPatientId;

    private java.lang.String _hospitalCode;

    private java.lang.String _hospitalName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'birthDate'.
     * 
     * @return the value of field 'birthDate'.
    **/
    public java.lang.String getBirthDate()
    {
        return this._birthDate;
    } //-- java.lang.String getBirthDate() 

    /**
     * Returns the value of field 'cardNum'.
     * 
     * @return the value of field 'cardNum'.
    **/
    public java.lang.String getCardNum()
    {
        return this._cardNum;
    } //-- java.lang.String getCardNum() 

    /**
     * Returns the value of field 'certCode'.
     * 
     * @return the value of field 'certCode'.
    **/
    public java.lang.String getCertCode()
    {
        return this._certCode;
    } //-- java.lang.String getCertCode() 

    /**
     * Returns the value of field 'defaultFlag'.
     * 
     * @return the value of field 'defaultFlag'.
    **/
    public java.lang.String getDefaultFlag()
    {
        return this._defaultFlag;
    } //-- java.lang.String getDefaultFlag() 

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
     * Returns the value of field 'sex'.
     * 
     * @return the value of field 'sex'.
    **/
    public java.lang.String getSex()
    {
        return this._sex;
    } //-- java.lang.String getSex() 

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
     * Sets the value of field 'birthDate'.
     * 
     * @param birthDate the value of field 'birthDate'.
    **/
    public void setBirthDate(java.lang.String birthDate)
    {
        this._birthDate = birthDate;
    } //-- void setBirthDate(java.lang.String) 

    /**
     * Sets the value of field 'cardNum'.
     * 
     * @param cardNum the value of field 'cardNum'.
    **/
    public void setCardNum(java.lang.String cardNum)
    {
        this._cardNum = cardNum;
    } //-- void setCardNum(java.lang.String) 

    /**
     * Sets the value of field 'certCode'.
     * 
     * @param certCode the value of field 'certCode'.
    **/
    public void setCertCode(java.lang.String certCode)
    {
        this._certCode = certCode;
    } //-- void setCertCode(java.lang.String) 

    /**
     * Sets the value of field 'defaultFlag'.
     * 
     * @param defaultFlag the value of field 'defaultFlag'.
    **/
    public void setDefaultFlag(java.lang.String defaultFlag)
    {
        this._defaultFlag = defaultFlag;
    } //-- void setDefaultFlag(java.lang.String) 

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
     * Sets the value of field 'sex'.
     * 
     * @param sex the value of field 'sex'.
    **/
    public void setSex(java.lang.String sex)
    {
        this._sex = sex;
    } //-- void setSex(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
