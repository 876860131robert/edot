/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp;

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

    private java.lang.String _flag;

    private java.lang.String _id;

    private java.lang.String _time;

    private java.lang.String _diagName;

    private java.lang.String _orgName;

    private java.lang.String _doctorName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'diagName'.
     * 
     * @return the value of field 'diagName'.
    **/
    public java.lang.String getDiagName()
    {
        return this._diagName;
    } //-- java.lang.String getDiagName() 

    /**
     * Returns the value of field 'doctorName'.
     * 
     * @return the value of field 'doctorName'.
    **/
    public java.lang.String getDoctorName()
    {
        return this._doctorName;
    } //-- java.lang.String getDoctorName() 

    /**
     * Returns the value of field 'flag'.
     * 
     * @return the value of field 'flag'.
    **/
    public java.lang.String getFlag()
    {
        return this._flag;
    } //-- java.lang.String getFlag() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'id'.
    **/
    public java.lang.String getId()
    {
        return this._id;
    } //-- java.lang.String getId() 

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
     * Returns the value of field 'time'.
     * 
     * @return the value of field 'time'.
    **/
    public java.lang.String getTime()
    {
        return this._time;
    } //-- java.lang.String getTime() 

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
     * Sets the value of field 'diagName'.
     * 
     * @param diagName the value of field 'diagName'.
    **/
    public void setDiagName(java.lang.String diagName)
    {
        this._diagName = diagName;
    } //-- void setDiagName(java.lang.String) 

    /**
     * Sets the value of field 'doctorName'.
     * 
     * @param doctorName the value of field 'doctorName'.
    **/
    public void setDoctorName(java.lang.String doctorName)
    {
        this._doctorName = doctorName;
    } //-- void setDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'flag'.
     * 
     * @param flag the value of field 'flag'.
    **/
    public void setFlag(java.lang.String flag)
    {
        this._flag = flag;
    } //-- void setFlag(java.lang.String) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
    **/
    public void setId(java.lang.String id)
    {
        this._id = id;
    } //-- void setId(java.lang.String) 

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
     * Sets the value of field 'time'.
     * 
     * @param time the value of field 'time'.
    **/
    public void setTime(java.lang.String time)
    {
        this._time = time;
    } //-- void setTime(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
