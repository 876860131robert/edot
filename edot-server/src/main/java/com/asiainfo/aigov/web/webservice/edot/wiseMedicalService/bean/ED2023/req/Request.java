/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req;

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

    private java.lang.String _userId;

    private java.lang.String _status;

    private java.lang.String _paitentCertNo;

    private java.lang.String _orderId;

    private java.lang.String _hospatilCode;

    private java.lang.String _doctorCode;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request()


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
     * Returns the value of field 'doctorCode'.
     * 
     * @return the value of field 'doctorCode'.
    **/
    public java.lang.String getDoctorCode()
    {
        return this._doctorCode;
    } //-- java.lang.String getDoctorCode() 

    /**
     * Returns the value of field 'hospatilCode'.
     * 
     * @return the value of field 'hospatilCode'.
    **/
    public java.lang.String getHospatilCode()
    {
        return this._hospatilCode;
    } //-- java.lang.String getHospatilCode() 

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
     * Returns the value of field 'paitentCertNo'.
     * 
     * @return the value of field 'paitentCertNo'.
    **/
    public java.lang.String getPaitentCertNo()
    {
        return this._paitentCertNo;
    } //-- java.lang.String getPaitentCertNo() 

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
     * Sets the value of field 'hospatilCode'.
     * 
     * @param hospatilCode the value of field 'hospatilCode'.
    **/
    public void setHospatilCode(java.lang.String hospatilCode)
    {
        this._hospatilCode = hospatilCode;
    } //-- void setHospatilCode(java.lang.String) 

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
     * Sets the value of field 'paitentCertNo'.
     * 
     * @param paitentCertNo the value of field 'paitentCertNo'.
    **/
    public void setPaitentCertNo(java.lang.String paitentCertNo)
    {
        this._paitentCertNo = paitentCertNo;
    } //-- void setPaitentCertNo(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
