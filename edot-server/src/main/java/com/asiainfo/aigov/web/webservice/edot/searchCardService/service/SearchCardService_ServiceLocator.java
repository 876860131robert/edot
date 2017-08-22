/**
 * SearchCardService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.aigov.web.webservice.edot.searchCardService.service;

public class SearchCardService_ServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardService_Service {

    public SearchCardService_ServiceLocator() {
    }


    public SearchCardService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchCardService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CardSearchServiceImplPort
    private java.lang.String CardSearchServiceImplPort_address = "http://10.63.89.232:8080/ctzbmp/services/searchCardService";

    public java.lang.String getCardSearchServiceImplPortAddress() {
        return CardSearchServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CardSearchServiceImplPortWSDDServiceName = "CardSearchServiceImplPort";

    public java.lang.String getCardSearchServiceImplPortWSDDServiceName() {
        return CardSearchServiceImplPortWSDDServiceName;
    }

    public void setCardSearchServiceImplPortWSDDServiceName(java.lang.String name) {
        CardSearchServiceImplPortWSDDServiceName = name;
    }

    public com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardService_PortType getCardSearchServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CardSearchServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardSearchServiceImplPort(endpoint);
    }

    public com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardService_PortType getCardSearchServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardServiceSoapBindingStub _stub = new com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCardSearchServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardSearchServiceImplPortEndpointAddress(java.lang.String address) {
        CardSearchServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardServiceSoapBindingStub _stub = new com.asiainfo.aigov.web.webservice.edot.searchCardService.service.SearchCardServiceSoapBindingStub(new java.net.URL(CardSearchServiceImplPort_address), this);
                _stub.setPortName(getCardSearchServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CardSearchServiceImplPort".equals(inputPortName)) {
            return getCardSearchServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sxhealth.gov.cn/card", "SearchCardService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sxhealth.gov.cn/card", "CardSearchServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CardSearchServiceImplPort".equals(portName)) {
            setCardSearchServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
