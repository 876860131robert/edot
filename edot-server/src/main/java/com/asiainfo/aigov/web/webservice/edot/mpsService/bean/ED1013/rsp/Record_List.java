/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp;

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
public class Record_List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _record_InfoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_List() {
        super();
        _record_InfoList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRecord_Info
    **/
    public void addRecord_Info(Record_Info vRecord_Info)
        throws java.lang.IndexOutOfBoundsException
    {
        _record_InfoList.addElement(vRecord_Info);
    } //-- void addRecord_Info(Record_Info) 

    /**
     * 
     * 
     * @param index
     * @param vRecord_Info
    **/
    public void addRecord_Info(int index, Record_Info vRecord_Info)
        throws java.lang.IndexOutOfBoundsException
    {
        _record_InfoList.insertElementAt(vRecord_Info, index);
    } //-- void addRecord_Info(int, Record_Info) 

    /**
    **/
    public java.util.Enumeration enumerateRecord_Info()
    {
        return _record_InfoList.elements();
    } //-- java.util.Enumeration enumerateRecord_Info() 

    /**
     * 
     * 
     * @param index
    **/
    public Record_Info getRecord_Info(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _record_InfoList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Record_Info) _record_InfoList.elementAt(index);
    } //-- Record_Info getRecord_Info(int) 

    /**
    **/
    public Record_Info[] getRecord_Info()
    {
        int size = _record_InfoList.size();
        Record_Info[] mArray = new Record_Info[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Record_Info) _record_InfoList.elementAt(index);
        }
        return mArray;
    } //-- Record_Info[] getRecord_Info() 

    /**
    **/
    public int getRecord_InfoCount()
    {
        return _record_InfoList.size();
    } //-- int getRecord_InfoCount() 

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
    public void removeAllRecord_Info()
    {
        _record_InfoList.removeAllElements();
    } //-- void removeAllRecord_Info() 

    /**
     * 
     * 
     * @param index
    **/
    public Record_Info removeRecord_Info(int index)
    {
        java.lang.Object obj = _record_InfoList.elementAt(index);
        _record_InfoList.removeElementAt(index);
        return (Record_Info) obj;
    } //-- Record_Info removeRecord_Info(int) 

    /**
     * 
     * 
     * @param index
     * @param vRecord_Info
    **/
    public void setRecord_Info(int index, Record_Info vRecord_Info)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _record_InfoList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _record_InfoList.setElementAt(vRecord_Info, index);
    } //-- void setRecord_Info(int, Record_Info) 

    /**
     * 
     * 
     * @param record_InfoArray
    **/
    public void setRecord_Info(Record_Info[] record_InfoArray)
    {
        //-- copy array
        _record_InfoList.removeAllElements();
        for (int i = 0; i < record_InfoArray.length; i++) {
            _record_InfoList.addElement(record_InfoArray[i]);
        }
    } //-- void setRecord_Info(Record_Info) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
