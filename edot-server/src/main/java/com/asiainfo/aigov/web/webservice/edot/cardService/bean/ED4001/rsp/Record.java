/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp;

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

    private java.lang.String _cardNo;

    private java.lang.String _masterCardType;

    private java.lang.String _masterCardTypeDesc;

    private java.lang.String _daugherCardType;

    private java.lang.String _daugherCardTypeDesc;

    private java.lang.String _cardStatus;

    private java.lang.String _cardStatusDesc;

    private java.lang.String _cardValidity;

    private java.lang.String _cardNcmsno;

      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'cardStatus'.
     * 
     * @return the value of field 'cardStatus'.
    **/
    public java.lang.String getCardStatus()
    {
        return this._cardStatus;
    } //-- java.lang.String getCardStatus() 

    /**
     * Returns the value of field 'cardStatusDesc'.
     * 
     * @return the value of field 'cardStatusDesc'.
    **/
    public java.lang.String getCardStatusDesc()
    {
        return this._cardStatusDesc;
    } //-- java.lang.String getCardStatusDesc() 

    /**
     * Returns the value of field 'cardValidity'.
     * 
     * @return the value of field 'cardValidity'.
    **/
    public java.lang.String getCardValidity()
    {
        return this._cardValidity;
    } //-- java.lang.String getCardValidity() 

    /**
     * Returns the value of field 'daugherCardType'.
     * 
     * @return the value of field 'daugherCardType'.
    **/
    public java.lang.String getDaugherCardType()
    {
        return this._daugherCardType;
    } //-- java.lang.String getDaugherCardType() 

    /**
     * Returns the value of field 'daugherCardTypeDesc'.
     * 
     * @return the value of field 'daugherCardTypeDesc'.
    **/
    public java.lang.String getDaugherCardTypeDesc()
    {
        return this._daugherCardTypeDesc;
    } //-- java.lang.String getDaugherCardTypeDesc() 

    /**
     * Returns the value of field 'masterCardType'.
     * 
     * @return the value of field 'masterCardType'.
    **/
    public java.lang.String getMasterCardType()
    {
        return this._masterCardType;
    } //-- java.lang.String getMasterCardType() 

    /**
     * Returns the value of field 'masterCardTypeDesc'.
     * 
     * @return the value of field 'masterCardTypeDesc'.
    **/
    public java.lang.String getMasterCardTypeDesc()
    {
        return this._masterCardTypeDesc;
    } //-- java.lang.String getMasterCardTypeDesc() 

    public java.lang.String getCardNcmsno()
    {
        return this._cardNcmsno;
    }
    
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
     * Sets the value of field 'cardNo'.
     * 
     * @param cardNo the value of field 'cardNo'.
    **/
    public void setCardNo(java.lang.String cardNo)
    {
        this._cardNo = cardNo;
    } //-- void setCardNo(java.lang.String) 

    /**
     * Sets the value of field 'cardStatus'.
     * 
     * @param cardStatus the value of field 'cardStatus'.
    **/
    public void setCardStatus(java.lang.String cardStatus)
    {
        this._cardStatus = cardStatus;
    } //-- void setCardStatus(java.lang.String) 

    /**
     * Sets the value of field 'cardStatusDesc'.
     * 
     * @param cardStatusDesc the value of field 'cardStatusDesc'.
    **/
    public void setCardStatusDesc(java.lang.String cardStatusDesc)
    {
        this._cardStatusDesc = cardStatusDesc;
    } //-- void setCardStatusDesc(java.lang.String) 

    /**
     * Sets the value of field 'cardValidity'.
     * 
     * @param cardValidity the value of field 'cardValidity'.
    **/
    public void setCardValidity(java.lang.String cardValidity)
    {
        this._cardValidity = cardValidity;
    } //-- void setCardValidity(java.lang.String) 

    /**
     * Sets the value of field 'daugherCardType'.
     * 
     * @param daugherCardType the value of field 'daugherCardType'.
    **/
    public void setDaugherCardType(java.lang.String daugherCardType)
    {
        this._daugherCardType = daugherCardType;
    } //-- void setDaugherCardType(java.lang.String) 

    /**
     * Sets the value of field 'daugherCardTypeDesc'.
     * 
     * @param daugherCardTypeDesc the value of field
     * 'daugherCardTypeDesc'.
    **/
    public void setDaugherCardTypeDesc(java.lang.String daugherCardTypeDesc)
    {
        this._daugherCardTypeDesc = daugherCardTypeDesc;
    } //-- void setDaugherCardTypeDesc(java.lang.String) 

    /**
     * Sets the value of field 'masterCardType'.
     * 
     * @param masterCardType the value of field 'masterCardType'.
    **/
    public void setMasterCardType(java.lang.String masterCardType)
    {
        this._masterCardType = masterCardType;
    } //-- void setMasterCardType(java.lang.String) 

    /**
     * Sets the value of field 'masterCardTypeDesc'.
     * 
     * @param masterCardTypeDesc the value of field
     * 'masterCardTypeDesc'.
    **/
    public void setMasterCardTypeDesc(java.lang.String masterCardTypeDesc)
    {
        this._masterCardTypeDesc = masterCardTypeDesc;
    } //-- void setMasterCardTypeDesc(java.lang.String) 

    public void setCardNcmsno(java.lang.String cardNcmsno)
    {
        this._cardNcmsno = cardNcmsno;
    }
    
    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
