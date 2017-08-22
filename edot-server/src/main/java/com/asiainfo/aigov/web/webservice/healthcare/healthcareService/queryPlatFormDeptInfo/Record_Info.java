/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo;

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

    private java.lang.String _code;

    private java.lang.String _name;

    private java.lang.String _office_Jian_Pin;

    private java.lang.String _standard_Office_Id;

    private java.lang.String _summary;

    private java.lang.String _tel;

    private java.lang.String _deleted;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'code'.
     * 
     * @return the value of field 'code'.
    **/
    public java.lang.String getCode()
    {
        return this._code;
    } //-- java.lang.String getCode() 

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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'office_Jian_Pin'.
     * 
     * @return the value of field 'office_Jian_Pin'.
    **/
    public java.lang.String getOffice_Jian_Pin()
    {
        return this._office_Jian_Pin;
    } //-- java.lang.String getOffice_Jian_Pin() 

    /**
     * Returns the value of field 'standard_Office_Id'.
     * 
     * @return the value of field 'standard_Office_Id'.
    **/
    public java.lang.String getStandard_Office_Id()
    {
        return this._standard_Office_Id;
    } //-- java.lang.String getStandard_Office_Id() 

    /**
     * Returns the value of field 'summary'.
     * 
     * @return the value of field 'summary'.
    **/
    public java.lang.String getSummary()
    {
        return this._summary;
    } //-- java.lang.String getSummary() 

    /**
     * Returns the value of field 'tel'.
     * 
     * @return the value of field 'tel'.
    **/
    public java.lang.String getTel()
    {
        return this._tel;
    } //-- java.lang.String getTel() 

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
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
    **/
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'office_Jian_Pin'.
     * 
     * @param office_Jian_Pin the value of field 'office_Jian_Pin'.
    **/
    public void setOffice_Jian_Pin(java.lang.String office_Jian_Pin)
    {
        this._office_Jian_Pin = office_Jian_Pin;
    } //-- void setOffice_Jian_Pin(java.lang.String) 

    /**
     * Sets the value of field 'standard_Office_Id'.
     * 
     * @param standard_Office_Id the value of field
     * 'standard_Office_Id'.
    **/
    public void setStandard_Office_Id(java.lang.String standard_Office_Id)
    {
        this._standard_Office_Id = standard_Office_Id;
    } //-- void setStandard_Office_Id(java.lang.String) 

    /**
     * Sets the value of field 'summary'.
     * 
     * @param summary the value of field 'summary'.
    **/
    public void setSummary(java.lang.String summary)
    {
        this._summary = summary;
    } //-- void setSummary(java.lang.String) 

    /**
     * Sets the value of field 'tel'.
     * 
     * @param tel the value of field 'tel'.
    **/
    public void setTel(java.lang.String tel)
    {
        this._tel = tel;
    } //-- void setTel(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormDeptInfo.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
