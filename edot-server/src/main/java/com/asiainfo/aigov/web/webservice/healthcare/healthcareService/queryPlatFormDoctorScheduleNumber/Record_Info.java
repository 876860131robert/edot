/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber;

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

    private java.lang.String _hid;

    private java.lang.String _order_no;

    private java.lang.String _start_Time;

    private java.lang.String _end_Time;

    private java.lang.String _limit;

    private java.lang.String _used;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'hid'.
     * 
     * @return the value of field 'hid'.
    **/
    public java.lang.String getHid()
    {
        return this._hid;
    } //-- java.lang.String getHid() 

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
     * Returns the value of field 'order_no'.
     * 
     * @return the value of field 'order_no'.
    **/
    public java.lang.String getOrder_no()
    {
        return this._order_no;
    } //-- java.lang.String getOrder_no() 

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
     * Returns the value of field 'start_Time'.
     * 
     * @return the value of field 'start_Time'.
    **/
    public java.lang.String getStart_Time()
    {
        return this._start_Time;
    } //-- java.lang.String getStart_Time() 

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
     * Sets the value of field 'end_Time'.
     * 
     * @param end_Time the value of field 'end_Time'.
    **/
    public void setEnd_Time(java.lang.String end_Time)
    {
        this._end_Time = end_Time;
    } //-- void setEnd_Time(java.lang.String) 

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
     * Sets the value of field 'limit'.
     * 
     * @param limit the value of field 'limit'.
    **/
    public void setLimit(java.lang.String limit)
    {
        this._limit = limit;
    } //-- void setLimit(java.lang.String) 

    /**
     * Sets the value of field 'order_no'.
     * 
     * @param order_no the value of field 'order_no'.
    **/
    public void setOrder_no(java.lang.String order_no)
    {
        this._order_no = order_no;
    } //-- void setOrder_no(java.lang.String) 

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
     * Sets the value of field 'start_Time'.
     * 
     * @param start_Time the value of field 'start_Time'.
    **/
    public void setStart_Time(java.lang.String start_Time)
    {
        this._start_Time = start_Time;
    } //-- void setStart_Time(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorScheduleNumber.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
