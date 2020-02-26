package com.YomiOluwadara.Feature2Q1Practise;
/*
 * Creates a variable timeOfDay of type Frequency
 * Creates an enum that holds all the possible time medication can be taken
 */
public class Frequency {
	
	Frequency timeOfDay;
	//setters and getters 
	public void setTimeOfDay(Frequency timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public Frequency getTimeOfDay() {
		return timeOfDay;
	}
	// do I need a constructor?
	
	Frequency(Frequency timeOfDay){
		this.timeOfDay = timeOfDay;
	}
	//enum declaration
	public enum allPossibleTimeToTakeMedication{
		as_needed
		,once_every_four_hours
		,morning
		,afternoon
		,evening
		,night
	}

}
