/**
 * 
 */
package com.YomiOluwadara.featOneAlleg;

import java.util.Scanner;

/**
 * @author OO046152 ask: build a system for entering and displaying allaergies
 *         that patient might have
 */
public class Allergy {
	private String patientName;
	private String allergyName;
	private String allergySymptom;
	Severity severity;
	AllergyReporter allergyReporter;
	private final String allergyTreatment = "Robutusin";

	// setter and getter methods
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergySymptom(String allergySymptom) {
		this.allergySymptom = allergySymptom;
	}

	public String getAllergySymptom() {
		return allergySymptom;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setAllergyReporter(AllergyReporter allergyReporter) {
		this.allergyReporter = allergyReporter;
	}

	public AllergyReporter getAllergyReporter() {
		return allergyReporter;
	}

	public String getAllergyTreatment() {
		return allergyTreatment;
	}

	// class constructor- parameterized
	public Allergy(String patientName, String allergyName, String allergySymptom, Severity severity,
			AllergyReporter allergyReporter) {
		this.patientName = patientName;
		this.allergyName = allergyName;
		this.allergySymptom = allergySymptom;
		this.severity = severity;
		this.allergyReporter = allergyReporter;
	}

	// default constructor
	public Allergy() {

	}

	// method to display the first info captured about the patient (from the
	// parameterized constructor)
	public void displayPatientInitialInfo() {
		System.out.println("Patient name is  : " + getPatientName());
		System.out.println("Patient's allergy is  : " + getAllergyName());
		System.out.println("Patient allergy symptom is  : " + getAllergySymptom());
		System.out.println("Patient allergy severity is  : " + getSeverity());
		System.out.println("Person reporting patient allergy is  : " + getAllergyReporter());
	}

	// method to update allergy
	public void updateAllergy() {
		System.out.println(" kindly enter the Allergy name for updating the allergy");
		// using the setter- setAllergyName(String allergyName) to set allergy from
		// keyboard input
		setAllergyName(new Scanner(System.in).nextLine());
		System.out.println("The allergy has been updated to " + getAllergyName());
	}

	// method for treating allergy
	public void alleryTreatment() {
		if (getAllergySymptom().contains("cold") || getAllergySymptom().contains("sneezing")
				|| getAllergySymptom().contains("cough")) {
			System.out.println(getAllergyTreatment());
		} else
			System.out.println("You do not have a cold dude");
	}

}
