/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.mapping.AccessMode;
import org.exolab.castor.mapping.ClassDescriptor;
import org.exolab.castor.mapping.FieldDescriptor;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.FieldValidator;
import org.exolab.castor.xml.TypeValidator;
import org.exolab.castor.xml.XMLFieldDescriptor;
import org.exolab.castor.xml.handlers.*;
import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
import org.exolab.castor.xml.validators.*;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Result_DataDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String nsPrefix;

    private java.lang.String nsURI;

    private java.lang.String xmlName;

    private org.exolab.castor.xml.XMLFieldDescriptor identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result_DataDescriptor() {
        super();
        xmlName = "Result_Data";
        
        //-- set grouping compositor
        setCompositorAsSequence();
        XMLFieldDescriptorImpl  desc           = null;
        XMLFieldHandler         handler        = null;
        FieldValidator          fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _patientId
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_patientId", "patientId", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Result_Data target = (Result_Data) object;
                return target.getPatientId();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Result_Data target = (Result_Data) object;
                    target.setPatientId( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _patientId
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(32);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_defaultFlag", "defaultFlag", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
        	public java.lang.Object getValue( java.lang.Object object ) 
        			throws IllegalStateException
        	{
        		Result_Data target = (Result_Data) object;
        		return target.getDefaultFlag();
        	}
        	public void setValue( java.lang.Object object, java.lang.Object value) 
        			throws IllegalStateException, IllegalArgumentException
        	{
        		try {
        			Result_Data target = (Result_Data) object;
        			target.setDefaultFlag( (java.lang.String) value);
        		}
        		catch (Exception ex) {
        			throw new IllegalStateException(ex.toString());
        		}
        	}
        	public java.lang.Object newInstance( java.lang.Object parent ) {
        		return null;
        	}
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _patientId
        fieldValidator = new FieldValidator();
        { //-- local scope
        	StringValidator sv = new StringValidator();
        	sv.setMaxLength(256);
        	sv.setWhiteSpace("preserve");
        	fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _patientName
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_patientName", "patientName", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Result_Data target = (Result_Data) object;
                return target.getPatientName();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Result_Data target = (Result_Data) object;
                    target.setPatientName( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _patientName
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(256);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _sex
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_sex", "sex", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Result_Data target = (Result_Data) object;
                return target.getSex();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Result_Data target = (Result_Data) object;
                    target.setSex( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _sex
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(32);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _phoneNum
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_phoneNum", "phoneNum", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Result_Data target = (Result_Data) object;
                return target.getPhoneNum();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Result_Data target = (Result_Data) object;
                    target.setPhoneNum( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _phoneNum
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(32);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _birthDate
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_birthDate", "birthDate", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Result_Data target = (Result_Data) object;
                return target.getBirthDate();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Result_Data target = (Result_Data) object;
                    target.setBirthDate( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _birthDate
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(32);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _certCode
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_certCode", "certCode", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Result_Data target = (Result_Data) object;
                return target.getCertCode();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Result_Data target = (Result_Data) object;
                    target.setCertCode( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _certCode
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(32);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_DataDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
    **/
    public org.exolab.castor.mapping.AccessMode getAccessMode()
    {
        return null;
    } //-- org.exolab.castor.mapping.AccessMode getAccessMode() 

    /**
    **/
    public org.exolab.castor.mapping.ClassDescriptor getExtends()
    {
        return null;
    } //-- org.exolab.castor.mapping.ClassDescriptor getExtends() 

    /**
    **/
    public org.exolab.castor.mapping.FieldDescriptor getIdentity()
    {
        return identity;
    } //-- org.exolab.castor.mapping.FieldDescriptor getIdentity() 

    /**
    **/
    public java.lang.Class getJavaClass()
    {
        return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Result_Data.class;
    } //-- java.lang.Class getJavaClass() 

    /**
    **/
    public java.lang.String getNameSpacePrefix()
    {
        return nsPrefix;
    } //-- java.lang.String getNameSpacePrefix() 

    /**
    **/
    public java.lang.String getNameSpaceURI()
    {
        return nsURI;
    } //-- java.lang.String getNameSpaceURI() 

    /**
    **/
    public org.exolab.castor.xml.TypeValidator getValidator()
    {
        return this;
    } //-- org.exolab.castor.xml.TypeValidator getValidator() 

    /**
    **/
    public java.lang.String getXMLName()
    {
        return xmlName;
    } //-- java.lang.String getXMLName() 

}
