package com.YomiOluwadara.Feature2Q1Practise;

public class Person {
	//declaring class variables
	private String personFirstName;
	private String personLastName;
	
	//writing getters and setters for the variable
	public void setPersonfirstName( String personFirstName) {
		this.personFirstName = personFirstName;
	}
	public String getPersonFirstName() {
		return personFirstName;
	}
	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}
	public String getPersonLastName() {
		return personLastName;
	}
	
	//defining class constructor
	public Person(String personFirstName, String personLastName) {
		this.personFirstName = personFirstName;
		this.personLastName = personLastName;
	}
	
	

}
