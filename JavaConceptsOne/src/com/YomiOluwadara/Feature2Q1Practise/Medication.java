package com.YomiOluwadara.Feature2Q1Practise;

import java.util.*;

/*NOTES
 * Medication class has the following medicationName,medicationStartDate,medicationEndDate,medicationFrequencyList of type LIST
 * overload the class constructor-one of them should not have medicationEndDate ( to hand medication that does not have an end date)
 */
public class Medication {
	private String medicationName;
	Date medicationStartDate;
	Date medicationEndDate;
	private List<Frequency>medicationFrequencyList;
	
//creating setters and getters for the variables
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public String getMedicationName() {
		return medicationName;
	}
    public void setMedicationStartDate(Date medicationStartDate) {
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
    public void setMedicationFrequencyList (List<Frequency> medicationFrequencyList) {
 	   this.medicationFrequencyList = medicationFrequencyList;
    }
     
}
