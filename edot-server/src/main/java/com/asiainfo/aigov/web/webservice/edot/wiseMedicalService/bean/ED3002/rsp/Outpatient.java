/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp;

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
public class Outpatient implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _visitDtime;

    private java.lang.String _outpatDiagName;

    private java.lang.String _orgName;

    private java.lang.String _visitDeptName;

    private java.lang.String _respDoctorName;

    private java.lang.String _openAccess;

    private java.lang.String _chiefComplaint;

    private java.lang.String _objectiveExamination;


      //----------------/
     //- Constructors -/
    //----------------/

    public Outpatient() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Outpatient()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'chiefComplaint'.
     * 
     * @return the value of field 'chiefComplaint'.
    **/
    public java.lang.String getChiefComplaint()
    {
        return this._chiefComplaint;
    } //-- java.lang.String getChiefComplaint() 

    /**
     * Returns the value of field 'objectiveExamination'.
     * 
     * @return the value of field 'objectiveExamination'.
    **/
    public java.lang.String getObjectiveExamination()
    {
        return this._objectiveExamination;
    } //-- java.lang.String getObjectiveExamination() 

    /**
     * Returns the value of field 'openAccess'.
     * 
     * @return the value of field 'openAccess'.
    **/
    public java.lang.String getOpenAccess()
    {
        return this._openAccess;
    } //-- java.lang.String getOpenAccess() 

    /**
     * Returns the value of field 'orgName'.
     * 
     * @return the value of field 'orgName'.
    **/
    public java.lang.String getOrgName()
    {
        return this._orgName;
    } //-- java.lang.String getOrgName() 

    /**
     * Returns the value of field 'outpatDiagName'.
     * 
     * @return the value of field 'outpatDiagName'.
    **/
    public java.lang.String getOutpatDiagName()
    {
        return this._outpatDiagName;
    } //-- java.lang.String getOutpatDiagName() 

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
     * Returns the value of field 'visitDeptName'.
     * 
     * @return the value of field 'visitDeptName'.
    **/
    public java.lang.String getVisitDeptName()
    {
        return this._visitDeptName;
    } //-- java.lang.String getVisitDeptName() 

    /**
     * Returns the value of field 'visitDtime'.
     * 
     * @return the value of field 'visitDtime'.
    **/
    public java.lang.String getVisitDtime()
    {
        return this._visitDtime;
    } //-- java.lang.String getVisitDtime() 

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
     * Sets the value of field 'chiefComplaint'.
     * 
     * @param chiefComplaint the value of field 'chiefComplaint'.
    **/
    public void setChiefComplaint(java.lang.String chiefComplaint)
    {
        this._chiefComplaint = chiefComplaint;
    } //-- void setChiefComplaint(java.lang.String) 

    /**
     * Sets the value of field 'objectiveExamination'.
     * 
     * @param objectiveExamination the value of field
     * 'objectiveExamination'.
    **/
    public void setObjectiveExamination(java.lang.String objectiveExamination)
    {
        this._objectiveExamination = objectiveExamination;
    } //-- void setObjectiveExamination(java.lang.String) 

    /**
     * Sets the value of field 'openAccess'.
     * 
     * @param openAccess the value of field 'openAccess'.
    **/
    public void setOpenAccess(java.lang.String openAccess)
    {
        this._openAccess = openAccess;
    } //-- void setOpenAccess(java.lang.String) 

    /**
     * Sets the value of field 'orgName'.
     * 
     * @param orgName the value of field 'orgName'.
    **/
    public void setOrgName(java.lang.String orgName)
    {
        this._orgName = orgName;
    } //-- void setOrgName(java.lang.String) 

    /**
     * Sets the value of field 'outpatDiagName'.
     * 
     * @param outpatDiagName the value of field 'outpatDiagName'.
    **/
    public void setOutpatDiagName(java.lang.String outpatDiagName)
    {
        this._outpatDiagName = outpatDiagName;
    } //-- void setOutpatDiagName(java.lang.String) 

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
     * Sets the value of field 'visitDeptName'.
     * 
     * @param visitDeptName the value of field 'visitDeptName'.
    **/
    public void setVisitDeptName(java.lang.String visitDeptName)
    {
        this._visitDeptName = visitDeptName;
    } //-- void setVisitDeptName(java.lang.String) 

    /**
     * Sets the value of field 'visitDtime'.
     * 
     * @param visitDtime the value of field 'visitDtime'.
    **/
    public void setVisitDtime(java.lang.String visitDtime)
    {
        this._visitDtime = visitDtime;
    } //-- void setVisitDtime(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Outpatient unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Outpatient) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Outpatient.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Outpatient unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
