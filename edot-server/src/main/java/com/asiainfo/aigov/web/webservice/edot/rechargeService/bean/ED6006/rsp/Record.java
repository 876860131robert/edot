/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp;

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

    private java.lang.String _terminalTranNo;

    private java.lang.String _cardNo;

    private java.lang.String _amount;

    private java.lang.String _chipSerial;

    private java.lang.String _cardSerial;

    private java.lang.String _tranAmount;

    private java.lang.String _payStatus;

    private java.lang.String _orderTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amount'.
     * 
     * @return the value of field 'amount'.
    **/
    public java.lang.String getAmount()
    {
        return this._amount;
    } //-- java.lang.String getAmount() 

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
     * Returns the value of field 'cardSerial'.
     * 
     * @return the value of field 'cardSerial'.
    **/
    public java.lang.String getCardSerial()
    {
        return this._cardSerial;
    } //-- java.lang.String getCardSerial() 

    /**
     * Returns the value of field 'chipSerial'.
     * 
     * @return the value of field 'chipSerial'.
    **/
    public java.lang.String getChipSerial()
    {
        return this._chipSerial;
    } //-- java.lang.String getChipSerial() 

    /**
     * Returns the value of field 'orderTime'.
     * 
     * @return the value of field 'orderTime'.
    **/
    public java.lang.String getOrderTime()
    {
        return this._orderTime;
    } //-- java.lang.String getOrderTime() 

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
     * Returns the value of field 'terminalTranNo'.
     * 
     * @return the value of field 'terminalTranNo'.
    **/
    public java.lang.String getTerminalTranNo()
    {
        return this._terminalTranNo;
    } //-- java.lang.String getTerminalTranNo() 

    /**
     * Returns the value of field 'tranAmount'.
     * 
     * @return the value of field 'tranAmount'.
    **/
    public java.lang.String getTranAmount()
    {
        return this._tranAmount;
    } //-- java.lang.String getTranAmount() 

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
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
    **/
    public void setAmount(java.lang.String amount)
    {
        this._amount = amount;
    } //-- void setAmount(java.lang.String) 

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
     * Sets the value of field 'cardSerial'.
     * 
     * @param cardSerial the value of field 'cardSerial'.
    **/
    public void setCardSerial(java.lang.String cardSerial)
    {
        this._cardSerial = cardSerial;
    } //-- void setCardSerial(java.lang.String) 

    /**
     * Sets the value of field 'chipSerial'.
     * 
     * @param chipSerial the value of field 'chipSerial'.
    **/
    public void setChipSerial(java.lang.String chipSerial)
    {
        this._chipSerial = chipSerial;
    } //-- void setChipSerial(java.lang.String) 

    /**
     * Sets the value of field 'orderTime'.
     * 
     * @param orderTime the value of field 'orderTime'.
    **/
    public void setOrderTime(java.lang.String orderTime)
    {
        this._orderTime = orderTime;
    } //-- void setOrderTime(java.lang.String) 

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
     * Sets the value of field 'terminalTranNo'.
     * 
     * @param terminalTranNo the value of field 'terminalTranNo'.
    **/
    public void setTerminalTranNo(java.lang.String terminalTranNo)
    {
        this._terminalTranNo = terminalTranNo;
    } //-- void setTerminalTranNo(java.lang.String) 

    /**
     * Sets the value of field 'tranAmount'.
     * 
     * @param tranAmount the value of field 'tranAmount'.
    **/
    public void setTranAmount(java.lang.String tranAmount)
    {
        this._tranAmount = tranAmount;
    } //-- void setTranAmount(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
