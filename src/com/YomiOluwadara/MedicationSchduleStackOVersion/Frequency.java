package com.YomiOluwadara.MedicationSchduleStackOVersion;

public class Frequency {
	public PartoftheDay part;
	
	//declaring an Enum to hold part/ time of the day
	public enum PartoftheDay
	{
	    Morning,
	    Afternoon,
	    Evening,
	    Night
	}
//constructor to set initial value for part of the day
	public Frequency( PartoftheDay part ) {
	    this.part = part;

	} 

// setter and getter for part of the day
	public PartoftheDay getPart() {
	    return part;
	}
	public void setPart(PartoftheDay part) {
	    this.part = part;
	}
}
