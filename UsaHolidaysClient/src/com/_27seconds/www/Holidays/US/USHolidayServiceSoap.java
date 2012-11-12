/**
 * USHolidayServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._27seconds.www.Holidays.US;

public interface USHolidayServiceSoap extends java.rmi.Remote {

    /**
     * Get the available holidays.
     */
    public com._27seconds.www.Holidays.US.GetHolidaysAvailableResponseGetHolidaysAvailableResult getHolidaysAvailable() throws java.rmi.RemoteException;

    /**
     * Get the date of a specific holiday.
     */
    public java.util.Calendar getHolidayDate(java.lang.String holidayName, int year) throws java.rmi.RemoteException;

    /**
     * Get the holidays for a date range.
     */
    public com._27seconds.www.Holidays.US.GetHolidaysForDateRangeResponseGetHolidaysForDateRangeResult getHolidaysForDateRange(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;

    /**
     * Get the holidays for a specific month.
     */
    public com._27seconds.www.Holidays.US.GetHolidaysForMonthResponseGetHolidaysForMonthResult getHolidaysForMonth(int year, int month) throws java.rmi.RemoteException;

    /**
     * Get the holidays for an entire year.
     */
    public com._27seconds.www.Holidays.US.GetHolidaysForYearResponseGetHolidaysForYearResult getHolidaysForYear(int year) throws java.rmi.RemoteException;
}
