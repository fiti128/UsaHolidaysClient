package main;

import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class DOMHolidayParser {
	List<Holiday> list = new ArrayList<>();
	Document dom;
	
	public List<Holiday> parseXMLStr(String xmlStr) {
		//parse the xml string and get the dom object
		try {
			parseXmlString(xmlStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get each holiday element and create a Holiday object
		parseDocument();
		// Iterate through the list and print the data
		//printData();
		//return the list
		return list;
	}
	
	
	private void parseDocument() {
		//get the root element
		Element docEle = dom.getDocumentElement();
		//get a node list of <holiday> elements
		NodeList nl = docEle.getElementsByTagName("Holidays");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {
				//get the employee element
				Element el = (Element) nl.item(i);
				// get the Employee object
				Holiday holiday = getHoliday(el);
				// add it to list
				list.add(holiday);
				
			}
		}
	}
	/**
	 * I take an employee element and read the values in, create an Employee 
	 * object and return it
	 * 
	 * @param elem
	 * @return
	 */
	private Holiday getHoliday(Element elem) {
		// for each <employee> element get text or int values of
		// name, id, age and name
		String name = getTextValue(elem, "Name");
		Date date = getDateValue(elem, "Date");
		return new Holiday(name,date);
	}

/**
 * Calls getTextValue and return a Date value
 * @param ele
 * @param tagName
 * @return
 */
	private Date getDateValue(Element ele, String tagName) {
		String dateStr = getTextValue(ele, "Date");
		DateFormat  formatter;
		formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return (Date)formatter.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

/**
 * I take a xml element and the tag name, look for the tag and get the text
 *  content i.e for <employee><name>John</name></employee> xml snippet if the
 *  Element points to employee node and tagName is name I will return John
 *  
 * @param elem
 * @param tagName
 * @return
 */
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}
		return textVal;
	}


	private void parseXmlString(String str) throws Exception {
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		dom = db.parse(new InputSource(new StringReader(str)));
	}
	
}
