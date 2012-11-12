/**
 * GetHolidayDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._27seconds.www.Holidays.US;

public class GetHolidayDate  implements java.io.Serializable {
    private java.lang.String holidayName;

    private int year;

    public GetHolidayDate() {
    }

    public GetHolidayDate(
           java.lang.String holidayName,
           int year) {
           this.holidayName = holidayName;
           this.year = year;
    }


    /**
     * Gets the holidayName value for this GetHolidayDate.
     * 
     * @return holidayName
     */
    public java.lang.String getHolidayName() {
        return holidayName;
    }


    /**
     * Sets the holidayName value for this GetHolidayDate.
     * 
     * @param holidayName
     */
    public void setHolidayName(java.lang.String holidayName) {
        this.holidayName = holidayName;
    }


    /**
     * Gets the year value for this GetHolidayDate.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this GetHolidayDate.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHolidayDate)) return false;
        GetHolidayDate other = (GetHolidayDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.holidayName==null && other.getHolidayName()==null) || 
             (this.holidayName!=null &&
              this.holidayName.equals(other.getHolidayName()))) &&
            this.year == other.getYear();
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
        if (getHolidayName() != null) {
            _hashCode += getHolidayName().hashCode();
        }
        _hashCode += getYear();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHolidayDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", ">GetHolidayDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", "holidayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
