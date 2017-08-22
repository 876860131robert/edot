/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req;

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

    private java.lang.String _hospital_Mark;

    private java.lang.String _serviceName;

    private java.lang.String _cardno;

    private java.lang.String _patname;

    private java.lang.String _sex;

    private java.lang.String _birthdate;

    private java.lang.String _age;

    private java.lang.String _id_code;

    private java.lang.String _psamno;

    private java.lang.String _address;

    private java.lang.String _phone;

    private java.lang.String _oper_date;

    private java.lang.String _oper_time;

    private java.lang.String _card_type;

    private java.lang.String _p_noteno;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;

    private java.lang.String _kiosk_No;

    private java.lang.String _patient_id;

    private java.lang.String _reg_type;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request()


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
     * Returns the value of field 'age'.
     * 
     * @return the value of field 'age'.
    **/
    public java.lang.String getAge()
    {
        return this._age;
    } //-- java.lang.String getAge() 

    /**
     * Returns the value of field 'birthdate'.
     * 
     * @return the value of field 'birthdate'.
    **/
    public java.lang.String getBirthdate()
    {
        return this._birthdate;
    } //-- java.lang.String getBirthdate() 

    /**
     * Returns the value of field 'card_type'.
     * 
     * @return the value of field 'card_type'.
    **/
    public java.lang.String getCard_type()
    {
        return this._card_type;
    } //-- java.lang.String getCard_type() 

    /**
     * Returns the value of field 'cardno'.
     * 
     * @return the value of field 'cardno'.
    **/
    public java.lang.String getCardno()
    {
        return this._cardno;
    } //-- java.lang.String getCardno() 

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
     * Returns the value of field 'hospital_Mark'.
     * 
     * @return the value of field 'hospital_Mark'.
    **/
    public java.lang.String getHospital_Mark()
    {
        return this._hospital_Mark;
    } //-- java.lang.String getHospital_Mark() 

    /**
     * Returns the value of field 'id_code'.
     * 
     * @return the value of field 'id_code'.
    **/
    public java.lang.String getId_code()
    {
        return this._id_code;
    } //-- java.lang.String getId_code() 

    /**
     * Returns the value of field 'kiosk_No'.
     * 
     * @return the value of field 'kiosk_No'.
    **/
    public java.lang.String getKiosk_No()
    {
        return this._kiosk_No;
    } //-- java.lang.String getKiosk_No() 

    /**
     * Returns the value of field 'oper_date'.
     * 
     * @return the value of field 'oper_date'.
    **/
    public java.lang.String getOper_date()
    {
        return this._oper_date;
    } //-- java.lang.String getOper_date() 

    /**
     * Returns the value of field 'oper_time'.
     * 
     * @return the value of field 'oper_time'.
    **/
    public java.lang.String getOper_time()
    {
        return this._oper_time;
    } //-- java.lang.String getOper_time() 

    /**
     * Returns the value of field 'p_noteno'.
     * 
     * @return the value of field 'p_noteno'.
    **/
    public java.lang.String getP_noteno()
    {
        return this._p_noteno;
    } //-- java.lang.String getP_noteno() 

    /**
     * Returns the value of field 'patient_id'.
     * 
     * @return the value of field 'patient_id'.
    **/
    public java.lang.String getPatient_id()
    {
        return this._patient_id;
    } //-- java.lang.String getPatient_id() 

    /**
     * Returns the value of field 'patname'.
     * 
     * @return the value of field 'patname'.
    **/
    public java.lang.String getPatname()
    {
        return this._patname;
    } //-- java.lang.String getPatname() 

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
     * Returns the value of field 'psamno'.
     * 
     * @return the value of field 'psamno'.
    **/
    public java.lang.String getPsamno()
    {
        return this._psamno;
    } //-- java.lang.String getPsamno() 

    /**
     * Returns the value of field 'reg_type'.
     * 
     * @return the value of field 'reg_type'.
    **/
    public java.lang.String getReg_type()
    {
        return this._reg_type;
    } //-- java.lang.String getReg_type() 

    /**
     * Returns the value of field 'serviceName'.
     * 
     * @return the value of field 'serviceName'.
    **/
    public java.lang.String getServiceName()
    {
        return this._serviceName;
    } //-- java.lang.String getServiceName() 

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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
    **/
    public void setAddress(java.lang.String address)
    {
        this._address = address;
    } //-- void setAddress(java.lang.String) 

    /**
     * Sets the value of field 'age'.
     * 
     * @param age the value of field 'age'.
    **/
    public void setAge(java.lang.String age)
    {
        this._age = age;
    } //-- void setAge(java.lang.String) 

    /**
     * Sets the value of field 'birthdate'.
     * 
     * @param birthdate the value of field 'birthdate'.
    **/
    public void setBirthdate(java.lang.String birthdate)
    {
        this._birthdate = birthdate;
    } //-- void setBirthdate(java.lang.String) 

    /**
     * Sets the value of field 'card_type'.
     * 
     * @param card_type the value of field 'card_type'.
    **/
    public void setCard_type(java.lang.String card_type)
    {
        this._card_type = card_type;
    } //-- void setCard_type(java.lang.String) 

    /**
     * Sets the value of field 'cardno'.
     * 
     * @param cardno the value of field 'cardno'.
    **/
    public void setCardno(java.lang.String cardno)
    {
        this._cardno = cardno;
    } //-- void setCardno(java.lang.String) 

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
     * Sets the value of field 'hospital_Mark'.
     * 
     * @param hospital_Mark the value of field 'hospital_Mark'.
    **/
    public void setHospital_Mark(java.lang.String hospital_Mark)
    {
        this._hospital_Mark = hospital_Mark;
    } //-- void setHospital_Mark(java.lang.String) 

    /**
     * Sets the value of field 'id_code'.
     * 
     * @param id_code the value of field 'id_code'.
    **/
    public void setId_code(java.lang.String id_code)
    {
        this._id_code = id_code;
    } //-- void setId_code(java.lang.String) 

    /**
     * Sets the value of field 'kiosk_No'.
     * 
     * @param kiosk_No the value of field 'kiosk_No'.
    **/
    public void setKiosk_No(java.lang.String kiosk_No)
    {
        this._kiosk_No = kiosk_No;
    } //-- void setKiosk_No(java.lang.String) 

    /**
     * Sets the value of field 'oper_date'.
     * 
     * @param oper_date the value of field 'oper_date'.
    **/
    public void setOper_date(java.lang.String oper_date)
    {
        this._oper_date = oper_date;
    } //-- void setOper_date(java.lang.String) 

    /**
     * Sets the value of field 'oper_time'.
     * 
     * @param oper_time the value of field 'oper_time'.
    **/
    public void setOper_time(java.lang.String oper_time)
    {
        this._oper_time = oper_time;
    } //-- void setOper_time(java.lang.String) 

    /**
     * Sets the value of field 'p_noteno'.
     * 
     * @param p_noteno the value of field 'p_noteno'.
    **/
    public void setP_noteno(java.lang.String p_noteno)
    {
        this._p_noteno = p_noteno;
    } //-- void setP_noteno(java.lang.String) 

    /**
     * Sets the value of field 'patient_id'.
     * 
     * @param patient_id the value of field 'patient_id'.
    **/
    public void setPatient_id(java.lang.String patient_id)
    {
        this._patient_id = patient_id;
    } //-- void setPatient_id(java.lang.String) 

    /**
     * Sets the value of field 'patname'.
     * 
     * @param patname the value of field 'patname'.
    **/
    public void setPatname(java.lang.String patname)
    {
        this._patname = patname;
    } //-- void setPatname(java.lang.String) 

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
     * Sets the value of field 'psamno'.
     * 
     * @param psamno the value of field 'psamno'.
    **/
    public void setPsamno(java.lang.String psamno)
    {
        this._psamno = psamno;
    } //-- void setPsamno(java.lang.String) 

    /**
     * Sets the value of field 'reg_type'.
     * 
     * @param reg_type the value of field 'reg_type'.
    **/
    public void setReg_type(java.lang.String reg_type)
    {
        this._reg_type = reg_type;
    } //-- void setReg_type(java.lang.String) 

    /**
     * Sets the value of field 'serviceName'.
     * 
     * @param serviceName the value of field 'serviceName'.
    **/
    public void setServiceName(java.lang.String serviceName)
    {
        this._serviceName = serviceName;
    } //-- void setServiceName(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
