/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req;

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
public class Pay_Info implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _serial_No;

    private java.lang.String _amt;

    private java.lang.String _presc_No;

    private java.lang.String _presc_Seq_No;

    private java.lang.String _visit_No;

    private java.lang.String _item_Class;


      //----------------/
     //- Constructors -/
    //----------------/

    public Pay_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req.Pay_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amt'.
     * 
     * @return the value of field 'amt'.
    **/
    public java.lang.String getAmt()
    {
        return this._amt;
    } //-- java.lang.String getAmt() 

    /**
     * Returns the value of field 'item_Class'.
     * 
     * @return the value of field 'item_Class'.
    **/
    public java.lang.String getItem_Class()
    {
        return this._item_Class;
    } //-- java.lang.String getItem_Class() 

    /**
     * Returns the value of field 'presc_No'.
     * 
     * @return the value of field 'presc_No'.
    **/
    public java.lang.String getPresc_No()
    {
        return this._presc_No;
    } //-- java.lang.String getPresc_No() 

    /**
     * Returns the value of field 'presc_Seq_No'.
     * 
     * @return the value of field 'presc_Seq_No'.
    **/
    public java.lang.String getPresc_Seq_No()
    {
        return this._presc_Seq_No;
    } //-- java.lang.String getPresc_Seq_No() 

    /**
     * Returns the value of field 'serial_No'.
     * 
     * @return the value of field 'serial_No'.
    **/
    public java.lang.String getSerial_No()
    {
        return this._serial_No;
    } //-- java.lang.String getSerial_No() 

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
     * Sets the value of field 'amt'.
     * 
     * @param amt the value of field 'amt'.
    **/
    public void setAmt(java.lang.String amt)
    {
        this._amt = amt;
    } //-- void setAmt(java.lang.String) 

    /**
     * Sets the value of field 'item_Class'.
     * 
     * @param item_Class the value of field 'item_Class'.
    **/
    public void setItem_Class(java.lang.String item_Class)
    {
        this._item_Class = item_Class;
    } //-- void setItem_Class(java.lang.String) 

    /**
     * Sets the value of field 'presc_No'.
     * 
     * @param presc_No the value of field 'presc_No'.
    **/
    public void setPresc_No(java.lang.String presc_No)
    {
        this._presc_No = presc_No;
    } //-- void setPresc_No(java.lang.String) 

    /**
     * Sets the value of field 'presc_Seq_No'.
     * 
     * @param presc_Seq_No the value of field 'presc_Seq_No'.
    **/
    public void setPresc_Seq_No(java.lang.String presc_Seq_No)
    {
        this._presc_Seq_No = presc_Seq_No;
    } //-- void setPresc_Seq_No(java.lang.String) 

    /**
     * Sets the value of field 'serial_No'.
     * 
     * @param serial_No the value of field 'serial_No'.
    **/
    public void setSerial_No(java.lang.String serial_No)
    {
        this._serial_No = serial_No;
    } //-- void setSerial_No(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req.Pay_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req.Pay_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req.Pay_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req.Pay_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
