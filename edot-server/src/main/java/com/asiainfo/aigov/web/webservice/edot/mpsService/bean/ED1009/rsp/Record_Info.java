/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp;

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

    private java.lang.String _item_No;

    private java.lang.String _visit_No;

    private java.lang.String _item_Name;

    private java.lang.String _item_Class;

    private java.lang.String _pay_Costs;

    private java.lang.String _visit_Date;

    private java.lang.String _presc_No;

    private java.lang.String _presc_Seq_No;

    private java.lang.String _serial_No;

    private java.lang.String _units;

    private java.lang.String _price;

    private java.lang.String _amount;

    private java.lang.String _item_Spec;

    private java.lang.String _performed_By;

    private java.lang.String _ordered_By;

    private java.lang.String _charge_Status;

    private java.lang.String _charge_Date;

    private java.lang.String _selective_Payment;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amount'.
     * 
     * @return the value of field 'amount'.
    **/
    public java.lang.String getAmount()
    {
        return this._amount;
    } //-- java.lang.String getAmount() 

    /**
     * Returns the value of field 'charge_Date'.
     * 
     * @return the value of field 'charge_Date'.
    **/
    public java.lang.String getCharge_Date()
    {
        return this._charge_Date;
    } //-- java.lang.String getCharge_Date() 

    /**
     * Returns the value of field 'charge_Status'.
     * 
     * @return the value of field 'charge_Status'.
    **/
    public java.lang.String getCharge_Status()
    {
        return this._charge_Status;
    } //-- java.lang.String getCharge_Status() 

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
     * Returns the value of field 'item_Name'.
     * 
     * @return the value of field 'item_Name'.
    **/
    public java.lang.String getItem_Name()
    {
        return this._item_Name;
    } //-- java.lang.String getItem_Name() 

    /**
     * Returns the value of field 'item_No'.
     * 
     * @return the value of field 'item_No'.
    **/
    public java.lang.String getItem_No()
    {
        return this._item_No;
    } //-- java.lang.String getItem_No() 

    /**
     * Returns the value of field 'item_Spec'.
     * 
     * @return the value of field 'item_Spec'.
    **/
    public java.lang.String getItem_Spec()
    {
        return this._item_Spec;
    } //-- java.lang.String getItem_Spec() 

    /**
     * Returns the value of field 'ordered_By'.
     * 
     * @return the value of field 'ordered_By'.
    **/
    public java.lang.String getOrdered_By()
    {
        return this._ordered_By;
    } //-- java.lang.String getOrdered_By() 

    /**
     * Returns the value of field 'pay_Costs'.
     * 
     * @return the value of field 'pay_Costs'.
    **/
    public java.lang.String getPay_Costs()
    {
        return this._pay_Costs;
    } //-- java.lang.String getPay_Costs() 

    /**
     * Returns the value of field 'performed_By'.
     * 
     * @return the value of field 'performed_By'.
    **/
    public java.lang.String getPerformed_By()
    {
        return this._performed_By;
    } //-- java.lang.String getPerformed_By() 

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
     * Returns the value of field 'price'.
     * 
     * @return the value of field 'price'.
    **/
    public java.lang.String getPrice()
    {
        return this._price;
    } //-- java.lang.String getPrice() 

    /**
     * Returns the value of field 'selective_Payment'.
     * 
     * @return the value of field 'selective_Payment'.
    **/
    public java.lang.String getSelective_Payment()
    {
        return this._selective_Payment;
    } //-- java.lang.String getSelective_Payment() 

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
     * Returns the value of field 'units'.
     * 
     * @return the value of field 'units'.
    **/
    public java.lang.String getUnits()
    {
        return this._units;
    } //-- java.lang.String getUnits() 

    /**
     * Returns the value of field 'visit_Date'.
     * 
     * @return the value of field 'visit_Date'.
    **/
    public java.lang.String getVisit_Date()
    {
        return this._visit_Date;
    } //-- java.lang.String getVisit_Date() 

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
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
    **/
    public void setAmount(java.lang.String amount)
    {
        this._amount = amount;
    } //-- void setAmount(java.lang.String) 

    /**
     * Sets the value of field 'charge_Date'.
     * 
     * @param charge_Date the value of field 'charge_Date'.
    **/
    public void setCharge_Date(java.lang.String charge_Date)
    {
        this._charge_Date = charge_Date;
    } //-- void setCharge_Date(java.lang.String) 

    /**
     * Sets the value of field 'charge_Status'.
     * 
     * @param charge_Status the value of field 'charge_Status'.
    **/
    public void setCharge_Status(java.lang.String charge_Status)
    {
        this._charge_Status = charge_Status;
    } //-- void setCharge_Status(java.lang.String) 

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
     * Sets the value of field 'item_Name'.
     * 
     * @param item_Name the value of field 'item_Name'.
    **/
    public void setItem_Name(java.lang.String item_Name)
    {
        this._item_Name = item_Name;
    } //-- void setItem_Name(java.lang.String) 

    /**
     * Sets the value of field 'item_No'.
     * 
     * @param item_No the value of field 'item_No'.
    **/
    public void setItem_No(java.lang.String item_No)
    {
        this._item_No = item_No;
    } //-- void setItem_No(java.lang.String) 

    /**
     * Sets the value of field 'item_Spec'.
     * 
     * @param item_Spec the value of field 'item_Spec'.
    **/
    public void setItem_Spec(java.lang.String item_Spec)
    {
        this._item_Spec = item_Spec;
    } //-- void setItem_Spec(java.lang.String) 

    /**
     * Sets the value of field 'ordered_By'.
     * 
     * @param ordered_By the value of field 'ordered_By'.
    **/
    public void setOrdered_By(java.lang.String ordered_By)
    {
        this._ordered_By = ordered_By;
    } //-- void setOrdered_By(java.lang.String) 

    /**
     * Sets the value of field 'pay_Costs'.
     * 
     * @param pay_Costs the value of field 'pay_Costs'.
    **/
    public void setPay_Costs(java.lang.String pay_Costs)
    {
        this._pay_Costs = pay_Costs;
    } //-- void setPay_Costs(java.lang.String) 

    /**
     * Sets the value of field 'performed_By'.
     * 
     * @param performed_By the value of field 'performed_By'.
    **/
    public void setPerformed_By(java.lang.String performed_By)
    {
        this._performed_By = performed_By;
    } //-- void setPerformed_By(java.lang.String) 

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
     * Sets the value of field 'price'.
     * 
     * @param price the value of field 'price'.
    **/
    public void setPrice(java.lang.String price)
    {
        this._price = price;
    } //-- void setPrice(java.lang.String) 

    /**
     * Sets the value of field 'selective_Payment'.
     * 
     * @param selective_Payment the value of field
     * 'selective_Payment'.
    **/
    public void setSelective_Payment(java.lang.String selective_Payment)
    {
        this._selective_Payment = selective_Payment;
    } //-- void setSelective_Payment(java.lang.String) 

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
     * Sets the value of field 'units'.
     * 
     * @param units the value of field 'units'.
    **/
    public void setUnits(java.lang.String units)
    {
        this._units = units;
    } //-- void setUnits(java.lang.String) 

    /**
     * Sets the value of field 'visit_Date'.
     * 
     * @param visit_Date the value of field 'visit_Date'.
    **/
    public void setVisit_Date(java.lang.String visit_Date)
    {
        this._visit_Date = visit_Date;
    } //-- void setVisit_Date(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
