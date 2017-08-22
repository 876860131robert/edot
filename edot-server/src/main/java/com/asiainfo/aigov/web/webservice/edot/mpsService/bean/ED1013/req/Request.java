/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req;

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

    private java.lang.String _test_No;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'test_No'.
     * 
     * @return the value of field 'test_No'.
    **/
    public java.lang.String getTest_No()
    {
        return this._test_No;
    } //-- java.lang.String getTest_No() 

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
     * Sets the value of field 'consumer'.
     * 
     * @param consumer the value of field 'consumer'.
    **/
    public void setConsumer(java.lang.String consumer)
    {
        this._consumer = consumer;
    } //-- void setConsumer(java.lang.String) 

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
     * Sets the value of field 'test_No'.
     * 
     * @param test_No the value of field 'test_No'.
    **/
    public void setTest_No(java.lang.String test_No)
    {
        this._test_No = test_No;
    } //-- void setTest_No(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
