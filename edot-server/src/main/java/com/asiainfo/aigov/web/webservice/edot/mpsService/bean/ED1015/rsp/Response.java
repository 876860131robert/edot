/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp;

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

    private Result_Data _result_Data;


      //----------------/
     //- Constructors -/
    //----------------/

    public Response() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response()


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
     * Returns the value of field 'result_Code'.
     * 
     * @return the value of field 'result_Code'.
    **/
    public java.lang.String getResult_Code()
    {
        return this._result_Code;
    } //-- java.lang.String getResult_Code() 

    /**
     * Returns the value of field 'result_Data'.
     * 
     * @return the value of field 'result_Data'.
    **/
    public Result_Data getResult_Data()
    {
        return this._result_Data;
    } //-- Result_Data getResult_Data() 

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
     * Sets the value of field 'result_Code'.
     * 
     * @param result_Code the value of field 'result_Code'.
    **/
    public void setResult_Code(java.lang.String result_Code)
    {
        this._result_Code = result_Code;
    } //-- void setResult_Code(java.lang.String) 

    /**
     * Sets the value of field 'result_Data'.
     * 
     * @param result_Data the value of field 'result_Data'.
    **/
    public void setResult_Data(Result_Data result_Data)
    {
        this._result_Data = result_Data;
    } //-- void setResult_Data(Result_Data) 

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
    public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
