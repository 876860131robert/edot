/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp;

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
public class Record implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _vaccRecordId;

    private java.lang.String _vaccinateDateDesc;

    private java.lang.String _vaccinateOrgName;

    private java.lang.String _vaccineName;

    private java.lang.String _vaccinateDoctorName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'vaccRecordId'.
     * 
     * @return the value of field 'vaccRecordId'.
    **/
    public java.lang.String getVaccRecordId()
    {
        return this._vaccRecordId;
    } //-- java.lang.String getVaccRecordId() 

    /**
     * Returns the value of field 'vaccinateDateDesc'.
     * 
     * @return the value of field 'vaccinateDateDesc'.
    **/
    public java.lang.String getVaccinateDateDesc()
    {
        return this._vaccinateDateDesc;
    } //-- java.lang.String getVaccinateDateDesc() 

    /**
     * Returns the value of field 'vaccinateDoctorName'.
     * 
     * @return the value of field 'vaccinateDoctorName'.
    **/
    public java.lang.String getVaccinateDoctorName()
    {
        return this._vaccinateDoctorName;
    } //-- java.lang.String getVaccinateDoctorName() 

    /**
     * Returns the value of field 'vaccinateOrgName'.
     * 
     * @return the value of field 'vaccinateOrgName'.
    **/
    public java.lang.String getVaccinateOrgName()
    {
        return this._vaccinateOrgName;
    } //-- java.lang.String getVaccinateOrgName() 

    /**
     * Returns the value of field 'vaccineName'.
     * 
     * @return the value of field 'vaccineName'.
    **/
    public java.lang.String getVaccineName()
    {
        return this._vaccineName;
    } //-- java.lang.String getVaccineName() 

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
     * Sets the value of field 'vaccRecordId'.
     * 
     * @param vaccRecordId the value of field 'vaccRecordId'.
    **/
    public void setVaccRecordId(java.lang.String vaccRecordId)
    {
        this._vaccRecordId = vaccRecordId;
    } //-- void setVaccRecordId(java.lang.String) 

    /**
     * Sets the value of field 'vaccinateDateDesc'.
     * 
     * @param vaccinateDateDesc the value of field
     * 'vaccinateDateDesc'.
    **/
    public void setVaccinateDateDesc(java.lang.String vaccinateDateDesc)
    {
        this._vaccinateDateDesc = vaccinateDateDesc;
    } //-- void setVaccinateDateDesc(java.lang.String) 

    /**
     * Sets the value of field 'vaccinateDoctorName'.
     * 
     * @param vaccinateDoctorName the value of field
     * 'vaccinateDoctorName'.
    **/
    public void setVaccinateDoctorName(java.lang.String vaccinateDoctorName)
    {
        this._vaccinateDoctorName = vaccinateDoctorName;
    } //-- void setVaccinateDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'vaccinateOrgName'.
     * 
     * @param vaccinateOrgName the value of field 'vaccinateOrgName'
    **/
    public void setVaccinateOrgName(java.lang.String vaccinateOrgName)
    {
        this._vaccinateOrgName = vaccinateOrgName;
    } //-- void setVaccinateOrgName(java.lang.String) 

    /**
     * Sets the value of field 'vaccineName'.
     * 
     * @param vaccineName the value of field 'vaccineName'.
    **/
    public void setVaccineName(java.lang.String vaccineName)
    {
        this._vaccineName = vaccineName;
    } //-- void setVaccineName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
