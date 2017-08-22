/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp;

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
public class Inpatient implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _inDtime;

    private java.lang.String _inDiagName;

    private java.lang.String _orgName;

    private java.lang.String _inDeptName;

    private java.lang.String _respDoctorName;

    private java.lang.String _openAccess;


      //----------------/
     //- Constructors -/
    //----------------/

    public Inpatient() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Inpatient()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'inDeptName'.
     * 
     * @return the value of field 'inDeptName'.
    **/
    public java.lang.String getInDeptName()
    {
        return this._inDeptName;
    } //-- java.lang.String getInDeptName() 

    /**
     * Returns the value of field 'inDiagName'.
     * 
     * @return the value of field 'inDiagName'.
    **/
    public java.lang.String getInDiagName()
    {
        return this._inDiagName;
    } //-- java.lang.String getInDiagName() 

    /**
     * Returns the value of field 'inDtime'.
     * 
     * @return the value of field 'inDtime'.
    **/
    public java.lang.String getInDtime()
    {
        return this._inDtime;
    } //-- java.lang.String getInDtime() 

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
     * Returns the value of field 'respDoctorName'.
     * 
     * @return the value of field 'respDoctorName'.
    **/
    public java.lang.String getRespDoctorName()
    {
        return this._respDoctorName;
    } //-- java.lang.String getRespDoctorName() 

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
     * Sets the value of field 'inDeptName'.
     * 
     * @param inDeptName the value of field 'inDeptName'.
    **/
    public void setInDeptName(java.lang.String inDeptName)
    {
        this._inDeptName = inDeptName;
    } //-- void setInDeptName(java.lang.String) 

    /**
     * Sets the value of field 'inDiagName'.
     * 
     * @param inDiagName the value of field 'inDiagName'.
    **/
    public void setInDiagName(java.lang.String inDiagName)
    {
        this._inDiagName = inDiagName;
    } //-- void setInDiagName(java.lang.String) 

    /**
     * Sets the value of field 'inDtime'.
     * 
     * @param inDtime the value of field 'inDtime'.
    **/
    public void setInDtime(java.lang.String inDtime)
    {
        this._inDtime = inDtime;
    } //-- void setInDtime(java.lang.String) 

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
     * Sets the value of field 'respDoctorName'.
     * 
     * @param respDoctorName the value of field 'respDoctorName'.
    **/
    public void setRespDoctorName(java.lang.String respDoctorName)
    {
        this._respDoctorName = respDoctorName;
    } //-- void setRespDoctorName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Inpatient unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Inpatient) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Inpatient.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Inpatient unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
