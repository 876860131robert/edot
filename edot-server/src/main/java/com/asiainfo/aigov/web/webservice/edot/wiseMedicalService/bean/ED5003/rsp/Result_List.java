/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp;

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
public class Result_List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _symptomId;

    private java.lang.String _name;

    private java.lang.String _description;

    private java.lang.String _initials;

    private java.lang.String _searchTimes;

    private java.lang.String _sex;

    private java.lang.String _ageGroup;

    private java.lang.String _jobId;

    private java.lang.String _creator;

    private java.lang.String _created;

    private java.lang.String _deleted;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ageGroup'.
     * 
     * @return the value of field 'ageGroup'.
    **/
    public java.lang.String getAgeGroup()
    {
        return this._ageGroup;
    } //-- java.lang.String getAgeGroup() 

    /**
     * Returns the value of field 'created'.
     * 
     * @return the value of field 'created'.
    **/
    public java.lang.String getCreated()
    {
        return this._created;
    } //-- java.lang.String getCreated() 

    /**
     * Returns the value of field 'creator'.
     * 
     * @return the value of field 'creator'.
    **/
    public java.lang.String getCreator()
    {
        return this._creator;
    } //-- java.lang.String getCreator() 

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
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'description'.
    **/
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'initials'.
     * 
     * @return the value of field 'initials'.
    **/
    public java.lang.String getInitials()
    {
        return this._initials;
    } //-- java.lang.String getInitials() 

    /**
     * Returns the value of field 'jobId'.
     * 
     * @return the value of field 'jobId'.
    **/
    public java.lang.String getJobId()
    {
        return this._jobId;
    } //-- java.lang.String getJobId() 

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
     * Returns the value of field 'searchTimes'.
     * 
     * @return the value of field 'searchTimes'.
    **/
    public java.lang.String getSearchTimes()
    {
        return this._searchTimes;
    } //-- java.lang.String getSearchTimes() 

    /**
     * Returns the value of field 'sex'.
     * 
     * @return the value of field 'sex'.
    **/
    public java.lang.String getSex()
    {
        return this._sex;
    } //-- java.lang.String getSex() 

    /**
     * Returns the value of field 'symptomId'.
     * 
     * @return the value of field 'symptomId'.
    **/
    public java.lang.String getSymptomId()
    {
        return this._symptomId;
    } //-- java.lang.String getSymptomId() 

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
     * Sets the value of field 'ageGroup'.
     * 
     * @param ageGroup the value of field 'ageGroup'.
    **/
    public void setAgeGroup(java.lang.String ageGroup)
    {
        this._ageGroup = ageGroup;
    } //-- void setAgeGroup(java.lang.String) 

    /**
     * Sets the value of field 'created'.
     * 
     * @param created the value of field 'created'.
    **/
    public void setCreated(java.lang.String created)
    {
        this._created = created;
    } //-- void setCreated(java.lang.String) 

    /**
     * Sets the value of field 'creator'.
     * 
     * @param creator the value of field 'creator'.
    **/
    public void setCreator(java.lang.String creator)
    {
        this._creator = creator;
    } //-- void setCreator(java.lang.String) 

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
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
    **/
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'initials'.
     * 
     * @param initials the value of field 'initials'.
    **/
    public void setInitials(java.lang.String initials)
    {
        this._initials = initials;
    } //-- void setInitials(java.lang.String) 

    /**
     * Sets the value of field 'jobId'.
     * 
     * @param jobId the value of field 'jobId'.
    **/
    public void setJobId(java.lang.String jobId)
    {
        this._jobId = jobId;
    } //-- void setJobId(java.lang.String) 

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
     * Sets the value of field 'searchTimes'.
     * 
     * @param searchTimes the value of field 'searchTimes'.
    **/
    public void setSearchTimes(java.lang.String searchTimes)
    {
        this._searchTimes = searchTimes;
    } //-- void setSearchTimes(java.lang.String) 

    /**
     * Sets the value of field 'sex'.
     * 
     * @param sex the value of field 'sex'.
    **/
    public void setSex(java.lang.String sex)
    {
        this._sex = sex;
    } //-- void setSex(java.lang.String) 

    /**
     * Sets the value of field 'symptomId'.
     * 
     * @param symptomId the value of field 'symptomId'.
    **/
    public void setSymptomId(java.lang.String symptomId)
    {
        this._symptomId = symptomId;
    } //-- void setSymptomId(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
