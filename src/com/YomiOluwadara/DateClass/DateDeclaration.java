/*
 * Practicing custom type of date and using a date instance to invoke available methods in the date class
 */
package com.YomiOluwadara.DateClass;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; // always import all to avoid issues 

public class DateDeclaration {
//declaring a variable of type Date ( we can do that for imported classes and arrays)
 Date medicationStartDate ;
 Date medicationEndDate;
 
 public void setMedicationStartDate(Date medicationStartDate) {
	this.medicationStartDate = medicationStartDate;
}

 public void setMedicationEndDate(Date medicationEndDate) {
	 this.medicationEndDate = medicationEndDate;
 }
 public Date getMedicationStartDate() {     // notice return type is of "Date" 
	 return medicationStartDate;
 }
 
 public Date getMedicationEndDate() {
	 return medicationEndDate;
 }

//constructors - they will be overloaded so that I can be able to leverage them when I want the instance/object to use the setters and getters to get values
 DateDeclaration () {
	 
 }
//constructor 2 (to set values of the date variables)
 DateDeclaration (Date medicationStartDate, Date medicationEndDate) {
	 this.medicationStartDate = medicationStartDate;
	 this.medicationEndDate = medicationEndDate;
 }
 
 void printMedicationInfo() {
	 
 }
	public static void main(String[] args) {
		//crating an instance from the constructor the does not take parameters and using the instance to invoke methods from the Date API
				Date medStartDate = new Date();
				System.out.println(medStartDate.toString());
				System.out.println(medStartDate.getTime());
				System.out.println(medStartDate.after(medStartDate)); //  method compares date to another date
				System.out.println(medStartDate.getTimezoneOffset());
				System.out.println("-------------------------------------------------------");
				//use the second constructor to crate another instance/object and use that object to invoke setters and getters
				DateDeclaration myobject = new DateDeclaration();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				//assign value to Date variables  medicationStartDate & medicationEndDate
				
				/*
				try {
					myobject.setMedicationStartDate( sdf.parse("2019-07-01"));
				} catch (ParseException e) {
					System.out.println("Error occurred while parsing in date " + e.toString());
				}
				*/
				//setting values for the date variables and using the parse method to pass it
				try {
					myobject.medicationStartDate =  sdf.parse("2019-06-24") ;
				} catch (ParseException e) {
					System.out.println("Error occurred while parsing in date " + e.toString());
				}
				finally {
					
				}
				
				try {
					myobject.medicationEndDate = sdf.parse("2019-07-11") ;
				} catch (ParseException e1) {
					System.out.println("Error occurred while parsing in date " + e1.toString());
					
				}
				finally {
					
				}
				System.out.println("Med start date obtained from constructor is  " + myobject.getMedicationStartDate());
				System.out.println("Med end date obtained from constructor is  " +  myobject.getMedicationEndDate());
				System.out.println("-------------------------------------------------------");
				
		  
		
		
		

		
		
		

	}

}
