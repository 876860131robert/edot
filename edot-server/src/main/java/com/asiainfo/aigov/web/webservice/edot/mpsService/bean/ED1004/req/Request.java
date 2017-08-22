/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req;

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

    private java.lang.String _serviceName;

    private java.lang.String _hospital_Mark;

    private java.lang.String _dept_Code;

    private java.lang.String _dept_Name;

    private java.lang.String _doctor_Code;

    private java.lang.String _doctor_Name;

    private java.lang.String _hb_Date;

    private java.lang.String _am_Pm;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'am_Pm'.
     * 
     * @return the value of field 'am_Pm'.
    **/
    public java.lang.String getAm_Pm()
    {
        return this._am_Pm;
    } //-- java.lang.String getAm_Pm() 

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
     * Returns the value of field 'dept_Code'.
     * 
     * @return the value of field 'dept_Code'.
    **/
    public java.lang.String getDept_Code()
    {
        return this._dept_Code;
    } //-- java.lang.String getDept_Code() 

    /**
     * Returns the value of field 'dept_Name'.
     * 
     * @return the value of field 'dept_Name'.
    **/
    public java.lang.String getDept_Name()
    {
        return this._dept_Name;
    } //-- java.lang.String getDept_Name() 

    /**
     * Returns the value of field 'doctor_Code'.
     * 
     * @return the value of field 'doctor_Code'.
    **/
    public java.lang.String getDoctor_Code()
    {
        return this._doctor_Code;
    } //-- java.lang.String getDoctor_Code() 

    /**
     * Returns the value of field 'doctor_Name'.
     * 
     * @return the value of field 'doctor_Name'.
    **/
    public java.lang.String getDoctor_Name()
    {
        return this._doctor_Name;
    } //-- java.lang.String getDoctor_Name() 

    /**
     * Returns the value of field 'hb_Date'.
     * 
     * @return the value of field 'hb_Date'.
    **/
    public java.lang.String getHb_Date()
    {
        return this._hb_Date;
    } //-- java.lang.String getHb_Date() 

    /**
     * Returns the value of field 'hospital_Mark'.
     * 
     * @return the value of field 'hospital_Mark'.
    **/
    public java.lang.String getHospital_Mark()
    {
        return this._hospital_Mark;
    } //-- java.lang.String getHospital_Mark() 

    /**
     * Returns the value of field 'serviceName'.
     * 
     * @return the value of field 'serviceName'.
    **/
    public java.lang.String getServiceName()
    {
        return this._serviceName;
    } //-- java.lang.String getServiceName() 

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
     * Sets the value of field 'am_Pm'.
     * 
     * @param am_Pm the value of field 'am_Pm'.
    **/
    public void setAm_Pm(java.lang.String am_Pm)
    {
        this._am_Pm = am_Pm;
    } //-- void setAm_Pm(java.lang.String) 

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
     * Sets the value of field 'dept_Code'.
     * 
     * @param dept_Code the value of field 'dept_Code'.
    **/
    public void setDept_Code(java.lang.String dept_Code)
    {
        this._dept_Code = dept_Code;
    } //-- void setDept_Code(java.lang.String) 

    /**
     * Sets the value of field 'dept_Name'.
     * 
     * @param dept_Name the value of field 'dept_Name'.
    **/
    public void setDept_Name(java.lang.String dept_Name)
    {
        this._dept_Name = dept_Name;
    } //-- void setDept_Name(java.lang.String) 

    /**
     * Sets the value of field 'doctor_Code'.
     * 
     * @param doctor_Code the value of field 'doctor_Code'.
    **/
    public void setDoctor_Code(java.lang.String doctor_Code)
    {
        this._doctor_Code = doctor_Code;
    } //-- void setDoctor_Code(java.lang.String) 

    /**
     * Sets the value of field 'doctor_Name'.
     * 
     * @param doctor_Name the value of field 'doctor_Name'.
    **/
    public void setDoctor_Name(java.lang.String doctor_Name)
    {
        this._doctor_Name = doctor_Name;
    } //-- void setDoctor_Name(java.lang.String) 

    /**
     * Sets the value of field 'hb_Date'.
     * 
     * @param hb_Date the value of field 'hb_Date'.
    **/
    public void setHb_Date(java.lang.String hb_Date)
    {
        this._hb_Date = hb_Date;
    } //-- void setHb_Date(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Mark'.
     * 
     * @param hospital_Mark the value of field 'hospital_Mark'.
    **/
    public void setHospital_Mark(java.lang.String hospital_Mark)
    {
        this._hospital_Mark = hospital_Mark;
    } //-- void setHospital_Mark(java.lang.String) 

    /**
     * Sets the value of field 'serviceName'.
     * 
     * @param serviceName the value of field 'serviceName'.
    **/
    public void setServiceName(java.lang.String serviceName)
    {
        this._serviceName = serviceName;
    } //-- void setServiceName(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
