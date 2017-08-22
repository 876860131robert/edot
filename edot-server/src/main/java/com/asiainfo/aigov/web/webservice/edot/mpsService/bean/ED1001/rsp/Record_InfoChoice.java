/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp;

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
public class Record_InfoChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _id_NoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_InfoChoice() {
        super();
        _id_NoList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_InfoChoice()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vId_No
    **/
    public void addId_No(java.lang.String vId_No)
        throws java.lang.IndexOutOfBoundsException
    {
        _id_NoList.addElement(vId_No);
    } //-- void addId_No(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vId_No
    **/
    public void addId_No(int index, java.lang.String vId_No)
        throws java.lang.IndexOutOfBoundsException
    {
        _id_NoList.insertElementAt(vId_No, index);
    } //-- void addId_No(int, java.lang.String) 

    /**
    **/
    public java.util.Enumeration enumerateId_No()
    {
        return _id_NoList.elements();
    } //-- java.util.Enumeration enumerateId_No() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String getId_No(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _id_NoList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_id_NoList.elementAt(index);
    } //-- java.lang.String getId_No(int) 

    /**
    **/
    public java.lang.String[] getId_No()
    {
        int size = _id_NoList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_id_NoList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getId_No() 

    /**
    **/
    public int getId_NoCount()
    {
        return _id_NoList.size();
    } //-- int getId_NoCount() 

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
    public void removeAllId_No()
    {
        _id_NoList.removeAllElements();
    } //-- void removeAllId_No() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String removeId_No(int index)
    {
        java.lang.Object obj = _id_NoList.elementAt(index);
        _id_NoList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeId_No(int) 

    /**
     * 
     * 
     * @param index
     * @param vId_No
    **/
    public void setId_No(int index, java.lang.String vId_No)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _id_NoList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _id_NoList.setElementAt(vId_No, index);
    } //-- void setId_No(int, java.lang.String) 

    /**
     * 
     * 
     * @param id_NoArray
    **/
    public void setId_No(java.lang.String[] id_NoArray)
    {
        //-- copy array
        _id_NoList.removeAllElements();
        for (int i = 0; i < id_NoArray.length; i++) {
            _id_NoList.addElement(id_NoArray[i]);
        }
    } //-- void setId_No(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_InfoChoice unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_InfoChoice) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_InfoChoice.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Record_InfoChoice unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
