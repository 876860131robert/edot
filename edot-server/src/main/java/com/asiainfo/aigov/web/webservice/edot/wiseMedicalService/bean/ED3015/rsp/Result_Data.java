/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp;

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

    private java.lang.String _allergens;

    private java.lang.String _envRisk;

    private java.lang.String _geneticDiseaseHistory;

    private java.lang.String _disability;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Result_Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'allergens'.
     * 
     * @return the value of field 'allergens'.
    **/
    public java.lang.String getAllergens()
    {
        return this._allergens;
    } //-- java.lang.String getAllergens() 

    /**
     * Returns the value of field 'disability'.
     * 
     * @return the value of field 'disability'.
    **/
    public java.lang.String getDisability()
    {
        return this._disability;
    } //-- java.lang.String getDisability() 

    /**
     * Returns the value of field 'envRisk'.
     * 
     * @return the value of field 'envRisk'.
    **/
    public java.lang.String getEnvRisk()
    {
        return this._envRisk;
    } //-- java.lang.String getEnvRisk() 

    /**
     * Returns the value of field 'geneticDiseaseHistory'.
     * 
     * @return the value of field 'geneticDiseaseHistory'.
    **/
    public java.lang.String getGeneticDiseaseHistory()
    {
        return this._geneticDiseaseHistory;
    } //-- java.lang.String getGeneticDiseaseHistory() 

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
     * Sets the value of field 'allergens'.
     * 
     * @param allergens the value of field 'allergens'.
    **/
    public void setAllergens(java.lang.String allergens)
    {
        this._allergens = allergens;
    } //-- void setAllergens(java.lang.String) 

    /**
     * Sets the value of field 'disability'.
     * 
     * @param disability the value of field 'disability'.
    **/
    public void setDisability(java.lang.String disability)
    {
        this._disability = disability;
    } //-- void setDisability(java.lang.String) 

    /**
     * Sets the value of field 'envRisk'.
     * 
     * @param envRisk the value of field 'envRisk'.
    **/
    public void setEnvRisk(java.lang.String envRisk)
    {
        this._envRisk = envRisk;
    } //-- void setEnvRisk(java.lang.String) 

    /**
     * Sets the value of field 'geneticDiseaseHistory'.
     * 
     * @param geneticDiseaseHistory the value of field
     * 'geneticDiseaseHistory'.
    **/
    public void setGeneticDiseaseHistory(java.lang.String geneticDiseaseHistory)
    {
        this._geneticDiseaseHistory = geneticDiseaseHistory;
    } //-- void setGeneticDiseaseHistory(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
