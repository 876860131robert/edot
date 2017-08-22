/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp;

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
public class Result_List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _officeId;

    private java.lang.String _officeCode;

    private java.lang.String _officeName;

    private java.lang.String _hospitalId;

    private java.lang.String _hospitalCode;

    private java.lang.String _hospitalName;

    private java.lang.String _tel;

    private java.lang.String _address;

    private java.lang.String _level;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'address'.
    **/
    public java.lang.String getAddress()
    {
        return this._address;
    } //-- java.lang.String getAddress() 

    /**
     * Returns the value of field 'hospitalCode'.
     * 
     * @return the value of field 'hospitalCode'.
    **/
    public java.lang.String getHospitalCode()
    {
        return this._hospitalCode;
    } //-- java.lang.String getHospitalCode() 

    /**
     * Returns the value of field 'hospitalId'.
     * 
     * @return the value of field 'hospitalId'.
    **/
    public java.lang.String getHospitalId()
    {
        return this._hospitalId;
    } //-- java.lang.String getHospitalId() 

    /**
     * Returns the value of field 'hospitalName'.
     * 
     * @return the value of field 'hospitalName'.
    **/
    public java.lang.String getHospitalName()
    {
        return this._hospitalName;
    } //-- java.lang.String getHospitalName() 

    /**
     * Returns the value of field 'level'.
     * 
     * @return the value of field 'level'.
    **/
    public java.lang.String getLevel()
    {
        return this._level;
    } //-- java.lang.String getLevel() 

    /**
     * Returns the value of field 'officeCode'.
     * 
     * @return the value of field 'officeCode'.
    **/
    public java.lang.String getOfficeCode()
    {
        return this._officeCode;
    } //-- java.lang.String getOfficeCode() 

    /**
     * Returns the value of field 'officeId'.
     * 
     * @return the value of field 'officeId'.
    **/
    public java.lang.String getOfficeId()
    {
        return this._officeId;
    } //-- java.lang.String getOfficeId() 

    /**
     * Returns the value of field 'officeName'.
     * 
     * @return the value of field 'officeName'.
    **/
    public java.lang.String getOfficeName()
    {
        return this._officeName;
    } //-- java.lang.String getOfficeName() 

    /**
     * Returns the value of field 'tel'.
     * 
     * @return the value of field 'tel'.
    **/
    public java.lang.String getTel()
    {
        return this._tel;
    } //-- java.lang.String getTel() 

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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
    **/
    public void setAddress(java.lang.String address)
    {
        this._address = address;
    } //-- void setAddress(java.lang.String) 

    /**
     * Sets the value of field 'hospitalCode'.
     * 
     * @param hospitalCode the value of field 'hospitalCode'.
    **/
    public void setHospitalCode(java.lang.String hospitalCode)
    {
        this._hospitalCode = hospitalCode;
    } //-- void setHospitalCode(java.lang.String) 

    /**
     * Sets the value of field 'hospitalId'.
     * 
     * @param hospitalId the value of field 'hospitalId'.
    **/
    public void setHospitalId(java.lang.String hospitalId)
    {
        this._hospitalId = hospitalId;
    } //-- void setHospitalId(java.lang.String) 

    /**
     * Sets the value of field 'hospitalName'.
     * 
     * @param hospitalName the value of field 'hospitalName'.
    **/
    public void setHospitalName(java.lang.String hospitalName)
    {
        this._hospitalName = hospitalName;
    } //-- void setHospitalName(java.lang.String) 

    /**
     * Sets the value of field 'level'.
     * 
     * @param level the value of field 'level'.
    **/
    public void setLevel(java.lang.String level)
    {
        this._level = level;
    } //-- void setLevel(java.lang.String) 

    /**
     * Sets the value of field 'officeCode'.
     * 
     * @param officeCode the value of field 'officeCode'.
    **/
    public void setOfficeCode(java.lang.String officeCode)
    {
        this._officeCode = officeCode;
    } //-- void setOfficeCode(java.lang.String) 

    /**
     * Sets the value of field 'officeId'.
     * 
     * @param officeId the value of field 'officeId'.
    **/
    public void setOfficeId(java.lang.String officeId)
    {
        this._officeId = officeId;
    } //-- void setOfficeId(java.lang.String) 

    /**
     * Sets the value of field 'officeName'.
     * 
     * @param officeName the value of field 'officeName'.
    **/
    public void setOfficeName(java.lang.String officeName)
    {
        this._officeName = officeName;
    } //-- void setOfficeName(java.lang.String) 

    /**
     * Sets the value of field 'tel'.
     * 
     * @param tel the value of field 'tel'.
    **/
    public void setTel(java.lang.String tel)
    {
        this._tel = tel;
    } //-- void setTel(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
