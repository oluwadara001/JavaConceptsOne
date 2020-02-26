package com.YomiOluwadara.featOneAlleg;

public class AllergyMainClass {

	public static void main(String[] args) {
		Allergy allegyobj = new Allergy("Jack", "common cold", "sneezing", Severity.meduim, AllergyReporter.patient);
		allegyobj.displayPatientInitialInfo();
		// updating the same person's allergy using the update method
		allegyobj.updateAllergy();
		allegyobj.alleryTreatment();

	}

}
