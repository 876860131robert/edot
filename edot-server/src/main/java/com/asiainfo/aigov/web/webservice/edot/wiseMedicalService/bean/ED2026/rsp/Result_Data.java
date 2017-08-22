/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp;

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
public class Result_Data implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _flowNo;

    private java.lang.String _allAmt;

    private java.lang.String _souceType;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Result_Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'allAmt'.
     * 
     * @return the value of field 'allAmt'.
    **/
    public java.lang.String getAllAmt()
    {
        return this._allAmt;
    } //-- java.lang.String getAllAmt() 

    /**
     * Returns the value of field 'flowNo'.
     * 
     * @return the value of field 'flowNo'.
    **/
    public java.lang.String getFlowNo()
    {
        return this._flowNo;
    } //-- java.lang.String getFlowNo() 

    /**
     * Returns the value of field 'souceType'.
     * 
     * @return the value of field 'souceType'.
    **/
    public java.lang.String getSouceType()
    {
        return this._souceType;
    } //-- java.lang.String getSouceType() 

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
     * Sets the value of field 'allAmt'.
     * 
     * @param allAmt the value of field 'allAmt'.
    **/
    public void setAllAmt(java.lang.String allAmt)
    {
        this._allAmt = allAmt;
    } //-- void setAllAmt(java.lang.String) 

    /**
     * Sets the value of field 'flowNo'.
     * 
     * @param flowNo the value of field 'flowNo'.
    **/
    public void setFlowNo(java.lang.String flowNo)
    {
        this._flowNo = flowNo;
    } //-- void setFlowNo(java.lang.String) 

    /**
     * Sets the value of field 'souceType'.
     * 
     * @param souceType the value of field 'souceType'.
    **/
    public void setSouceType(java.lang.String souceType)
    {
        this._souceType = souceType;
    } //-- void setSouceType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
