/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req;

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

    private java.lang.String _serviceName;

    private java.lang.String _hospital_Mark;

    private java.lang.String _patient_Id;

    private java.lang.String _charge_Status;

    private java.lang.String _pay_Mode;

    private java.lang.String _flow_No;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;

    private Pay_List _pay_List;

    private java.lang.String _kiosk_No;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'charge_Status'.
     * 
     * @return the value of field 'charge_Status'.
    **/
    public java.lang.String getCharge_Status()
    {
        return this._charge_Status;
    } //-- java.lang.String getCharge_Status() 

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
     * Returns the value of field 'flow_No'.
     * 
     * @return the value of field 'flow_No'.
    **/
    public java.lang.String getFlow_No()
    {
        return this._flow_No;
    } //-- java.lang.String getFlow_No() 

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
     * Returns the value of field 'kiosk_No'.
     * 
     * @return the value of field 'kiosk_No'.
    **/
    public java.lang.String getKiosk_No()
    {
        return this._kiosk_No;
    } //-- java.lang.String getKiosk_No() 

    /**
     * Returns the value of field 'patient_Id'.
     * 
     * @return the value of field 'patient_Id'.
    **/
    public java.lang.String getPatient_Id()
    {
        return this._patient_Id;
    } //-- java.lang.String getPatient_Id() 

    /**
     * Returns the value of field 'pay_List'.
     * 
     * @return the value of field 'pay_List'.
    **/
    public Pay_List getPay_List()
    {
        return this._pay_List;
    } //-- Pay_List getPay_List() 

    /**
     * Returns the value of field 'pay_Mode'.
     * 
     * @return the value of field 'pay_Mode'.
    **/
    public java.lang.String getPay_Mode()
    {
        return this._pay_Mode;
    } //-- java.lang.String getPay_Mode() 

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
     * Sets the value of field 'charge_Status'.
     * 
     * @param charge_Status the value of field 'charge_Status'.
    **/
    public void setCharge_Status(java.lang.String charge_Status)
    {
        this._charge_Status = charge_Status;
    } //-- void setCharge_Status(java.lang.String) 

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
     * Sets the value of field 'flow_No'.
     * 
     * @param flow_No the value of field 'flow_No'.
    **/
    public void setFlow_No(java.lang.String flow_No)
    {
        this._flow_No = flow_No;
    } //-- void setFlow_No(java.lang.String) 

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
     * Sets the value of field 'kiosk_No'.
     * 
     * @param kiosk_No the value of field 'kiosk_No'.
    **/
    public void setKiosk_No(java.lang.String kiosk_No)
    {
        this._kiosk_No = kiosk_No;
    } //-- void setKiosk_No(java.lang.String) 

    /**
     * Sets the value of field 'patient_Id'.
     * 
     * @param patient_Id the value of field 'patient_Id'.
    **/
    public void setPatient_Id(java.lang.String patient_Id)
    {
        this._patient_Id = patient_Id;
    } //-- void setPatient_Id(java.lang.String) 

    /**
     * Sets the value of field 'pay_List'.
     * 
     * @param pay_List the value of field 'pay_List'.
    **/
    public void setPay_List(Pay_List pay_List)
    {
        this._pay_List = pay_List;
    } //-- void setPay_List(Pay_List) 

    /**
     * Sets the value of field 'pay_Mode'.
     * 
     * @param pay_Mode the value of field 'pay_Mode'.
    **/
    public void setPay_Mode(java.lang.String pay_Mode)
    {
        this._pay_Mode = pay_Mode;
    } //-- void setPay_Mode(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
