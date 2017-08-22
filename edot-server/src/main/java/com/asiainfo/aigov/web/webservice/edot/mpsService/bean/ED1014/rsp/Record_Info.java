/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp;

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

    private java.lang.String _exam_No;

    private java.lang.String _apply_Doctor;

    private java.lang.String _apply_Date_Time;

    private java.lang.String _exam_Date_Time;

    private java.lang.String _exam_Class;

    private java.lang.String _exam_Sub_Class;

    private java.lang.String _report_Status;

    private java.lang.String _report_Date_Time;

    private java.lang.String _report_Doctor;

    private java.lang.String _description;

    private java.lang.String _impression;

    private java.lang.String _recommendation;

    private java.lang.String _exam_Para;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Record_Info()


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
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'description'.
    **/
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'exam_Class'.
     * 
     * @return the value of field 'exam_Class'.
    **/
    public java.lang.String getExam_Class()
    {
        return this._exam_Class;
    } //-- java.lang.String getExam_Class() 

    /**
     * Returns the value of field 'exam_Date_Time'.
     * 
     * @return the value of field 'exam_Date_Time'.
    **/
    public java.lang.String getExam_Date_Time()
    {
        return this._exam_Date_Time;
    } //-- java.lang.String getExam_Date_Time() 

    /**
     * Returns the value of field 'exam_No'.
     * 
     * @return the value of field 'exam_No'.
    **/
    public java.lang.String getExam_No()
    {
        return this._exam_No;
    } //-- java.lang.String getExam_No() 

    /**
     * Returns the value of field 'exam_Para'.
     * 
     * @return the value of field 'exam_Para'.
    **/
    public java.lang.String getExam_Para()
    {
        return this._exam_Para;
    } //-- java.lang.String getExam_Para() 

    /**
     * Returns the value of field 'exam_Sub_Class'.
     * 
     * @return the value of field 'exam_Sub_Class'.
    **/
    public java.lang.String getExam_Sub_Class()
    {
        return this._exam_Sub_Class;
    } //-- java.lang.String getExam_Sub_Class() 

    /**
     * Returns the value of field 'impression'.
     * 
     * @return the value of field 'impression'.
    **/
    public java.lang.String getImpression()
    {
        return this._impression;
    } //-- java.lang.String getImpression() 

    /**
     * Returns the value of field 'recommendation'.
     * 
     * @return the value of field 'recommendation'.
    **/
    public java.lang.String getRecommendation()
    {
        return this._recommendation;
    } //-- java.lang.String getRecommendation() 

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
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
    **/
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'exam_Class'.
     * 
     * @param exam_Class the value of field 'exam_Class'.
    **/
    public void setExam_Class(java.lang.String exam_Class)
    {
        this._exam_Class = exam_Class;
    } //-- void setExam_Class(java.lang.String) 

    /**
     * Sets the value of field 'exam_Date_Time'.
     * 
     * @param exam_Date_Time the value of field 'exam_Date_Time'.
    **/
    public void setExam_Date_Time(java.lang.String exam_Date_Time)
    {
        this._exam_Date_Time = exam_Date_Time;
    } //-- void setExam_Date_Time(java.lang.String) 

    /**
     * Sets the value of field 'exam_No'.
     * 
     * @param exam_No the value of field 'exam_No'.
    **/
    public void setExam_No(java.lang.String exam_No)
    {
        this._exam_No = exam_No;
    } //-- void setExam_No(java.lang.String) 

    /**
     * Sets the value of field 'exam_Para'.
     * 
     * @param exam_Para the value of field 'exam_Para'.
    **/
    public void setExam_Para(java.lang.String exam_Para)
    {
        this._exam_Para = exam_Para;
    } //-- void setExam_Para(java.lang.String) 

    /**
     * Sets the value of field 'exam_Sub_Class'.
     * 
     * @param exam_Sub_Class the value of field 'exam_Sub_Class'.
    **/
    public void setExam_Sub_Class(java.lang.String exam_Sub_Class)
    {
        this._exam_Sub_Class = exam_Sub_Class;
    } //-- void setExam_Sub_Class(java.lang.String) 

    /**
     * Sets the value of field 'impression'.
     * 
     * @param impression the value of field 'impression'.
    **/
    public void setImpression(java.lang.String impression)
    {
        this._impression = impression;
    } //-- void setImpression(java.lang.String) 

    /**
     * Sets the value of field 'recommendation'.
     * 
     * @param recommendation the value of field 'recommendation'.
    **/
    public void setRecommendation(java.lang.String recommendation)
    {
        this._recommendation = recommendation;
    } //-- void setRecommendation(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
