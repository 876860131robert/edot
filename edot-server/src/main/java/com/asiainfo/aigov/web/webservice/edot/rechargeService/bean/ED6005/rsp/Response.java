/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp;

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
public class Response implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _resultCode;

    private java.lang.String _errMsg;

    private java.lang.String _cardNo;

    private java.lang.String _amount;

    private java.lang.String _totalAmount;

    private java.lang.String _chipSerial;

    private java.lang.String _cardSerial;

    private java.lang.String _terminalTranNo;

    private java.lang.String _terminalNo;


      //----------------/
     //- Constructors -/
    //----------------/

    public Response() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response()


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
     * Returns the value of field 'errMsg'.
     * 
     * @return the value of field 'errMsg'.
    **/
    public java.lang.String getErrMsg()
    {
        return this._errMsg;
    } //-- java.lang.String getErrMsg() 

    /**
     * Returns the value of field 'resultCode'.
     * 
     * @return the value of field 'resultCode'.
    **/
    public java.lang.String getResultCode()
    {
        return this._resultCode;
    } //-- java.lang.String getResultCode() 

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
     * Sets the value of field 'errMsg'.
     * 
     * @param errMsg the value of field 'errMsg'.
    **/
    public void setErrMsg(java.lang.String errMsg)
    {
        this._errMsg = errMsg;
    } //-- void setErrMsg(java.lang.String) 

    /**
     * Sets the value of field 'resultCode'.
     * 
     * @param resultCode the value of field 'resultCode'.
    **/
    public void setResultCode(java.lang.String resultCode)
    {
        this._resultCode = resultCode;
    } //-- void setResultCode(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
