/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp;

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

    private java.lang.String _hospitalId;

    private java.lang.String _hospitalCode;

    private java.lang.String _hospitalName;

    private java.lang.String _tel;

    private java.lang.String _adress;

    private java.lang.String _hospitalType;

    private java.lang.String _hasSub;

    private java.lang.String _parentId;

    private java.lang.String _figureImg;

    private java.lang.String _site;

    private java.lang.String _intro;

    private java.lang.String _hospitalLevel;

    private java.lang.String _provinceCode;

    private java.lang.String _cityCode;

    private java.lang.String _countyCode;

    private java.lang.String _jingDuValue;

    private java.lang.String _weiDuValue;

    private java.lang.String _daoHangPicUrl;

    private java.lang.String _hosPicUrl;

    private java.lang.String _daoHangPicHotPoints;

    private java.lang.String _hosFloorIntr;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'adress'.
     * 
     * @return the value of field 'adress'.
    **/
    public java.lang.String getAdress()
    {
        return this._adress;
    } //-- java.lang.String getAdress() 

    /**
     * Returns the value of field 'cityCode'.
     * 
     * @return the value of field 'cityCode'.
    **/
    public java.lang.String getCityCode()
    {
        return this._cityCode;
    } //-- java.lang.String getCityCode() 

    /**
     * Returns the value of field 'countyCode'.
     * 
     * @return the value of field 'countyCode'.
    **/
    public java.lang.String getCountyCode()
    {
        return this._countyCode;
    } //-- java.lang.String getCountyCode() 

    /**
     * Returns the value of field 'daoHangPicHotPoints'.
     * 
     * @return the value of field 'daoHangPicHotPoints'.
    **/
    public java.lang.String getDaoHangPicHotPoints()
    {
        return this._daoHangPicHotPoints;
    } //-- java.lang.String getDaoHangPicHotPoints() 

    /**
     * Returns the value of field 'daoHangPicUrl'.
     * 
     * @return the value of field 'daoHangPicUrl'.
    **/
    public java.lang.String getDaoHangPicUrl()
    {
        return this._daoHangPicUrl;
    } //-- java.lang.String getDaoHangPicUrl() 

    /**
     * Returns the value of field 'figureImg'.
     * 
     * @return the value of field 'figureImg'.
    **/
    public java.lang.String getFigureImg()
    {
        return this._figureImg;
    } //-- java.lang.String getFigureImg() 

    /**
     * Returns the value of field 'hasSub'.
     * 
     * @return the value of field 'hasSub'.
    **/
    public java.lang.String getHasSub()
    {
        return this._hasSub;
    } //-- java.lang.String getHasSub() 

    /**
     * Returns the value of field 'hosFloorIntr'.
     * 
     * @return the value of field 'hosFloorIntr'.
    **/
    public java.lang.String getHosFloorIntr()
    {
        return this._hosFloorIntr;
    } //-- java.lang.String getHosFloorIntr() 

    /**
     * Returns the value of field 'hosPicUrl'.
     * 
     * @return the value of field 'hosPicUrl'.
    **/
    public java.lang.String getHosPicUrl()
    {
        return this._hosPicUrl;
    } //-- java.lang.String getHosPicUrl() 

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
     * Returns the value of field 'hospitalLevel'.
     * 
     * @return the value of field 'hospitalLevel'.
    **/
    public java.lang.String getHospitalLevel()
    {
        return this._hospitalLevel;
    } //-- java.lang.String getHospitalLevel() 

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
     * Returns the value of field 'hospitalType'.
     * 
     * @return the value of field 'hospitalType'.
    **/
    public java.lang.String getHospitalType()
    {
        return this._hospitalType;
    } //-- java.lang.String getHospitalType() 

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
     * Returns the value of field 'jingDuValue'.
     * 
     * @return the value of field 'jingDuValue'.
    **/
    public java.lang.String getJingDuValue()
    {
        return this._jingDuValue;
    } //-- java.lang.String getJingDuValue() 

    /**
     * Returns the value of field 'parentId'.
     * 
     * @return the value of field 'parentId'.
    **/
    public java.lang.String getParentId()
    {
        return this._parentId;
    } //-- java.lang.String getParentId() 

    /**
     * Returns the value of field 'provinceCode'.
     * 
     * @return the value of field 'provinceCode'.
    **/
    public java.lang.String getProvinceCode()
    {
        return this._provinceCode;
    } //-- java.lang.String getProvinceCode() 

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
     * Returns the value of field 'weiDuValue'.
     * 
     * @return the value of field 'weiDuValue'.
    **/
    public java.lang.String getWeiDuValue()
    {
        return this._weiDuValue;
    } //-- java.lang.String getWeiDuValue() 

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
     * Sets the value of field 'adress'.
     * 
     * @param adress the value of field 'adress'.
    **/
    public void setAdress(java.lang.String adress)
    {
        this._adress = adress;
    } //-- void setAdress(java.lang.String) 

    /**
     * Sets the value of field 'cityCode'.
     * 
     * @param cityCode the value of field 'cityCode'.
    **/
    public void setCityCode(java.lang.String cityCode)
    {
        this._cityCode = cityCode;
    } //-- void setCityCode(java.lang.String) 

    /**
     * Sets the value of field 'countyCode'.
     * 
     * @param countyCode the value of field 'countyCode'.
    **/
    public void setCountyCode(java.lang.String countyCode)
    {
        this._countyCode = countyCode;
    } //-- void setCountyCode(java.lang.String) 

    /**
     * Sets the value of field 'daoHangPicHotPoints'.
     * 
     * @param daoHangPicHotPoints the value of field
     * 'daoHangPicHotPoints'.
    **/
    public void setDaoHangPicHotPoints(java.lang.String daoHangPicHotPoints)
    {
        this._daoHangPicHotPoints = daoHangPicHotPoints;
    } //-- void setDaoHangPicHotPoints(java.lang.String) 

    /**
     * Sets the value of field 'daoHangPicUrl'.
     * 
     * @param daoHangPicUrl the value of field 'daoHangPicUrl'.
    **/
    public void setDaoHangPicUrl(java.lang.String daoHangPicUrl)
    {
        this._daoHangPicUrl = daoHangPicUrl;
    } //-- void setDaoHangPicUrl(java.lang.String) 

    /**
     * Sets the value of field 'figureImg'.
     * 
     * @param figureImg the value of field 'figureImg'.
    **/
    public void setFigureImg(java.lang.String figureImg)
    {
        this._figureImg = figureImg;
    } //-- void setFigureImg(java.lang.String) 

    /**
     * Sets the value of field 'hasSub'.
     * 
     * @param hasSub the value of field 'hasSub'.
    **/
    public void setHasSub(java.lang.String hasSub)
    {
        this._hasSub = hasSub;
    } //-- void setHasSub(java.lang.String) 

    /**
     * Sets the value of field 'hosFloorIntr'.
     * 
     * @param hosFloorIntr the value of field 'hosFloorIntr'.
    **/
    public void setHosFloorIntr(java.lang.String hosFloorIntr)
    {
        this._hosFloorIntr = hosFloorIntr;
    } //-- void setHosFloorIntr(java.lang.String) 

    /**
     * Sets the value of field 'hosPicUrl'.
     * 
     * @param hosPicUrl the value of field 'hosPicUrl'.
    **/
    public void setHosPicUrl(java.lang.String hosPicUrl)
    {
        this._hosPicUrl = hosPicUrl;
    } //-- void setHosPicUrl(java.lang.String) 

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
     * Sets the value of field 'hospitalLevel'.
     * 
     * @param hospitalLevel the value of field 'hospitalLevel'.
    **/
    public void setHospitalLevel(java.lang.String hospitalLevel)
    {
        this._hospitalLevel = hospitalLevel;
    } //-- void setHospitalLevel(java.lang.String) 

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
     * Sets the value of field 'hospitalType'.
     * 
     * @param hospitalType the value of field 'hospitalType'.
    **/
    public void setHospitalType(java.lang.String hospitalType)
    {
        this._hospitalType = hospitalType;
    } //-- void setHospitalType(java.lang.String) 

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
     * Sets the value of field 'jingDuValue'.
     * 
     * @param jingDuValue the value of field 'jingDuValue'.
    **/
    public void setJingDuValue(java.lang.String jingDuValue)
    {
        this._jingDuValue = jingDuValue;
    } //-- void setJingDuValue(java.lang.String) 

    /**
     * Sets the value of field 'parentId'.
     * 
     * @param parentId the value of field 'parentId'.
    **/
    public void setParentId(java.lang.String parentId)
    {
        this._parentId = parentId;
    } //-- void setParentId(java.lang.String) 

    /**
     * Sets the value of field 'provinceCode'.
     * 
     * @param provinceCode the value of field 'provinceCode'.
    **/
    public void setProvinceCode(java.lang.String provinceCode)
    {
        this._provinceCode = provinceCode;
    } //-- void setProvinceCode(java.lang.String) 

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
     * Sets the value of field 'weiDuValue'.
     * 
     * @param weiDuValue the value of field 'weiDuValue'.
    **/
    public void setWeiDuValue(java.lang.String weiDuValue)
    {
        this._weiDuValue = weiDuValue;
    } //-- void setWeiDuValue(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
