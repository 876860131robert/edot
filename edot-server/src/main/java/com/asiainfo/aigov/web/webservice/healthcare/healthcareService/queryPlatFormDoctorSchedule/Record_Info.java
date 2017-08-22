/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule;

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

    private java.lang.String _schedule_Id;

    private java.lang.String _dept_Code;

    private java.lang.String _dept_Name;

    private java.lang.String _standard_Office_Id;

    private java.lang.String _doctor_Code;

    private java.lang.String _doctor_Name;

    private java.lang.String _mark_Type;

    private java.lang.String _mark_Desc;

    private java.lang.String _hb_Date;

    private java.lang.String _am_Pm;

    private java.lang.String _limit;

    private java.lang.String _sum_Fee;

    private java.lang.String _clinic_Fee;

    private java.lang.String _average_Minute;

    private java.lang.String _is_StopDiagnostic;

    private java.lang.String _used;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_Info()


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
     * Returns the value of field 'average_Minute'.
     * 
     * @return the value of field 'average_Minute'.
    **/
    public java.lang.String getAverage_Minute()
    {
        return this._average_Minute;
    } //-- java.lang.String getAverage_Minute() 

    /**
     * Returns the value of field 'clinic_Fee'.
     * 
     * @return the value of field 'clinic_Fee'.
    **/
    public java.lang.String getClinic_Fee()
    {
        return this._clinic_Fee;
    } //-- java.lang.String getClinic_Fee() 

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
     * Returns the value of field 'hb_Date'.
     * 
     * @return the value of field 'hb_Date'.
    **/
    public java.lang.String getHb_Date()
    {
        return this._hb_Date;
    } //-- java.lang.String getHb_Date() 

    /**
     * Returns the value of field 'is_StopDiagnostic'.
     * 
     * @return the value of field 'is_StopDiagnostic'.
    **/
    public java.lang.String getIs_StopDiagnostic()
    {
        return this._is_StopDiagnostic;
    } //-- java.lang.String getIs_StopDiagnostic() 

    /**
     * Returns the value of field 'limit'.
     * 
     * @return the value of field 'limit'.
    **/
    public java.lang.String getLimit()
    {
        return this._limit;
    } //-- java.lang.String getLimit() 

    /**
     * Returns the value of field 'mark_Desc'.
     * 
     * @return the value of field 'mark_Desc'.
    **/
    public java.lang.String getMark_Desc()
    {
        return this._mark_Desc;
    } //-- java.lang.String getMark_Desc() 

    /**
     * Returns the value of field 'mark_Type'.
     * 
     * @return the value of field 'mark_Type'.
    **/
    public java.lang.String getMark_Type()
    {
        return this._mark_Type;
    } //-- java.lang.String getMark_Type() 

    /**
     * Returns the value of field 'schedule_Id'.
     * 
     * @return the value of field 'schedule_Id'.
    **/
    public java.lang.String getSchedule_Id()
    {
        return this._schedule_Id;
    } //-- java.lang.String getSchedule_Id() 

    /**
     * Returns the value of field 'standard_Office_Id'.
     * 
     * @return the value of field 'standard_Office_Id'.
    **/
    public java.lang.String getStandard_Office_Id()
    {
        return this._standard_Office_Id;
    } //-- java.lang.String getStandard_Office_Id() 

    /**
     * Returns the value of field 'sum_Fee'.
     * 
     * @return the value of field 'sum_Fee'.
    **/
    public java.lang.String getSum_Fee()
    {
        return this._sum_Fee;
    } //-- java.lang.String getSum_Fee() 

    /**
     * Returns the value of field 'used'.
     * 
     * @return the value of field 'used'.
    **/
    public java.lang.String getUsed()
    {
        return this._used;
    } //-- java.lang.String getUsed() 

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
     * Sets the value of field 'average_Minute'.
     * 
     * @param average_Minute the value of field 'average_Minute'.
    **/
    public void setAverage_Minute(java.lang.String average_Minute)
    {
        this._average_Minute = average_Minute;
    } //-- void setAverage_Minute(java.lang.String) 

    /**
     * Sets the value of field 'clinic_Fee'.
     * 
     * @param clinic_Fee the value of field 'clinic_Fee'.
    **/
    public void setClinic_Fee(java.lang.String clinic_Fee)
    {
        this._clinic_Fee = clinic_Fee;
    } //-- void setClinic_Fee(java.lang.String) 

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
     * Sets the value of field 'hb_Date'.
     * 
     * @param hb_Date the value of field 'hb_Date'.
    **/
    public void setHb_Date(java.lang.String hb_Date)
    {
        this._hb_Date = hb_Date;
    } //-- void setHb_Date(java.lang.String) 

    /**
     * Sets the value of field 'is_StopDiagnostic'.
     * 
     * @param is_StopDiagnostic the value of field
     * 'is_StopDiagnostic'.
    **/
    public void setIs_StopDiagnostic(java.lang.String is_StopDiagnostic)
    {
        this._is_StopDiagnostic = is_StopDiagnostic;
    } //-- void setIs_StopDiagnostic(java.lang.String) 

    /**
     * Sets the value of field 'limit'.
     * 
     * @param limit the value of field 'limit'.
    **/
    public void setLimit(java.lang.String limit)
    {
        this._limit = limit;
    } //-- void setLimit(java.lang.String) 

    /**
     * Sets the value of field 'mark_Desc'.
     * 
     * @param mark_Desc the value of field 'mark_Desc'.
    **/
    public void setMark_Desc(java.lang.String mark_Desc)
    {
        this._mark_Desc = mark_Desc;
    } //-- void setMark_Desc(java.lang.String) 

    /**
     * Sets the value of field 'mark_Type'.
     * 
     * @param mark_Type the value of field 'mark_Type'.
    **/
    public void setMark_Type(java.lang.String mark_Type)
    {
        this._mark_Type = mark_Type;
    } //-- void setMark_Type(java.lang.String) 

    /**
     * Sets the value of field 'schedule_Id'.
     * 
     * @param schedule_Id the value of field 'schedule_Id'.
    **/
    public void setSchedule_Id(java.lang.String schedule_Id)
    {
        this._schedule_Id = schedule_Id;
    } //-- void setSchedule_Id(java.lang.String) 

    /**
     * Sets the value of field 'standard_Office_Id'.
     * 
     * @param standard_Office_Id the value of field
     * 'standard_Office_Id'.
    **/
    public void setStandard_Office_Id(java.lang.String standard_Office_Id)
    {
        this._standard_Office_Id = standard_Office_Id;
    } //-- void setStandard_Office_Id(java.lang.String) 

    /**
     * Sets the value of field 'sum_Fee'.
     * 
     * @param sum_Fee the value of field 'sum_Fee'.
    **/
    public void setSum_Fee(java.lang.String sum_Fee)
    {
        this._sum_Fee = sum_Fee;
    } //-- void setSum_Fee(java.lang.String) 

    /**
     * Sets the value of field 'used'.
     * 
     * @param used the value of field 'used'.
    **/
    public void setUsed(java.lang.String used)
    {
        this._used = used;
    } //-- void setUsed(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorSchedule.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
