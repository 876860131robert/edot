/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req;

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

    private java.lang.String _hid;

    private java.lang.String _id_No;

    private java.lang.String _patient_Name;

    private java.lang.String _patient_Id;

    private java.lang.String _dept_Code;

    private java.lang.String _dept_Name;

    private java.lang.String _doctor_Code;

    private java.lang.String _doctor_Name;

    private java.lang.String _hb_Date;

    private java.lang.String _hb_Time;

    private java.lang.String _am_Pm;

    private java.lang.String _operate_Type;

    private java.lang.String _flow_No;

    private java.lang.String _sysType;

    private java.lang.String _consumer;

    private java.lang.String _token;

    private java.lang.String _hm_Card_No;

    private java.lang.String _appoint_No;

    private java.lang.String _kiosk_No;

    private java.lang.String _phone_No;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'am_Pm'.
     * 
     * @return the value of field 'am_Pm'.
    **/
    public java.lang.String getAm_Pm()
    {
        return this._am_Pm;
    } //-- java.lang.String getAm_Pm() 

    /**
     * Returns the value of field 'appoint_No'.
     * 
     * @return the value of field 'appoint_No'.
    **/
    public java.lang.String getAppoint_No()
    {
        return this._appoint_No;
    } //-- java.lang.String getAppoint_No() 

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
     * Returns the value of field 'dept_Code'.
     * 
     * @return the value of field 'dept_Code'.
    **/
    public java.lang.String getDept_Code()
    {
        return this._dept_Code;
    } //-- java.lang.String getDept_Code() 

    /**
     * Returns the value of field 'dept_Name'.
     * 
     * @return the value of field 'dept_Name'.
    **/
    public java.lang.String getDept_Name()
    {
        return this._dept_Name;
    } //-- java.lang.String getDept_Name() 

    /**
     * Returns the value of field 'doctor_Code'.
     * 
     * @return the value of field 'doctor_Code'.
    **/
    public java.lang.String getDoctor_Code()
    {
        return this._doctor_Code;
    } //-- java.lang.String getDoctor_Code() 

    /**
     * Returns the value of field 'doctor_Name'.
     * 
     * @return the value of field 'doctor_Name'.
    **/
    public java.lang.String getDoctor_Name()
    {
        return this._doctor_Name;
    } //-- java.lang.String getDoctor_Name() 

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
     * Returns the value of field 'hb_Date'.
     * 
     * @return the value of field 'hb_Date'.
    **/
    public java.lang.String getHb_Date()
    {
        return this._hb_Date;
    } //-- java.lang.String getHb_Date() 

    /**
     * Returns the value of field 'hb_Time'.
     * 
     * @return the value of field 'hb_Time'.
    **/
    public java.lang.String getHb_Time()
    {
        return this._hb_Time;
    } //-- java.lang.String getHb_Time() 

    /**
     * Returns the value of field 'hid'.
     * 
     * @return the value of field 'hid'.
    **/
    public java.lang.String getHid()
    {
        return this._hid;
    } //-- java.lang.String getHid() 

    /**
     * Returns the value of field 'hm_Card_No'.
     * 
     * @return the value of field 'hm_Card_No'.
    **/
    public java.lang.String getHm_Card_No()
    {
        return this._hm_Card_No;
    } //-- java.lang.String getHm_Card_No() 

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
     * Returns the value of field 'id_No'.
     * 
     * @return the value of field 'id_No'.
    **/
    public java.lang.String getId_No()
    {
        return this._id_No;
    } //-- java.lang.String getId_No() 

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
     * Returns the value of field 'operate_Type'.
     * 
     * @return the value of field 'operate_Type'.
    **/
    public java.lang.String getOperate_Type()
    {
        return this._operate_Type;
    } //-- java.lang.String getOperate_Type() 

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
     * Returns the value of field 'patient_Name'.
     * 
     * @return the value of field 'patient_Name'.
    **/
    public java.lang.String getPatient_Name()
    {
        return this._patient_Name;
    } //-- java.lang.String getPatient_Name() 

    /**
     * Returns the value of field 'phone_No'.
     * 
     * @return the value of field 'phone_No'.
    **/
    public java.lang.String getPhone_No()
    {
        return this._phone_No;
    } //-- java.lang.String getPhone_No() 

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
     * Sets the value of field 'am_Pm'.
     * 
     * @param am_Pm the value of field 'am_Pm'.
    **/
    public void setAm_Pm(java.lang.String am_Pm)
    {
        this._am_Pm = am_Pm;
    } //-- void setAm_Pm(java.lang.String) 

    /**
     * Sets the value of field 'appoint_No'.
     * 
     * @param appoint_No the value of field 'appoint_No'.
    **/
    public void setAppoint_No(java.lang.String appoint_No)
    {
        this._appoint_No = appoint_No;
    } //-- void setAppoint_No(java.lang.String) 

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
     * Sets the value of field 'dept_Code'.
     * 
     * @param dept_Code the value of field 'dept_Code'.
    **/
    public void setDept_Code(java.lang.String dept_Code)
    {
        this._dept_Code = dept_Code;
    } //-- void setDept_Code(java.lang.String) 

    /**
     * Sets the value of field 'dept_Name'.
     * 
     * @param dept_Name the value of field 'dept_Name'.
    **/
    public void setDept_Name(java.lang.String dept_Name)
    {
        this._dept_Name = dept_Name;
    } //-- void setDept_Name(java.lang.String) 

    /**
     * Sets the value of field 'doctor_Code'.
     * 
     * @param doctor_Code the value of field 'doctor_Code'.
    **/
    public void setDoctor_Code(java.lang.String doctor_Code)
    {
        this._doctor_Code = doctor_Code;
    } //-- void setDoctor_Code(java.lang.String) 

    /**
     * Sets the value of field 'doctor_Name'.
     * 
     * @param doctor_Name the value of field 'doctor_Name'.
    **/
    public void setDoctor_Name(java.lang.String doctor_Name)
    {
        this._doctor_Name = doctor_Name;
    } //-- void setDoctor_Name(java.lang.String) 

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
     * Sets the value of field 'hb_Date'.
     * 
     * @param hb_Date the value of field 'hb_Date'.
    **/
    public void setHb_Date(java.lang.String hb_Date)
    {
        this._hb_Date = hb_Date;
    } //-- void setHb_Date(java.lang.String) 

    /**
     * Sets the value of field 'hb_Time'.
     * 
     * @param hb_Time the value of field 'hb_Time'.
    **/
    public void setHb_Time(java.lang.String hb_Time)
    {
        this._hb_Time = hb_Time;
    } //-- void setHb_Time(java.lang.String) 

    /**
     * Sets the value of field 'hid'.
     * 
     * @param hid the value of field 'hid'.
    **/
    public void setHid(java.lang.String hid)
    {
        this._hid = hid;
    } //-- void setHid(java.lang.String) 

    /**
     * Sets the value of field 'hm_Card_No'.
     * 
     * @param hm_Card_No the value of field 'hm_Card_No'.
    **/
    public void setHm_Card_No(java.lang.String hm_Card_No)
    {
        this._hm_Card_No = hm_Card_No;
    } //-- void setHm_Card_No(java.lang.String) 

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
     * Sets the value of field 'id_No'.
     * 
     * @param id_No the value of field 'id_No'.
    **/
    public void setId_No(java.lang.String id_No)
    {
        this._id_No = id_No;
    } //-- void setId_No(java.lang.String) 

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
     * Sets the value of field 'operate_Type'.
     * 
     * @param operate_Type the value of field 'operate_Type'.
    **/
    public void setOperate_Type(java.lang.String operate_Type)
    {
        this._operate_Type = operate_Type;
    } //-- void setOperate_Type(java.lang.String) 

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
     * Sets the value of field 'patient_Name'.
     * 
     * @param patient_Name the value of field 'patient_Name'.
    **/
    public void setPatient_Name(java.lang.String patient_Name)
    {
        this._patient_Name = patient_Name;
    } //-- void setPatient_Name(java.lang.String) 

    /**
     * Sets the value of field 'phone_No'.
     * 
     * @param phone_No the value of field 'phone_No'.
    **/
    public void setPhone_No(java.lang.String phone_No)
    {
        this._phone_No = phone_No;
    } //-- void setPhone_No(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
