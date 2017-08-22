/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp;

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

    private java.lang.String _idNo;

    private java.lang.String _cardNo;

    private java.lang.String _name;

    private java.lang.String _phone;

    private java.lang.String _amount;


      //----------------/
     //- Constructors -/
    //----------------/

    public Response() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response()


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
     * Returns the value of field 'errMsg'.
     * 
     * @return the value of field 'errMsg'.
    **/
    public java.lang.String getErrMsg()
    {
        return this._errMsg;
    } //-- java.lang.String getErrMsg() 

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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'phone'.
    **/
    public java.lang.String getPhone()
    {
        return this._phone;
    } //-- java.lang.String getPhone() 

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
     * Sets the value of field 'errMsg'.
     * 
     * @param errMsg the value of field 'errMsg'.
    **/
    public void setErrMsg(java.lang.String errMsg)
    {
        this._errMsg = errMsg;
    } //-- void setErrMsg(java.lang.String) 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
    **/
    public void setPhone(java.lang.String phone)
    {
        this._phone = phone;
    } //-- void setPhone(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
