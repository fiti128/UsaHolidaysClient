package main;

import java.util.Date;

public class Holiday {
String name;
Date date;

	public Holiday(String name, Date date) {
		super();
		this.name = name; this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Holiday [name=" + name + ", date=" + date + "]";
	}
	
}
