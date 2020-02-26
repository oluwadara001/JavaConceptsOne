package com.YomiOluwadara.DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMethodPratice {
	
	//method that compares 2 dates to see which one is later
	void compareTwoDate() {
		Calendar medicationStartDate = Calendar.getInstance(); //creating calendar instance
		Calendar medicationEndDate = Calendar.getInstance();
		medicationStartDate.set(2019, 05, 01, 12, 00, 00);
		medicationEndDate.set(  2019, 05, 21, 17, 00, 00);
		if(medicationStartDate.equals(medicationEndDate)) {
			System.out.println(" Dates are the same, take medicine at the same time");
			}
			else if (medicationEndDate.after(medicationStartDate) && (medicationStartDate.equals(medicationEndDate)) ) {
				System.out.println("Time of day are not the same, so dont take medication");
			}
		}
		/*
		// passing all the date attributes at once yy/mm/dd  hh:mm:ss  (for noon)midday
		//using the Calendar objects to set Dates using the set() and passing in argument using the Calendar class
				//medicationStartDate.set(Calendar.YEAR,2019);
				//medicationStartDate.set(Calendar.MONTH,05);
				//medicationStartDate.set(Calendar.DAY_OF_MONTH,01);
				 * use this to determine if med could be administred at same time
		if (cal2.before(cal)) {  
	         System.out.println("Date " + time + " is before current date.");
	         or
	         Would timeFoMedOne.equals(timeforMedTwo)
	}
	*/
	

	public static void main(String[] args) {
		/*
		CalendarMethodPratice myobj = new CalendarMethodPratice();
		myobj.compareTwoDate();
		*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Calendar myobj = GregorianCalendar.getInstance();
		Calendar myobj2 = GregorianCalendar.getInstance();
		 myobj.set(11, 59, 59);
		 myobj2.set(2019, 06, 12, 11, 59, 59);
		 
		 //System.out.println(sdf.parse( myobj.set(Calendar.AM,1159)));   Using the getTime() to retrieve the time from set()
		System.out.println(myobj.getTime()   + " -- ");
		System.out.println(myobj2.getTime()   + " --2 ");
	
		
		
		
	}

}
