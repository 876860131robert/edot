/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req;

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

    private java.lang.String _sourceType;

    private java.lang.String _orderId;

    private java.lang.String _orderFee;

    private java.lang.String _returnUrl;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request()


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
     * Returns the value of field 'returnUrl'.
     * 
     * @return the value of field 'returnUrl'.
    **/
    public java.lang.String getReturnUrl()
    {
        return this._returnUrl;
    } //-- java.lang.String getReturnUrl() 

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
     * Sets the value of field 'consumer'.
     * 
     * @param consumer the value of field 'consumer'.
    **/
    public void setConsumer(java.lang.String consumer)
    {
        this._consumer = consumer;
    } //-- void setConsumer(java.lang.String) 

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
     * Sets the value of field 'returnUrl'.
     * 
     * @param returnUrl the value of field 'returnUrl'.
    **/
    public void setReturnUrl(java.lang.String returnUrl)
    {
        this._returnUrl = returnUrl;
    } //-- void setReturnUrl(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
