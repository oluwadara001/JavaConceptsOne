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
		
		//creating medication object using the default constructor and using the object/reference to set values
		Medication medicationObj1 = new Medication();
		medicationObj1.setMedicationName("Aspirin");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// setting values for dates:USE THE OBJECT TO INVOKE THE DATE FIELDS AND
		try {
			medicationObj1.medicationStartDate = sdf.parse("2019-07-10");
		} catch (ParseException e) {
			System.out.println("Error occured while setting medication Start Date  " + e.toString());
		}
		finally {
			
		}
		try {
			medicationObj1.medicationEndDate = sdf.parse("2019-07-24");
		} catch (ParseException e) {
			System.out.println("Error occured while setting medication End Date  " + e.toString());
		}
		
// always refer to package com.YomiOluwadara.FeatureTwo; for full solution
		
		

	}

}
