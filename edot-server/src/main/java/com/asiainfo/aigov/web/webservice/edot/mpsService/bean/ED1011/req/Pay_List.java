/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req;

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
public class Pay_List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _pay_InfoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Pay_List() {
        super();
        _pay_InfoList = new Vector();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Pay_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPay_Info
    **/
    public void addPay_Info(Pay_Info vPay_Info)
        throws java.lang.IndexOutOfBoundsException
    {
        _pay_InfoList.addElement(vPay_Info);
    } //-- void addPay_Info(Pay_Info) 

    /**
     * 
     * 
     * @param index
     * @param vPay_Info
    **/
    public void addPay_Info(int index, Pay_Info vPay_Info)
        throws java.lang.IndexOutOfBoundsException
    {
        _pay_InfoList.insertElementAt(vPay_Info, index);
    } //-- void addPay_Info(int, Pay_Info) 

    /**
    **/
    public java.util.Enumeration enumeratePay_Info()
    {
        return _pay_InfoList.elements();
    } //-- java.util.Enumeration enumeratePay_Info() 

    /**
     * 
     * 
     * @param index
    **/
    public Pay_Info getPay_Info(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pay_InfoList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Pay_Info) _pay_InfoList.elementAt(index);
    } //-- Pay_Info getPay_Info(int) 

    /**
    **/
    public Pay_Info[] getPay_Info()
    {
        int size = _pay_InfoList.size();
        Pay_Info[] mArray = new Pay_Info[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Pay_Info) _pay_InfoList.elementAt(index);
        }
        return mArray;
    } //-- Pay_Info[] getPay_Info() 

    /**
    **/
    public int getPay_InfoCount()
    {
        return _pay_InfoList.size();
    } //-- int getPay_InfoCount() 

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
    public void removeAllPay_Info()
    {
        _pay_InfoList.removeAllElements();
    } //-- void removeAllPay_Info() 

    /**
     * 
     * 
     * @param index
    **/
    public Pay_Info removePay_Info(int index)
    {
        java.lang.Object obj = _pay_InfoList.elementAt(index);
        _pay_InfoList.removeElementAt(index);
        return (Pay_Info) obj;
    } //-- Pay_Info removePay_Info(int) 

    /**
     * 
     * 
     * @param index
     * @param vPay_Info
    **/
    public void setPay_Info(int index, Pay_Info vPay_Info)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _pay_InfoList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _pay_InfoList.setElementAt(vPay_Info, index);
    } //-- void setPay_Info(int, Pay_Info) 

    /**
     * 
     * 
     * @param pay_InfoArray
    **/
    public void setPay_Info(Pay_Info[] pay_InfoArray)
    {
        //-- copy array
        _pay_InfoList.removeAllElements();
        for (int i = 0; i < pay_InfoArray.length; i++) {
            _pay_InfoList.addElement(pay_InfoArray[i]);
        }
    } //-- void setPay_Info(Pay_Info) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Pay_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Pay_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Pay_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Pay_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
