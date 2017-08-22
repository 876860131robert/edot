/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp;

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

    private java.lang.String _infectionReporId;

    private java.lang.String _reportDateDesc;

    private java.lang.String _reportOrgName;

    private java.lang.String _infectionTypeName;

    private java.lang.String _infectionName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'infectionReporId'.
     * 
     * @return the value of field 'infectionReporId'.
    **/
    public java.lang.String getInfectionReporId()
    {
        return this._infectionReporId;
    } //-- java.lang.String getInfectionReporId() 

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
     * Returns the value of field 'reportDateDesc'.
     * 
     * @return the value of field 'reportDateDesc'.
    **/
    public java.lang.String getReportDateDesc()
    {
        return this._reportDateDesc;
    } //-- java.lang.String getReportDateDesc() 

    /**
     * Returns the value of field 'reportOrgName'.
     * 
     * @return the value of field 'reportOrgName'.
    **/
    public java.lang.String getReportOrgName()
    {
        return this._reportOrgName;
    } //-- java.lang.String getReportOrgName() 

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
     * Sets the value of field 'infectionName'.
     * 
     * @param infectionName the value of field 'infectionName'.
    **/
    public void setInfectionName(java.lang.String infectionName)
    {
        this._infectionName = infectionName;
    } //-- void setInfectionName(java.lang.String) 

    /**
     * Sets the value of field 'infectionReporId'.
     * 
     * @param infectionReporId the value of field 'infectionReporId'
    **/
    public void setInfectionReporId(java.lang.String infectionReporId)
    {
        this._infectionReporId = infectionReporId;
    } //-- void setInfectionReporId(java.lang.String) 

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
     * Sets the value of field 'reportDateDesc'.
     * 
     * @param reportDateDesc the value of field 'reportDateDesc'.
    **/
    public void setReportDateDesc(java.lang.String reportDateDesc)
    {
        this._reportDateDesc = reportDateDesc;
    } //-- void setReportDateDesc(java.lang.String) 

    /**
     * Sets the value of field 'reportOrgName'.
     * 
     * @param reportOrgName the value of field 'reportOrgName'.
    **/
    public void setReportOrgName(java.lang.String reportOrgName)
    {
        this._reportOrgName = reportOrgName;
    } //-- void setReportOrgName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
