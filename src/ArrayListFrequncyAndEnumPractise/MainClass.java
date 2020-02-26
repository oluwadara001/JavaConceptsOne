package ArrayListFrequncyAndEnumPractise;

import java.util.*;
import java.util.List;
import ArrayListFrequncyAndEnumPractise.Frequency.timeOfDayToTakeMedication; //imported the enum from Frequency class

public class MainClass {

 
	public static void main(String[] args) {
		//creating an object/reference of myFrequencyList 
		List <Frequency> myFrequencyList = new  ArrayList <Frequency>();
		myFrequencyList.add(new Frequency(timeOfDayToTakeMedication.evening));
		myFrequencyList.add(new Frequency(timeOfDayToTakeMedication.every_four_hour));
		myFrequencyList.add(new Frequency(timeOfDayToTakeMedication.morning));
		myFrequencyList.add(new Frequency(timeOfDayToTakeMedication.night_at_bed_time));
		myFrequencyList.add(new Frequency(timeOfDayToTakeMedication.PRN_as_needed));
		//traverse  over the ArrayList to print content
		for (Frequency freq:myFrequencyList) {
			System.out.println(freq.getTimeofDay());
		}
		
		
		// always refer to package com.YomiOluwadara.FeatureTwo; for full solution
		
		
		
		
		

	}

}