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
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Fee implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _receivableAmount;

    private java.lang.String _selfAmount;

    private java.lang.String _medicalInsuranceAmount;

    private java.lang.String _cooperationMedicalAmount;

    private java.lang.String _discountAmount;

    private java.lang.String _realAmount;


      //----------------/
     //- Constructors -/
    //----------------/

    public Fee() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Fee()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'cooperationMedicalAmount'.
     * 
     * @return the value of field 'cooperationMedicalAmount'.
    **/
    public java.lang.String getCooperationMedicalAmount()
    {
        return this._cooperationMedicalAmount;
    } //-- java.lang.String getCooperationMedicalAmount() 

    /**
     * Returns the value of field 'discountAmount'.
     * 
     * @return the value of field 'discountAmount'.
    **/
    public java.lang.String getDiscountAmount()
    {
        return this._discountAmount;
    } //-- java.lang.String getDiscountAmount() 

    /**
     * Returns the value of field 'medicalInsuranceAmount'.
     * 
     * @return the value of field 'medicalInsuranceAmount'.
    **/
    public java.lang.String getMedicalInsuranceAmount()
    {
        return this._medicalInsuranceAmount;
    } //-- java.lang.String getMedicalInsuranceAmount() 

    /**
     * Returns the value of field 'realAmount'.
     * 
     * @return the value of field 'realAmount'.
    **/
    public java.lang.String getRealAmount()
    {
        return this._realAmount;
    } //-- java.lang.String getRealAmount() 

    /**
     * Returns the value of field 'receivableAmount'.
     * 
     * @return the value of field 'receivableAmount'.
    **/
    public java.lang.String getReceivableAmount()
    {
        return this._receivableAmount;
    } //-- java.lang.String getReceivableAmount() 

    /**
     * Returns the value of field 'selfAmount'.
     * 
     * @return the value of field 'selfAmount'.
    **/
    public java.lang.String getSelfAmount()
    {
        return this._selfAmount;
    } //-- java.lang.String getSelfAmount() 

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
     * Sets the value of field 'cooperationMedicalAmount'.
     * 
     * @param cooperationMedicalAmount the value of field
     * 'cooperationMedicalAmount'.
    **/
    public void setCooperationMedicalAmount(java.lang.String cooperationMedicalAmount)
    {
        this._cooperationMedicalAmount = cooperationMedicalAmount;
    } //-- void setCooperationMedicalAmount(java.lang.String) 

    /**
     * Sets the value of field 'discountAmount'.
     * 
     * @param discountAmount the value of field 'discountAmount'.
    **/
    public void setDiscountAmount(java.lang.String discountAmount)
    {
        this._discountAmount = discountAmount;
    } //-- void setDiscountAmount(java.lang.String) 

    /**
     * Sets the value of field 'medicalInsuranceAmount'.
     * 
     * @param medicalInsuranceAmount the value of field
     * 'medicalInsuranceAmount'.
    **/
    public void setMedicalInsuranceAmount(java.lang.String medicalInsuranceAmount)
    {
        this._medicalInsuranceAmount = medicalInsuranceAmount;
    } //-- void setMedicalInsuranceAmount(java.lang.String) 

    /**
     * Sets the value of field 'realAmount'.
     * 
     * @param realAmount the value of field 'realAmount'.
    **/
    public void setRealAmount(java.lang.String realAmount)
    {
        this._realAmount = realAmount;
    } //-- void setRealAmount(java.lang.String) 

    /**
     * Sets the value of field 'receivableAmount'.
     * 
     * @param receivableAmount the value of field 'receivableAmount'
    **/
    public void setReceivableAmount(java.lang.String receivableAmount)
    {
        this._receivableAmount = receivableAmount;
    } //-- void setReceivableAmount(java.lang.String) 

    /**
     * Sets the value of field 'selfAmount'.
     * 
     * @param selfAmount the value of field 'selfAmount'.
    **/
    public void setSelfAmount(java.lang.String selfAmount)
    {
        this._selfAmount = selfAmount;
    } //-- void setSelfAmount(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Fee unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Fee) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Fee.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Fee unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
