/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
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

    private java.lang.String _diseaseId;

    private java.lang.String _name;

    private java.lang.String _description;

    private java.lang.String _cause;

    private java.lang.String _examine;

    private java.lang.String _feature;

    private java.lang.String _diagnose;

    private java.lang.String _schedule;

    private java.lang.String _advice;

    private java.lang.String _creator;

    private java.lang.String _created;

    private java.lang.String _deleted;

    private java.util.Vector _office_listList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
        _office_listList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOffice_list
    **/
    public void addOffice_list(Office_list vOffice_list)
        throws java.lang.IndexOutOfBoundsException
    {
        _office_listList.addElement(vOffice_list);
    } //-- void addOffice_list(Office_list) 

    /**
     * 
     * 
     * @param index
     * @param vOffice_list
    **/
    public void addOffice_list(int index, Office_list vOffice_list)
        throws java.lang.IndexOutOfBoundsException
    {
        _office_listList.insertElementAt(vOffice_list, index);
    } //-- void addOffice_list(int, Office_list) 

    /**
    **/
    public java.util.Enumeration enumerateOffice_list()
    {
        return _office_listList.elements();
    } //-- java.util.Enumeration enumerateOffice_list() 

    /**
     * Returns the value of field 'advice'.
     * 
     * @return the value of field 'advice'.
    **/
    public java.lang.String getAdvice()
    {
        return this._advice;
    } //-- java.lang.String getAdvice() 

    /**
     * Returns the value of field 'cause'.
     * 
     * @return the value of field 'cause'.
    **/
    public java.lang.String getCause()
    {
        return this._cause;
    } //-- java.lang.String getCause() 

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
     * Returns the value of field 'diagnose'.
     * 
     * @return the value of field 'diagnose'.
    **/
    public java.lang.String getDiagnose()
    {
        return this._diagnose;
    } //-- java.lang.String getDiagnose() 

    /**
     * Returns the value of field 'diseaseId'.
     * 
     * @return the value of field 'diseaseId'.
    **/
    public java.lang.String getDiseaseId()
    {
        return this._diseaseId;
    } //-- java.lang.String getDiseaseId() 

    /**
     * Returns the value of field 'examine'.
     * 
     * @return the value of field 'examine'.
    **/
    public java.lang.String getExamine()
    {
        return this._examine;
    } //-- java.lang.String getExamine() 

    /**
     * Returns the value of field 'feature'.
     * 
     * @return the value of field 'feature'.
    **/
    public java.lang.String getFeature()
    {
        return this._feature;
    } //-- java.lang.String getFeature() 

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
     * 
     * 
     * @param index
    **/
    public Office_list getOffice_list(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _office_listList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Office_list) _office_listList.elementAt(index);
    } //-- Office_list getOffice_list(int) 

    /**
    **/
    public Office_list[] getOffice_list()
    {
        int size = _office_listList.size();
        Office_list[] mArray = new Office_list[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Office_list) _office_listList.elementAt(index);
        }
        return mArray;
    } //-- Office_list[] getOffice_list() 

    /**
    **/
    public int getOffice_listCount()
    {
        return _office_listList.size();
    } //-- int getOffice_listCount() 

    /**
     * Returns the value of field 'schedule'.
     * 
     * @return the value of field 'schedule'.
    **/
    public java.lang.String getSchedule()
    {
        return this._schedule;
    } //-- java.lang.String getSchedule() 

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
    **/
    public void removeAllOffice_list()
    {
        _office_listList.removeAllElements();
    } //-- void removeAllOffice_list() 

    /**
     * 
     * 
     * @param index
    **/
    public Office_list removeOffice_list(int index)
    {
        java.lang.Object obj = _office_listList.elementAt(index);
        _office_listList.removeElementAt(index);
        return (Office_list) obj;
    } //-- Office_list removeOffice_list(int) 

    /**
     * Sets the value of field 'advice'.
     * 
     * @param advice the value of field 'advice'.
    **/
    public void setAdvice(java.lang.String advice)
    {
        this._advice = advice;
    } //-- void setAdvice(java.lang.String) 

    /**
     * Sets the value of field 'cause'.
     * 
     * @param cause the value of field 'cause'.
    **/
    public void setCause(java.lang.String cause)
    {
        this._cause = cause;
    } //-- void setCause(java.lang.String) 

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
     * Sets the value of field 'diagnose'.
     * 
     * @param diagnose the value of field 'diagnose'.
    **/
    public void setDiagnose(java.lang.String diagnose)
    {
        this._diagnose = diagnose;
    } //-- void setDiagnose(java.lang.String) 

    /**
     * Sets the value of field 'diseaseId'.
     * 
     * @param diseaseId the value of field 'diseaseId'.
    **/
    public void setDiseaseId(java.lang.String diseaseId)
    {
        this._diseaseId = diseaseId;
    } //-- void setDiseaseId(java.lang.String) 

    /**
     * Sets the value of field 'examine'.
     * 
     * @param examine the value of field 'examine'.
    **/
    public void setExamine(java.lang.String examine)
    {
        this._examine = examine;
    } //-- void setExamine(java.lang.String) 

    /**
     * Sets the value of field 'feature'.
     * 
     * @param feature the value of field 'feature'.
    **/
    public void setFeature(java.lang.String feature)
    {
        this._feature = feature;
    } //-- void setFeature(java.lang.String) 

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
     * 
     * 
     * @param index
     * @param vOffice_list
    **/
    public void setOffice_list(int index, Office_list vOffice_list)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _office_listList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _office_listList.setElementAt(vOffice_list, index);
    } //-- void setOffice_list(int, Office_list) 

    /**
     * 
     * 
     * @param office_listArray
    **/
    public void setOffice_list(Office_list[] office_listArray)
    {
        //-- copy array
        _office_listList.removeAllElements();
        for (int i = 0; i < office_listArray.length; i++) {
            _office_listList.addElement(office_listArray[i]);
        }
    } //-- void setOffice_list(Office_list) 

    /**
     * Sets the value of field 'schedule'.
     * 
     * @param schedule the value of field 'schedule'.
    **/
    public void setSchedule(java.lang.String schedule)
    {
        this._schedule = schedule;
    } //-- void setSchedule(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
