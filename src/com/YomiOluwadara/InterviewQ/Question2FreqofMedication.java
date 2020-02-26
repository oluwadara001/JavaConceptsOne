/*
 * Mainly function and object structure. One was create an object that tells a nurse the frequency of medicine that a patient must take.  
 */
package com.YomiOluwadara.InterviewQ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2FreqofMedication {
// crate a separate method that takes input from nurse and ensure input is correctly taken.
	static String getNurseInput() {
		System.out.println("Kindly enter one of the following  options 'bd', 'qd','tid,'qid','qy'");
		Scanner scan = new Scanner (System.in);
		String nurseInput = scan.nextLine();
		return "nurseInput";	
	}
	
	static void howOften(String nurseInput) {
		if (getNurseInput()  == "bd") {
			System.out.println("Take once at bed time");
			}
		else if (nurseInput == "qd") {
			System.out.println("Take one time a day");
		}
		else if (nurseInput == "tid") {
			System.out.println("Take three times day");
		}
		else if (nurseInput == "qid") {
			System.out.println("Take four  times day");
		}
		else 	if (nurseInput == "qy") {
			System.out.println("Take every h hour in a day as directed by attending physician");
		}
		else {
			System.out.println("The attending physician has not prescribed any meds at this time");
		}
	}
	
	
	public static void main(String[] args) {
		//String  nurseInput = getNurseInput();
	//use the class to involve the how often method and pass in the return value of the getinput method
		Question2FreqofMedication.howOften(getNurseInput());
	}

}
