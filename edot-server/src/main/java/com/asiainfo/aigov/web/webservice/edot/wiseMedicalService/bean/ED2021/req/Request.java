/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req;

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

    private java.lang.String _orderId;

    private java.lang.String _status;

    private java.lang.String _operateType;

    private java.lang.String _appointNo;

    private java.lang.String _receiptNo;

    private java.lang.String _resCode;

    private java.lang.String _resMsg;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'consumer'.
     * 
     * @return the value of field 'consumer'.
    **/
    public java.lang.String getConsumer()
    {
        return this._consumer;
    } //-- java.lang.String getConsumer() 

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
     * Returns the value of field 'orderId'.
     * 
     * @return the value of field 'orderId'.
    **/
    public java.lang.String getOrderId()
    {
        return this._orderId;
    } //-- java.lang.String getOrderId() 

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
     * Sets the value of field 'appointNo'.
     * 
     * @param appointNo the value of field 'appointNo'.
    **/
    public void setAppointNo(java.lang.String appointNo)
    {
        this._appointNo = appointNo;
    } //-- void setAppointNo(java.lang.String) 

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
     * Sets the value of field 'operateType'.
     * 
     * @param operateType the value of field 'operateType'.
    **/
    public void setOperateType(java.lang.String operateType)
    {
        this._operateType = operateType;
    } //-- void setOperateType(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
