package com.YomiOluwadara.MedicationSchduleStackOVersion;
import java.util.List;

public class Medicine {
	private String name;
	private String disease;
	private String composition;
	private String details;
	private List<Frequency> frequencyList; //declares a list variable
// setters and  getters for the variables
	public void setFrequencyList(List<Frequency> frequencyList) {
	    this.frequencyList = frequencyList;
	}


	public List<Frequency> getFrequencyList() {
	    return frequencyList;
	}

	
	public String getName() {
	    return name;
	}

	public Medicine(String name, String composition, String details) {
	    this.name = name;
	    this.setComposition(composition);
	    this.setDetails(details);

	}

	public void setName(String name) {
	    this.name = name;
	}
	public String getDisease() {
	    return disease;
	}
	public void setDisease(String disease) {
	    this.disease = disease;
	}

	/**
	 * @return the composition
	 */
	public String getComposition() {
	    return composition;
	}

	/**
	 * @param composition the composition to set
	 */
	public void setComposition(String composition) {
	    this.composition = composition;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
	    return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
	    this.details = details;
	}
}
