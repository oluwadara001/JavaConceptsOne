/*
 * practising custome type of date and using a date instance to invoke available methods in the date class
 */
package com.YomiOluwadara.DateClass;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*; // always import all to avoid issues 

public class DateDeclaration {
//declaring a variable of type Date ( we can do that for imported classes and arrays)
 Date medicationStartDate ;
 Date medicationEndDate;
 
 
 // defining setters and getters for the variables
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
 void DateDeclaration () {
	 
 }
//constructor 2 
 void DateDeclaration (Date medicationStartDate, Date medicationEndDate) {
	 this.medicationStartDate = medicationStartDate;
	 this.medicationEndDate = medicationEndDate;
 }
 
	public static void main(String[] args) {
		
	
		Date medStartDate = new Date();
		System.out.println(medStartDate.toString());

		
		

	}

}
