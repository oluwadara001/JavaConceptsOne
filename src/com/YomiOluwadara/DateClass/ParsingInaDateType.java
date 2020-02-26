/*
 * Praising how to pass in a variable of type "Date"
 * NOTE: MAKEE SURE TO IMPORT THE DATE CLASS FIRST
 */
package com.YomiOluwadara.DateClass;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParsingInaDateType {
	//declaring class variables
	private Date schoolStartDate;
	private Date schoolEndDate;
	
	//setters and getters
	public void setSchoolStartDate(Date schoolStartDate) {
		this.schoolStartDate = schoolStartDate;
	}
	public Date getSchoolStartDate() {
		return schoolStartDate;
	}
	public void setSchoolEndDate(Date schoolEndDate) {
		this.schoolEndDate = schoolEndDate;
	}
	public Date getSchoolEndDate(){
		return schoolEndDate;
	}
	
	// instance method to print the information
	public void printSchoolDates() {
		System.out.println("School resumption Date is  " + getSchoolStartDate());
		System.out.println("Last day of school is  " +  getSchoolEndDate() );
	}

	public static void main(String[] args) {
		//create an object of the class, then use it with the setter methods to set the initial values ( no parameterized constructor defined)
		ParsingInaDateType myobject1 = new ParsingInaDateType();
		//creating an instance of the SimpleDateformat class and using it to invoke the parse method to set variable of type date
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		try {
			myobject1.schoolStartDate = sdf.parse("2019-07-13");
		} catch (ParseException e) {
			System.out.println("Error occured while setting in school start date " + e.toString());
		}
		finally {
			
		}
		try {
			myobject1.schoolEndDate = sdf.parse("2019-11-11");
		}
		catch(ParseException e2) {
			System.out.println("Error occured while setting in school end date " + e2.toString());
		}
		finally {
			
		}
		//using the class reference to call the non static method
		myobject1.printSchoolDates();
		

	}

}
