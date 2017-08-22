/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp;

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

    private java.lang.String _cert_no;

    private java.lang.String _patient_name;

    private java.lang.String _evaluate_status;

    private java.lang.String _visit_date;

    private java.lang.String _office_code;

    private java.lang.String _office_name;

    private java.lang.String _doctor_cert_no;

    private java.lang.String _doctor_name;

    private java.lang.String _hospital_code;

    private java.lang.String _hospital_name;

    private java.lang.String _create_date;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_List() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Result_List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'cert_no'.
     * 
     * @return the value of field 'cert_no'.
    **/
    public java.lang.String getCert_no()
    {
        return this._cert_no;
    } //-- java.lang.String getCert_no() 

    /**
     * Returns the value of field 'create_date'.
     * 
     * @return the value of field 'create_date'.
    **/
    public java.lang.String getCreate_date()
    {
        return this._create_date;
    } //-- java.lang.String getCreate_date() 

    /**
     * Returns the value of field 'doctor_cert_no'.
     * 
     * @return the value of field 'doctor_cert_no'.
    **/
    public java.lang.String getDoctor_cert_no()
    {
        return this._doctor_cert_no;
    } //-- java.lang.String getDoctor_cert_no() 

    /**
     * Returns the value of field 'doctor_name'.
     * 
     * @return the value of field 'doctor_name'.
    **/
    public java.lang.String getDoctor_name()
    {
        return this._doctor_name;
    } //-- java.lang.String getDoctor_name() 

    /**
     * Returns the value of field 'evaluate_status'.
     * 
     * @return the value of field 'evaluate_status'.
    **/
    public java.lang.String getEvaluate_status()
    {
        return this._evaluate_status;
    } //-- java.lang.String getEvaluate_status() 

    /**
     * Returns the value of field 'hospital_code'.
     * 
     * @return the value of field 'hospital_code'.
    **/
    public java.lang.String getHospital_code()
    {
        return this._hospital_code;
    } //-- java.lang.String getHospital_code() 

    /**
     * Returns the value of field 'hospital_name'.
     * 
     * @return the value of field 'hospital_name'.
    **/
    public java.lang.String getHospital_name()
    {
        return this._hospital_name;
    } //-- java.lang.String getHospital_name() 

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
     * Returns the value of field 'office_code'.
     * 
     * @return the value of field 'office_code'.
    **/
    public java.lang.String getOffice_code()
    {
        return this._office_code;
    } //-- java.lang.String getOffice_code() 

    /**
     * Returns the value of field 'office_name'.
     * 
     * @return the value of field 'office_name'.
    **/
    public java.lang.String getOffice_name()
    {
        return this._office_name;
    } //-- java.lang.String getOffice_name() 

    /**
     * Returns the value of field 'patient_name'.
     * 
     * @return the value of field 'patient_name'.
    **/
    public java.lang.String getPatient_name()
    {
        return this._patient_name;
    } //-- java.lang.String getPatient_name() 

    /**
     * Returns the value of field 'visit_date'.
     * 
     * @return the value of field 'visit_date'.
    **/
    public java.lang.String getVisit_date()
    {
        return this._visit_date;
    } //-- java.lang.String getVisit_date() 

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
     * Sets the value of field 'cert_no'.
     * 
     * @param cert_no the value of field 'cert_no'.
    **/
    public void setCert_no(java.lang.String cert_no)
    {
        this._cert_no = cert_no;
    } //-- void setCert_no(java.lang.String) 

    /**
     * Sets the value of field 'create_date'.
     * 
     * @param create_date the value of field 'create_date'.
    **/
    public void setCreate_date(java.lang.String create_date)
    {
        this._create_date = create_date;
    } //-- void setCreate_date(java.lang.String) 

    /**
     * Sets the value of field 'doctor_cert_no'.
     * 
     * @param doctor_cert_no the value of field 'doctor_cert_no'.
    **/
    public void setDoctor_cert_no(java.lang.String doctor_cert_no)
    {
        this._doctor_cert_no = doctor_cert_no;
    } //-- void setDoctor_cert_no(java.lang.String) 

    /**
     * Sets the value of field 'doctor_name'.
     * 
     * @param doctor_name the value of field 'doctor_name'.
    **/
    public void setDoctor_name(java.lang.String doctor_name)
    {
        this._doctor_name = doctor_name;
    } //-- void setDoctor_name(java.lang.String) 

    /**
     * Sets the value of field 'evaluate_status'.
     * 
     * @param evaluate_status the value of field 'evaluate_status'.
    **/
    public void setEvaluate_status(java.lang.String evaluate_status)
    {
        this._evaluate_status = evaluate_status;
    } //-- void setEvaluate_status(java.lang.String) 

    /**
     * Sets the value of field 'hospital_code'.
     * 
     * @param hospital_code the value of field 'hospital_code'.
    **/
    public void setHospital_code(java.lang.String hospital_code)
    {
        this._hospital_code = hospital_code;
    } //-- void setHospital_code(java.lang.String) 

    /**
     * Sets the value of field 'hospital_name'.
     * 
     * @param hospital_name the value of field 'hospital_name'.
    **/
    public void setHospital_name(java.lang.String hospital_name)
    {
        this._hospital_name = hospital_name;
    } //-- void setHospital_name(java.lang.String) 

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
     * Sets the value of field 'office_code'.
     * 
     * @param office_code the value of field 'office_code'.
    **/
    public void setOffice_code(java.lang.String office_code)
    {
        this._office_code = office_code;
    } //-- void setOffice_code(java.lang.String) 

    /**
     * Sets the value of field 'office_name'.
     * 
     * @param office_name the value of field 'office_name'.
    **/
    public void setOffice_name(java.lang.String office_name)
    {
        this._office_name = office_name;
    } //-- void setOffice_name(java.lang.String) 

    /**
     * Sets the value of field 'patient_name'.
     * 
     * @param patient_name the value of field 'patient_name'.
    **/
    public void setPatient_name(java.lang.String patient_name)
    {
        this._patient_name = patient_name;
    } //-- void setPatient_name(java.lang.String) 

    /**
     * Sets the value of field 'visit_date'.
     * 
     * @param visit_date the value of field 'visit_date'.
    **/
    public void setVisit_date(java.lang.String visit_date)
    {
        this._visit_date = visit_date;
    } //-- void setVisit_date(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Result_List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Result_List) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Result_List.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Result_List unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
