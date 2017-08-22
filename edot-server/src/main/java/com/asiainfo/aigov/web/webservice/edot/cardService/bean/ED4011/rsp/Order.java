/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp;

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
public class Order implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _orderSerial;

    private java.lang.String _idNo;

    private java.lang.String _name;

    private java.lang.String _cardNo;

    private java.lang.String _combinedTreatmentNo;

    private java.lang.String _applyTime;

    private java.lang.String _cardType;

    private java.lang.String _cardTypeDesc;

    private java.lang.String _status;

    private java.lang.String _statusDesc;

    private java.lang.String _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public Order() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Order()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'applyTime'.
     * 
     * @return the value of field 'applyTime'.
    **/
    public java.lang.String getApplyTime()
    {
        return this._applyTime;
    } //-- java.lang.String getApplyTime() 

    /**
     * Returns the value of field 'cardNo'.
     * 
     * @return the value of field 'cardNo'.
    **/
    public java.lang.String getCardNo()
    {
        return this._cardNo;
    } //-- java.lang.String getCardNo() 

    /**
     * Returns the value of field 'cardType'.
     * 
     * @return the value of field 'cardType'.
    **/
    public java.lang.String getCardType()
    {
        return this._cardType;
    } //-- java.lang.String getCardType() 

    /**
     * Returns the value of field 'cardTypeDesc'.
     * 
     * @return the value of field 'cardTypeDesc'.
    **/
    public java.lang.String getCardTypeDesc()
    {
        return this._cardTypeDesc;
    } //-- java.lang.String getCardTypeDesc() 

    /**
     * Returns the value of field 'combinedTreatmentNo'.
     * 
     * @return the value of field 'combinedTreatmentNo'.
    **/
    public java.lang.String getCombinedTreatmentNo()
    {
        return this._combinedTreatmentNo;
    } //-- java.lang.String getCombinedTreatmentNo() 

    /**
     * Returns the value of field 'idNo'.
     * 
     * @return the value of field 'idNo'.
    **/
    public java.lang.String getIdNo()
    {
        return this._idNo;
    } //-- java.lang.String getIdNo() 

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'message'.
    **/
    public java.lang.String getMessage()
    {
        return this._message;
    } //-- java.lang.String getMessage() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'orderSerial'.
     * 
     * @return the value of field 'orderSerial'.
    **/
    public java.lang.String getOrderSerial()
    {
        return this._orderSerial;
    } //-- java.lang.String getOrderSerial() 

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
     * Returns the value of field 'statusDesc'.
     * 
     * @return the value of field 'statusDesc'.
    **/
    public java.lang.String getStatusDesc()
    {
        return this._statusDesc;
    } //-- java.lang.String getStatusDesc() 

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
     * Sets the value of field 'applyTime'.
     * 
     * @param applyTime the value of field 'applyTime'.
    **/
    public void setApplyTime(java.lang.String applyTime)
    {
        this._applyTime = applyTime;
    } //-- void setApplyTime(java.lang.String) 

    /**
     * Sets the value of field 'cardNo'.
     * 
     * @param cardNo the value of field 'cardNo'.
    **/
    public void setCardNo(java.lang.String cardNo)
    {
        this._cardNo = cardNo;
    } //-- void setCardNo(java.lang.String) 

    /**
     * Sets the value of field 'cardType'.
     * 
     * @param cardType the value of field 'cardType'.
    **/
    public void setCardType(java.lang.String cardType)
    {
        this._cardType = cardType;
    } //-- void setCardType(java.lang.String) 

    /**
     * Sets the value of field 'cardTypeDesc'.
     * 
     * @param cardTypeDesc the value of field 'cardTypeDesc'.
    **/
    public void setCardTypeDesc(java.lang.String cardTypeDesc)
    {
        this._cardTypeDesc = cardTypeDesc;
    } //-- void setCardTypeDesc(java.lang.String) 

    /**
     * Sets the value of field 'combinedTreatmentNo'.
     * 
     * @param combinedTreatmentNo the value of field
     * 'combinedTreatmentNo'.
    **/
    public void setCombinedTreatmentNo(java.lang.String combinedTreatmentNo)
    {
        this._combinedTreatmentNo = combinedTreatmentNo;
    } //-- void setCombinedTreatmentNo(java.lang.String) 

    /**
     * Sets the value of field 'idNo'.
     * 
     * @param idNo the value of field 'idNo'.
    **/
    public void setIdNo(java.lang.String idNo)
    {
        this._idNo = idNo;
    } //-- void setIdNo(java.lang.String) 

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
    **/
    public void setMessage(java.lang.String message)
    {
        this._message = message;
    } //-- void setMessage(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'orderSerial'.
     * 
     * @param orderSerial the value of field 'orderSerial'.
    **/
    public void setOrderSerial(java.lang.String orderSerial)
    {
        this._orderSerial = orderSerial;
    } //-- void setOrderSerial(java.lang.String) 

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
     * Sets the value of field 'statusDesc'.
     * 
     * @param statusDesc the value of field 'statusDesc'.
    **/
    public void setStatusDesc(java.lang.String statusDesc)
    {
        this._statusDesc = statusDesc;
    } //-- void setStatusDesc(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Order unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Order) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Order.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Order unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
