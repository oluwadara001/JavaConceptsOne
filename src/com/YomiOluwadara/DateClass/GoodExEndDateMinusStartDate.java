package com.YomiOluwadara.DateClass;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class GoodExEndDateMinusStartDate {
	//method to determine the difference in dates and times between 2 dates.Method will be overloaded to accommodate for situation where there is no end date
	//method 1: there is start and end dates
	 void PrintDiffinDates(String schoolStartDate, String schoolendDate) {
		 Date startDate = null;
		 Date endDate = null;
		 SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/mm/dd hh:mm:ss");
		 //create an object of the simpleDateFormat to pass date
		 try {
			 startDate = sdf.parse(schoolStartDate);
			 endDate = sdf.parse(schoolendDate);
			 // define a variable difference of type long
			 long differenceIndates =  endDate.getTime() - startDate.getTime() ;  // use Date type to invoke getDate() - retrieves duration in milliseconds
			 long differenceIndatesInDays = differenceIndates/(24 * 60 * 60 * 1000);
			 long differenceIndatesInHours = differenceIndatesInDays * 24;
			 System.out.println("Difference,in days, between  "  + schoolStartDate  +   " and  " + schoolendDate +  " is " +  differenceIndatesInDays );
			 System.out.println("Difference,in hours, between  "  + schoolStartDate  +  " and  " + schoolendDate +  " is " +  differenceIndatesInHours );
			  }
		 catch(ParseException e) {
			 System.out.println("Error occured while setting date  "  +  e.toString());
			 }
		 finally {
			 }
		  }
	 
	 //method 2: No end date
	 void PrintDiffinDates (String schoolStartDate){
		 Date startDate ;
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		 try {
			 //use the object of the SimpleDateFormat to school start date : Date type to STring
			 startDate = sdf.parse(schoolStartDate);
			 //declare a variable of type long to hold the difference by using the Date startDate to invoke the getTime() from the Date AP
			 long diffrenceInDates = startDate.getTime() - 0;
			 long differnceinDays = diffrenceInDates/(24 * 60 * 60 * 1000);  //converts milliseconds to days
			 long differenceinHours = differnceinDays * 24;
			 System.out.println(" There is no end date, school has been opened for  "  +   differnceinDays  +   "  days since start date" );
			 System.out.println(" There is no end date, school has been opened for  "  +   differenceinHours  +   " hours since start date" );
			 
		 }
		 catch (ParseException e) {
			 System.out.println("Error has occured while setting date " +  e.toString());
		 }
		 finally {
			 
		 }
	 }

	public static void main(String[] args) {
		GoodExEndDateMinusStartDate myObj = new GoodExEndDateMinusStartDate();
		myObj.PrintDiffinDates("2019/01/01 23:59:00", "2019/02/28 23:59: 00");  //case when there is begin and end date
		myObj.PrintDiffinDates("2019/01/01 23:59:59");                           //case when there is NO end date
		

	}

}
