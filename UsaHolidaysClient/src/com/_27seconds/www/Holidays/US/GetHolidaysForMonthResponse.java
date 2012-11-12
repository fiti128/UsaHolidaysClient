/**
 * GetHolidaysForMonthResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._27seconds.www.Holidays.US;

public class GetHolidaysForMonthResponse  implements java.io.Serializable {
    private com._27seconds.www.Holidays.US.GetHolidaysForMonthResponseGetHolidaysForMonthResult getHolidaysForMonthResult;

    public GetHolidaysForMonthResponse() {
    }

    public GetHolidaysForMonthResponse(
           com._27seconds.www.Holidays.US.GetHolidaysForMonthResponseGetHolidaysForMonthResult getHolidaysForMonthResult) {
           this.getHolidaysForMonthResult = getHolidaysForMonthResult;
    }


    /**
     * Gets the getHolidaysForMonthResult value for this GetHolidaysForMonthResponse.
     * 
     * @return getHolidaysForMonthResult
     */
    public com._27seconds.www.Holidays.US.GetHolidaysForMonthResponseGetHolidaysForMonthResult getGetHolidaysForMonthResult() {
        return getHolidaysForMonthResult;
    }


    /**
     * Sets the getHolidaysForMonthResult value for this GetHolidaysForMonthResponse.
     * 
     * @param getHolidaysForMonthResult
     */
    public void setGetHolidaysForMonthResult(com._27seconds.www.Holidays.US.GetHolidaysForMonthResponseGetHolidaysForMonthResult getHolidaysForMonthResult) {
        this.getHolidaysForMonthResult = getHolidaysForMonthResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHolidaysForMonthResponse)) return false;
        GetHolidaysForMonthResponse other = (GetHolidaysForMonthResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHolidaysForMonthResult==null && other.getGetHolidaysForMonthResult()==null) || 
             (this.getHolidaysForMonthResult!=null &&
              this.getHolidaysForMonthResult.equals(other.getGetHolidaysForMonthResult())));
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
        if (getGetHolidaysForMonthResult() != null) {
            _hashCode += getGetHolidaysForMonthResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHolidaysForMonthResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", ">GetHolidaysForMonthResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHolidaysForMonthResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", "GetHolidaysForMonthResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", ">>GetHolidaysForMonthResponse>GetHolidaysForMonthResult"));
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
