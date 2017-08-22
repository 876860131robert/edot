/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp;

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
public class Result_Data implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _patientId;
    
    private java.lang.String _defaultFlag;

    private java.lang.String _patientName;

    private java.lang.String _sex;

    private java.lang.String _phoneNum;

    private java.lang.String _birthDate;

    private java.lang.String _certCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_Data()


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
     * Returns the value of field 'certCode'.
     * 
     * @return the value of field 'certCode'.
    **/
    public java.lang.String getCertCode()
    {
        return this._certCode;
    } //-- java.lang.String getCertCode() 

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
     * Returns the value of field 'phoneNum'.
     * 
     * @return the value of field 'phoneNum'.
    **/
    public java.lang.String getPhoneNum()
    {
        return this._phoneNum;
    } //-- java.lang.String getPhoneNum() 

    /**
     * Returns the value of field 'sex'.
     * 
     * @return the value of field 'sex'.
    **/
    public java.lang.String getSex()
    {
        return this._sex;
    } //-- java.lang.String getSex() 

    public java.lang.String getDefaultFlag()
    {
    	return this._defaultFlag;
    }
    
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
     * Sets the value of field 'certCode'.
     * 
     * @param certCode the value of field 'certCode'.
    **/
    public void setCertCode(java.lang.String certCode)
    {
        this._certCode = certCode;
    } //-- void setCertCode(java.lang.String) 

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
     * Sets the value of field 'phoneNum'.
     * 
     * @param phoneNum the value of field 'phoneNum'.
    **/
    public void setPhoneNum(java.lang.String phoneNum)
    {
        this._phoneNum = phoneNum;
    } //-- void setPhoneNum(java.lang.String) 

    /**
     * Sets the value of field 'sex'.
     * 
     * @param sex the value of field 'sex'.
    **/
    public void setSex(java.lang.String sex)
    {
        this._sex = sex;
    } //-- void setSex(java.lang.String) 

    public void setDefaultFlag(java.lang.String defaultFlag)
    {
    	this._defaultFlag = defaultFlag;
    }
    
    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
