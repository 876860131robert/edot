/**
 * SearchCardService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.aigov.web.webservice.edot.searchCardService.service;

public interface SearchCardService_PortType extends java.rmi.Remote {
    public com.asiainfo.aigov.web.webservice.edot.searchCardService.service.WSResult syncCardInfo(java.lang.String username, java.lang.String password, com.asiainfo.aigov.web.webservice.edot.searchCardService.service.CardInfo cardInfo, com.asiainfo.aigov.web.webservice.edot.searchCardService.service.People peopleInfo) throws java.rmi.RemoteException;
    public com.asiainfo.aigov.web.webservice.edot.searchCardService.service.CardSearchResult searchCardStatus(java.lang.String xnhkh, java.lang.String sfzhm) throws java.rmi.RemoteException;
}
