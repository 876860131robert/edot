/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp;

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
public class Record implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _paySerial;

    private java.lang.String _orderId;

    private java.lang.String _cardNum;

    private java.lang.String _orderFee;

    private java.lang.String _payType;

    private java.lang.String _payTypeDesc;

    private java.lang.String _payStatus;

    private java.lang.String _payStatusDesc;

    private java.lang.String _createDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'createDate'.
     * 
     * @return the value of field 'createDate'.
    **/
    public java.lang.String getCreateDate()
    {
        return this._createDate;
    } //-- java.lang.String getCreateDate() 

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
     * Returns the value of field 'paySerial'.
     * 
     * @return the value of field 'paySerial'.
    **/
    public java.lang.String getPaySerial()
    {
        return this._paySerial;
    } //-- java.lang.String getPaySerial() 

    /**
     * Returns the value of field 'payStatus'.
     * 
     * @return the value of field 'payStatus'.
    **/
    public java.lang.String getPayStatus()
    {
        return this._payStatus;
    } //-- java.lang.String getPayStatus() 

    /**
     * Returns the value of field 'payStatusDesc'.
     * 
     * @return the value of field 'payStatusDesc'.
    **/
    public java.lang.String getPayStatusDesc()
    {
        return this._payStatusDesc;
    } //-- java.lang.String getPayStatusDesc() 

    /**
     * Returns the value of field 'payType'.
     * 
     * @return the value of field 'payType'.
    **/
    public java.lang.String getPayType()
    {
        return this._payType;
    } //-- java.lang.String getPayType() 

    /**
     * Returns the value of field 'payTypeDesc'.
     * 
     * @return the value of field 'payTypeDesc'.
    **/
    public java.lang.String getPayTypeDesc()
    {
        return this._payTypeDesc;
    } //-- java.lang.String getPayTypeDesc() 

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
     * Sets the value of field 'cardNum'.
     * 
     * @param cardNum the value of field 'cardNum'.
    **/
    public void setCardNum(java.lang.String cardNum)
    {
        this._cardNum = cardNum;
    } //-- void setCardNum(java.lang.String) 

    /**
     * Sets the value of field 'createDate'.
     * 
     * @param createDate the value of field 'createDate'.
    **/
    public void setCreateDate(java.lang.String createDate)
    {
        this._createDate = createDate;
    } //-- void setCreateDate(java.lang.String) 

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
     * Sets the value of field 'paySerial'.
     * 
     * @param paySerial the value of field 'paySerial'.
    **/
    public void setPaySerial(java.lang.String paySerial)
    {
        this._paySerial = paySerial;
    } //-- void setPaySerial(java.lang.String) 

    /**
     * Sets the value of field 'payStatus'.
     * 
     * @param payStatus the value of field 'payStatus'.
    **/
    public void setPayStatus(java.lang.String payStatus)
    {
        this._payStatus = payStatus;
    } //-- void setPayStatus(java.lang.String) 

    /**
     * Sets the value of field 'payStatusDesc'.
     * 
     * @param payStatusDesc the value of field 'payStatusDesc'.
    **/
    public void setPayStatusDesc(java.lang.String payStatusDesc)
    {
        this._payStatusDesc = payStatusDesc;
    } //-- void setPayStatusDesc(java.lang.String) 

    /**
     * Sets the value of field 'payType'.
     * 
     * @param payType the value of field 'payType'.
    **/
    public void setPayType(java.lang.String payType)
    {
        this._payType = payType;
    } //-- void setPayType(java.lang.String) 

    /**
     * Sets the value of field 'payTypeDesc'.
     * 
     * @param payTypeDesc the value of field 'payTypeDesc'.
    **/
    public void setPayTypeDesc(java.lang.String payTypeDesc)
    {
        this._payTypeDesc = payTypeDesc;
    } //-- void setPayTypeDesc(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
