/*
 * crate an object of each class and use constructors to parse in initial values
 * Crate an instance of the SimpleDateFormat class to parse in the date values to the date variables
 * use the objects of each class to call the getters and print them
 * MORE WORK: how to inform the nurse
 */
package com.YomiOluwadara.Feature2Q1Practise;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.YomiOluwadara.Feature2Q1Practise.Frequency;


public class MedicationMainClass {

	public static void main(String[] args) {
		//creating an object of the person class
		Person personObj1 = new Person("Joe", "George");
		
		//creating medication object using the default constructor and using the object/referece to set values
		Medication medicationObj1 = new Medication();
		medicationObj1.setMedicationName("Aspirin");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//USE THE OBJECT TO INVOKE THE DATE FIELDS AND
	try {
		medicationObj1.medicationStartDate = sdf.parse("07-05-2019");
	}
	catch (ParseException e) {
		System.out.println("Error has occured while setting medication Start Date "  + e.toString());
	}
	finally {
		
	}
		
		

	}

}
