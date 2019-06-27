package com.YomiOluwadara.DateClass;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*; // always import all to avoid issues 

public class DateDeclaration {
	//declaring a variable of type Date ( we can do that for imported classes and arrays)
 Date myDate ;
	public Date getMyDate() {
	return myDate;
}
public void setMyDate(Date myDate) {
	this.myDate = myDate;
}

	public static void main(String[] args) {
		Date medStartDate = new Date();
		//use date object to invoke availabe methods in the date class
		System.out.println(medStartDate.toString());

		
		

	}

}
