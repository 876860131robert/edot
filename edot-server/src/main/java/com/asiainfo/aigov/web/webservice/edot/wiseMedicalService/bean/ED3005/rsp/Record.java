/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp;

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

    private java.lang.String _examDateDesc;

    private java.lang.String _respDoctorName;

    private java.lang.String _bodyTemperature;

    private java.lang.String _pulseRate;

    private java.lang.String _breathingRate;

    private java.lang.String _height;

    private java.lang.String _weight;

    private java.lang.String _waistline;

    private java.lang.String _lsbp;

    private java.lang.String _rsbp;

    private java.lang.String _elderCognitionResult;

    private java.lang.String _elderCognitionScore;

    private java.lang.String _elderEmotionalState;

    private java.lang.String _elderDepressionScore;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'bodyTemperature'.
     * 
     * @return the value of field 'bodyTemperature'.
    **/
    public java.lang.String getBodyTemperature()
    {
        return this._bodyTemperature;
    } //-- java.lang.String getBodyTemperature() 

    /**
     * Returns the value of field 'breathingRate'.
     * 
     * @return the value of field 'breathingRate'.
    **/
    public java.lang.String getBreathingRate()
    {
        return this._breathingRate;
    } //-- java.lang.String getBreathingRate() 

    /**
     * Returns the value of field 'elderCognitionResult'.
     * 
     * @return the value of field 'elderCognitionResult'.
    **/
    public java.lang.String getElderCognitionResult()
    {
        return this._elderCognitionResult;
    } //-- java.lang.String getElderCognitionResult() 

    /**
     * Returns the value of field 'elderCognitionScore'.
     * 
     * @return the value of field 'elderCognitionScore'.
    **/
    public java.lang.String getElderCognitionScore()
    {
        return this._elderCognitionScore;
    } //-- java.lang.String getElderCognitionScore() 

    /**
     * Returns the value of field 'elderDepressionScore'.
     * 
     * @return the value of field 'elderDepressionScore'.
    **/
    public java.lang.String getElderDepressionScore()
    {
        return this._elderDepressionScore;
    } //-- java.lang.String getElderDepressionScore() 

    /**
     * Returns the value of field 'elderEmotionalState'.
     * 
     * @return the value of field 'elderEmotionalState'.
    **/
    public java.lang.String getElderEmotionalState()
    {
        return this._elderEmotionalState;
    } //-- java.lang.String getElderEmotionalState() 

    /**
     * Returns the value of field 'examDateDesc'.
     * 
     * @return the value of field 'examDateDesc'.
    **/
    public java.lang.String getExamDateDesc()
    {
        return this._examDateDesc;
    } //-- java.lang.String getExamDateDesc() 

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
     * Returns the value of field 'lsbp'.
     * 
     * @return the value of field 'lsbp'.
    **/
    public java.lang.String getLsbp()
    {
        return this._lsbp;
    } //-- java.lang.String getLsbp() 

    /**
     * Returns the value of field 'pulseRate'.
     * 
     * @return the value of field 'pulseRate'.
    **/
    public java.lang.String getPulseRate()
    {
        return this._pulseRate;
    } //-- java.lang.String getPulseRate() 

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
     * Returns the value of field 'rsbp'.
     * 
     * @return the value of field 'rsbp'.
    **/
    public java.lang.String getRsbp()
    {
        return this._rsbp;
    } //-- java.lang.String getRsbp() 

    /**
     * Returns the value of field 'waistline'.
     * 
     * @return the value of field 'waistline'.
    **/
    public java.lang.String getWaistline()
    {
        return this._waistline;
    } //-- java.lang.String getWaistline() 

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
     * Sets the value of field 'bodyTemperature'.
     * 
     * @param bodyTemperature the value of field 'bodyTemperature'.
    **/
    public void setBodyTemperature(java.lang.String bodyTemperature)
    {
        this._bodyTemperature = bodyTemperature;
    } //-- void setBodyTemperature(java.lang.String) 

    /**
     * Sets the value of field 'breathingRate'.
     * 
     * @param breathingRate the value of field 'breathingRate'.
    **/
    public void setBreathingRate(java.lang.String breathingRate)
    {
        this._breathingRate = breathingRate;
    } //-- void setBreathingRate(java.lang.String) 

    /**
     * Sets the value of field 'elderCognitionResult'.
     * 
     * @param elderCognitionResult the value of field
     * 'elderCognitionResult'.
    **/
    public void setElderCognitionResult(java.lang.String elderCognitionResult)
    {
        this._elderCognitionResult = elderCognitionResult;
    } //-- void setElderCognitionResult(java.lang.String) 

    /**
     * Sets the value of field 'elderCognitionScore'.
     * 
     * @param elderCognitionScore the value of field
     * 'elderCognitionScore'.
    **/
    public void setElderCognitionScore(java.lang.String elderCognitionScore)
    {
        this._elderCognitionScore = elderCognitionScore;
    } //-- void setElderCognitionScore(java.lang.String) 

    /**
     * Sets the value of field 'elderDepressionScore'.
     * 
     * @param elderDepressionScore the value of field
     * 'elderDepressionScore'.
    **/
    public void setElderDepressionScore(java.lang.String elderDepressionScore)
    {
        this._elderDepressionScore = elderDepressionScore;
    } //-- void setElderDepressionScore(java.lang.String) 

    /**
     * Sets the value of field 'elderEmotionalState'.
     * 
     * @param elderEmotionalState the value of field
     * 'elderEmotionalState'.
    **/
    public void setElderEmotionalState(java.lang.String elderEmotionalState)
    {
        this._elderEmotionalState = elderEmotionalState;
    } //-- void setElderEmotionalState(java.lang.String) 

    /**
     * Sets the value of field 'examDateDesc'.
     * 
     * @param examDateDesc the value of field 'examDateDesc'.
    **/
    public void setExamDateDesc(java.lang.String examDateDesc)
    {
        this._examDateDesc = examDateDesc;
    } //-- void setExamDateDesc(java.lang.String) 

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
     * Sets the value of field 'lsbp'.
     * 
     * @param lsbp the value of field 'lsbp'.
    **/
    public void setLsbp(java.lang.String lsbp)
    {
        this._lsbp = lsbp;
    } //-- void setLsbp(java.lang.String) 

    /**
     * Sets the value of field 'pulseRate'.
     * 
     * @param pulseRate the value of field 'pulseRate'.
    **/
    public void setPulseRate(java.lang.String pulseRate)
    {
        this._pulseRate = pulseRate;
    } //-- void setPulseRate(java.lang.String) 

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
     * Sets the value of field 'rsbp'.
     * 
     * @param rsbp the value of field 'rsbp'.
    **/
    public void setRsbp(java.lang.String rsbp)
    {
        this._rsbp = rsbp;
    } //-- void setRsbp(java.lang.String) 

    /**
     * Sets the value of field 'waistline'.
     * 
     * @param waistline the value of field 'waistline'.
    **/
    public void setWaistline(java.lang.String waistline)
    {
        this._waistline = waistline;
    } //-- void setWaistline(java.lang.String) 

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
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
