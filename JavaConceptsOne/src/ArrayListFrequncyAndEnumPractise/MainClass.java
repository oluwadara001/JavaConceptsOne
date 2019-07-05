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
		
		
		
		
		
		

	}

}