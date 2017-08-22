/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp;

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

    private java.lang.String _serial_No;

    private java.lang.String _receipt_No;

    private java.lang.String _drug_Windows;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'drug_Windows'.
     * 
     * @return the value of field 'drug_Windows'.
    **/
    public java.lang.String getDrug_Windows()
    {
        return this._drug_Windows;
    } //-- java.lang.String getDrug_Windows() 

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
     * Returns the value of field 'serial_No'.
     * 
     * @return the value of field 'serial_No'.
    **/
    public java.lang.String getSerial_No()
    {
        return this._serial_No;
    } //-- java.lang.String getSerial_No() 

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
     * Sets the value of field 'drug_Windows'.
     * 
     * @param drug_Windows the value of field 'drug_Windows'.
    **/
    public void setDrug_Windows(java.lang.String drug_Windows)
    {
        this._drug_Windows = drug_Windows;
    } //-- void setDrug_Windows(java.lang.String) 

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
     * Sets the value of field 'serial_No'.
     * 
     * @param serial_No the value of field 'serial_No'.
    **/
    public void setSerial_No(java.lang.String serial_No)
    {
        this._serial_No = serial_No;
    } //-- void setSerial_No(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
