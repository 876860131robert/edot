/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo;

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

    private java.lang.String _doctor_Code;

    private java.lang.String _name;

    private java.lang.String _office_Code;

    private java.lang.String _sex_Code;

    private java.lang.String _degree;

    private java.lang.String _tech_Title;

    private java.lang.String _deleted;

    private java.lang.String _specaility;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'degree'.
     * 
     * @return the value of field 'degree'.
    **/
    public java.lang.String getDegree()
    {
        return this._degree;
    } //-- java.lang.String getDegree() 

    /**
     * Returns the value of field 'deleted'.
     * 
     * @return the value of field 'deleted'.
    **/
    public java.lang.String getDeleted()
    {
        return this._deleted;
    } //-- java.lang.String getDeleted() 

    /**
     * Returns the value of field 'doctor_Code'.
     * 
     * @return the value of field 'doctor_Code'.
    **/
    public java.lang.String getDoctor_Code()
    {
        return this._doctor_Code;
    } //-- java.lang.String getDoctor_Code() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'office_Code'.
     * 
     * @return the value of field 'office_Code'.
    **/
    public java.lang.String getOffice_Code()
    {
        return this._office_Code;
    } //-- java.lang.String getOffice_Code() 

    /**
     * Returns the value of field 'sex_Code'.
     * 
     * @return the value of field 'sex_Code'.
    **/
    public java.lang.String getSex_Code()
    {
        return this._sex_Code;
    } //-- java.lang.String getSex_Code() 

    /**
     * Returns the value of field 'specaility'.
     * 
     * @return the value of field 'specaility'.
    **/
    public java.lang.String getSpecaility()
    {
        return this._specaility;
    } //-- java.lang.String getSpecaility() 

    /**
     * Returns the value of field 'tech_Title'.
     * 
     * @return the value of field 'tech_Title'.
    **/
    public java.lang.String getTech_Title()
    {
        return this._tech_Title;
    } //-- java.lang.String getTech_Title() 

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
     * Sets the value of field 'degree'.
     * 
     * @param degree the value of field 'degree'.
    **/
    public void setDegree(java.lang.String degree)
    {
        this._degree = degree;
    } //-- void setDegree(java.lang.String) 

    /**
     * Sets the value of field 'deleted'.
     * 
     * @param deleted the value of field 'deleted'.
    **/
    public void setDeleted(java.lang.String deleted)
    {
        this._deleted = deleted;
    } //-- void setDeleted(java.lang.String) 

    /**
     * Sets the value of field 'doctor_Code'.
     * 
     * @param doctor_Code the value of field 'doctor_Code'.
    **/
    public void setDoctor_Code(java.lang.String doctor_Code)
    {
        this._doctor_Code = doctor_Code;
    } //-- void setDoctor_Code(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'office_Code'.
     * 
     * @param office_Code the value of field 'office_Code'.
    **/
    public void setOffice_Code(java.lang.String office_Code)
    {
        this._office_Code = office_Code;
    } //-- void setOffice_Code(java.lang.String) 

    /**
     * Sets the value of field 'sex_Code'.
     * 
     * @param sex_Code the value of field 'sex_Code'.
    **/
    public void setSex_Code(java.lang.String sex_Code)
    {
        this._sex_Code = sex_Code;
    } //-- void setSex_Code(java.lang.String) 

    /**
     * Sets the value of field 'specaility'.
     * 
     * @param specaility the value of field 'specaility'.
    **/
    public void setSpecaility(java.lang.String specaility)
    {
        this._specaility = specaility;
    } //-- void setSpecaility(java.lang.String) 

    /**
     * Sets the value of field 'tech_Title'.
     * 
     * @param tech_Title the value of field 'tech_Title'.
    **/
    public void setTech_Title(java.lang.String tech_Title)
    {
        this._tech_Title = tech_Title;
    } //-- void setTech_Title(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDoctorInfo.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
