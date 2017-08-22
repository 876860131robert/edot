/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp;

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
public class Result_Data implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _receipt_No;

    private java.lang.String _remain_Money;

    private java.lang.String _visit_No;

    private java.lang.String _call_Number;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Result_Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'call_Number'.
     * 
     * @return the value of field 'call_Number'.
    **/
    public java.lang.String getCall_Number()
    {
        return this._call_Number;
    } //-- java.lang.String getCall_Number() 

    /**
     * Returns the value of field 'receipt_No'.
     * 
     * @return the value of field 'receipt_No'.
    **/
    public java.lang.String getReceipt_No()
    {
        return this._receipt_No;
    } //-- java.lang.String getReceipt_No() 

    /**
     * Returns the value of field 'remain_Money'.
     * 
     * @return the value of field 'remain_Money'.
    **/
    public java.lang.String getRemain_Money()
    {
        return this._remain_Money;
    } //-- java.lang.String getRemain_Money() 

    /**
     * Returns the value of field 'visit_No'.
     * 
     * @return the value of field 'visit_No'.
    **/
    public java.lang.String getVisit_No()
    {
        return this._visit_No;
    } //-- java.lang.String getVisit_No() 

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
     * Sets the value of field 'call_Number'.
     * 
     * @param call_Number the value of field 'call_Number'.
    **/
    public void setCall_Number(java.lang.String call_Number)
    {
        this._call_Number = call_Number;
    } //-- void setCall_Number(java.lang.String) 

    /**
     * Sets the value of field 'receipt_No'.
     * 
     * @param receipt_No the value of field 'receipt_No'.
    **/
    public void setReceipt_No(java.lang.String receipt_No)
    {
        this._receipt_No = receipt_No;
    } //-- void setReceipt_No(java.lang.String) 

    /**
     * Sets the value of field 'remain_Money'.
     * 
     * @param remain_Money the value of field 'remain_Money'.
    **/
    public void setRemain_Money(java.lang.String remain_Money)
    {
        this._remain_Money = remain_Money;
    } //-- void setRemain_Money(java.lang.String) 

    /**
     * Sets the value of field 'visit_No'.
     * 
     * @param visit_No the value of field 'visit_No'.
    **/
    public void setVisit_No(java.lang.String visit_No)
    {
        this._visit_No = visit_No;
    } //-- void setVisit_No(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
