/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

import org.apache.commons.lang.StringUtils;
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

    private Record_InfoChoice _record_InfoChoice;

    private java.lang.String _card_No;

    private java.lang.String _patient_Id;

    private java.lang.String _patient_Name;

    private java.lang.String _card_Type;

    private java.lang.String _phone_Number;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'card_No'.
     * 
     * @return the value of field 'card_No'.
    **/
    public java.lang.String getCard_No()
    {
        return StringUtils.isNotEmpty(this._card_No)?this._card_No:"000000";
    } //-- java.lang.String getCard_No() 

    /**
     * Returns the value of field 'card_Type'.
     * 
     * @return the value of field 'card_Type'.
    **/
    public java.lang.String getCard_Type()
    {
        return this._card_Type;
    } //-- java.lang.String getCard_Type() 

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
     * Returns the value of field 'record_InfoChoice'.
     * 
     * @return the value of field 'record_InfoChoice'.
    **/
    public Record_InfoChoice getRecord_InfoChoice()
    {
        return this._record_InfoChoice;
    } //-- Record_InfoChoice getRecord_InfoChoice() 

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
     * Sets the value of field 'card_No'.
     * 
     * @param card_No the value of field 'card_No'.
    **/
    public void setCard_No(java.lang.String card_No)
    {
        this._card_No = card_No;
    } //-- void setCard_No(java.lang.String) 

    /**
     * Sets the value of field 'card_Type'.
     * 
     * @param card_Type the value of field 'card_Type'.
    **/
    public void setCard_Type(java.lang.String card_Type)
    {
        this._card_Type = card_Type;
    } //-- void setCard_Type(java.lang.String) 

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
     * Sets the value of field 'record_InfoChoice'.
     * 
     * @param record_InfoChoice the value of field
     * 'record_InfoChoice'.
    **/
    public void setRecord_InfoChoice(Record_InfoChoice record_InfoChoice)
    {
        this._record_InfoChoice = record_InfoChoice;
    } //-- void setRecord_InfoChoice(Record_InfoChoice) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
