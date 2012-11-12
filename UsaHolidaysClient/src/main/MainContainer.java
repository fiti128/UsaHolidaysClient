package main;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.message.MessageElement;

import com._27seconds.www.Holidays.US.GetHolidaysForYearResponseGetHolidaysForYearResult;
import com._27seconds.www.Holidays.US.USHolidayServiceSoapProxy;

public class MainContainer {
	public static void main(String[] args) {
		List<Holiday> list = new ArrayList<>();
		USHolidayWebService webService = new USHolidayWebService();
		String xmlStr = webService.getHolidayXml(2012);
		if (xmlStr != null) {
			DOMHolidayParser dom = new DOMHolidayParser();
			list = dom.parseXMLStr(xmlStr);
			printData(list);
		}
	}
	private static void printData(List<Holiday> list) {
		System.out.println("No of Holidays: " +list.size() + ".");
		Iterator<Holiday> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
