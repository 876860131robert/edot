/**
 * CardSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.aigov.web.webservice.edot.searchCardService.service;

public class CardSearchResult  extends com.asiainfo.aigov.web.webservice.edot.searchCardService.service.WSResult  implements java.io.Serializable {
    private java.lang.String kxx;

    private java.lang.String sfzhm;

    private java.lang.String xm;

    private java.lang.String xnhkh;

    public CardSearchResult() {
    }

    public CardSearchResult(
           java.lang.String message,
           int resultCode,
           java.lang.String kxx,
           java.lang.String sfzhm,
           java.lang.String xm,
           java.lang.String xnhkh) {
        super(
            message,
            resultCode);
        this.kxx = kxx;
        this.sfzhm = sfzhm;
        this.xm = xm;
        this.xnhkh = xnhkh;
    }


    /**
     * Gets the kxx value for this CardSearchResult.
     * 
     * @return kxx
     */
    public java.lang.String getKxx() {
        return kxx;
    }


    /**
     * Sets the kxx value for this CardSearchResult.
     * 
     * @param kxx
     */
    public void setKxx(java.lang.String kxx) {
        this.kxx = kxx;
    }


    /**
     * Gets the sfzhm value for this CardSearchResult.
     * 
     * @return sfzhm
     */
    public java.lang.String getSfzhm() {
        return sfzhm;
    }


    /**
     * Sets the sfzhm value for this CardSearchResult.
     * 
     * @param sfzhm
     */
    public void setSfzhm(java.lang.String sfzhm) {
        this.sfzhm = sfzhm;
    }


    /**
     * Gets the xm value for this CardSearchResult.
     * 
     * @return xm
     */
    public java.lang.String getXm() {
        return xm;
    }


    /**
     * Sets the xm value for this CardSearchResult.
     * 
     * @param xm
     */
    public void setXm(java.lang.String xm) {
        this.xm = xm;
    }


    /**
     * Gets the xnhkh value for this CardSearchResult.
     * 
     * @return xnhkh
     */
    public java.lang.String getXnhkh() {
        return xnhkh;
    }


    /**
     * Sets the xnhkh value for this CardSearchResult.
     * 
     * @param xnhkh
     */
    public void setXnhkh(java.lang.String xnhkh) {
        this.xnhkh = xnhkh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardSearchResult)) return false;
        CardSearchResult other = (CardSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.kxx==null && other.getKxx()==null) || 
             (this.kxx!=null &&
              this.kxx.equals(other.getKxx()))) &&
            ((this.sfzhm==null && other.getSfzhm()==null) || 
             (this.sfzhm!=null &&
              this.sfzhm.equals(other.getSfzhm()))) &&
            ((this.xm==null && other.getXm()==null) || 
             (this.xm!=null &&
              this.xm.equals(other.getXm()))) &&
            ((this.xnhkh==null && other.getXnhkh()==null) || 
             (this.xnhkh!=null &&
              this.xnhkh.equals(other.getXnhkh())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getKxx() != null) {
            _hashCode += getKxx().hashCode();
        }
        if (getSfzhm() != null) {
            _hashCode += getSfzhm().hashCode();
        }
        if (getXm() != null) {
            _hashCode += getXm().hashCode();
        }
        if (getXnhkh() != null) {
            _hashCode += getXnhkh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sxhealth.gov.cn/card", "CardSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kxx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kxx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sfzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xnhkh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xnhkh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
