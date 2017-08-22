/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req;

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
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _cardNo;

    private java.lang.String _payStatus;

    private java.lang.String _terminalTranNo;

    private java.lang.String _startDate;

    private java.lang.String _endDate;

    private java.lang.String _currentPage;

    private java.lang.String _pageSize;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'cardNo'.
     * 
     * @return the value of field 'cardNo'.
    **/
    public java.lang.String getCardNo()
    {
        return this._cardNo;
    } //-- java.lang.String getCardNo() 

    /**
     * Returns the value of field 'currentPage'.
     * 
     * @return the value of field 'currentPage'.
    **/
    public java.lang.String getCurrentPage()
    {
        return this._currentPage;
    } //-- java.lang.String getCurrentPage() 

    /**
     * Returns the value of field 'endDate'.
     * 
     * @return the value of field 'endDate'.
    **/
    public java.lang.String getEndDate()
    {
        return this._endDate;
    } //-- java.lang.String getEndDate() 

    /**
     * Returns the value of field 'pageSize'.
     * 
     * @return the value of field 'pageSize'.
    **/
    public java.lang.String getPageSize()
    {
        return this._pageSize;
    } //-- java.lang.String getPageSize() 

    /**
     * Returns the value of field 'payStatus'.
     * 
     * @return the value of field 'payStatus'.
    **/
    public java.lang.String getPayStatus()
    {
        return this._payStatus;
    } //-- java.lang.String getPayStatus() 

    /**
     * Returns the value of field 'startDate'.
     * 
     * @return the value of field 'startDate'.
    **/
    public java.lang.String getStartDate()
    {
        return this._startDate;
    } //-- java.lang.String getStartDate() 

    /**
     * Returns the value of field 'terminalTranNo'.
     * 
     * @return the value of field 'terminalTranNo'.
    **/
    public java.lang.String getTerminalTranNo()
    {
        return this._terminalTranNo;
    } //-- java.lang.String getTerminalTranNo() 

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
     * Sets the value of field 'cardNo'.
     * 
     * @param cardNo the value of field 'cardNo'.
    **/
    public void setCardNo(java.lang.String cardNo)
    {
        this._cardNo = cardNo;
    } //-- void setCardNo(java.lang.String) 

    /**
     * Sets the value of field 'currentPage'.
     * 
     * @param currentPage the value of field 'currentPage'.
    **/
    public void setCurrentPage(java.lang.String currentPage)
    {
        this._currentPage = currentPage;
    } //-- void setCurrentPage(java.lang.String) 

    /**
     * Sets the value of field 'endDate'.
     * 
     * @param endDate the value of field 'endDate'.
    **/
    public void setEndDate(java.lang.String endDate)
    {
        this._endDate = endDate;
    } //-- void setEndDate(java.lang.String) 

    /**
     * Sets the value of field 'pageSize'.
     * 
     * @param pageSize the value of field 'pageSize'.
    **/
    public void setPageSize(java.lang.String pageSize)
    {
        this._pageSize = pageSize;
    } //-- void setPageSize(java.lang.String) 

    /**
     * Sets the value of field 'payStatus'.
     * 
     * @param payStatus the value of field 'payStatus'.
    **/
    public void setPayStatus(java.lang.String payStatus)
    {
        this._payStatus = payStatus;
    } //-- void setPayStatus(java.lang.String) 

    /**
     * Sets the value of field 'startDate'.
     * 
     * @param startDate the value of field 'startDate'.
    **/
    public void setStartDate(java.lang.String startDate)
    {
        this._startDate = startDate;
    } //-- void setStartDate(java.lang.String) 

    /**
     * Sets the value of field 'terminalTranNo'.
     * 
     * @param terminalTranNo the value of field 'terminalTranNo'.
    **/
    public void setTerminalTranNo(java.lang.String terminalTranNo)
    {
        this._terminalTranNo = terminalTranNo;
    } //-- void setTerminalTranNo(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request) Unmarshaller.unmarshal(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request.class, reader);
    } //-- com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
