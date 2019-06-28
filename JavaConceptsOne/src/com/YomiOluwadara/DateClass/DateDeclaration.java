/*
 * Practicing custom type of date and using a date instance to invoke available methods in the date class
 */
package com.YomiOluwadara.DateClass;

import java.util.Date;
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
//constructor 2 
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
		
		 
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		
		DateDeclaration myobject = new DateDeclaration();
		myobject.setMedicationStartDate(null);;
		

		
		
		

	}

}
