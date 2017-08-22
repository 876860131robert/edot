/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp;

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
public class Response implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _result_Code;

    private java.lang.String _error_Msg;

    private java.lang.String _serviceName;

    private java.lang.String _hospital_Name;

    private java.lang.String _hospital_Short_Name;

    private java.lang.String _hospital_TelPhone;

    private java.lang.String _hospital_Address;

    private java.lang.String _hospital_Introduction;

    private java.lang.String _remark;

    private java.lang.String _hospital_Lng;

    private java.lang.String _hospital_Lat;

    private java.lang.String _hospital_Image;

    private java.lang.String _hospital_Nav_Image;

    private java.lang.String _hospital_Nav_Introduction;


      //----------------/
     //- Constructors -/
    //----------------/

    public Response() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'error_Msg'.
     * 
     * @return the value of field 'error_Msg'.
    **/
    public java.lang.String getError_Msg()
    {
        return this._error_Msg;
    } //-- java.lang.String getError_Msg() 

    /**
     * Returns the value of field 'hospital_Address'.
     * 
     * @return the value of field 'hospital_Address'.
    **/
    public java.lang.String getHospital_Address()
    {
        return this._hospital_Address;
    } //-- java.lang.String getHospital_Address() 

    /**
     * Returns the value of field 'hospital_Image'.
     * 
     * @return the value of field 'hospital_Image'.
    **/
    public java.lang.String getHospital_Image()
    {
        return this._hospital_Image;
    } //-- java.lang.String getHospital_Image() 

    /**
     * Returns the value of field 'hospital_Introduction'.
     * 
     * @return the value of field 'hospital_Introduction'.
    **/
    public java.lang.String getHospital_Introduction()
    {
        return this._hospital_Introduction;
    } //-- java.lang.String getHospital_Introduction() 

    /**
     * Returns the value of field 'hospital_Lat'.
     * 
     * @return the value of field 'hospital_Lat'.
    **/
    public java.lang.String getHospital_Lat()
    {
        return this._hospital_Lat;
    } //-- java.lang.String getHospital_Lat() 

    /**
     * Returns the value of field 'hospital_Lng'.
     * 
     * @return the value of field 'hospital_Lng'.
    **/
    public java.lang.String getHospital_Lng()
    {
        return this._hospital_Lng;
    } //-- java.lang.String getHospital_Lng() 

    /**
     * Returns the value of field 'hospital_Name'.
     * 
     * @return the value of field 'hospital_Name'.
    **/
    public java.lang.String getHospital_Name()
    {
        return this._hospital_Name;
    } //-- java.lang.String getHospital_Name() 

    /**
     * Returns the value of field 'hospital_Nav_Image'.
     * 
     * @return the value of field 'hospital_Nav_Image'.
    **/
    public java.lang.String getHospital_Nav_Image()
    {
        return this._hospital_Nav_Image;
    } //-- java.lang.String getHospital_Nav_Image() 

    /**
     * Returns the value of field 'hospital_Nav_Introduction'.
     * 
     * @return the value of field 'hospital_Nav_Introduction'.
    **/
    public java.lang.String getHospital_Nav_Introduction()
    {
        return this._hospital_Nav_Introduction;
    } //-- java.lang.String getHospital_Nav_Introduction() 

    /**
     * Returns the value of field 'hospital_Short_Name'.
     * 
     * @return the value of field 'hospital_Short_Name'.
    **/
    public java.lang.String getHospital_Short_Name()
    {
        return this._hospital_Short_Name;
    } //-- java.lang.String getHospital_Short_Name() 

    /**
     * Returns the value of field 'hospital_TelPhone'.
     * 
     * @return the value of field 'hospital_TelPhone'.
    **/
    public java.lang.String getHospital_TelPhone()
    {
        return this._hospital_TelPhone;
    } //-- java.lang.String getHospital_TelPhone() 

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
     * Returns the value of field 'result_Code'.
     * 
     * @return the value of field 'result_Code'.
    **/
    public java.lang.String getResult_Code()
    {
        return this._result_Code;
    } //-- java.lang.String getResult_Code() 

    /**
     * Returns the value of field 'serviceName'.
     * 
     * @return the value of field 'serviceName'.
    **/
    public java.lang.String getServiceName()
    {
        return this._serviceName;
    } //-- java.lang.String getServiceName() 

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
     * Sets the value of field 'error_Msg'.
     * 
     * @param error_Msg the value of field 'error_Msg'.
    **/
    public void setError_Msg(java.lang.String error_Msg)
    {
        this._error_Msg = error_Msg;
    } //-- void setError_Msg(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Address'.
     * 
     * @param hospital_Address the value of field 'hospital_Address'
    **/
    public void setHospital_Address(java.lang.String hospital_Address)
    {
        this._hospital_Address = hospital_Address;
    } //-- void setHospital_Address(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Image'.
     * 
     * @param hospital_Image the value of field 'hospital_Image'.
    **/
    public void setHospital_Image(java.lang.String hospital_Image)
    {
        this._hospital_Image = hospital_Image;
    } //-- void setHospital_Image(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Introduction'.
     * 
     * @param hospital_Introduction the value of field
     * 'hospital_Introduction'.
    **/
    public void setHospital_Introduction(java.lang.String hospital_Introduction)
    {
        this._hospital_Introduction = hospital_Introduction;
    } //-- void setHospital_Introduction(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Lat'.
     * 
     * @param hospital_Lat the value of field 'hospital_Lat'.
    **/
    public void setHospital_Lat(java.lang.String hospital_Lat)
    {
        this._hospital_Lat = hospital_Lat;
    } //-- void setHospital_Lat(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Lng'.
     * 
     * @param hospital_Lng the value of field 'hospital_Lng'.
    **/
    public void setHospital_Lng(java.lang.String hospital_Lng)
    {
        this._hospital_Lng = hospital_Lng;
    } //-- void setHospital_Lng(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Name'.
     * 
     * @param hospital_Name the value of field 'hospital_Name'.
    **/
    public void setHospital_Name(java.lang.String hospital_Name)
    {
        this._hospital_Name = hospital_Name;
    } //-- void setHospital_Name(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Nav_Image'.
     * 
     * @param hospital_Nav_Image the value of field
     * 'hospital_Nav_Image'.
    **/
    public void setHospital_Nav_Image(java.lang.String hospital_Nav_Image)
    {
        this._hospital_Nav_Image = hospital_Nav_Image;
    } //-- void setHospital_Nav_Image(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Nav_Introduction'.
     * 
     * @param hospital_Nav_Introduction the value of field
     * 'hospital_Nav_Introduction'.
    **/
    public void setHospital_Nav_Introduction(java.lang.String hospital_Nav_Introduction)
    {
        this._hospital_Nav_Introduction = hospital_Nav_Introduction;
    } //-- void setHospital_Nav_Introduction(java.lang.String) 

    /**
     * Sets the value of field 'hospital_Short_Name'.
     * 
     * @param hospital_Short_Name the value of field
     * 'hospital_Short_Name'.
    **/
    public void setHospital_Short_Name(java.lang.String hospital_Short_Name)
    {
        this._hospital_Short_Name = hospital_Short_Name;
    } //-- void setHospital_Short_Name(java.lang.String) 

    /**
     * Sets the value of field 'hospital_TelPhone'.
     * 
     * @param hospital_TelPhone the value of field
     * 'hospital_TelPhone'.
    **/
    public void setHospital_TelPhone(java.lang.String hospital_TelPhone)
    {
        this._hospital_TelPhone = hospital_TelPhone;
    } //-- void setHospital_TelPhone(java.lang.String) 

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
     * Sets the value of field 'result_Code'.
     * 
     * @param result_Code the value of field 'result_Code'.
    **/
    public void setResult_Code(java.lang.String result_Code)
    {
        this._result_Code = result_Code;
    } //-- void setResult_Code(java.lang.String) 

    /**
     * Sets the value of field 'serviceName'.
     * 
     * @param serviceName the value of field 'serviceName'.
    **/
    public void setServiceName(java.lang.String serviceName)
    {
        this._serviceName = serviceName;
    } //-- void setServiceName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
