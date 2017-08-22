/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp;

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
public class Result_Data implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _realName;

    private java.lang.String _sex;

    private java.lang.String _idCardNo;

    private java.lang.String _phoneNo;

    private java.lang.String _email;

    private java.lang.String _bloodType;

    private java.lang.String _marriage;

    private java.lang.String _birthday;

    private java.lang.String _address;

    private java.lang.String _imgBase64;

    private java.lang.String _cardNum;

    private java.lang.String _orgName;

    private java.lang.String _orgCode;

    private java.lang.String _userType;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Result_Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'address'.
    **/
    public java.lang.String getAddress()
    {
        return this._address;
    } //-- java.lang.String getAddress() 

    /**
     * Returns the value of field 'birthday'.
     * 
     * @return the value of field 'birthday'.
    **/
    public java.lang.String getBirthday()
    {
        return this._birthday;
    } //-- java.lang.String getBirthday() 

    /**
     * Returns the value of field 'bloodType'.
     * 
     * @return the value of field 'bloodType'.
    **/
    public java.lang.String getBloodType()
    {
        return this._bloodType;
    } //-- java.lang.String getBloodType() 

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
     * Returns the value of field 'email'.
     * 
     * @return the value of field 'email'.
    **/
    public java.lang.String getEmail()
    {
        return this._email;
    } //-- java.lang.String getEmail() 

    /**
     * Returns the value of field 'idCardNo'.
     * 
     * @return the value of field 'idCardNo'.
    **/
    public java.lang.String getIdCardNo()
    {
        return this._idCardNo;
    } //-- java.lang.String getIdCardNo() 

    /**
     * Returns the value of field 'imgBase64'.
     * 
     * @return the value of field 'imgBase64'.
    **/
    public java.lang.String getImgBase64()
    {
        return this._imgBase64;
    } //-- java.lang.String getImgBase64() 

    /**
     * Returns the value of field 'marriage'.
     * 
     * @return the value of field 'marriage'.
    **/
    public java.lang.String getMarriage()
    {
        return this._marriage;
    } //-- java.lang.String getMarriage() 

    /**
     * Returns the value of field 'orgCode'.
     * 
     * @return the value of field 'orgCode'.
    **/
    public java.lang.String getOrgCode()
    {
        return this._orgCode;
    } //-- java.lang.String getOrgCode() 

    /**
     * Returns the value of field 'orgName'.
     * 
     * @return the value of field 'orgName'.
    **/
    public java.lang.String getOrgName()
    {
        return this._orgName;
    } //-- java.lang.String getOrgName() 

    /**
     * Returns the value of field 'phoneNo'.
     * 
     * @return the value of field 'phoneNo'.
    **/
    public java.lang.String getPhoneNo()
    {
        return this._phoneNo;
    } //-- java.lang.String getPhoneNo() 

    /**
     * Returns the value of field 'realName'.
     * 
     * @return the value of field 'realName'.
    **/
    public java.lang.String getRealName()
    {
        return this._realName;
    } //-- java.lang.String getRealName() 

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
     * Returns the value of field 'userType'.
     * 
     * @return the value of field 'userType'.
    **/
    public java.lang.String getUserType()
    {
        return this._userType;
    } //-- java.lang.String getUserType() 

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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
    **/
    public void setAddress(java.lang.String address)
    {
        this._address = address;
    } //-- void setAddress(java.lang.String) 

    /**
     * Sets the value of field 'birthday'.
     * 
     * @param birthday the value of field 'birthday'.
    **/
    public void setBirthday(java.lang.String birthday)
    {
        this._birthday = birthday;
    } //-- void setBirthday(java.lang.String) 

    /**
     * Sets the value of field 'bloodType'.
     * 
     * @param bloodType the value of field 'bloodType'.
    **/
    public void setBloodType(java.lang.String bloodType)
    {
        this._bloodType = bloodType;
    } //-- void setBloodType(java.lang.String) 

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
     * Sets the value of field 'email'.
     * 
     * @param email the value of field 'email'.
    **/
    public void setEmail(java.lang.String email)
    {
        this._email = email;
    } //-- void setEmail(java.lang.String) 

    /**
     * Sets the value of field 'idCardNo'.
     * 
     * @param idCardNo the value of field 'idCardNo'.
    **/
    public void setIdCardNo(java.lang.String idCardNo)
    {
        this._idCardNo = idCardNo;
    } //-- void setIdCardNo(java.lang.String) 

    /**
     * Sets the value of field 'imgBase64'.
     * 
     * @param imgBase64 the value of field 'imgBase64'.
    **/
    public void setImgBase64(java.lang.String imgBase64)
    {
        this._imgBase64 = imgBase64;
    } //-- void setImgBase64(java.lang.String) 

    /**
     * Sets the value of field 'marriage'.
     * 
     * @param marriage the value of field 'marriage'.
    **/
    public void setMarriage(java.lang.String marriage)
    {
        this._marriage = marriage;
    } //-- void setMarriage(java.lang.String) 

    /**
     * Sets the value of field 'orgCode'.
     * 
     * @param orgCode the value of field 'orgCode'.
    **/
    public void setOrgCode(java.lang.String orgCode)
    {
        this._orgCode = orgCode;
    } //-- void setOrgCode(java.lang.String) 

    /**
     * Sets the value of field 'orgName'.
     * 
     * @param orgName the value of field 'orgName'.
    **/
    public void setOrgName(java.lang.String orgName)
    {
        this._orgName = orgName;
    } //-- void setOrgName(java.lang.String) 

    /**
     * Sets the value of field 'phoneNo'.
     * 
     * @param phoneNo the value of field 'phoneNo'.
    **/
    public void setPhoneNo(java.lang.String phoneNo)
    {
        this._phoneNo = phoneNo;
    } //-- void setPhoneNo(java.lang.String) 

    /**
     * Sets the value of field 'realName'.
     * 
     * @param realName the value of field 'realName'.
    **/
    public void setRealName(java.lang.String realName)
    {
        this._realName = realName;
    } //-- void setRealName(java.lang.String) 

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
     * Sets the value of field 'userType'.
     * 
     * @param userType the value of field 'userType'.
    **/
    public void setUserType(java.lang.String userType)
    {
        this._userType = userType;
    } //-- void setUserType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
