/*Write a Java program that makes the user to provide a single character from the alphabet. Print Vowel or Consonant,
 *  depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
 *   print an error message
 *   --Don't use try -catch here!!
 */
package com.YomiOluwadara.ConditionalStatements;

import java.util.Scanner;

public class VowelOrConsonant {
	// java inbuilt library method to determine if a char is an alphabet or not
	
private static boolean isAlphabetic(char userInput) {
		
		return false;
	}

	//a static method that has all static members- everything will happen within the scope of this method
	static void alphabetDecider () {
		System.out.println("Enter an alphabet");
		Scanner scan = new Scanner(System.in);
		char userInput = scan.next(".").charAt(0); 
		System.out.println("You have entered : " + userInput);
		//using the class to invoke the static method to check  if user input is an alphabet
	while (	VowelOrConsonant.isAlphabetic(userInput)) ;
		System.out.println("ERROR : You have not entered an alphabet");
		
//implementing the if to determine if input is a vowel or consonant
	if(userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u') {
		System.out.println("The alphabet you entered is a vovel");
	}
	
	else {
		System.out.println("You have entered a consonant");
	}
		}
		
	public static void main(String[] args) {
		VowelOrConsonant.alphabetDecider();

	}

}
