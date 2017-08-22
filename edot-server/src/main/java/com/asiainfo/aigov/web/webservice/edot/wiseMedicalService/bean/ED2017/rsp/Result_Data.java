/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp;

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
public class Result_Data implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _result_ListList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
        _result_ListList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResult_List
    **/
    public void addResult_List(Result_List vResult_List)
        throws java.lang.IndexOutOfBoundsException
    {
        _result_ListList.addElement(vResult_List);
    } //-- void addResult_List(Result_List) 

    /**
     * 
     * 
     * @param index
     * @param vResult_List
    **/
    public void addResult_List(int index, Result_List vResult_List)
        throws java.lang.IndexOutOfBoundsException
    {
        _result_ListList.insertElementAt(vResult_List, index);
    } //-- void addResult_List(int, Result_List) 

    /**
    **/
    public java.util.Enumeration enumerateResult_List()
    {
        return _result_ListList.elements();
    } //-- java.util.Enumeration enumerateResult_List() 

    /**
     * 
     * 
     * @param index
    **/
    public Result_List getResult_List(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _result_ListList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Result_List) _result_ListList.elementAt(index);
    } //-- Result_List getResult_List(int) 

    /**
    **/
    public Result_List[] getResult_List()
    {
        int size = _result_ListList.size();
        Result_List[] mArray = new Result_List[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Result_List) _result_ListList.elementAt(index);
        }
        return mArray;
    } //-- Result_List[] getResult_List() 

    /**
    **/
    public int getResult_ListCount()
    {
        return _result_ListList.size();
    } //-- int getResult_ListCount() 

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
    public void removeAllResult_List()
    {
        _result_ListList.removeAllElements();
    } //-- void removeAllResult_List() 

    /**
     * 
     * 
     * @param index
    **/
    public Result_List removeResult_List(int index)
    {
        java.lang.Object obj = _result_ListList.elementAt(index);
        _result_ListList.removeElementAt(index);
        return (Result_List) obj;
    } //-- Result_List removeResult_List(int) 

    /**
     * 
     * 
     * @param index
     * @param vResult_List
    **/
    public void setResult_List(int index, Result_List vResult_List)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _result_ListList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _result_ListList.setElementAt(vResult_List, index);
    } //-- void setResult_List(int, Result_List) 

    /**
     * 
     * 
     * @param result_ListArray
    **/
    public void setResult_List(Result_List[] result_ListArray)
    {
        //-- copy array
        _result_ListList.removeAllElements();
        for (int i = 0; i < result_ListArray.length; i++) {
            _result_ListList.addElement(result_ListArray[i]);
        }
    } //-- void setResult_List(Result_List) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
