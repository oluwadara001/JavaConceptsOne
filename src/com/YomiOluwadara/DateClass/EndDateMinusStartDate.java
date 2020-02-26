package com.YomiOluwadara.DateClass;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EndDateMinusStartDate {
//declare class variables
Date medicationStartDate;
Date medicationEndDate;

//setters and getters
public void setMedicationStartDate (Date medicationStartDate) {
	this.medicationStartDate = medicationStartDate;
}
public Date getMedicationStartDate() {
	return medicationStartDate;
}
public void setMedicationEndDate(Date medicationEndDate) {
	this.medicationEndDate = medicationEndDate;
}
public Date getMedicationEndDate() {
	return medicationEndDate;
}

//method to return difference between dates
// you can overload the method not to take medictionendDate as parameter
void printDiffernceBetweenDates(String medicationEndDate,String medicationStartDate) {
	Date endDate = null;
	Date startDate = null;
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
try {
	startDate = sdf.parse(medicationStartDate);
	endDate = sdf.parse(medicationEndDate);
	long differnce = endDate.getTime() - startDate.getTime(); //return duration in milliseconds
	long diffInHours = differnce /(60 * 60 * 1000) % 24;      //converts milliseconds to hours
	long diffInDays = differnce /(24 * 60 * 60 * 1000);		//converts milliseconds to days
	System.out.print(diffInHours + " days, " );
	System.out.print(diffInDays + " hours, " );
	} 
catch (ParseException e) {
	System.out.println("An error has occured while setting date " + e.toString());
}
finally {
	
	}
}

	public static void main(String[] args) {
		EndDateMinusStartDate obj = new EndDateMinusStartDate();
		EndDateMinusStartDate myObj = new EndDateMinusStartDate();
		obj.printDiffernceBetweenDates("2019/07/11", "2019/07/01");
		myObj.printDiffernceBetweenDates("2019/01/31", "0000/00/00");  
		
	}

}

