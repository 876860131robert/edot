/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req;

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

    private java.lang.String _cardNo;

    private java.lang.String _amount;

    private java.lang.String _chipSerial;

    private java.lang.String _cardSerial;

    private java.lang.String _randomNumber;

    private java.lang.String _tranSerial;

    private java.lang.String _tranAmount;

    private java.lang.String _tranType;

    private java.lang.String _terminalNo;

    private java.lang.String _mac;

    private java.lang.String _tradeDateTime;

    private java.lang.String _payMode;

    private java.lang.String _payChannel;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request()


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
     * Returns the value of field 'mac'.
     * 
     * @return the value of field 'mac'.
    **/
    public java.lang.String getMac()
    {
        return this._mac;
    } //-- java.lang.String getMac() 

    /**
     * Returns the value of field 'payChannel'.
     * 
     * @return the value of field 'payChannel'.
    **/
    public java.lang.String getPayChannel()
    {
        return this._payChannel;
    } //-- java.lang.String getPayChannel() 

    /**
     * Returns the value of field 'payMode'.
     * 
     * @return the value of field 'payMode'.
    **/
    public java.lang.String getPayMode()
    {
        return this._payMode;
    } //-- java.lang.String getPayMode() 

    /**
     * Returns the value of field 'randomNumber'.
     * 
     * @return the value of field 'randomNumber'.
    **/
    public java.lang.String getRandomNumber()
    {
        return this._randomNumber;
    } //-- java.lang.String getRandomNumber() 

    /**
     * Returns the value of field 'terminalNo'.
     * 
     * @return the value of field 'terminalNo'.
    **/
    public java.lang.String getTerminalNo()
    {
        return this._terminalNo;
    } //-- java.lang.String getTerminalNo() 

    /**
     * Returns the value of field 'tradeDateTime'.
     * 
     * @return the value of field 'tradeDateTime'.
    **/
    public java.lang.String getTradeDateTime()
    {
        return this._tradeDateTime;
    } //-- java.lang.String getTradeDateTime() 

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
     * Returns the value of field 'tranSerial'.
     * 
     * @return the value of field 'tranSerial'.
    **/
    public java.lang.String getTranSerial()
    {
        return this._tranSerial;
    } //-- java.lang.String getTranSerial() 

    /**
     * Returns the value of field 'tranType'.
     * 
     * @return the value of field 'tranType'.
    **/
    public java.lang.String getTranType()
    {
        return this._tranType;
    } //-- java.lang.String getTranType() 

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
     * Sets the value of field 'mac'.
     * 
     * @param mac the value of field 'mac'.
    **/
    public void setMac(java.lang.String mac)
    {
        this._mac = mac;
    } //-- void setMac(java.lang.String) 

    /**
     * Sets the value of field 'payChannel'.
     * 
     * @param payChannel the value of field 'payChannel'.
    **/
    public void setPayChannel(java.lang.String payChannel)
    {
        this._payChannel = payChannel;
    } //-- void setPayChannel(java.lang.String) 

    /**
     * Sets the value of field 'payMode'.
     * 
     * @param payMode the value of field 'payMode'.
    **/
    public void setPayMode(java.lang.String payMode)
    {
        this._payMode = payMode;
    } //-- void setPayMode(java.lang.String) 

    /**
     * Sets the value of field 'randomNumber'.
     * 
     * @param randomNumber the value of field 'randomNumber'.
    **/
    public void setRandomNumber(java.lang.String randomNumber)
    {
        this._randomNumber = randomNumber;
    } //-- void setRandomNumber(java.lang.String) 

    /**
     * Sets the value of field 'terminalNo'.
     * 
     * @param terminalNo the value of field 'terminalNo'.
    **/
    public void setTerminalNo(java.lang.String terminalNo)
    {
        this._terminalNo = terminalNo;
    } //-- void setTerminalNo(java.lang.String) 

    /**
     * Sets the value of field 'tradeDateTime'.
     * 
     * @param tradeDateTime the value of field 'tradeDateTime'.
    **/
    public void setTradeDateTime(java.lang.String tradeDateTime)
    {
        this._tradeDateTime = tradeDateTime;
    } //-- void setTradeDateTime(java.lang.String) 

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
     * Sets the value of field 'tranSerial'.
     * 
     * @param tranSerial the value of field 'tranSerial'.
    **/
    public void setTranSerial(java.lang.String tranSerial)
    {
        this._tranSerial = tranSerial;
    } //-- void setTranSerial(java.lang.String) 

    /**
     * Sets the value of field 'tranType'.
     * 
     * @param tranType the value of field 'tranType'.
    **/
    public void setTranType(java.lang.String tranType)
    {
        this._tranType = tranType;
    } //-- void setTranType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
