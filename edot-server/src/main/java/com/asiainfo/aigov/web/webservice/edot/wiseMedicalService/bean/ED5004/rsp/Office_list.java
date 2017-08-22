/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp;

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
public class Office_list implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _officeId;

    private java.lang.String _officeName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Office_list() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'officeId'.
     * 
     * @return the value of field 'officeId'.
    **/
    public java.lang.String getOfficeId()
    {
        return this._officeId;
    } //-- java.lang.String getOfficeId() 

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
     * Sets the value of field 'officeId'.
     * 
     * @param officeId the value of field 'officeId'.
    **/
    public void setOfficeId(java.lang.String officeId)
    {
        this._officeId = officeId;
    } //-- void setOfficeId(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Office_list unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
