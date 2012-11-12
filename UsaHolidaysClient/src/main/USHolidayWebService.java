package main;

import java.rmi.RemoteException;

import org.apache.axis.message.MessageElement;

import com._27seconds.www.Holidays.US.GetHolidaysForYearResponseGetHolidaysForYearResult;
import com._27seconds.www.Holidays.US.USHolidayServiceSoapProxy;

public class USHolidayWebService {
 public String getHolidayXml(int year) {
	 USHolidayServiceSoapProxy sp = new USHolidayServiceSoapProxy();
		try {
			GetHolidaysForYearResponseGetHolidaysForYearResult result = sp.
					getHolidaysForYear(year);
			MessageElement[] me = result.get_any();
			if (me.length >1) {
				return me[1].toString();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
 }
}
