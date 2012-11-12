/**
 * USHolidayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._27seconds.www.Holidays.US;

public interface USHolidayService extends javax.xml.rpc.Service {

/**
 * Web service that calculates national holidays for the US.
 */
    public java.lang.String getUSHolidayServiceSoapAddress();

    public com._27seconds.www.Holidays.US.USHolidayServiceSoap getUSHolidayServiceSoap() throws javax.xml.rpc.ServiceException;

    public com._27seconds.www.Holidays.US.USHolidayServiceSoap getUSHolidayServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
