/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp;

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

    private java.lang.String _reportDateDesc;

    private java.lang.String _patientAges;

    private java.lang.String _infectPatOccupName;

    private java.lang.String _infectionTypeName;

    private java.lang.String _infectionName;

    private java.lang.String _otherInfectionName;

    private java.lang.String _revisedDiag;

    private java.lang.String _reportDoctorName;

    private java.lang.String _reportDate;

    private java.lang.String _firstSympAppearDate;

    private java.lang.String _diagDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'diagDate'.
     * 
     * @return the value of field 'diagDate'.
    **/
    public java.lang.String getDiagDate()
    {
        return this._diagDate;
    } //-- java.lang.String getDiagDate() 

    /**
     * Returns the value of field 'firstSympAppearDate'.
     * 
     * @return the value of field 'firstSympAppearDate'.
    **/
    public java.lang.String getFirstSympAppearDate()
    {
        return this._firstSympAppearDate;
    } //-- java.lang.String getFirstSympAppearDate() 

    /**
     * Returns the value of field 'infectPatOccupName'.
     * 
     * @return the value of field 'infectPatOccupName'.
    **/
    public java.lang.String getInfectPatOccupName()
    {
        return this._infectPatOccupName;
    } //-- java.lang.String getInfectPatOccupName() 

    /**
     * Returns the value of field 'infectionName'.
     * 
     * @return the value of field 'infectionName'.
    **/
    public java.lang.String getInfectionName()
    {
        return this._infectionName;
    } //-- java.lang.String getInfectionName() 

    /**
     * Returns the value of field 'infectionTypeName'.
     * 
     * @return the value of field 'infectionTypeName'.
    **/
    public java.lang.String getInfectionTypeName()
    {
        return this._infectionTypeName;
    } //-- java.lang.String getInfectionTypeName() 

    /**
     * Returns the value of field 'otherInfectionName'.
     * 
     * @return the value of field 'otherInfectionName'.
    **/
    public java.lang.String getOtherInfectionName()
    {
        return this._otherInfectionName;
    } //-- java.lang.String getOtherInfectionName() 

    /**
     * Returns the value of field 'patientAges'.
     * 
     * @return the value of field 'patientAges'.
    **/
    public java.lang.String getPatientAges()
    {
        return this._patientAges;
    } //-- java.lang.String getPatientAges() 

    /**
     * Returns the value of field 'reportDate'.
     * 
     * @return the value of field 'reportDate'.
    **/
    public java.lang.String getReportDate()
    {
        return this._reportDate;
    } //-- java.lang.String getReportDate() 

    /**
     * Returns the value of field 'reportDateDesc'.
     * 
     * @return the value of field 'reportDateDesc'.
    **/
    public java.lang.String getReportDateDesc()
    {
        return this._reportDateDesc;
    } //-- java.lang.String getReportDateDesc() 

    /**
     * Returns the value of field 'reportDoctorName'.
     * 
     * @return the value of field 'reportDoctorName'.
    **/
    public java.lang.String getReportDoctorName()
    {
        return this._reportDoctorName;
    } //-- java.lang.String getReportDoctorName() 

    /**
     * Returns the value of field 'revisedDiag'.
     * 
     * @return the value of field 'revisedDiag'.
    **/
    public java.lang.String getRevisedDiag()
    {
        return this._revisedDiag;
    } //-- java.lang.String getRevisedDiag() 

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
     * Sets the value of field 'diagDate'.
     * 
     * @param diagDate the value of field 'diagDate'.
    **/
    public void setDiagDate(java.lang.String diagDate)
    {
        this._diagDate = diagDate;
    } //-- void setDiagDate(java.lang.String) 

    /**
     * Sets the value of field 'firstSympAppearDate'.
     * 
     * @param firstSympAppearDate the value of field
     * 'firstSympAppearDate'.
    **/
    public void setFirstSympAppearDate(java.lang.String firstSympAppearDate)
    {
        this._firstSympAppearDate = firstSympAppearDate;
    } //-- void setFirstSympAppearDate(java.lang.String) 

    /**
     * Sets the value of field 'infectPatOccupName'.
     * 
     * @param infectPatOccupName the value of field
     * 'infectPatOccupName'.
    **/
    public void setInfectPatOccupName(java.lang.String infectPatOccupName)
    {
        this._infectPatOccupName = infectPatOccupName;
    } //-- void setInfectPatOccupName(java.lang.String) 

    /**
     * Sets the value of field 'infectionName'.
     * 
     * @param infectionName the value of field 'infectionName'.
    **/
    public void setInfectionName(java.lang.String infectionName)
    {
        this._infectionName = infectionName;
    } //-- void setInfectionName(java.lang.String) 

    /**
     * Sets the value of field 'infectionTypeName'.
     * 
     * @param infectionTypeName the value of field
     * 'infectionTypeName'.
    **/
    public void setInfectionTypeName(java.lang.String infectionTypeName)
    {
        this._infectionTypeName = infectionTypeName;
    } //-- void setInfectionTypeName(java.lang.String) 

    /**
     * Sets the value of field 'otherInfectionName'.
     * 
     * @param otherInfectionName the value of field
     * 'otherInfectionName'.
    **/
    public void setOtherInfectionName(java.lang.String otherInfectionName)
    {
        this._otherInfectionName = otherInfectionName;
    } //-- void setOtherInfectionName(java.lang.String) 

    /**
     * Sets the value of field 'patientAges'.
     * 
     * @param patientAges the value of field 'patientAges'.
    **/
    public void setPatientAges(java.lang.String patientAges)
    {
        this._patientAges = patientAges;
    } //-- void setPatientAges(java.lang.String) 

    /**
     * Sets the value of field 'reportDate'.
     * 
     * @param reportDate the value of field 'reportDate'.
    **/
    public void setReportDate(java.lang.String reportDate)
    {
        this._reportDate = reportDate;
    } //-- void setReportDate(java.lang.String) 

    /**
     * Sets the value of field 'reportDateDesc'.
     * 
     * @param reportDateDesc the value of field 'reportDateDesc'.
    **/
    public void setReportDateDesc(java.lang.String reportDateDesc)
    {
        this._reportDateDesc = reportDateDesc;
    } //-- void setReportDateDesc(java.lang.String) 

    /**
     * Sets the value of field 'reportDoctorName'.
     * 
     * @param reportDoctorName the value of field 'reportDoctorName'
    **/
    public void setReportDoctorName(java.lang.String reportDoctorName)
    {
        this._reportDoctorName = reportDoctorName;
    } //-- void setReportDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'revisedDiag'.
     * 
     * @param revisedDiag the value of field 'revisedDiag'.
    **/
    public void setRevisedDiag(java.lang.String revisedDiag)
    {
        this._revisedDiag = revisedDiag;
    } //-- void setRevisedDiag(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
