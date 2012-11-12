/**
 * GetHolidayDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._27seconds.www.Holidays.US;

public class GetHolidayDateResponse  implements java.io.Serializable {
    private java.util.Calendar getHolidayDateResult;

    public GetHolidayDateResponse() {
    }

    public GetHolidayDateResponse(
           java.util.Calendar getHolidayDateResult) {
           this.getHolidayDateResult = getHolidayDateResult;
    }


    /**
     * Gets the getHolidayDateResult value for this GetHolidayDateResponse.
     * 
     * @return getHolidayDateResult
     */
    public java.util.Calendar getGetHolidayDateResult() {
        return getHolidayDateResult;
    }


    /**
     * Sets the getHolidayDateResult value for this GetHolidayDateResponse.
     * 
     * @param getHolidayDateResult
     */
    public void setGetHolidayDateResult(java.util.Calendar getHolidayDateResult) {
        this.getHolidayDateResult = getHolidayDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHolidayDateResponse)) return false;
        GetHolidayDateResponse other = (GetHolidayDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHolidayDateResult==null && other.getGetHolidayDateResult()==null) || 
             (this.getHolidayDateResult!=null &&
              this.getHolidayDateResult.equals(other.getGetHolidayDateResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetHolidayDateResult() != null) {
            _hashCode += getGetHolidayDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHolidayDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", ">GetHolidayDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHolidayDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", "GetHolidayDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
