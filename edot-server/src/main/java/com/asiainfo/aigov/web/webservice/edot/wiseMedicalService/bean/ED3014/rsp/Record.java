/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp;

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
public class Record implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _name;

    private java.lang.String _age;

    private java.lang.String _sexName;

    private java.lang.String _birthDateDesc;

    private java.lang.String _idNo;

    private java.lang.String _marriageName;

    private java.lang.String _telNo;

    private java.lang.String _aboName;

    private java.lang.String _address;

    private java.lang.String _exhaustFacilityName;

    private java.lang.String _fuelTypeName;

    private java.lang.String _toiletTypeName;

    private java.lang.String _livestockPenCode;

    private java.lang.String _createHaDate;

    private java.lang.String _adminOrgCode;

    private java.lang.String _respDoctorName;

    private java.lang.String _remark;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'aboName'.
     * 
     * @return the value of field 'aboName'.
    **/
    public java.lang.String getAboName()
    {
        return this._aboName;
    } //-- java.lang.String getAboName() 

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
     * Returns the value of field 'adminOrgCode'.
     * 
     * @return the value of field 'adminOrgCode'.
    **/
    public java.lang.String getAdminOrgCode()
    {
        return this._adminOrgCode;
    } //-- java.lang.String getAdminOrgCode() 

    /**
     * Returns the value of field 'age'.
     * 
     * @return the value of field 'age'.
    **/
    public java.lang.String getAge()
    {
        return this._age;
    } //-- java.lang.String getAge() 

    /**
     * Returns the value of field 'birthDateDesc'.
     * 
     * @return the value of field 'birthDateDesc'.
    **/
    public java.lang.String getBirthDateDesc()
    {
        return this._birthDateDesc;
    } //-- java.lang.String getBirthDateDesc() 

    /**
     * Returns the value of field 'createHaDate'.
     * 
     * @return the value of field 'createHaDate'.
    **/
    public java.lang.String getCreateHaDate()
    {
        return this._createHaDate;
    } //-- java.lang.String getCreateHaDate() 

    /**
     * Returns the value of field 'exhaustFacilityName'.
     * 
     * @return the value of field 'exhaustFacilityName'.
    **/
    public java.lang.String getExhaustFacilityName()
    {
        return this._exhaustFacilityName;
    } //-- java.lang.String getExhaustFacilityName() 

    /**
     * Returns the value of field 'fuelTypeName'.
     * 
     * @return the value of field 'fuelTypeName'.
    **/
    public java.lang.String getFuelTypeName()
    {
        return this._fuelTypeName;
    } //-- java.lang.String getFuelTypeName() 

    /**
     * Returns the value of field 'idNo'.
     * 
     * @return the value of field 'idNo'.
    **/
    public java.lang.String getIdNo()
    {
        return this._idNo;
    } //-- java.lang.String getIdNo() 

    /**
     * Returns the value of field 'livestockPenCode'.
     * 
     * @return the value of field 'livestockPenCode'.
    **/
    public java.lang.String getLivestockPenCode()
    {
        return this._livestockPenCode;
    } //-- java.lang.String getLivestockPenCode() 

    /**
     * Returns the value of field 'marriageName'.
     * 
     * @return the value of field 'marriageName'.
    **/
    public java.lang.String getMarriageName()
    {
        return this._marriageName;
    } //-- java.lang.String getMarriageName() 

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
     * Returns the value of field 'remark'.
     * 
     * @return the value of field 'remark'.
    **/
    public java.lang.String getRemark()
    {
        return this._remark;
    } //-- java.lang.String getRemark() 

    /**
     * Returns the value of field 'respDoctorName'.
     * 
     * @return the value of field 'respDoctorName'.
    **/
    public java.lang.String getRespDoctorName()
    {
        return this._respDoctorName;
    } //-- java.lang.String getRespDoctorName() 

    /**
     * Returns the value of field 'sexName'.
     * 
     * @return the value of field 'sexName'.
    **/
    public java.lang.String getSexName()
    {
        return this._sexName;
    } //-- java.lang.String getSexName() 

    /**
     * Returns the value of field 'telNo'.
     * 
     * @return the value of field 'telNo'.
    **/
    public java.lang.String getTelNo()
    {
        return this._telNo;
    } //-- java.lang.String getTelNo() 

    /**
     * Returns the value of field 'toiletTypeName'.
     * 
     * @return the value of field 'toiletTypeName'.
    **/
    public java.lang.String getToiletTypeName()
    {
        return this._toiletTypeName;
    } //-- java.lang.String getToiletTypeName() 

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
     * Sets the value of field 'aboName'.
     * 
     * @param aboName the value of field 'aboName'.
    **/
    public void setAboName(java.lang.String aboName)
    {
        this._aboName = aboName;
    } //-- void setAboName(java.lang.String) 

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
     * Sets the value of field 'adminOrgCode'.
     * 
     * @param adminOrgCode the value of field 'adminOrgCode'.
    **/
    public void setAdminOrgCode(java.lang.String adminOrgCode)
    {
        this._adminOrgCode = adminOrgCode;
    } //-- void setAdminOrgCode(java.lang.String) 

    /**
     * Sets the value of field 'age'.
     * 
     * @param age the value of field 'age'.
    **/
    public void setAge(java.lang.String age)
    {
        this._age = age;
    } //-- void setAge(java.lang.String) 

    /**
     * Sets the value of field 'birthDateDesc'.
     * 
     * @param birthDateDesc the value of field 'birthDateDesc'.
    **/
    public void setBirthDateDesc(java.lang.String birthDateDesc)
    {
        this._birthDateDesc = birthDateDesc;
    } //-- void setBirthDateDesc(java.lang.String) 

    /**
     * Sets the value of field 'createHaDate'.
     * 
     * @param createHaDate the value of field 'createHaDate'.
    **/
    public void setCreateHaDate(java.lang.String createHaDate)
    {
        this._createHaDate = createHaDate;
    } //-- void setCreateHaDate(java.lang.String) 

    /**
     * Sets the value of field 'exhaustFacilityName'.
     * 
     * @param exhaustFacilityName the value of field
     * 'exhaustFacilityName'.
    **/
    public void setExhaustFacilityName(java.lang.String exhaustFacilityName)
    {
        this._exhaustFacilityName = exhaustFacilityName;
    } //-- void setExhaustFacilityName(java.lang.String) 

    /**
     * Sets the value of field 'fuelTypeName'.
     * 
     * @param fuelTypeName the value of field 'fuelTypeName'.
    **/
    public void setFuelTypeName(java.lang.String fuelTypeName)
    {
        this._fuelTypeName = fuelTypeName;
    } //-- void setFuelTypeName(java.lang.String) 

    /**
     * Sets the value of field 'idNo'.
     * 
     * @param idNo the value of field 'idNo'.
    **/
    public void setIdNo(java.lang.String idNo)
    {
        this._idNo = idNo;
    } //-- void setIdNo(java.lang.String) 

    /**
     * Sets the value of field 'livestockPenCode'.
     * 
     * @param livestockPenCode the value of field 'livestockPenCode'
    **/
    public void setLivestockPenCode(java.lang.String livestockPenCode)
    {
        this._livestockPenCode = livestockPenCode;
    } //-- void setLivestockPenCode(java.lang.String) 

    /**
     * Sets the value of field 'marriageName'.
     * 
     * @param marriageName the value of field 'marriageName'.
    **/
    public void setMarriageName(java.lang.String marriageName)
    {
        this._marriageName = marriageName;
    } //-- void setMarriageName(java.lang.String) 

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
     * Sets the value of field 'remark'.
     * 
     * @param remark the value of field 'remark'.
    **/
    public void setRemark(java.lang.String remark)
    {
        this._remark = remark;
    } //-- void setRemark(java.lang.String) 

    /**
     * Sets the value of field 'respDoctorName'.
     * 
     * @param respDoctorName the value of field 'respDoctorName'.
    **/
    public void setRespDoctorName(java.lang.String respDoctorName)
    {
        this._respDoctorName = respDoctorName;
    } //-- void setRespDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'sexName'.
     * 
     * @param sexName the value of field 'sexName'.
    **/
    public void setSexName(java.lang.String sexName)
    {
        this._sexName = sexName;
    } //-- void setSexName(java.lang.String) 

    /**
     * Sets the value of field 'telNo'.
     * 
     * @param telNo the value of field 'telNo'.
    **/
    public void setTelNo(java.lang.String telNo)
    {
        this._telNo = telNo;
    } //-- void setTelNo(java.lang.String) 

    /**
     * Sets the value of field 'toiletTypeName'.
     * 
     * @param toiletTypeName the value of field 'toiletTypeName'.
    **/
    public void setToiletTypeName(java.lang.String toiletTypeName)
    {
        this._toiletTypeName = toiletTypeName;
    } //-- void setToiletTypeName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
