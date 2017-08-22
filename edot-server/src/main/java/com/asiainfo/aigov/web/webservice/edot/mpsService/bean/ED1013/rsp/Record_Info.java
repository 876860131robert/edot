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

    private java.lang.String _item_name;

    private java.lang.String _result;

    private java.lang.String _abnormal_Indicator;

    private java.lang.String _units;

    private java.lang.String _reference_Range;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'abnormal_Indicator'.
     * 
     * @return the value of field 'abnormal_Indicator'.
    **/
    public java.lang.String getAbnormal_Indicator()
    {
        return this._abnormal_Indicator;
    } //-- java.lang.String getAbnormal_Indicator() 

    /**
     * Returns the value of field 'item_name'.
     * 
     * @return the value of field 'item_name'.
    **/
    public java.lang.String getItem_name()
    {
        return this._item_name;
    } //-- java.lang.String getItem_name() 

    /**
     * Returns the value of field 'reference_Range'.
     * 
     * @return the value of field 'reference_Range'.
    **/
    public java.lang.String getReference_Range()
    {
        return this._reference_Range;
    } //-- java.lang.String getReference_Range() 

    /**
     * Returns the value of field 'result'.
     * 
     * @return the value of field 'result'.
    **/
    public java.lang.String getResult()
    {
        return this._result;
    } //-- java.lang.String getResult() 

    /**
     * Returns the value of field 'units'.
     * 
     * @return the value of field 'units'.
    **/
    public java.lang.String getUnits()
    {
        return this._units;
    } //-- java.lang.String getUnits() 

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
     * Sets the value of field 'abnormal_Indicator'.
     * 
     * @param abnormal_Indicator the value of field
     * 'abnormal_Indicator'.
    **/
    public void setAbnormal_Indicator(java.lang.String abnormal_Indicator)
    {
        this._abnormal_Indicator = abnormal_Indicator;
    } //-- void setAbnormal_Indicator(java.lang.String) 

    /**
     * Sets the value of field 'item_name'.
     * 
     * @param item_name the value of field 'item_name'.
    **/
    public void setItem_name(java.lang.String item_name)
    {
        this._item_name = item_name;
    } //-- void setItem_name(java.lang.String) 

    /**
     * Sets the value of field 'reference_Range'.
     * 
     * @param reference_Range the value of field 'reference_Range'.
    **/
    public void setReference_Range(java.lang.String reference_Range)
    {
        this._reference_Range = reference_Range;
    } //-- void setReference_Range(java.lang.String) 

    /**
     * Sets the value of field 'result'.
     * 
     * @param result the value of field 'result'.
    **/
    public void setResult(java.lang.String result)
    {
        this._result = result;
    } //-- void setResult(java.lang.String) 

    /**
     * Sets the value of field 'units'.
     * 
     * @param units the value of field 'units'.
    **/
    public void setUnits(java.lang.String units)
    {
        this._units = units;
    } //-- void setUnits(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
