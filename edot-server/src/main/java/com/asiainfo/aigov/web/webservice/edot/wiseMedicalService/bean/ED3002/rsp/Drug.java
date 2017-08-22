/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp;

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
public class Drug implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _drugTypeDesc;

    private java.lang.String _drugName;

    private java.lang.String _drugUsingDays;


      //----------------/
     //- Constructors -/
    //----------------/

    public Drug() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Drug()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'drugName'.
     * 
     * @return the value of field 'drugName'.
    **/
    public java.lang.String getDrugName()
    {
        return this._drugName;
    } //-- java.lang.String getDrugName() 

    /**
     * Returns the value of field 'drugTypeDesc'.
     * 
     * @return the value of field 'drugTypeDesc'.
    **/
    public java.lang.String getDrugTypeDesc()
    {
        return this._drugTypeDesc;
    } //-- java.lang.String getDrugTypeDesc() 

    /**
     * Returns the value of field 'drugUsingDays'.
     * 
     * @return the value of field 'drugUsingDays'.
    **/
    public java.lang.String getDrugUsingDays()
    {
        return this._drugUsingDays;
    } //-- java.lang.String getDrugUsingDays() 

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
     * Sets the value of field 'drugName'.
     * 
     * @param drugName the value of field 'drugName'.
    **/
    public void setDrugName(java.lang.String drugName)
    {
        this._drugName = drugName;
    } //-- void setDrugName(java.lang.String) 

    /**
     * Sets the value of field 'drugTypeDesc'.
     * 
     * @param drugTypeDesc the value of field 'drugTypeDesc'.
    **/
    public void setDrugTypeDesc(java.lang.String drugTypeDesc)
    {
        this._drugTypeDesc = drugTypeDesc;
    } //-- void setDrugTypeDesc(java.lang.String) 

    /**
     * Sets the value of field 'drugUsingDays'.
     * 
     * @param drugUsingDays the value of field 'drugUsingDays'.
    **/
    public void setDrugUsingDays(java.lang.String drugUsingDays)
    {
        this._drugUsingDays = drugUsingDays;
    } //-- void setDrugUsingDays(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Drug unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Drug) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Drug.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Drug unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
