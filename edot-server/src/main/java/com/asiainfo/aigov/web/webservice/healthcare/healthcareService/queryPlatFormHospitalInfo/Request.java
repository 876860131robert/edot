/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo;

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
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _serviceName;

    private java.lang.String _hospital_Mark;

    private java.lang.String _code;

    private java.lang.String _name;

    private java.lang.String _tel;

    private java.lang.String _address;

    private java.lang.String _province_Code;

    private java.lang.String _city_Code;

    private java.lang.String _county_Code;

    private java.lang.String _hospital_Level;

    private java.lang.String _intro;

    private java.lang.String _hos_Floor_Intr;

    private java.lang.String _site;

    private java.lang.String _deleted;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request()


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
     * Returns the value of field 'city_Code'.
     * 
     * @return the value of field 'city_Code'.
    **/
    public java.lang.String getCity_Code()
    {
        return this._city_Code;
    } //-- java.lang.String getCity_Code() 

    /**
     * Returns the value of field 'code'.
     * 
     * @return the value of field 'code'.
    **/
    public java.lang.String getCode()
    {
        return this._code;
    } //-- java.lang.String getCode() 

    /**
     * Returns the value of field 'county_Code'.
     * 
     * @return the value of field 'county_Code'.
    **/
    public java.lang.String getCounty_Code()
    {
        return this._county_Code;
    } //-- java.lang.String getCounty_Code() 

    /**
     * Returns the value of field 'deleted'.
     * 
     * @return the value of field 'deleted'.
    **/
    public java.lang.String getDeleted()
    {
        return this._deleted;
    } //-- java.lang.String getDeleted() 

    /**
     * Returns the value of field 'hos_Floor_Intr'.
     * 
     * @return the value of field 'hos_Floor_Intr'.
    **/
    public java.lang.String getHos_Floor_Intr()
    {
        return this._hos_Floor_Intr;
    } //-- java.lang.String getHos_Floor_Intr() 

    /**
     * Returns the value of field 'hospital_Level'.
     * 
     * @return the value of field 'hospital_Level'.
    **/
    public java.lang.String getHospital_Level()
    {
        return this._hospital_Level;
    } //-- java.lang.String getHospital_Level() 

    /**
     * Returns the value of field 'hospital_Mark'.
     * 
     * @return the value of field 'hospital_Mark'.
    **/
    public java.lang.String getHospital_Mark()
    {
        return this._hospital_Mark;
    } //-- java.lang.String getHospital_Mark() 

    /**
     * Returns the value of field 'intro'.
     * 
     * @return the value of field 'intro'.
    **/
    public java.lang.String getIntro()
    {
        return this._intro;
    } //-- java.lang.String getIntro() 

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
     * Returns the value of field 'province_Code'.
     * 
     * @return the value of field 'province_Code'.
    **/
    public java.lang.String getProvince_Code()
    {
        return this._province_Code;
    } //-- java.lang.String getProvince_Code() 

    /**
     * Returns the value of field 'serviceName'.
     * 
     * @return the value of field 'serviceName'.
    **/
    public java.lang.String getServiceName()
    {
        return this._serviceName;
    } //-- java.lang.String getServiceName() 

    /**
     * Returns the value of field 'site'.
     * 
     * @return the value of field 'site'.
    **/
    public java.lang.String getSite()
    {
        return this._site;
    } //-- java.lang.String getSite() 

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
     * Sets the value of field 'city_Code'.
     * 
     * @param city_Code the value of field 'city_Code'.
    **/
    public void setCity_Code(java.lang.String city_Code)
    {
        this._city_Code = city_Code;
    } //-- void setCity_Code(java.lang.String) 

    /**
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
    **/
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

    /**
     * Sets the value of field 'county_Code'.
     * 
     * @param county_Code the value of field 'county_Code'.
    **/
    public void setCounty_Code(java.lang.String county_Code)
    {
        this._county_Code = county_Code;
    } //-- void setCounty_Code(java.lang.String) 

    /**
     * Sets the value of field 'deleted'.
     * 
     * @param deleted the value of field 'deleted'.
    **/
    public void setDeleted(java.lang.String deleted)
    {
        this._deleted = deleted;
    } //-- void setDeleted(java.lang.String) 

    /**
     * Sets the value of field 'hos_Floor_Intr'.
     * 
     * @param hos_Floor_Intr the value of field 'hos_Floor_Intr'.
    **/
    public void setHos_Floor_Intr(java.lang.String hos_Floor_Intr)
    {
        this._hos_Floor_Intr = hos_Floor_Intr;
    } //-- void setHos_Floor_Intr(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Level'.
     * 
     * @param hospital_Level the value of field 'hospital_Level'.
    **/
    public void setHospital_Level(java.lang.String hospital_Level)
    {
        this._hospital_Level = hospital_Level;
    } //-- void setHospital_Level(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Mark'.
     * 
     * @param hospital_Mark the value of field 'hospital_Mark'.
    **/
    public void setHospital_Mark(java.lang.String hospital_Mark)
    {
        this._hospital_Mark = hospital_Mark;
    } //-- void setHospital_Mark(java.lang.String) 

    /**
     * Sets the value of field 'intro'.
     * 
     * @param intro the value of field 'intro'.
    **/
    public void setIntro(java.lang.String intro)
    {
        this._intro = intro;
    } //-- void setIntro(java.lang.String) 

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
     * Sets the value of field 'province_Code'.
     * 
     * @param province_Code the value of field 'province_Code'.
    **/
    public void setProvince_Code(java.lang.String province_Code)
    {
        this._province_Code = province_Code;
    } //-- void setProvince_Code(java.lang.String) 

    /**
     * Sets the value of field 'serviceName'.
     * 
     * @param serviceName the value of field 'serviceName'.
    **/
    public void setServiceName(java.lang.String serviceName)
    {
        this._serviceName = serviceName;
    } //-- void setServiceName(java.lang.String) 

    /**
     * Sets the value of field 'site'.
     * 
     * @param site the value of field 'site'.
    **/
    public void setSite(java.lang.String site)
    {
        this._site = site;
    } //-- void setSite(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.healthcare.healthcareService.queryPlatFormHospitalInfo.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
