/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req;

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

    private java.lang.String _patient_Id;

    private java.lang.String _phone_Number;

    private java.lang.String _id_No;

    private java.lang.String _patient_Name;

    private java.lang.String _appoint_No;

    private java.lang.String _visit_No;

    private java.lang.String _receipt_No;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_Info()


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
     * Returns the value of field 'phone_Number'.
     * 
     * @return the value of field 'phone_Number'.
    **/
    public java.lang.String getPhone_Number()
    {
        return this._phone_Number;
    } //-- java.lang.String getPhone_Number() 

    /**
     * Returns the value of field 'receipt_No'.
     * 
     * @return the value of field 'receipt_No'.
    **/
    public java.lang.String getReceipt_No()
    {
        return this._receipt_No;
    } //-- java.lang.String getReceipt_No() 

    /**
     * Returns the value of field 'visit_No'.
     * 
     * @return the value of field 'visit_No'.
    **/
    public java.lang.String getVisit_No()
    {
        return this._visit_No;
    } //-- java.lang.String getVisit_No() 

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
     * Sets the value of field 'phone_Number'.
     * 
     * @param phone_Number the value of field 'phone_Number'.
    **/
    public void setPhone_Number(java.lang.String phone_Number)
    {
        this._phone_Number = phone_Number;
    } //-- void setPhone_Number(java.lang.String) 

    /**
     * Sets the value of field 'receipt_No'.
     * 
     * @param receipt_No the value of field 'receipt_No'.
    **/
    public void setReceipt_No(java.lang.String receipt_No)
    {
        this._receipt_No = receipt_No;
    } //-- void setReceipt_No(java.lang.String) 

    /**
     * Sets the value of field 'visit_No'.
     * 
     * @param visit_No the value of field 'visit_No'.
    **/
    public void setVisit_No(java.lang.String visit_No)
    {
        this._visit_No = visit_No;
    } //-- void setVisit_No(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
