/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp;

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

    private java.lang.String _id;

    private java.lang.String _userId;

    private java.lang.String _doctorCode;

    private java.lang.String _doctorName;

    private java.lang.String _officeCode;

    private java.lang.String _officeName;

    private java.lang.String _hospatilCode;

    private java.lang.String _hospatilName;

    private java.lang.String _patientName;

    private java.lang.String _treatmentTime;

    private java.lang.String _question1;

    private java.lang.String _question2;

    private java.lang.String _question3;

    private java.lang.String _question4;

    private java.lang.String _question5;

    private java.lang.String _question6;

    private java.lang.String _question7;

    private java.lang.String _question8;

    private java.lang.String _created;

    private java.lang.String _modified;

    private java.lang.String _status;

    private java.lang.String _doctorReply;

    private java.lang.String _replyDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'created'.
     * 
     * @return the value of field 'created'.
    **/
    public java.lang.String getCreated()
    {
        return this._created;
    } //-- java.lang.String getCreated() 

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
     * Returns the value of field 'doctorName'.
     * 
     * @return the value of field 'doctorName'.
    **/
    public java.lang.String getDoctorName()
    {
        return this._doctorName;
    } //-- java.lang.String getDoctorName() 

    /**
     * Returns the value of field 'doctorReply'.
     * 
     * @return the value of field 'doctorReply'.
    **/
    public java.lang.String getDoctorReply()
    {
        return this._doctorReply;
    } //-- java.lang.String getDoctorReply() 

    /**
     * Returns the value of field 'hospatilCode'.
     * 
     * @return the value of field 'hospatilCode'.
    **/
    public java.lang.String getHospatilCode()
    {
        return this._hospatilCode;
    } //-- java.lang.String getHospatilCode() 

    /**
     * Returns the value of field 'hospatilName'.
     * 
     * @return the value of field 'hospatilName'.
    **/
    public java.lang.String getHospatilName()
    {
        return this._hospatilName;
    } //-- java.lang.String getHospatilName() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'id'.
    **/
    public java.lang.String getId()
    {
        return this._id;
    } //-- java.lang.String getId() 

    /**
     * Returns the value of field 'modified'.
     * 
     * @return the value of field 'modified'.
    **/
    public java.lang.String getModified()
    {
        return this._modified;
    } //-- java.lang.String getModified() 

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
     * Returns the value of field 'officeName'.
     * 
     * @return the value of field 'officeName'.
    **/
    public java.lang.String getOfficeName()
    {
        return this._officeName;
    } //-- java.lang.String getOfficeName() 

    /**
     * Returns the value of field 'patientName'.
     * 
     * @return the value of field 'patientName'.
    **/
    public java.lang.String getPatientName()
    {
        return this._patientName;
    } //-- java.lang.String getPatientName() 

    /**
     * Returns the value of field 'question1'.
     * 
     * @return the value of field 'question1'.
    **/
    public java.lang.String getQuestion1()
    {
        return this._question1;
    } //-- java.lang.String getQuestion1() 

    /**
     * Returns the value of field 'question2'.
     * 
     * @return the value of field 'question2'.
    **/
    public java.lang.String getQuestion2()
    {
        return this._question2;
    } //-- java.lang.String getQuestion2() 

    /**
     * Returns the value of field 'question3'.
     * 
     * @return the value of field 'question3'.
    **/
    public java.lang.String getQuestion3()
    {
        return this._question3;
    } //-- java.lang.String getQuestion3() 

    /**
     * Returns the value of field 'question4'.
     * 
     * @return the value of field 'question4'.
    **/
    public java.lang.String getQuestion4()
    {
        return this._question4;
    } //-- java.lang.String getQuestion4() 

    /**
     * Returns the value of field 'question5'.
     * 
     * @return the value of field 'question5'.
    **/
    public java.lang.String getQuestion5()
    {
        return this._question5;
    } //-- java.lang.String getQuestion5() 

    /**
     * Returns the value of field 'question6'.
     * 
     * @return the value of field 'question6'.
    **/
    public java.lang.String getQuestion6()
    {
        return this._question6;
    } //-- java.lang.String getQuestion6() 

    /**
     * Returns the value of field 'question7'.
     * 
     * @return the value of field 'question7'.
    **/
    public java.lang.String getQuestion7()
    {
        return this._question7;
    } //-- java.lang.String getQuestion7() 

    /**
     * Returns the value of field 'question8'.
     * 
     * @return the value of field 'question8'.
    **/
    public java.lang.String getQuestion8()
    {
        return this._question8;
    } //-- java.lang.String getQuestion8() 

    /**
     * Returns the value of field 'replyDate'.
     * 
     * @return the value of field 'replyDate'.
    **/
    public java.lang.String getReplyDate()
    {
        return this._replyDate;
    } //-- java.lang.String getReplyDate() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'status'.
    **/
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Returns the value of field 'treatmentTime'.
     * 
     * @return the value of field 'treatmentTime'.
    **/
    public java.lang.String getTreatmentTime()
    {
        return this._treatmentTime;
    } //-- java.lang.String getTreatmentTime() 

    /**
     * Returns the value of field 'userId'.
     * 
     * @return the value of field 'userId'.
    **/
    public java.lang.String getUserId()
    {
        return this._userId;
    } //-- java.lang.String getUserId() 

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
     * Sets the value of field 'created'.
     * 
     * @param created the value of field 'created'.
    **/
    public void setCreated(java.lang.String created)
    {
        this._created = created;
    } //-- void setCreated(java.lang.String) 

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
     * Sets the value of field 'doctorName'.
     * 
     * @param doctorName the value of field 'doctorName'.
    **/
    public void setDoctorName(java.lang.String doctorName)
    {
        this._doctorName = doctorName;
    } //-- void setDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'doctorReply'.
     * 
     * @param doctorReply the value of field 'doctorReply'.
    **/
    public void setDoctorReply(java.lang.String doctorReply)
    {
        this._doctorReply = doctorReply;
    } //-- void setDoctorReply(java.lang.String) 

    /**
     * Sets the value of field 'hospatilCode'.
     * 
     * @param hospatilCode the value of field 'hospatilCode'.
    **/
    public void setHospatilCode(java.lang.String hospatilCode)
    {
        this._hospatilCode = hospatilCode;
    } //-- void setHospatilCode(java.lang.String) 

    /**
     * Sets the value of field 'hospatilName'.
     * 
     * @param hospatilName the value of field 'hospatilName'.
    **/
    public void setHospatilName(java.lang.String hospatilName)
    {
        this._hospatilName = hospatilName;
    } //-- void setHospatilName(java.lang.String) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
    **/
    public void setId(java.lang.String id)
    {
        this._id = id;
    } //-- void setId(java.lang.String) 

    /**
     * Sets the value of field 'modified'.
     * 
     * @param modified the value of field 'modified'.
    **/
    public void setModified(java.lang.String modified)
    {
        this._modified = modified;
    } //-- void setModified(java.lang.String) 

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
     * Sets the value of field 'officeName'.
     * 
     * @param officeName the value of field 'officeName'.
    **/
    public void setOfficeName(java.lang.String officeName)
    {
        this._officeName = officeName;
    } //-- void setOfficeName(java.lang.String) 

    /**
     * Sets the value of field 'patientName'.
     * 
     * @param patientName the value of field 'patientName'.
    **/
    public void setPatientName(java.lang.String patientName)
    {
        this._patientName = patientName;
    } //-- void setPatientName(java.lang.String) 

    /**
     * Sets the value of field 'question1'.
     * 
     * @param question1 the value of field 'question1'.
    **/
    public void setQuestion1(java.lang.String question1)
    {
        this._question1 = question1;
    } //-- void setQuestion1(java.lang.String) 

    /**
     * Sets the value of field 'question2'.
     * 
     * @param question2 the value of field 'question2'.
    **/
    public void setQuestion2(java.lang.String question2)
    {
        this._question2 = question2;
    } //-- void setQuestion2(java.lang.String) 

    /**
     * Sets the value of field 'question3'.
     * 
     * @param question3 the value of field 'question3'.
    **/
    public void setQuestion3(java.lang.String question3)
    {
        this._question3 = question3;
    } //-- void setQuestion3(java.lang.String) 

    /**
     * Sets the value of field 'question4'.
     * 
     * @param question4 the value of field 'question4'.
    **/
    public void setQuestion4(java.lang.String question4)
    {
        this._question4 = question4;
    } //-- void setQuestion4(java.lang.String) 

    /**
     * Sets the value of field 'question5'.
     * 
     * @param question5 the value of field 'question5'.
    **/
    public void setQuestion5(java.lang.String question5)
    {
        this._question5 = question5;
    } //-- void setQuestion5(java.lang.String) 

    /**
     * Sets the value of field 'question6'.
     * 
     * @param question6 the value of field 'question6'.
    **/
    public void setQuestion6(java.lang.String question6)
    {
        this._question6 = question6;
    } //-- void setQuestion6(java.lang.String) 

    /**
     * Sets the value of field 'question7'.
     * 
     * @param question7 the value of field 'question7'.
    **/
    public void setQuestion7(java.lang.String question7)
    {
        this._question7 = question7;
    } //-- void setQuestion7(java.lang.String) 

    /**
     * Sets the value of field 'question8'.
     * 
     * @param question8 the value of field 'question8'.
    **/
    public void setQuestion8(java.lang.String question8)
    {
        this._question8 = question8;
    } //-- void setQuestion8(java.lang.String) 

    /**
     * Sets the value of field 'replyDate'.
     * 
     * @param replyDate the value of field 'replyDate'.
    **/
    public void setReplyDate(java.lang.String replyDate)
    {
        this._replyDate = replyDate;
    } //-- void setReplyDate(java.lang.String) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
    **/
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Sets the value of field 'treatmentTime'.
     * 
     * @param treatmentTime the value of field 'treatmentTime'.
    **/
    public void setTreatmentTime(java.lang.String treatmentTime)
    {
        this._treatmentTime = treatmentTime;
    } //-- void setTreatmentTime(java.lang.String) 

    /**
     * Sets the value of field 'userId'.
     * 
     * @param userId the value of field 'userId'.
    **/
    public void setUserId(java.lang.String userId)
    {
        this._userId = userId;
    } //-- void setUserId(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
