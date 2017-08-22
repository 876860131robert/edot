/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp;

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

    private java.lang.String _doctorId;

    private java.lang.String _doctorCode;

    private java.lang.String _name;

    private java.lang.String _officeCode;

    private java.lang.String _hospitalId;

    private java.lang.String _doctorLevel;

    private java.lang.String _tel;

    private java.lang.String _mobile;

    private java.lang.String _specaility;

    private java.lang.String _noType;

    private java.lang.String _doctorImg;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'doctorCode'.
     * 
     * @return the value of field 'doctorCode'.
    **/
    public java.lang.String getDoctorCode()
    {
        return this._doctorCode;
    } //-- java.lang.String getDoctorCode() 

    /**
     * Returns the value of field 'doctorId'.
     * 
     * @return the value of field 'doctorId'.
    **/
    public java.lang.String getDoctorId()
    {
        return this._doctorId;
    } //-- java.lang.String getDoctorId() 

    /**
     * Returns the value of field 'doctorImg'.
     * 
     * @return the value of field 'doctorImg'.
    **/
    public java.lang.String getDoctorImg()
    {
        return this._doctorImg;
    } //-- java.lang.String getDoctorImg() 

    /**
     * Returns the value of field 'doctorLevel'.
     * 
     * @return the value of field 'doctorLevel'.
    **/
    public java.lang.String getDoctorLevel()
    {
        return this._doctorLevel;
    } //-- java.lang.String getDoctorLevel() 

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
     * Returns the value of field 'mobile'.
     * 
     * @return the value of field 'mobile'.
    **/
    public java.lang.String getMobile()
    {
        return this._mobile;
    } //-- java.lang.String getMobile() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'noType'.
     * 
     * @return the value of field 'noType'.
    **/
    public java.lang.String getNoType()
    {
        return this._noType;
    } //-- java.lang.String getNoType() 

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
     * Returns the value of field 'specaility'.
     * 
     * @return the value of field 'specaility'.
    **/
    public java.lang.String getSpecaility()
    {
        return this._specaility;
    } //-- java.lang.String getSpecaility() 

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
     * Sets the value of field 'doctorCode'.
     * 
     * @param doctorCode the value of field 'doctorCode'.
    **/
    public void setDoctorCode(java.lang.String doctorCode)
    {
        this._doctorCode = doctorCode;
    } //-- void setDoctorCode(java.lang.String) 

    /**
     * Sets the value of field 'doctorId'.
     * 
     * @param doctorId the value of field 'doctorId'.
    **/
    public void setDoctorId(java.lang.String doctorId)
    {
        this._doctorId = doctorId;
    } //-- void setDoctorId(java.lang.String) 

    /**
     * Sets the value of field 'doctorImg'.
     * 
     * @param doctorImg the value of field 'doctorImg'.
    **/
    public void setDoctorImg(java.lang.String doctorImg)
    {
        this._doctorImg = doctorImg;
    } //-- void setDoctorImg(java.lang.String) 

    /**
     * Sets the value of field 'doctorLevel'.
     * 
     * @param doctorLevel the value of field 'doctorLevel'.
    **/
    public void setDoctorLevel(java.lang.String doctorLevel)
    {
        this._doctorLevel = doctorLevel;
    } //-- void setDoctorLevel(java.lang.String) 

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
     * Sets the value of field 'mobile'.
     * 
     * @param mobile the value of field 'mobile'.
    **/
    public void setMobile(java.lang.String mobile)
    {
        this._mobile = mobile;
    } //-- void setMobile(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'noType'.
     * 
     * @param noType the value of field 'noType'.
    **/
    public void setNoType(java.lang.String noType)
    {
        this._noType = noType;
    } //-- void setNoType(java.lang.String) 

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
     * Sets the value of field 'specaility'.
     * 
     * @param specaility the value of field 'specaility'.
    **/
    public void setSpecaility(java.lang.String specaility)
    {
        this._specaility = specaility;
    } //-- void setSpecaility(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
