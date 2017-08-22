/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp;

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
public class DrugList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _drugList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DrugList() {
        super();
        _drugList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.DrugList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDrug
    **/
    public void addDrug(Drug vDrug)
        throws java.lang.IndexOutOfBoundsException
    {
        _drugList.addElement(vDrug);
    } //-- void addDrug(Drug) 

    /**
     * 
     * 
     * @param index
     * @param vDrug
    **/
    public void addDrug(int index, Drug vDrug)
        throws java.lang.IndexOutOfBoundsException
    {
        _drugList.insertElementAt(vDrug, index);
    } //-- void addDrug(int, Drug) 

    /**
    **/
    public java.util.Enumeration enumerateDrug()
    {
        return _drugList.elements();
    } //-- java.util.Enumeration enumerateDrug() 

    /**
     * 
     * 
     * @param index
    **/
    public Drug getDrug(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _drugList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Drug) _drugList.elementAt(index);
    } //-- Drug getDrug(int) 

    /**
    **/
    public Drug[] getDrug()
    {
        int size = _drugList.size();
        Drug[] mArray = new Drug[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Drug) _drugList.elementAt(index);
        }
        return mArray;
    } //-- Drug[] getDrug() 

    /**
    **/
    public int getDrugCount()
    {
        return _drugList.size();
    } //-- int getDrugCount() 

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
    public void removeAllDrug()
    {
        _drugList.removeAllElements();
    } //-- void removeAllDrug() 

    /**
     * 
     * 
     * @param index
    **/
    public Drug removeDrug(int index)
    {
        java.lang.Object obj = _drugList.elementAt(index);
        _drugList.removeElementAt(index);
        return (Drug) obj;
    } //-- Drug removeDrug(int) 

    /**
     * 
     * 
     * @param index
     * @param vDrug
    **/
    public void setDrug(int index, Drug vDrug)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _drugList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _drugList.setElementAt(vDrug, index);
    } //-- void setDrug(int, Drug) 

    /**
     * 
     * 
     * @param drugArray
    **/
    public void setDrug(Drug[] drugArray)
    {
        //-- copy array
        _drugList.removeAllElements();
        for (int i = 0; i < drugArray.length; i++) {
            _drugList.addElement(drugArray[i]);
        }
    } //-- void setDrug(Drug) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.DrugList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.DrugList) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.DrugList.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.DrugList unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
