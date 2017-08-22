/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req;

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

    private java.lang.String _totalAmount;

    private java.lang.String _chipSerial;

    private java.lang.String _cardSerial;

    private java.lang.String _tranSerialBefore;

    private java.lang.String _tranType;

    private java.lang.String _terminalNo;

    private java.lang.String _terminalTranNo;

    private java.lang.String _tac;

    private java.lang.String _tradeDateTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request()


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
     * Returns the value of field 'tac'.
     * 
     * @return the value of field 'tac'.
    **/
    public java.lang.String getTac()
    {
        return this._tac;
    } //-- java.lang.String getTac() 

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
     * Returns the value of field 'terminalTranNo'.
     * 
     * @return the value of field 'terminalTranNo'.
    **/
    public java.lang.String getTerminalTranNo()
    {
        return this._terminalTranNo;
    } //-- java.lang.String getTerminalTranNo() 

    /**
     * Returns the value of field 'totalAmount'.
     * 
     * @return the value of field 'totalAmount'.
    **/
    public java.lang.String getTotalAmount()
    {
        return this._totalAmount;
    } //-- java.lang.String getTotalAmount() 

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
     * Returns the value of field 'tranSerialBefore'.
     * 
     * @return the value of field 'tranSerialBefore'.
    **/
    public java.lang.String getTranSerialBefore()
    {
        return this._tranSerialBefore;
    } //-- java.lang.String getTranSerialBefore() 

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
     * Sets the value of field 'tac'.
     * 
     * @param tac the value of field 'tac'.
    **/
    public void setTac(java.lang.String tac)
    {
        this._tac = tac;
    } //-- void setTac(java.lang.String) 

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
     * Sets the value of field 'terminalTranNo'.
     * 
     * @param terminalTranNo the value of field 'terminalTranNo'.
    **/
    public void setTerminalTranNo(java.lang.String terminalTranNo)
    {
        this._terminalTranNo = terminalTranNo;
    } //-- void setTerminalTranNo(java.lang.String) 

    /**
     * Sets the value of field 'totalAmount'.
     * 
     * @param totalAmount the value of field 'totalAmount'.
    **/
    public void setTotalAmount(java.lang.String totalAmount)
    {
        this._totalAmount = totalAmount;
    } //-- void setTotalAmount(java.lang.String) 

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
     * Sets the value of field 'tranSerialBefore'.
     * 
     * @param tranSerialBefore the value of field 'tranSerialBefore'
    **/
    public void setTranSerialBefore(java.lang.String tranSerialBefore)
    {
        this._tranSerialBefore = tranSerialBefore;
    } //-- void setTranSerialBefore(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
