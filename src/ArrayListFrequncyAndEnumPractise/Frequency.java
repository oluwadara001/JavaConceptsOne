/*
 * First step: create enum to hold all possible values.
 * second step:create a variable of type enum,create getters and setters
 * third step: create constructor
 */
package ArrayListFrequncyAndEnumPractise;

public class Frequency {
	// creating variable of type enum
	timeOfDayToTakeMedication timeofDay;
	
	//defining constructor for the class
	public Frequency (timeOfDayToTakeMedication timeofDay) {
		this.timeofDay = timeofDay;
	}
	
	//creating an enum to hold a closed set of values
	public enum timeOfDayToTakeMedication{
		PRN_as_needed
		,morning
		,afternoon
		,evening
		,night_at_bed_time
		,every_four_hour
	}

	//setters and getters
	public void setTimeofDay(timeOfDayToTakeMedication time) {
		this.timeofDay = time;
	}
	public timeOfDayToTakeMedication getTimeofDay() {
		return timeofDay;
	}
	
	
	
}
