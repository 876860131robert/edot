/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req;

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

    private java.lang.String _hospital_Code;

    private java.lang.String _patient_Id;

    private java.lang.String _pay_Mode;

    private java.lang.String _all_Amt;

    private Pay_List _pay_List;

    private java.lang.String _sysType;

    private java.lang.String _token;

    private java.lang.String _consumer;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'all_Amt'.
     * 
     * @return the value of field 'all_Amt'.
    **/
    public java.lang.String getAll_Amt()
    {
        return this._all_Amt;
    } //-- java.lang.String getAll_Amt() 

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
     * Returns the value of field 'hospital_Code'.
     * 
     * @return the value of field 'hospital_Code'.
    **/
    public java.lang.String getHospital_Code()
    {
        return this._hospital_Code;
    } //-- java.lang.String getHospital_Code() 

    /**
     * Returns the value of field 'patient_Id'.
     * 
     * @return the value of field 'patient_Id'.
    **/
    public java.lang.String getPatient_Id()
    {
        return this._patient_Id;
    } //-- java.lang.String getPatient_Id() 

    /**
     * Returns the value of field 'pay_List'.
     * 
     * @return the value of field 'pay_List'.
    **/
    public Pay_List getPay_List()
    {
        return this._pay_List;
    } //-- Pay_List getPay_List() 

    /**
     * Returns the value of field 'pay_Mode'.
     * 
     * @return the value of field 'pay_Mode'.
    **/
    public java.lang.String getPay_Mode()
    {
        return this._pay_Mode;
    } //-- java.lang.String getPay_Mode() 

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
     * Sets the value of field 'all_Amt'.
     * 
     * @param all_Amt the value of field 'all_Amt'.
    **/
    public void setAll_Amt(java.lang.String all_Amt)
    {
        this._all_Amt = all_Amt;
    } //-- void setAll_Amt(java.lang.String) 

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
     * Sets the value of field 'hospital_Code'.
     * 
     * @param hospital_Code the value of field 'hospital_Code'.
    **/
    public void setHospital_Code(java.lang.String hospital_Code)
    {
        this._hospital_Code = hospital_Code;
    } //-- void setHospital_Code(java.lang.String) 

    /**
     * Sets the value of field 'patient_Id'.
     * 
     * @param patient_Id the value of field 'patient_Id'.
    **/
    public void setPatient_Id(java.lang.String patient_Id)
    {
        this._patient_Id = patient_Id;
    } //-- void setPatient_Id(java.lang.String) 

    /**
     * Sets the value of field 'pay_List'.
     * 
     * @param pay_List the value of field 'pay_List'.
    **/
    public void setPay_List(Pay_List pay_List)
    {
        this._pay_List = pay_List;
    } //-- void setPay_List(Pay_List) 

    /**
     * Sets the value of field 'pay_Mode'.
     * 
     * @param pay_Mode the value of field 'pay_Mode'.
    **/
    public void setPay_Mode(java.lang.String pay_Mode)
    {
        this._pay_Mode = pay_Mode;
    } //-- void setPay_Mode(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
