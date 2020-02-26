/*
 * Calendar class is an Abstract class, so we cannot use a constructor to create an instance. 
 * TO GET THE OFFSET by using the TimeZone class
 * 		- Get the timezone by calling the getTimeZone method and passing your time zone
 * 		- use the timezone instance to invoke the getOffset() and pass in the calender.zone offset as parameter
 */
package com.YomiOluwadara.DateClass;

import java.util.*;

public class CaendarEx{
Date myDate;
//Calendar calendar;

public void setMyDate (Date mydate) {
	this.myDate = myDate;
}
	public static void main(String[] args) {
		Calendar myObj = Calendar.getInstance();  // CALENDAR CLASS IS ABSTRACT, THIS IS HOW YOU INSTANTIATE IT-NOT WITH A CONSTRUCTOR
		System.out.println("The Current Date is:" + myObj.getTime());
		System.out.println( myObj.get(Calendar.DST_OFFSET));
		System.out.println( myObj.get(Calendar.DAY_OF_MONTH));
		//using the set in calendar to set time parameters 
		System.out.println("---------------------------------------");
		myObj.set(Calendar.HOUR,0);
		myObj.set(Calendar.DAY_OF_MONTH, 23);
		myObj.set(Calendar.SECOND, 20);
		System.out.println("---------------------------------------");
		
		//// Creating a TimeZone  and using that to determine the offset
		TimeZone zoneobj = TimeZone.getTimeZone("America/Chicago");
		System.out.println(" The offset is  +  " + zoneobj.getOffset(Calendar.ZONE_OFFSET));
		
		
		
		
	}

}
