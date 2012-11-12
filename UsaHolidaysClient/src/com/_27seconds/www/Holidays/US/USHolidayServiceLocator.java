/**
 * USHolidayServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._27seconds.www.Holidays.US;

public class USHolidayServiceLocator extends org.apache.axis.client.Service implements com._27seconds.www.Holidays.US.USHolidayService {

/**
 * Web service that calculates national holidays for the US.
 */

    public USHolidayServiceLocator() {
    }


    public USHolidayServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public USHolidayServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for USHolidayServiceSoap
    private java.lang.String USHolidayServiceSoap_address = "http://www.holidaywebservice.com/Holidays/US/USHolidayService.asmx";

    public java.lang.String getUSHolidayServiceSoapAddress() {
        return USHolidayServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String USHolidayServiceSoapWSDDServiceName = "USHolidayServiceSoap";

    public java.lang.String getUSHolidayServiceSoapWSDDServiceName() {
        return USHolidayServiceSoapWSDDServiceName;
    }

    public void setUSHolidayServiceSoapWSDDServiceName(java.lang.String name) {
        USHolidayServiceSoapWSDDServiceName = name;
    }

    public com._27seconds.www.Holidays.US.USHolidayServiceSoap getUSHolidayServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(USHolidayServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUSHolidayServiceSoap(endpoint);
    }

    public com._27seconds.www.Holidays.US.USHolidayServiceSoap getUSHolidayServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com._27seconds.www.Holidays.US.USHolidayServiceSoapStub _stub = new com._27seconds.www.Holidays.US.USHolidayServiceSoapStub(portAddress, this);
            _stub.setPortName(getUSHolidayServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUSHolidayServiceSoapEndpointAddress(java.lang.String address) {
        USHolidayServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com._27seconds.www.Holidays.US.USHolidayServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com._27seconds.www.Holidays.US.USHolidayServiceSoapStub _stub = new com._27seconds.www.Holidays.US.USHolidayServiceSoapStub(new java.net.URL(USHolidayServiceSoap_address), this);
                _stub.setPortName(getUSHolidayServiceSoapWSDDServiceName());
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
        if ("USHolidayServiceSoap".equals(inputPortName)) {
            return getUSHolidayServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", "USHolidayService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.27seconds.com/Holidays/US/", "USHolidayServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("USHolidayServiceSoap".equals(portName)) {
            setUSHolidayServiceSoapEndpointAddress(address);
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
