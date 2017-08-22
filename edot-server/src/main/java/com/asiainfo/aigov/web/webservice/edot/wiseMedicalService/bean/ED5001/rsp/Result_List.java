/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp;

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

    private java.lang.String _part_id;

    private java.lang.String _part_name;

    private java.lang.String _part_desc;

    private java.lang.String _upid;

    private java.lang.String _creator;

    private java.lang.String _created;

    private java.lang.String _deleted;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'part_desc'.
     * 
     * @return the value of field 'part_desc'.
    **/
    public java.lang.String getPart_desc()
    {
        return this._part_desc;
    } //-- java.lang.String getPart_desc() 

    /**
     * Returns the value of field 'part_id'.
     * 
     * @return the value of field 'part_id'.
    **/
    public java.lang.String getPart_id()
    {
        return this._part_id;
    } //-- java.lang.String getPart_id() 

    /**
     * Returns the value of field 'part_name'.
     * 
     * @return the value of field 'part_name'.
    **/
    public java.lang.String getPart_name()
    {
        return this._part_name;
    } //-- java.lang.String getPart_name() 

    /**
     * Returns the value of field 'upid'.
     * 
     * @return the value of field 'upid'.
    **/
    public java.lang.String getUpid()
    {
        return this._upid;
    } //-- java.lang.String getUpid() 

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
     * Sets the value of field 'part_desc'.
     * 
     * @param part_desc the value of field 'part_desc'.
    **/
    public void setPart_desc(java.lang.String part_desc)
    {
        this._part_desc = part_desc;
    } //-- void setPart_desc(java.lang.String) 

    /**
     * Sets the value of field 'part_id'.
     * 
     * @param part_id the value of field 'part_id'.
    **/
    public void setPart_id(java.lang.String part_id)
    {
        this._part_id = part_id;
    } //-- void setPart_id(java.lang.String) 

    /**
     * Sets the value of field 'part_name'.
     * 
     * @param part_name the value of field 'part_name'.
    **/
    public void setPart_name(java.lang.String part_name)
    {
        this._part_name = part_name;
    } //-- void setPart_name(java.lang.String) 

    /**
     * Sets the value of field 'upid'.
     * 
     * @param upid the value of field 'upid'.
    **/
    public void setUpid(java.lang.String upid)
    {
        this._upid = upid;
    } //-- void setUpid(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
