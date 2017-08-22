/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp;

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
public class SympList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _sympList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SympList() {
        super();
        _sympList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.SympList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSymp
    **/
    public void addSymp(Symp vSymp)
        throws java.lang.IndexOutOfBoundsException
    {
        _sympList.addElement(vSymp);
    } //-- void addSymp(Symp) 

    /**
     * 
     * 
     * @param index
     * @param vSymp
    **/
    public void addSymp(int index, Symp vSymp)
        throws java.lang.IndexOutOfBoundsException
    {
        _sympList.insertElementAt(vSymp, index);
    } //-- void addSymp(int, Symp) 

    /**
    **/
    public java.util.Enumeration enumerateSymp()
    {
        return _sympList.elements();
    } //-- java.util.Enumeration enumerateSymp() 

    /**
     * 
     * 
     * @param index
    **/
    public Symp getSymp(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _sympList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Symp) _sympList.elementAt(index);
    } //-- Symp getSymp(int) 

    /**
    **/
    public Symp[] getSymp()
    {
        int size = _sympList.size();
        Symp[] mArray = new Symp[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Symp) _sympList.elementAt(index);
        }
        return mArray;
    } //-- Symp[] getSymp() 

    /**
    **/
    public int getSympCount()
    {
        return _sympList.size();
    } //-- int getSympCount() 

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
    public void removeAllSymp()
    {
        _sympList.removeAllElements();
    } //-- void removeAllSymp() 

    /**
     * 
     * 
     * @param index
    **/
    public Symp removeSymp(int index)
    {
        java.lang.Object obj = _sympList.elementAt(index);
        _sympList.removeElementAt(index);
        return (Symp) obj;
    } //-- Symp removeSymp(int) 

    /**
     * 
     * 
     * @param index
     * @param vSymp
    **/
    public void setSymp(int index, Symp vSymp)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _sympList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _sympList.setElementAt(vSymp, index);
    } //-- void setSymp(int, Symp) 

    /**
     * 
     * 
     * @param sympArray
    **/
    public void setSymp(Symp[] sympArray)
    {
        //-- copy array
        _sympList.removeAllElements();
        for (int i = 0; i < sympArray.length; i++) {
            _sympList.addElement(sympArray[i]);
        }
    } //-- void setSymp(Symp) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.SympList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.SympList) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.SympList.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.SympList unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
