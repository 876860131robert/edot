/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp;

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

    private java.lang.String _hypertensionFollowupId;

    private java.lang.String _thisFollowupDateDesc;

    private java.lang.String _refertoOrgName;

    private java.lang.String _respDoctorName;

    private java.lang.String _sbp;

    private java.lang.String _dbp;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'hypertensionFollowupId'.
     * 
     * @return the value of field 'hypertensionFollowupId'.
    **/
    public java.lang.String getHypertensionFollowupId()
    {
        return this._hypertensionFollowupId;
    } //-- java.lang.String getHypertensionFollowupId() 

    /**
     * Returns the value of field 'refertoOrgName'.
     * 
     * @return the value of field 'refertoOrgName'.
    **/
    public java.lang.String getRefertoOrgName()
    {
        return this._refertoOrgName;
    } //-- java.lang.String getRefertoOrgName() 

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
     * Sets the value of field 'dbp'.
     * 
     * @param dbp the value of field 'dbp'.
    **/
    public void setDbp(java.lang.String dbp)
    {
        this._dbp = dbp;
    } //-- void setDbp(java.lang.String) 

    /**
     * Sets the value of field 'hypertensionFollowupId'.
     * 
     * @param hypertensionFollowupId the value of field
     * 'hypertensionFollowupId'.
    **/
    public void setHypertensionFollowupId(java.lang.String hypertensionFollowupId)
    {
        this._hypertensionFollowupId = hypertensionFollowupId;
    } //-- void setHypertensionFollowupId(java.lang.String) 

    /**
     * Sets the value of field 'refertoOrgName'.
     * 
     * @param refertoOrgName the value of field 'refertoOrgName'.
    **/
    public void setRefertoOrgName(java.lang.String refertoOrgName)
    {
        this._refertoOrgName = refertoOrgName;
    } //-- void setRefertoOrgName(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
