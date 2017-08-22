/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req;

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

    private java.lang.String _patientId;

    private java.lang.String _patientName;

    private java.lang.String _phoneNum;

    private java.lang.String _certCode;

    private java.lang.String _hosId;

    private java.lang.String _cardNum;

    private java.lang.String _defaultFlag;

    private java.lang.String _operId;

    private java.lang.String _operdate;

    private java.lang.String _hisPatientId;

    private java.lang.String _hosCode;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'certCode'.
     * 
     * @return the value of field 'certCode'.
    **/
    public java.lang.String getCertCode()
    {
        return this._certCode;
    } //-- java.lang.String getCertCode() 

    /**
     * Returns the value of field 'consumer'.
     * 
     * @return the value of field 'consumer'.
    **/
    public java.lang.String getConsumer()
    {
        return this._consumer;
    } //-- java.lang.String getConsumer() 

    /**
     * Returns the value of field 'defaultFlag'.
     * 
     * @return the value of field 'defaultFlag'.
    **/
    public java.lang.String getDefaultFlag()
    {
        return this._defaultFlag;
    } //-- java.lang.String getDefaultFlag() 

    /**
     * Returns the value of field 'hisPatientId'.
     * 
     * @return the value of field 'hisPatientId'.
    **/
    public java.lang.String getHisPatientId()
    {
        return this._hisPatientId;
    } //-- java.lang.String getHisPatientId() 

    /**
     * Returns the value of field 'hosCode'.
     * 
     * @return the value of field 'hosCode'.
    **/
    public java.lang.String getHosCode()
    {
        return this._hosCode;
    } //-- java.lang.String getHosCode() 

    /**
     * Returns the value of field 'hosId'.
     * 
     * @return the value of field 'hosId'.
    **/
    public java.lang.String getHosId()
    {
        return this._hosId;
    } //-- java.lang.String getHosId() 

    /**
     * Returns the value of field 'operId'.
     * 
     * @return the value of field 'operId'.
    **/
    public java.lang.String getOperId()
    {
        return this._operId;
    } //-- java.lang.String getOperId() 

    /**
     * Returns the value of field 'operdate'.
     * 
     * @return the value of field 'operdate'.
    **/
    public java.lang.String getOperdate()
    {
        return this._operdate;
    } //-- java.lang.String getOperdate() 

    /**
     * Returns the value of field 'patientId'.
     * 
     * @return the value of field 'patientId'.
    **/
    public java.lang.String getPatientId()
    {
        return this._patientId;
    } //-- java.lang.String getPatientId() 

    /**
     * Returns the value of field 'patientName'.
     * 
     * @return the value of field 'patientName'.
    **/
    public java.lang.String getPatientName()
    {
        return this._patientName;
    } //-- java.lang.String getPatientName() 

    /**
     * Returns the value of field 'phoneNum'.
     * 
     * @return the value of field 'phoneNum'.
    **/
    public java.lang.String getPhoneNum()
    {
        return this._phoneNum;
    } //-- java.lang.String getPhoneNum() 

    /**
     * Returns the value of field 'sysType'.
     * 
     * @return the value of field 'sysType'.
    **/
    public java.lang.String getSysType()
    {
        return this._sysType;
    } //-- java.lang.String getSysType() 

    /**
     * Returns the value of field 'token'.
     * 
     * @return the value of field 'token'.
    **/
    public java.lang.String getToken()
    {
        return this._token;
    } //-- java.lang.String getToken() 

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
     * Sets the value of field 'cardNum'.
     * 
     * @param cardNum the value of field 'cardNum'.
    **/
    public void setCardNum(java.lang.String cardNum)
    {
        this._cardNum = cardNum;
    } //-- void setCardNum(java.lang.String) 

    /**
     * Sets the value of field 'certCode'.
     * 
     * @param certCode the value of field 'certCode'.
    **/
    public void setCertCode(java.lang.String certCode)
    {
        this._certCode = certCode;
    } //-- void setCertCode(java.lang.String) 

    /**
     * Sets the value of field 'consumer'.
     * 
     * @param consumer the value of field 'consumer'.
    **/
    public void setConsumer(java.lang.String consumer)
    {
        this._consumer = consumer;
    } //-- void setConsumer(java.lang.String) 

    /**
     * Sets the value of field 'defaultFlag'.
     * 
     * @param defaultFlag the value of field 'defaultFlag'.
    **/
    public void setDefaultFlag(java.lang.String defaultFlag)
    {
        this._defaultFlag = defaultFlag;
    } //-- void setDefaultFlag(java.lang.String) 

    /**
     * Sets the value of field 'hisPatientId'.
     * 
     * @param hisPatientId the value of field 'hisPatientId'.
    **/
    public void setHisPatientId(java.lang.String hisPatientId)
    {
        this._hisPatientId = hisPatientId;
    } //-- void setHisPatientId(java.lang.String) 

    /**
     * Sets the value of field 'hosCode'.
     * 
     * @param hosCode the value of field 'hosCode'.
    **/
    public void setHosCode(java.lang.String hosCode)
    {
        this._hosCode = hosCode;
    } //-- void setHosCode(java.lang.String) 

    /**
     * Sets the value of field 'hosId'.
     * 
     * @param hosId the value of field 'hosId'.
    **/
    public void setHosId(java.lang.String hosId)
    {
        this._hosId = hosId;
    } //-- void setHosId(java.lang.String) 

    /**
     * Sets the value of field 'operId'.
     * 
     * @param operId the value of field 'operId'.
    **/
    public void setOperId(java.lang.String operId)
    {
        this._operId = operId;
    } //-- void setOperId(java.lang.String) 

    /**
     * Sets the value of field 'operdate'.
     * 
     * @param operdate the value of field 'operdate'.
    **/
    public void setOperdate(java.lang.String operdate)
    {
        this._operdate = operdate;
    } //-- void setOperdate(java.lang.String) 

    /**
     * Sets the value of field 'patientId'.
     * 
     * @param patientId the value of field 'patientId'.
    **/
    public void setPatientId(java.lang.String patientId)
    {
        this._patientId = patientId;
    } //-- void setPatientId(java.lang.String) 

    /**
     * Sets the value of field 'patientName'.
     * 
     * @param patientName the value of field 'patientName'.
    **/
    public void setPatientName(java.lang.String patientName)
    {
        this._patientName = patientName;
    } //-- void setPatientName(java.lang.String) 

    /**
     * Sets the value of field 'phoneNum'.
     * 
     * @param phoneNum the value of field 'phoneNum'.
    **/
    public void setPhoneNum(java.lang.String phoneNum)
    {
        this._phoneNum = phoneNum;
    } //-- void setPhoneNum(java.lang.String) 

    /**
     * Sets the value of field 'sysType'.
     * 
     * @param sysType the value of field 'sysType'.
    **/
    public void setSysType(java.lang.String sysType)
    {
        this._sysType = sysType;
    } //-- void setSysType(java.lang.String) 

    /**
     * Sets the value of field 'token'.
     * 
     * @param token the value of field 'token'.
    **/
    public void setToken(java.lang.String token)
    {
        this._token = token;
    } //-- void setToken(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
