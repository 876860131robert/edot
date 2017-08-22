/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp;

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

    private java.lang.String _vaccinateDateDesc;

    private java.lang.String _vaccineCode;

    private java.lang.String _vaccineName;

    private java.lang.String _vaccinateDoses;

    private java.lang.String _vaccinateSite;

    private java.lang.String _vaccineBatchNo;

    private java.lang.String _vaccinateDoctorName;

    private java.lang.String _remarks;

    private java.lang.String _vaccinateOrgName;

    private java.lang.String _createDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'createDate'.
     * 
     * @return the value of field 'createDate'.
    **/
    public java.lang.String getCreateDate()
    {
        return this._createDate;
    } //-- java.lang.String getCreateDate() 

    /**
     * Returns the value of field 'remarks'.
     * 
     * @return the value of field 'remarks'.
    **/
    public java.lang.String getRemarks()
    {
        return this._remarks;
    } //-- java.lang.String getRemarks() 

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
     * Returns the value of field 'vaccinateDoses'.
     * 
     * @return the value of field 'vaccinateDoses'.
    **/
    public java.lang.String getVaccinateDoses()
    {
        return this._vaccinateDoses;
    } //-- java.lang.String getVaccinateDoses() 

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
     * Returns the value of field 'vaccinateSite'.
     * 
     * @return the value of field 'vaccinateSite'.
    **/
    public java.lang.String getVaccinateSite()
    {
        return this._vaccinateSite;
    } //-- java.lang.String getVaccinateSite() 

    /**
     * Returns the value of field 'vaccineBatchNo'.
     * 
     * @return the value of field 'vaccineBatchNo'.
    **/
    public java.lang.String getVaccineBatchNo()
    {
        return this._vaccineBatchNo;
    } //-- java.lang.String getVaccineBatchNo() 

    /**
     * Returns the value of field 'vaccineCode'.
     * 
     * @return the value of field 'vaccineCode'.
    **/
    public java.lang.String getVaccineCode()
    {
        return this._vaccineCode;
    } //-- java.lang.String getVaccineCode() 

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
     * Sets the value of field 'createDate'.
     * 
     * @param createDate the value of field 'createDate'.
    **/
    public void setCreateDate(java.lang.String createDate)
    {
        this._createDate = createDate;
    } //-- void setCreateDate(java.lang.String) 

    /**
     * Sets the value of field 'remarks'.
     * 
     * @param remarks the value of field 'remarks'.
    **/
    public void setRemarks(java.lang.String remarks)
    {
        this._remarks = remarks;
    } //-- void setRemarks(java.lang.String) 

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
     * Sets the value of field 'vaccinateDoses'.
     * 
     * @param vaccinateDoses the value of field 'vaccinateDoses'.
    **/
    public void setVaccinateDoses(java.lang.String vaccinateDoses)
    {
        this._vaccinateDoses = vaccinateDoses;
    } //-- void setVaccinateDoses(java.lang.String) 

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
     * Sets the value of field 'vaccinateSite'.
     * 
     * @param vaccinateSite the value of field 'vaccinateSite'.
    **/
    public void setVaccinateSite(java.lang.String vaccinateSite)
    {
        this._vaccinateSite = vaccinateSite;
    } //-- void setVaccinateSite(java.lang.String) 

    /**
     * Sets the value of field 'vaccineBatchNo'.
     * 
     * @param vaccineBatchNo the value of field 'vaccineBatchNo'.
    **/
    public void setVaccineBatchNo(java.lang.String vaccineBatchNo)
    {
        this._vaccineBatchNo = vaccineBatchNo;
    } //-- void setVaccineBatchNo(java.lang.String) 

    /**
     * Sets the value of field 'vaccineCode'.
     * 
     * @param vaccineCode the value of field 'vaccineCode'.
    **/
    public void setVaccineCode(java.lang.String vaccineCode)
    {
        this._vaccineCode = vaccineCode;
    } //-- void setVaccineCode(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
