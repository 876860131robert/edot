/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp;

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

    private java.lang.String _healthExamId;

    private java.lang.String _examDateDesc;

    private java.lang.String _orgName;

    private java.lang.String _respDoctorName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'examDateDesc'.
     * 
     * @return the value of field 'examDateDesc'.
    **/
    public java.lang.String getExamDateDesc()
    {
        return this._examDateDesc;
    } //-- java.lang.String getExamDateDesc() 

    /**
     * Returns the value of field 'healthExamId'.
     * 
     * @return the value of field 'healthExamId'.
    **/
    public java.lang.String getHealthExamId()
    {
        return this._healthExamId;
    } //-- java.lang.String getHealthExamId() 

    /**
     * Returns the value of field 'orgName'.
     * 
     * @return the value of field 'orgName'.
    **/
    public java.lang.String getOrgName()
    {
        return this._orgName;
    } //-- java.lang.String getOrgName() 

    /**
     * Returns the value of field 'respDoctorName'.
     * 
     * @return the value of field 'respDoctorName'.
    **/
    public java.lang.String getRespDoctorName()
    {
        return this._respDoctorName;
    } //-- java.lang.String getRespDoctorName() 

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
     * Sets the value of field 'examDateDesc'.
     * 
     * @param examDateDesc the value of field 'examDateDesc'.
    **/
    public void setExamDateDesc(java.lang.String examDateDesc)
    {
        this._examDateDesc = examDateDesc;
    } //-- void setExamDateDesc(java.lang.String) 

    /**
     * Sets the value of field 'healthExamId'.
     * 
     * @param healthExamId the value of field 'healthExamId'.
    **/
    public void setHealthExamId(java.lang.String healthExamId)
    {
        this._healthExamId = healthExamId;
    } //-- void setHealthExamId(java.lang.String) 

    /**
     * Sets the value of field 'orgName'.
     * 
     * @param orgName the value of field 'orgName'.
    **/
    public void setOrgName(java.lang.String orgName)
    {
        this._orgName = orgName;
    } //-- void setOrgName(java.lang.String) 

    /**
     * Sets the value of field 'respDoctorName'.
     * 
     * @param respDoctorName the value of field 'respDoctorName'.
    **/
    public void setRespDoctorName(java.lang.String respDoctorName)
    {
        this._respDoctorName = respDoctorName;
    } //-- void setRespDoctorName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
