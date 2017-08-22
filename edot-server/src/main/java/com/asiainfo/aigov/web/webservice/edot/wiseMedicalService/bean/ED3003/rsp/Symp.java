/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp;

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
public class Symp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _symptomName;

    private java.lang.String _onsetDtimeDesc;


      //----------------/
     //- Constructors -/
    //----------------/

    public Symp() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Symp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'onsetDtimeDesc'.
     * 
     * @return the value of field 'onsetDtimeDesc'.
    **/
    public java.lang.String getOnsetDtimeDesc()
    {
        return this._onsetDtimeDesc;
    } //-- java.lang.String getOnsetDtimeDesc() 

    /**
     * Returns the value of field 'symptomName'.
     * 
     * @return the value of field 'symptomName'.
    **/
    public java.lang.String getSymptomName()
    {
        return this._symptomName;
    } //-- java.lang.String getSymptomName() 

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
     * Sets the value of field 'onsetDtimeDesc'.
     * 
     * @param onsetDtimeDesc the value of field 'onsetDtimeDesc'.
    **/
    public void setOnsetDtimeDesc(java.lang.String onsetDtimeDesc)
    {
        this._onsetDtimeDesc = onsetDtimeDesc;
    } //-- void setOnsetDtimeDesc(java.lang.String) 

    /**
     * Sets the value of field 'symptomName'.
     * 
     * @param symptomName the value of field 'symptomName'.
    **/
    public void setSymptomName(java.lang.String symptomName)
    {
        this._symptomName = symptomName;
    } //-- void setSymptomName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Symp unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Symp) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Symp.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Symp unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
