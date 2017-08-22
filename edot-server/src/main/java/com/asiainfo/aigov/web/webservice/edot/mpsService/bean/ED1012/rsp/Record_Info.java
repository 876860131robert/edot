/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp;

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

    private java.lang.String _test_No;

    private java.lang.String _apply_Doctor;

    private java.lang.String _apply_Date_Time;

    private java.lang.String _specimen;

    private java.lang.String _item_name;

    private java.lang.String _report_Status;

    private java.lang.String _report_Date_Time;

    private java.lang.String _report_Doctor;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'apply_Date_Time'.
     * 
     * @return the value of field 'apply_Date_Time'.
    **/
    public java.lang.String getApply_Date_Time()
    {
        return this._apply_Date_Time;
    } //-- java.lang.String getApply_Date_Time() 

    /**
     * Returns the value of field 'apply_Doctor'.
     * 
     * @return the value of field 'apply_Doctor'.
    **/
    public java.lang.String getApply_Doctor()
    {
        return this._apply_Doctor;
    } //-- java.lang.String getApply_Doctor() 

    /**
     * Returns the value of field 'item_name'.
     * 
     * @return the value of field 'item_name'.
    **/
    public java.lang.String getItem_name()
    {
        return this._item_name;
    } //-- java.lang.String getItem_name() 

    /**
     * Returns the value of field 'report_Date_Time'.
     * 
     * @return the value of field 'report_Date_Time'.
    **/
    public java.lang.String getReport_Date_Time()
    {
        return this._report_Date_Time;
    } //-- java.lang.String getReport_Date_Time() 

    /**
     * Returns the value of field 'report_Doctor'.
     * 
     * @return the value of field 'report_Doctor'.
    **/
    public java.lang.String getReport_Doctor()
    {
        return this._report_Doctor;
    } //-- java.lang.String getReport_Doctor() 

    /**
     * Returns the value of field 'report_Status'.
     * 
     * @return the value of field 'report_Status'.
    **/
    public java.lang.String getReport_Status()
    {
        return this._report_Status;
    } //-- java.lang.String getReport_Status() 

    /**
     * Returns the value of field 'specimen'.
     * 
     * @return the value of field 'specimen'.
    **/
    public java.lang.String getSpecimen()
    {
        return this._specimen;
    } //-- java.lang.String getSpecimen() 

    /**
     * Returns the value of field 'test_No'.
     * 
     * @return the value of field 'test_No'.
    **/
    public java.lang.String getTest_No()
    {
        return this._test_No;
    } //-- java.lang.String getTest_No() 

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
     * Sets the value of field 'apply_Date_Time'.
     * 
     * @param apply_Date_Time the value of field 'apply_Date_Time'.
    **/
    public void setApply_Date_Time(java.lang.String apply_Date_Time)
    {
        this._apply_Date_Time = apply_Date_Time;
    } //-- void setApply_Date_Time(java.lang.String) 

    /**
     * Sets the value of field 'apply_Doctor'.
     * 
     * @param apply_Doctor the value of field 'apply_Doctor'.
    **/
    public void setApply_Doctor(java.lang.String apply_Doctor)
    {
        this._apply_Doctor = apply_Doctor;
    } //-- void setApply_Doctor(java.lang.String) 

    /**
     * Sets the value of field 'item_name'.
     * 
     * @param item_name the value of field 'item_name'.
    **/
    public void setItem_name(java.lang.String item_name)
    {
        this._item_name = item_name;
    } //-- void setItem_name(java.lang.String) 

    /**
     * Sets the value of field 'report_Date_Time'.
     * 
     * @param report_Date_Time the value of field 'report_Date_Time'
    **/
    public void setReport_Date_Time(java.lang.String report_Date_Time)
    {
        this._report_Date_Time = report_Date_Time;
    } //-- void setReport_Date_Time(java.lang.String) 

    /**
     * Sets the value of field 'report_Doctor'.
     * 
     * @param report_Doctor the value of field 'report_Doctor'.
    **/
    public void setReport_Doctor(java.lang.String report_Doctor)
    {
        this._report_Doctor = report_Doctor;
    } //-- void setReport_Doctor(java.lang.String) 

    /**
     * Sets the value of field 'report_Status'.
     * 
     * @param report_Status the value of field 'report_Status'.
    **/
    public void setReport_Status(java.lang.String report_Status)
    {
        this._report_Status = report_Status;
    } //-- void setReport_Status(java.lang.String) 

    /**
     * Sets the value of field 'specimen'.
     * 
     * @param specimen the value of field 'specimen'.
    **/
    public void setSpecimen(java.lang.String specimen)
    {
        this._specimen = specimen;
    } //-- void setSpecimen(java.lang.String) 

    /**
     * Sets the value of field 'test_No'.
     * 
     * @param test_No the value of field 'test_No'.
    **/
    public void setTest_No(java.lang.String test_No)
    {
        this._test_No = test_No;
    } //-- void setTest_No(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
