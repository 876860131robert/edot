/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp;

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

    private java.lang.String _publicOrderId;

    private java.lang.String _orderId;

    private java.lang.String _orderFee;

    private java.lang.String _souceType;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_Data() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Result_Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'orderFee'.
     * 
     * @return the value of field 'orderFee'.
    **/
    public java.lang.String getOrderFee()
    {
        return this._orderFee;
    } //-- java.lang.String getOrderFee() 

    /**
     * Returns the value of field 'orderId'.
     * 
     * @return the value of field 'orderId'.
    **/
    public java.lang.String getOrderId()
    {
        return this._orderId;
    } //-- java.lang.String getOrderId() 

    /**
     * Returns the value of field 'publicOrderId'.
     * 
     * @return the value of field 'publicOrderId'.
    **/
    public java.lang.String getPublicOrderId()
    {
        return this._publicOrderId;
    } //-- java.lang.String getPublicOrderId() 

    /**
     * Returns the value of field 'souceType'.
     * 
     * @return the value of field 'souceType'.
    **/
    public java.lang.String getSouceType()
    {
        return this._souceType;
    } //-- java.lang.String getSouceType() 

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
     * Sets the value of field 'orderFee'.
     * 
     * @param orderFee the value of field 'orderFee'.
    **/
    public void setOrderFee(java.lang.String orderFee)
    {
        this._orderFee = orderFee;
    } //-- void setOrderFee(java.lang.String) 

    /**
     * Sets the value of field 'orderId'.
     * 
     * @param orderId the value of field 'orderId'.
    **/
    public void setOrderId(java.lang.String orderId)
    {
        this._orderId = orderId;
    } //-- void setOrderId(java.lang.String) 

    /**
     * Sets the value of field 'publicOrderId'.
     * 
     * @param publicOrderId the value of field 'publicOrderId'.
    **/
    public void setPublicOrderId(java.lang.String publicOrderId)
    {
        this._publicOrderId = publicOrderId;
    } //-- void setPublicOrderId(java.lang.String) 

    /**
     * Sets the value of field 'souceType'.
     * 
     * @param souceType the value of field 'souceType'.
    **/
    public void setSouceType(java.lang.String souceType)
    {
        this._souceType = souceType;
    } //-- void setSouceType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Result_Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Result_Data) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Result_Data.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Result_Data unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
