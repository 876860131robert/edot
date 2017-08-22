/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp;

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

    private java.lang.String _thisFollowupDateDesc;

    private java.lang.String _name;

    private java.lang.String _respDoctorName;

    private java.lang.String _sbp;

    private java.lang.String _dbp;

    private java.lang.String _weight;

    private java.lang.String _height;

    private java.lang.String _bmi;

    private java.lang.String _aimBmi;

    private java.lang.String _fbg;

    private java.lang.String _pbg;

    private java.lang.String _ghb;

    private java.lang.String _ghbExamDate;

    private java.lang.String _insulinUsingFreq;

    private java.lang.String _insulinPerDose;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'aimBmi'.
     * 
     * @return the value of field 'aimBmi'.
    **/
    public java.lang.String getAimBmi()
    {
        return this._aimBmi;
    } //-- java.lang.String getAimBmi() 

    /**
     * Returns the value of field 'bmi'.
     * 
     * @return the value of field 'bmi'.
    **/
    public java.lang.String getBmi()
    {
        return this._bmi;
    } //-- java.lang.String getBmi() 

    /**
     * Returns the value of field 'dbp'.
     * 
     * @return the value of field 'dbp'.
    **/
    public java.lang.String getDbp()
    {
        return this._dbp;
    } //-- java.lang.String getDbp() 

    /**
     * Returns the value of field 'fbg'.
     * 
     * @return the value of field 'fbg'.
    **/
    public java.lang.String getFbg()
    {
        return this._fbg;
    } //-- java.lang.String getFbg() 

    /**
     * Returns the value of field 'ghb'.
     * 
     * @return the value of field 'ghb'.
    **/
    public java.lang.String getGhb()
    {
        return this._ghb;
    } //-- java.lang.String getGhb() 

    /**
     * Returns the value of field 'ghbExamDate'.
     * 
     * @return the value of field 'ghbExamDate'.
    **/
    public java.lang.String getGhbExamDate()
    {
        return this._ghbExamDate;
    } //-- java.lang.String getGhbExamDate() 

    /**
     * Returns the value of field 'height'.
     * 
     * @return the value of field 'height'.
    **/
    public java.lang.String getHeight()
    {
        return this._height;
    } //-- java.lang.String getHeight() 

    /**
     * Returns the value of field 'insulinPerDose'.
     * 
     * @return the value of field 'insulinPerDose'.
    **/
    public java.lang.String getInsulinPerDose()
    {
        return this._insulinPerDose;
    } //-- java.lang.String getInsulinPerDose() 

    /**
     * Returns the value of field 'insulinUsingFreq'.
     * 
     * @return the value of field 'insulinUsingFreq'.
    **/
    public java.lang.String getInsulinUsingFreq()
    {
        return this._insulinUsingFreq;
    } //-- java.lang.String getInsulinUsingFreq() 

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
     * Returns the value of field 'pbg'.
     * 
     * @return the value of field 'pbg'.
    **/
    public java.lang.String getPbg()
    {
        return this._pbg;
    } //-- java.lang.String getPbg() 

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
     * Returns the value of field 'sbp'.
     * 
     * @return the value of field 'sbp'.
    **/
    public java.lang.String getSbp()
    {
        return this._sbp;
    } //-- java.lang.String getSbp() 

    /**
     * Returns the value of field 'thisFollowupDateDesc'.
     * 
     * @return the value of field 'thisFollowupDateDesc'.
    **/
    public java.lang.String getThisFollowupDateDesc()
    {
        return this._thisFollowupDateDesc;
    } //-- java.lang.String getThisFollowupDateDesc() 

    /**
     * Returns the value of field 'weight'.
     * 
     * @return the value of field 'weight'.
    **/
    public java.lang.String getWeight()
    {
        return this._weight;
    } //-- java.lang.String getWeight() 

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
     * Sets the value of field 'aimBmi'.
     * 
     * @param aimBmi the value of field 'aimBmi'.
    **/
    public void setAimBmi(java.lang.String aimBmi)
    {
        this._aimBmi = aimBmi;
    } //-- void setAimBmi(java.lang.String) 

    /**
     * Sets the value of field 'bmi'.
     * 
     * @param bmi the value of field 'bmi'.
    **/
    public void setBmi(java.lang.String bmi)
    {
        this._bmi = bmi;
    } //-- void setBmi(java.lang.String) 

    /**
     * Sets the value of field 'dbp'.
     * 
     * @param dbp the value of field 'dbp'.
    **/
    public void setDbp(java.lang.String dbp)
    {
        this._dbp = dbp;
    } //-- void setDbp(java.lang.String) 

    /**
     * Sets the value of field 'fbg'.
     * 
     * @param fbg the value of field 'fbg'.
    **/
    public void setFbg(java.lang.String fbg)
    {
        this._fbg = fbg;
    } //-- void setFbg(java.lang.String) 

    /**
     * Sets the value of field 'ghb'.
     * 
     * @param ghb the value of field 'ghb'.
    **/
    public void setGhb(java.lang.String ghb)
    {
        this._ghb = ghb;
    } //-- void setGhb(java.lang.String) 

    /**
     * Sets the value of field 'ghbExamDate'.
     * 
     * @param ghbExamDate the value of field 'ghbExamDate'.
    **/
    public void setGhbExamDate(java.lang.String ghbExamDate)
    {
        this._ghbExamDate = ghbExamDate;
    } //-- void setGhbExamDate(java.lang.String) 

    /**
     * Sets the value of field 'height'.
     * 
     * @param height the value of field 'height'.
    **/
    public void setHeight(java.lang.String height)
    {
        this._height = height;
    } //-- void setHeight(java.lang.String) 

    /**
     * Sets the value of field 'insulinPerDose'.
     * 
     * @param insulinPerDose the value of field 'insulinPerDose'.
    **/
    public void setInsulinPerDose(java.lang.String insulinPerDose)
    {
        this._insulinPerDose = insulinPerDose;
    } //-- void setInsulinPerDose(java.lang.String) 

    /**
     * Sets the value of field 'insulinUsingFreq'.
     * 
     * @param insulinUsingFreq the value of field 'insulinUsingFreq'
    **/
    public void setInsulinUsingFreq(java.lang.String insulinUsingFreq)
    {
        this._insulinUsingFreq = insulinUsingFreq;
    } //-- void setInsulinUsingFreq(java.lang.String) 

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
     * Sets the value of field 'pbg'.
     * 
     * @param pbg the value of field 'pbg'.
    **/
    public void setPbg(java.lang.String pbg)
    {
        this._pbg = pbg;
    } //-- void setPbg(java.lang.String) 

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
     * Sets the value of field 'sbp'.
     * 
     * @param sbp the value of field 'sbp'.
    **/
    public void setSbp(java.lang.String sbp)
    {
        this._sbp = sbp;
    } //-- void setSbp(java.lang.String) 

    /**
     * Sets the value of field 'thisFollowupDateDesc'.
     * 
     * @param thisFollowupDateDesc the value of field
     * 'thisFollowupDateDesc'.
    **/
    public void setThisFollowupDateDesc(java.lang.String thisFollowupDateDesc)
    {
        this._thisFollowupDateDesc = thisFollowupDateDesc;
    } //-- void setThisFollowupDateDesc(java.lang.String) 

    /**
     * Sets the value of field 'weight'.
     * 
     * @param weight the value of field 'weight'.
    **/
    public void setWeight(java.lang.String weight)
    {
        this._weight = weight;
    } //-- void setWeight(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
