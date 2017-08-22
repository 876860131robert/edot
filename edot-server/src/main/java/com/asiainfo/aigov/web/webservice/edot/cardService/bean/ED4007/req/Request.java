/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req;

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

    private java.lang.String _idNo;

    private java.lang.String _cardNo;

    private java.lang.String _appId;

    private java.lang.String _userName;

    private java.lang.String _passWord;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appId'.
     * 
     * @return the value of field 'appId'.
    **/
    public java.lang.String getAppId()
    {
        return this._appId;
    } //-- java.lang.String getAppId() 

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
     * Returns the value of field 'idNo'.
     * 
     * @return the value of field 'idNo'.
    **/
    public java.lang.String getIdNo()
    {
        return this._idNo;
    } //-- java.lang.String getIdNo() 

    /**
     * Returns the value of field 'passWord'.
     * 
     * @return the value of field 'passWord'.
    **/
    public java.lang.String getPassWord()
    {
        return this._passWord;
    } //-- java.lang.String getPassWord() 

    /**
     * Returns the value of field 'userName'.
     * 
     * @return the value of field 'userName'.
    **/
    public java.lang.String getUserName()
    {
        return this._userName;
    } //-- java.lang.String getUserName() 

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
     * Sets the value of field 'appId'.
     * 
     * @param appId the value of field 'appId'.
    **/
    public void setAppId(java.lang.String appId)
    {
        this._appId = appId;
    } //-- void setAppId(java.lang.String) 

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
     * Sets the value of field 'idNo'.
     * 
     * @param idNo the value of field 'idNo'.
    **/
    public void setIdNo(java.lang.String idNo)
    {
        this._idNo = idNo;
    } //-- void setIdNo(java.lang.String) 

    /**
     * Sets the value of field 'passWord'.
     * 
     * @param passWord the value of field 'passWord'.
    **/
    public void setPassWord(java.lang.String passWord)
    {
        this._passWord = passWord;
    } //-- void setPassWord(java.lang.String) 

    /**
     * Sets the value of field 'userName'.
     * 
     * @param userName the value of field 'userName'.
    **/
    public void setUserName(java.lang.String userName)
    {
        this._userName = userName;
    } //-- void setUserName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
