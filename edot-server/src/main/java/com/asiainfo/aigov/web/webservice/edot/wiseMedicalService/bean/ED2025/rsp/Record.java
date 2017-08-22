/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp;

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

    private java.lang.String _healthexamTestId;

    private java.lang.String _testNo;

    private java.lang.String _sampleSpecies;

    private java.lang.String _gatherDate;

    private java.lang.String _testType;

    private java.lang.String _testName;

    private java.lang.String _reportDate;

    private java.lang.String _reportDoctorName;

    private java.lang.String _healthexamTestReportId;

    private java.lang.String _healthArchivesNo;

    private java.lang.String _orgCode;

    private java.lang.String _healthexamFormNo;

    private java.lang.String _testReportNo;

    private java.lang.String _sampleNo;

    private java.lang.String _orderNo;

    private java.lang.String _testItemName;

    private java.lang.String _testItemCode;

    private java.lang.String _testResultCode;

    private java.lang.String _testResultName;

    private java.lang.String _testResultValue;

    private java.lang.String _testResultUnit;

    private java.lang.String _referenceUpperLimit;

    private java.lang.String _referenceLowerLimit;

    private java.lang.String _referenceRange;

    private java.lang.String _qualitativeResult;

    private java.lang.String _testResultFlag;

    private java.lang.String _createDtime;

    private java.lang.String _modifyDtime;


      //----------------/
     //- Constructors -/
    //----------------/

    public Record() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'createDtime'.
     * 
     * @return the value of field 'createDtime'.
    **/
    public java.lang.String getCreateDtime()
    {
        return this._createDtime;
    } //-- java.lang.String getCreateDtime() 

    /**
     * Returns the value of field 'gatherDate'.
     * 
     * @return the value of field 'gatherDate'.
    **/
    public java.lang.String getGatherDate()
    {
        return this._gatherDate;
    } //-- java.lang.String getGatherDate() 

    /**
     * Returns the value of field 'healthArchivesNo'.
     * 
     * @return the value of field 'healthArchivesNo'.
    **/
    public java.lang.String getHealthArchivesNo()
    {
        return this._healthArchivesNo;
    } //-- java.lang.String getHealthArchivesNo() 

    /**
     * Returns the value of field 'healthexamFormNo'.
     * 
     * @return the value of field 'healthexamFormNo'.
    **/
    public java.lang.String getHealthexamFormNo()
    {
        return this._healthexamFormNo;
    } //-- java.lang.String getHealthexamFormNo() 

    /**
     * Returns the value of field 'healthexamTestId'.
     * 
     * @return the value of field 'healthexamTestId'.
    **/
    public java.lang.String getHealthexamTestId()
    {
        return this._healthexamTestId;
    } //-- java.lang.String getHealthexamTestId() 

    /**
     * Returns the value of field 'healthexamTestReportId'.
     * 
     * @return the value of field 'healthexamTestReportId'.
    **/
    public java.lang.String getHealthexamTestReportId()
    {
        return this._healthexamTestReportId;
    } //-- java.lang.String getHealthexamTestReportId() 

    /**
     * Returns the value of field 'modifyDtime'.
     * 
     * @return the value of field 'modifyDtime'.
    **/
    public java.lang.String getModifyDtime()
    {
        return this._modifyDtime;
    } //-- java.lang.String getModifyDtime() 

    /**
     * Returns the value of field 'orderNo'.
     * 
     * @return the value of field 'orderNo'.
    **/
    public java.lang.String getOrderNo()
    {
        return this._orderNo;
    } //-- java.lang.String getOrderNo() 

    /**
     * Returns the value of field 'orgCode'.
     * 
     * @return the value of field 'orgCode'.
    **/
    public java.lang.String getOrgCode()
    {
        return this._orgCode;
    } //-- java.lang.String getOrgCode() 

    /**
     * Returns the value of field 'qualitativeResult'.
     * 
     * @return the value of field 'qualitativeResult'.
    **/
    public java.lang.String getQualitativeResult()
    {
        return this._qualitativeResult;
    } //-- java.lang.String getQualitativeResult() 

    /**
     * Returns the value of field 'referenceLowerLimit'.
     * 
     * @return the value of field 'referenceLowerLimit'.
    **/
    public java.lang.String getReferenceLowerLimit()
    {
        return this._referenceLowerLimit;
    } //-- java.lang.String getReferenceLowerLimit() 

    /**
     * Returns the value of field 'referenceRange'.
     * 
     * @return the value of field 'referenceRange'.
    **/
    public java.lang.String getReferenceRange()
    {
        return this._referenceRange;
    } //-- java.lang.String getReferenceRange() 

    /**
     * Returns the value of field 'referenceUpperLimit'.
     * 
     * @return the value of field 'referenceUpperLimit'.
    **/
    public java.lang.String getReferenceUpperLimit()
    {
        return this._referenceUpperLimit;
    } //-- java.lang.String getReferenceUpperLimit() 

    /**
     * Returns the value of field 'reportDate'.
     * 
     * @return the value of field 'reportDate'.
    **/
    public java.lang.String getReportDate()
    {
        return this._reportDate;
    } //-- java.lang.String getReportDate() 

    /**
     * Returns the value of field 'reportDoctorName'.
     * 
     * @return the value of field 'reportDoctorName'.
    **/
    public java.lang.String getReportDoctorName()
    {
        return this._reportDoctorName;
    } //-- java.lang.String getReportDoctorName() 

    /**
     * Returns the value of field 'sampleNo'.
     * 
     * @return the value of field 'sampleNo'.
    **/
    public java.lang.String getSampleNo()
    {
        return this._sampleNo;
    } //-- java.lang.String getSampleNo() 

    /**
     * Returns the value of field 'sampleSpecies'.
     * 
     * @return the value of field 'sampleSpecies'.
    **/
    public java.lang.String getSampleSpecies()
    {
        return this._sampleSpecies;
    } //-- java.lang.String getSampleSpecies() 

    /**
     * Returns the value of field 'testItemCode'.
     * 
     * @return the value of field 'testItemCode'.
    **/
    public java.lang.String getTestItemCode()
    {
        return this._testItemCode;
    } //-- java.lang.String getTestItemCode() 

    /**
     * Returns the value of field 'testItemName'.
     * 
     * @return the value of field 'testItemName'.
    **/
    public java.lang.String getTestItemName()
    {
        return this._testItemName;
    } //-- java.lang.String getTestItemName() 

    /**
     * Returns the value of field 'testName'.
     * 
     * @return the value of field 'testName'.
    **/
    public java.lang.String getTestName()
    {
        return this._testName;
    } //-- java.lang.String getTestName() 

    /**
     * Returns the value of field 'testNo'.
     * 
     * @return the value of field 'testNo'.
    **/
    public java.lang.String getTestNo()
    {
        return this._testNo;
    } //-- java.lang.String getTestNo() 

    /**
     * Returns the value of field 'testReportNo'.
     * 
     * @return the value of field 'testReportNo'.
    **/
    public java.lang.String getTestReportNo()
    {
        return this._testReportNo;
    } //-- java.lang.String getTestReportNo() 

    /**
     * Returns the value of field 'testResultCode'.
     * 
     * @return the value of field 'testResultCode'.
    **/
    public java.lang.String getTestResultCode()
    {
        return this._testResultCode;
    } //-- java.lang.String getTestResultCode() 

    /**
     * Returns the value of field 'testResultFlag'.
     * 
     * @return the value of field 'testResultFlag'.
    **/
    public java.lang.String getTestResultFlag()
    {
        return this._testResultFlag;
    } //-- java.lang.String getTestResultFlag() 

    /**
     * Returns the value of field 'testResultName'.
     * 
     * @return the value of field 'testResultName'.
    **/
    public java.lang.String getTestResultName()
    {
        return this._testResultName;
    } //-- java.lang.String getTestResultName() 

    /**
     * Returns the value of field 'testResultUnit'.
     * 
     * @return the value of field 'testResultUnit'.
    **/
    public java.lang.String getTestResultUnit()
    {
        return this._testResultUnit;
    } //-- java.lang.String getTestResultUnit() 

    /**
     * Returns the value of field 'testResultValue'.
     * 
     * @return the value of field 'testResultValue'.
    **/
    public java.lang.String getTestResultValue()
    {
        return this._testResultValue;
    } //-- java.lang.String getTestResultValue() 

    /**
     * Returns the value of field 'testType'.
     * 
     * @return the value of field 'testType'.
    **/
    public java.lang.String getTestType()
    {
        return this._testType;
    } //-- java.lang.String getTestType() 

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
     * Sets the value of field 'createDtime'.
     * 
     * @param createDtime the value of field 'createDtime'.
    **/
    public void setCreateDtime(java.lang.String createDtime)
    {
        this._createDtime = createDtime;
    } //-- void setCreateDtime(java.lang.String) 

    /**
     * Sets the value of field 'gatherDate'.
     * 
     * @param gatherDate the value of field 'gatherDate'.
    **/
    public void setGatherDate(java.lang.String gatherDate)
    {
        this._gatherDate = gatherDate;
    } //-- void setGatherDate(java.lang.String) 

    /**
     * Sets the value of field 'healthArchivesNo'.
     * 
     * @param healthArchivesNo the value of field 'healthArchivesNo'
    **/
    public void setHealthArchivesNo(java.lang.String healthArchivesNo)
    {
        this._healthArchivesNo = healthArchivesNo;
    } //-- void setHealthArchivesNo(java.lang.String) 

    /**
     * Sets the value of field 'healthexamFormNo'.
     * 
     * @param healthexamFormNo the value of field 'healthexamFormNo'
    **/
    public void setHealthexamFormNo(java.lang.String healthexamFormNo)
    {
        this._healthexamFormNo = healthexamFormNo;
    } //-- void setHealthexamFormNo(java.lang.String) 

    /**
     * Sets the value of field 'healthexamTestId'.
     * 
     * @param healthexamTestId the value of field 'healthexamTestId'
    **/
    public void setHealthexamTestId(java.lang.String healthexamTestId)
    {
        this._healthexamTestId = healthexamTestId;
    } //-- void setHealthexamTestId(java.lang.String) 

    /**
     * Sets the value of field 'healthexamTestReportId'.
     * 
     * @param healthexamTestReportId the value of field
     * 'healthexamTestReportId'.
    **/
    public void setHealthexamTestReportId(java.lang.String healthexamTestReportId)
    {
        this._healthexamTestReportId = healthexamTestReportId;
    } //-- void setHealthexamTestReportId(java.lang.String) 

    /**
     * Sets the value of field 'modifyDtime'.
     * 
     * @param modifyDtime the value of field 'modifyDtime'.
    **/
    public void setModifyDtime(java.lang.String modifyDtime)
    {
        this._modifyDtime = modifyDtime;
    } //-- void setModifyDtime(java.lang.String) 

    /**
     * Sets the value of field 'orderNo'.
     * 
     * @param orderNo the value of field 'orderNo'.
    **/
    public void setOrderNo(java.lang.String orderNo)
    {
        this._orderNo = orderNo;
    } //-- void setOrderNo(java.lang.String) 

    /**
     * Sets the value of field 'orgCode'.
     * 
     * @param orgCode the value of field 'orgCode'.
    **/
    public void setOrgCode(java.lang.String orgCode)
    {
        this._orgCode = orgCode;
    } //-- void setOrgCode(java.lang.String) 

    /**
     * Sets the value of field 'qualitativeResult'.
     * 
     * @param qualitativeResult the value of field
     * 'qualitativeResult'.
    **/
    public void setQualitativeResult(java.lang.String qualitativeResult)
    {
        this._qualitativeResult = qualitativeResult;
    } //-- void setQualitativeResult(java.lang.String) 

    /**
     * Sets the value of field 'referenceLowerLimit'.
     * 
     * @param referenceLowerLimit the value of field
     * 'referenceLowerLimit'.
    **/
    public void setReferenceLowerLimit(java.lang.String referenceLowerLimit)
    {
        this._referenceLowerLimit = referenceLowerLimit;
    } //-- void setReferenceLowerLimit(java.lang.String) 

    /**
     * Sets the value of field 'referenceRange'.
     * 
     * @param referenceRange the value of field 'referenceRange'.
    **/
    public void setReferenceRange(java.lang.String referenceRange)
    {
        this._referenceRange = referenceRange;
    } //-- void setReferenceRange(java.lang.String) 

    /**
     * Sets the value of field 'referenceUpperLimit'.
     * 
     * @param referenceUpperLimit the value of field
     * 'referenceUpperLimit'.
    **/
    public void setReferenceUpperLimit(java.lang.String referenceUpperLimit)
    {
        this._referenceUpperLimit = referenceUpperLimit;
    } //-- void setReferenceUpperLimit(java.lang.String) 

    /**
     * Sets the value of field 'reportDate'.
     * 
     * @param reportDate the value of field 'reportDate'.
    **/
    public void setReportDate(java.lang.String reportDate)
    {
        this._reportDate = reportDate;
    } //-- void setReportDate(java.lang.String) 

    /**
     * Sets the value of field 'reportDoctorName'.
     * 
     * @param reportDoctorName the value of field 'reportDoctorName'
    **/
    public void setReportDoctorName(java.lang.String reportDoctorName)
    {
        this._reportDoctorName = reportDoctorName;
    } //-- void setReportDoctorName(java.lang.String) 

    /**
     * Sets the value of field 'sampleNo'.
     * 
     * @param sampleNo the value of field 'sampleNo'.
    **/
    public void setSampleNo(java.lang.String sampleNo)
    {
        this._sampleNo = sampleNo;
    } //-- void setSampleNo(java.lang.String) 

    /**
     * Sets the value of field 'sampleSpecies'.
     * 
     * @param sampleSpecies the value of field 'sampleSpecies'.
    **/
    public void setSampleSpecies(java.lang.String sampleSpecies)
    {
        this._sampleSpecies = sampleSpecies;
    } //-- void setSampleSpecies(java.lang.String) 

    /**
     * Sets the value of field 'testItemCode'.
     * 
     * @param testItemCode the value of field 'testItemCode'.
    **/
    public void setTestItemCode(java.lang.String testItemCode)
    {
        this._testItemCode = testItemCode;
    } //-- void setTestItemCode(java.lang.String) 

    /**
     * Sets the value of field 'testItemName'.
     * 
     * @param testItemName the value of field 'testItemName'.
    **/
    public void setTestItemName(java.lang.String testItemName)
    {
        this._testItemName = testItemName;
    } //-- void setTestItemName(java.lang.String) 

    /**
     * Sets the value of field 'testName'.
     * 
     * @param testName the value of field 'testName'.
    **/
    public void setTestName(java.lang.String testName)
    {
        this._testName = testName;
    } //-- void setTestName(java.lang.String) 

    /**
     * Sets the value of field 'testNo'.
     * 
     * @param testNo the value of field 'testNo'.
    **/
    public void setTestNo(java.lang.String testNo)
    {
        this._testNo = testNo;
    } //-- void setTestNo(java.lang.String) 

    /**
     * Sets the value of field 'testReportNo'.
     * 
     * @param testReportNo the value of field 'testReportNo'.
    **/
    public void setTestReportNo(java.lang.String testReportNo)
    {
        this._testReportNo = testReportNo;
    } //-- void setTestReportNo(java.lang.String) 

    /**
     * Sets the value of field 'testResultCode'.
     * 
     * @param testResultCode the value of field 'testResultCode'.
    **/
    public void setTestResultCode(java.lang.String testResultCode)
    {
        this._testResultCode = testResultCode;
    } //-- void setTestResultCode(java.lang.String) 

    /**
     * Sets the value of field 'testResultFlag'.
     * 
     * @param testResultFlag the value of field 'testResultFlag'.
    **/
    public void setTestResultFlag(java.lang.String testResultFlag)
    {
        this._testResultFlag = testResultFlag;
    } //-- void setTestResultFlag(java.lang.String) 

    /**
     * Sets the value of field 'testResultName'.
     * 
     * @param testResultName the value of field 'testResultName'.
    **/
    public void setTestResultName(java.lang.String testResultName)
    {
        this._testResultName = testResultName;
    } //-- void setTestResultName(java.lang.String) 

    /**
     * Sets the value of field 'testResultUnit'.
     * 
     * @param testResultUnit the value of field 'testResultUnit'.
    **/
    public void setTestResultUnit(java.lang.String testResultUnit)
    {
        this._testResultUnit = testResultUnit;
    } //-- void setTestResultUnit(java.lang.String) 

    /**
     * Sets the value of field 'testResultValue'.
     * 
     * @param testResultValue the value of field 'testResultValue'.
    **/
    public void setTestResultValue(java.lang.String testResultValue)
    {
        this._testResultValue = testResultValue;
    } //-- void setTestResultValue(java.lang.String) 

    /**
     * Sets the value of field 'testType'.
     * 
     * @param testType the value of field 'testType'.
    **/
    public void setTestType(java.lang.String testType)
    {
        this._testType = testType;
    } //-- void setTestType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Record unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
