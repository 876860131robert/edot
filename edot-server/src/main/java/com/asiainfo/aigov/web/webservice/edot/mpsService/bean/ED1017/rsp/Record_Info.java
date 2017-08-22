/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp;

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
public class Record_Info implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _standard_Code;

    private java.lang.String _dept_Code;

    private java.lang.String _dept_Name;

    private java.lang.String _dept_Introduction;

    private java.lang.String _remark;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record_Info() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Record_Info()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dept_Code'.
     * 
     * @return the value of field 'dept_Code'.
    **/
    public java.lang.String getDept_Code()
    {
        return this._dept_Code;
    } //-- java.lang.String getDept_Code() 

    /**
     * Returns the value of field 'dept_Introduction'.
     * 
     * @return the value of field 'dept_Introduction'.
    **/
    public java.lang.String getDept_Introduction()
    {
        return this._dept_Introduction;
    } //-- java.lang.String getDept_Introduction() 

    /**
     * Returns the value of field 'dept_Name'.
     * 
     * @return the value of field 'dept_Name'.
    **/
    public java.lang.String getDept_Name()
    {
        return this._dept_Name;
    } //-- java.lang.String getDept_Name() 

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
     * Returns the value of field 'standard_Code'.
     * 
     * @return the value of field 'standard_Code'.
    **/
    public java.lang.String getStandard_Code()
    {
        return this._standard_Code;
    } //-- java.lang.String getStandard_Code() 

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
     * Sets the value of field 'dept_Code'.
     * 
     * @param dept_Code the value of field 'dept_Code'.
    **/
    public void setDept_Code(java.lang.String dept_Code)
    {
        this._dept_Code = dept_Code;
    } //-- void setDept_Code(java.lang.String) 

    /**
     * Sets the value of field 'dept_Introduction'.
     * 
     * @param dept_Introduction the value of field
     * 'dept_Introduction'.
    **/
    public void setDept_Introduction(java.lang.String dept_Introduction)
    {
        this._dept_Introduction = dept_Introduction;
    } //-- void setDept_Introduction(java.lang.String) 

    /**
     * Sets the value of field 'dept_Name'.
     * 
     * @param dept_Name the value of field 'dept_Name'.
    **/
    public void setDept_Name(java.lang.String dept_Name)
    {
        this._dept_Name = dept_Name;
    } //-- void setDept_Name(java.lang.String) 

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
     * Sets the value of field 'standard_Code'.
     * 
     * @param standard_Code the value of field 'standard_Code'.
    **/
    public void setStandard_Code(java.lang.String standard_Code)
    {
        this._standard_Code = standard_Code;
    } //-- void setStandard_Code(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Record_Info unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Record_Info) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Record_Info.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Record_Info unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
