/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req;

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

    private java.lang.String _cardType;

    private java.lang.String _cardNo;

    private java.lang.String _cardName;

    private java.lang.String _sex;

    private java.lang.String _combinedTreatmentNo;

    private java.lang.String _nation;

    private java.lang.String _censusRegister;

    private java.lang.String _censusRegisterAddr;

    private java.lang.String _contractPhone;

    private java.lang.String _expiryDateStart;

    private java.lang.String _expiryDateEnd;

    private java.lang.String _idFront;

    private java.lang.String _idBack;

    private java.lang.String _idHand;

    private java.lang.String _obtainCardtype;

    private java.lang.String _obtainCardnet;

    private java.lang.String _payType;

    private java.lang.String _mailAddr;

    private java.lang.String _loginName;

    private java.lang.String _appId;

    private java.lang.String _userName;

    private java.lang.String _passWord;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request()


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
     * Returns the value of field 'cardName'.
     * 
     * @return the value of field 'cardName'.
    **/
    public java.lang.String getCardName()
    {
        return this._cardName;
    } //-- java.lang.String getCardName() 

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
     * Returns the value of field 'censusRegister'.
     * 
     * @return the value of field 'censusRegister'.
    **/
    public java.lang.String getCensusRegister()
    {
        return this._censusRegister;
    } //-- java.lang.String getCensusRegister() 

    /**
     * Returns the value of field 'censusRegisterAddr'.
     * 
     * @return the value of field 'censusRegisterAddr'.
    **/
    public java.lang.String getCensusRegisterAddr()
    {
        return this._censusRegisterAddr;
    } //-- java.lang.String getCensusRegisterAddr() 

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
     * Returns the value of field 'contractPhone'.
     * 
     * @return the value of field 'contractPhone'.
    **/
    public java.lang.String getContractPhone()
    {
        return this._contractPhone;
    } //-- java.lang.String getContractPhone() 

    /**
     * Returns the value of field 'expiryDateEnd'.
     * 
     * @return the value of field 'expiryDateEnd'.
    **/
    public java.lang.String getExpiryDateEnd()
    {
        return this._expiryDateEnd;
    } //-- java.lang.String getExpiryDateEnd() 

    /**
     * Returns the value of field 'expiryDateStart'.
     * 
     * @return the value of field 'expiryDateStart'.
    **/
    public java.lang.String getExpiryDateStart()
    {
        return this._expiryDateStart;
    } //-- java.lang.String getExpiryDateStart() 

    /**
     * Returns the value of field 'idBack'.
     * 
     * @return the value of field 'idBack'.
    **/
    public java.lang.String getIdBack()
    {
        return this._idBack;
    } //-- java.lang.String getIdBack() 

    /**
     * Returns the value of field 'idFront'.
     * 
     * @return the value of field 'idFront'.
    **/
    public java.lang.String getIdFront()
    {
        return this._idFront;
    } //-- java.lang.String getIdFront() 

    /**
     * Returns the value of field 'idHand'.
     * 
     * @return the value of field 'idHand'.
    **/
    public java.lang.String getIdHand()
    {
        return this._idHand;
    } //-- java.lang.String getIdHand() 

    /**
     * Returns the value of field 'loginName'.
     * 
     * @return the value of field 'loginName'.
    **/
    public java.lang.String getLoginName()
    {
        return this._loginName;
    } //-- java.lang.String getLoginName() 

    /**
     * Returns the value of field 'mailAddr'.
     * 
     * @return the value of field 'mailAddr'.
    **/
    public java.lang.String getMailAddr()
    {
        return this._mailAddr;
    } //-- java.lang.String getMailAddr() 

    /**
     * Returns the value of field 'nation'.
     * 
     * @return the value of field 'nation'.
    **/
    public java.lang.String getNation()
    {
        return this._nation;
    } //-- java.lang.String getNation() 

    /**
     * Returns the value of field 'obtainCardnet'.
     * 
     * @return the value of field 'obtainCardnet'.
    **/
    public java.lang.String getObtainCardnet()
    {
        return this._obtainCardnet;
    } //-- java.lang.String getObtainCardnet() 

    /**
     * Returns the value of field 'obtainCardtype'.
     * 
     * @return the value of field 'obtainCardtype'.
    **/
    public java.lang.String getObtainCardtype()
    {
        return this._obtainCardtype;
    } //-- java.lang.String getObtainCardtype() 

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
     * Returns the value of field 'payType'.
     * 
     * @return the value of field 'payType'.
    **/
    public java.lang.String getPayType()
    {
        return this._payType;
    } //-- java.lang.String getPayType() 

    /**
     * Returns the value of field 'sex'.
     * 
     * @return the value of field 'sex'.
    **/
    public java.lang.String getSex()
    {
        return this._sex;
    } //-- java.lang.String getSex() 

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
     * Sets the value of field 'cardName'.
     * 
     * @param cardName the value of field 'cardName'.
    **/
    public void setCardName(java.lang.String cardName)
    {
        this._cardName = cardName;
    } //-- void setCardName(java.lang.String) 

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
     * Sets the value of field 'censusRegister'.
     * 
     * @param censusRegister the value of field 'censusRegister'.
    **/
    public void setCensusRegister(java.lang.String censusRegister)
    {
        this._censusRegister = censusRegister;
    } //-- void setCensusRegister(java.lang.String) 

    /**
     * Sets the value of field 'censusRegisterAddr'.
     * 
     * @param censusRegisterAddr the value of field
     * 'censusRegisterAddr'.
    **/
    public void setCensusRegisterAddr(java.lang.String censusRegisterAddr)
    {
        this._censusRegisterAddr = censusRegisterAddr;
    } //-- void setCensusRegisterAddr(java.lang.String) 

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
     * Sets the value of field 'contractPhone'.
     * 
     * @param contractPhone the value of field 'contractPhone'.
    **/
    public void setContractPhone(java.lang.String contractPhone)
    {
        this._contractPhone = contractPhone;
    } //-- void setContractPhone(java.lang.String) 

    /**
     * Sets the value of field 'expiryDateEnd'.
     * 
     * @param expiryDateEnd the value of field 'expiryDateEnd'.
    **/
    public void setExpiryDateEnd(java.lang.String expiryDateEnd)
    {
        this._expiryDateEnd = expiryDateEnd;
    } //-- void setExpiryDateEnd(java.lang.String) 

    /**
     * Sets the value of field 'expiryDateStart'.
     * 
     * @param expiryDateStart the value of field 'expiryDateStart'.
    **/
    public void setExpiryDateStart(java.lang.String expiryDateStart)
    {
        this._expiryDateStart = expiryDateStart;
    } //-- void setExpiryDateStart(java.lang.String) 

    /**
     * Sets the value of field 'idBack'.
     * 
     * @param idBack the value of field 'idBack'.
    **/
    public void setIdBack(java.lang.String idBack)
    {
        this._idBack = idBack;
    } //-- void setIdBack(java.lang.String) 

    /**
     * Sets the value of field 'idFront'.
     * 
     * @param idFront the value of field 'idFront'.
    **/
    public void setIdFront(java.lang.String idFront)
    {
        this._idFront = idFront;
    } //-- void setIdFront(java.lang.String) 

    /**
     * Sets the value of field 'idHand'.
     * 
     * @param idHand the value of field 'idHand'.
    **/
    public void setIdHand(java.lang.String idHand)
    {
        this._idHand = idHand;
    } //-- void setIdHand(java.lang.String) 

    /**
     * Sets the value of field 'loginName'.
     * 
     * @param loginName the value of field 'loginName'.
    **/
    public void setLoginName(java.lang.String loginName)
    {
        this._loginName = loginName;
    } //-- void setLoginName(java.lang.String) 

    /**
     * Sets the value of field 'mailAddr'.
     * 
     * @param mailAddr the value of field 'mailAddr'.
    **/
    public void setMailAddr(java.lang.String mailAddr)
    {
        this._mailAddr = mailAddr;
    } //-- void setMailAddr(java.lang.String) 

    /**
     * Sets the value of field 'nation'.
     * 
     * @param nation the value of field 'nation'.
    **/
    public void setNation(java.lang.String nation)
    {
        this._nation = nation;
    } //-- void setNation(java.lang.String) 

    /**
     * Sets the value of field 'obtainCardnet'.
     * 
     * @param obtainCardnet the value of field 'obtainCardnet'.
    **/
    public void setObtainCardnet(java.lang.String obtainCardnet)
    {
        this._obtainCardnet = obtainCardnet;
    } //-- void setObtainCardnet(java.lang.String) 

    /**
     * Sets the value of field 'obtainCardtype'.
     * 
     * @param obtainCardtype the value of field 'obtainCardtype'.
    **/
    public void setObtainCardtype(java.lang.String obtainCardtype)
    {
        this._obtainCardtype = obtainCardtype;
    } //-- void setObtainCardtype(java.lang.String) 

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
     * Sets the value of field 'payType'.
     * 
     * @param payType the value of field 'payType'.
    **/
    public void setPayType(java.lang.String payType)
    {
        this._payType = payType;
    } //-- void setPayType(java.lang.String) 

    /**
     * Sets the value of field 'sex'.
     * 
     * @param sex the value of field 'sex'.
    **/
    public void setSex(java.lang.String sex)
    {
        this._sex = sex;
    } //-- void setSex(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
