/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp;

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
public class Records implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _recordList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Records() {
        super();
        _recordList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Records()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRecord
    **/
    public void addRecord(Record vRecord)
        throws java.lang.IndexOutOfBoundsException
    {
        _recordList.addElement(vRecord);
    } //-- void addRecord(Record) 

    /**
     * 
     * 
     * @param index
     * @param vRecord
    **/
    public void addRecord(int index, Record vRecord)
        throws java.lang.IndexOutOfBoundsException
    {
        _recordList.insertElementAt(vRecord, index);
    } //-- void addRecord(int, Record) 

    /**
    **/
    public java.util.Enumeration enumerateRecord()
    {
        return _recordList.elements();
    } //-- java.util.Enumeration enumerateRecord() 

    /**
     * 
     * 
     * @param index
    **/
    public Record getRecord(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _recordList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Record) _recordList.elementAt(index);
    } //-- Record getRecord(int) 

    /**
    **/
    public Record[] getRecord()
    {
        int size = _recordList.size();
        Record[] mArray = new Record[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Record) _recordList.elementAt(index);
        }
        return mArray;
    } //-- Record[] getRecord() 

    /**
    **/
    public int getRecordCount()
    {
        return _recordList.size();
    } //-- int getRecordCount() 

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
    public void removeAllRecord()
    {
        _recordList.removeAllElements();
    } //-- void removeAllRecord() 

    /**
     * 
     * 
     * @param index
    **/
    public Record removeRecord(int index)
    {
        java.lang.Object obj = _recordList.elementAt(index);
        _recordList.removeElementAt(index);
        return (Record) obj;
    } //-- Record removeRecord(int) 

    /**
     * 
     * 
     * @param index
     * @param vRecord
    **/
    public void setRecord(int index, Record vRecord)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _recordList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _recordList.setElementAt(vRecord, index);
    } //-- void setRecord(int, Record) 

    /**
     * 
     * 
     * @param recordArray
    **/
    public void setRecord(Record[] recordArray)
    {
        //-- copy array
        _recordList.removeAllElements();
        for (int i = 0; i < recordArray.length; i++) {
            _recordList.addElement(recordArray[i]);
        }
    } //-- void setRecord(Record) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Records unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Records) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Records.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Records unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
