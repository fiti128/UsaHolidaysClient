package com._27seconds.www.Holidays.US;

public class USHolidayServiceSoapProxy implements com._27seconds.www.Holidays.US.USHolidayServiceSoap {
  private String _endpoint = null;
  private com._27seconds.www.Holidays.US.USHolidayServiceSoap uSHolidayServiceSoap = null;
  
  public USHolidayServiceSoapProxy() {
    _initUSHolidayServiceSoapProxy();
  }
  
  public USHolidayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initUSHolidayServiceSoapProxy();
  }
  
  private void _initUSHolidayServiceSoapProxy() {
    try {
      uSHolidayServiceSoap = (new com._27seconds.www.Holidays.US.USHolidayServiceLocator()).getUSHolidayServiceSoap();
      if (uSHolidayServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uSHolidayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uSHolidayServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uSHolidayServiceSoap != null)
      ((javax.xml.rpc.Stub)uSHolidayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com._27seconds.www.Holidays.US.USHolidayServiceSoap getUSHolidayServiceSoap() {
    if (uSHolidayServiceSoap == null)
      _initUSHolidayServiceSoapProxy();
    return uSHolidayServiceSoap;
  }
  
  public com._27seconds.www.Holidays.US.GetHolidaysAvailableResponseGetHolidaysAvailableResult getHolidaysAvailable() throws java.rmi.RemoteException{
    if (uSHolidayServiceSoap == null)
      _initUSHolidayServiceSoapProxy();
    return uSHolidayServiceSoap.getHolidaysAvailable();
  }
  
  public java.util.Calendar getHolidayDate(java.lang.String holidayName, int year) throws java.rmi.RemoteException{
    if (uSHolidayServiceSoap == null)
      _initUSHolidayServiceSoapProxy();
    return uSHolidayServiceSoap.getHolidayDate(holidayName, year);
  }
  
  public com._27seconds.www.Holidays.US.GetHolidaysForDateRangeResponseGetHolidaysForDateRangeResult getHolidaysForDateRange(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (uSHolidayServiceSoap == null)
      _initUSHolidayServiceSoapProxy();
    return uSHolidayServiceSoap.getHolidaysForDateRange(startDate, endDate);
  }
  
  public com._27seconds.www.Holidays.US.GetHolidaysForMonthResponseGetHolidaysForMonthResult getHolidaysForMonth(int year, int month) throws java.rmi.RemoteException{
    if (uSHolidayServiceSoap == null)
      _initUSHolidayServiceSoapProxy();
    return uSHolidayServiceSoap.getHolidaysForMonth(year, month);
  }
  
  public com._27seconds.www.Holidays.US.GetHolidaysForYearResponseGetHolidaysForYearResult getHolidaysForYear(int year) throws java.rmi.RemoteException{
    if (uSHolidayServiceSoap == null)
      _initUSHolidayServiceSoapProxy();
    return uSHolidayServiceSoap.getHolidaysForYear(year);
  }
  
  
}