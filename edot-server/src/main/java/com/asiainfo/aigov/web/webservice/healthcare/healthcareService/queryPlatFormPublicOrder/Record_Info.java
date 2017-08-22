/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder;

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
public class Record_Info implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _appoint_No;

    private java.lang.String _hid;

    private java.lang.String _hb_Date;

    private java.lang.String _doctor_Code;

    private java.lang.String _doctor_Name;

    private java.lang.String _dept_Code;

    private java.lang.String _dept_Name;

    private java.lang.String _register_Time;

    private java.lang.String _status;

    private java.lang.String _start_Time;

    private java.lang.String _end_Time;

    private java.lang.String _source;

    private java.lang.String _patient_Name;

    private java.lang.String _patient_Id;

    private java.lang.String _card_No;

    private java.lang.String _id_No;

    private java.lang.String _patient_Tel;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'card_No'.
     * 
     * @return the value of field 'card_No'.
    **/
    public java.lang.String getCard_No()
    {
        return this._card_No;
    } //-- java.lang.String getCard_No() 

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
     * Returns the value of field 'end_Time'.
     * 
     * @return the value of field 'end_Time'.
    **/
    public java.lang.String getEnd_Time()
    {
        return this._end_Time;
    } //-- java.lang.String getEnd_Time() 

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
     * Returns the value of field 'hid'.
     * 
     * @return the value of field 'hid'.
    **/
    public java.lang.String getHid()
    {
        return this._hid;
    } //-- java.lang.String getHid() 

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
     * Returns the value of field 'patient_Tel'.
     * 
     * @return the value of field 'patient_Tel'.
    **/
    public java.lang.String getPatient_Tel()
    {
        return this._patient_Tel;
    } //-- java.lang.String getPatient_Tel() 

    /**
     * Returns the value of field 'register_Time'.
     * 
     * @return the value of field 'register_Time'.
    **/
    public java.lang.String getRegister_Time()
    {
        return this._register_Time;
    } //-- java.lang.String getRegister_Time() 

    /**
     * Returns the value of field 'source'.
     * 
     * @return the value of field 'source'.
    **/
    public java.lang.String getSource()
    {
        return this._source;
    } //-- java.lang.String getSource() 

    /**
     * Returns the value of field 'start_Time'.
     * 
     * @return the value of field 'start_Time'.
    **/
    public java.lang.String getStart_Time()
    {
        return this._start_Time;
    } //-- java.lang.String getStart_Time() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'status'.
    **/
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

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
     * Sets the value of field 'appoint_No'.
     * 
     * @param appoint_No the value of field 'appoint_No'.
    **/
    public void setAppoint_No(java.lang.String appoint_No)
    {
        this._appoint_No = appoint_No;
    } //-- void setAppoint_No(java.lang.String) 

    /**
     * Sets the value of field 'card_No'.
     * 
     * @param card_No the value of field 'card_No'.
    **/
    public void setCard_No(java.lang.String card_No)
    {
        this._card_No = card_No;
    } //-- void setCard_No(java.lang.String) 

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
     * Sets the value of field 'end_Time'.
     * 
     * @param end_Time the value of field 'end_Time'.
    **/
    public void setEnd_Time(java.lang.String end_Time)
    {
        this._end_Time = end_Time;
    } //-- void setEnd_Time(java.lang.String) 

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
     * Sets the value of field 'hid'.
     * 
     * @param hid the value of field 'hid'.
    **/
    public void setHid(java.lang.String hid)
    {
        this._hid = hid;
    } //-- void setHid(java.lang.String) 

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
     * Sets the value of field 'patient_Tel'.
     * 
     * @param patient_Tel the value of field 'patient_Tel'.
    **/
    public void setPatient_Tel(java.lang.String patient_Tel)
    {
        this._patient_Tel = patient_Tel;
    } //-- void setPatient_Tel(java.lang.String) 

    /**
     * Sets the value of field 'register_Time'.
     * 
     * @param register_Time the value of field 'register_Time'.
    **/
    public void setRegister_Time(java.lang.String register_Time)
    {
        this._register_Time = register_Time;
    } //-- void setRegister_Time(java.lang.String) 

    /**
     * Sets the value of field 'source'.
     * 
     * @param source the value of field 'source'.
    **/
    public void setSource(java.lang.String source)
    {
        this._source = source;
    } //-- void setSource(java.lang.String) 

    /**
     * Sets the value of field 'start_Time'.
     * 
     * @param start_Time the value of field 'start_Time'.
    **/
    public void setStart_Time(java.lang.String start_Time)
    {
        this._start_Time = start_Time;
    } //-- void setStart_Time(java.lang.String) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
    **/
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicOrder.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
