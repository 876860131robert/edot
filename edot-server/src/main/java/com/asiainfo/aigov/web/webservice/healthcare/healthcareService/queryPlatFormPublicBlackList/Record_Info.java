/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList;

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

    private java.lang.String _blackList_Id;

    private java.lang.String _name;

    private java.lang.String _id_No;

    private java.lang.String _card_No;

    private java.lang.String _black_Date;

    private java.lang.String _status;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'blackList_Id'.
     * 
     * @return the value of field 'blackList_Id'.
    **/
    public java.lang.String getBlackList_Id()
    {
        return this._blackList_Id;
    } //-- java.lang.String getBlackList_Id() 

    /**
     * Returns the value of field 'black_Date'.
     * 
     * @return the value of field 'black_Date'.
    **/
    public java.lang.String getBlack_Date()
    {
        return this._black_Date;
    } //-- java.lang.String getBlack_Date() 

    /**
     * Returns the value of field 'card_No'.
     * 
     * @return the value of field 'card_No'.
    **/
    public java.lang.String getCard_No()
    {
        return this._card_No;
    } //-- java.lang.String getCard_No() 

    /**
     * Returns the value of field 'id_No'.
     * 
     * @return the value of field 'id_No'.
    **/
    public java.lang.String getId_No()
    {
        return this._id_No;
    } //-- java.lang.String getId_No() 

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
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'status'.
    **/
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

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
     * Sets the value of field 'blackList_Id'.
     * 
     * @param blackList_Id the value of field 'blackList_Id'.
    **/
    public void setBlackList_Id(java.lang.String blackList_Id)
    {
        this._blackList_Id = blackList_Id;
    } //-- void setBlackList_Id(java.lang.String) 

    /**
     * Sets the value of field 'black_Date'.
     * 
     * @param black_Date the value of field 'black_Date'.
    **/
    public void setBlack_Date(java.lang.String black_Date)
    {
        this._black_Date = black_Date;
    } //-- void setBlack_Date(java.lang.String) 

    /**
     * Sets the value of field 'card_No'.
     * 
     * @param card_No the value of field 'card_No'.
    **/
    public void setCard_No(java.lang.String card_No)
    {
        this._card_No = card_No;
    } //-- void setCard_No(java.lang.String) 

    /**
     * Sets the value of field 'id_No'.
     * 
     * @param id_No the value of field 'id_No'.
    **/
    public void setId_No(java.lang.String id_No)
    {
        this._id_No = id_No;
    } //-- void setId_No(java.lang.String) 

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
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
    **/
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormPublicBlackList.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
