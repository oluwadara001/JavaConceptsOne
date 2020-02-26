/*
 * Question: Basic OOPs stuff - create a class that has info about some disease, and can be updated easily,
 * Answer: Using setters and getters will be appropriate. The setters could be used to set the
 * Since the object of discussion(disease) is not private, we could use static variables and methods here. We just use the class to 
 * invoke the static methods and variables
 */
package com.YomiOluwadara.InterviewQ;
public class QuestionOne {
	public static final String diseaseName = "Headache";
	public static String symptomOne;
	public static String symptomTwo;
	public static String symptomThree;
	
	//setters and getters to update disease info
	public static String getSymptomOne() {
		return symptomOne;
	}

	public static void setSymptomOne(String symptomOne) {
		QuestionOne.symptomOne = symptomOne;
	}

	public static String getSymptomTwo() {
		return symptomTwo;
	}

	public static void setSymptomTwo(String symptomTwo) {
		QuestionOne.symptomTwo = symptomTwo;
	}

	public static String getSymptomThree() {
		return symptomThree;
	}

	public static void setSymptomThree(String symptomThree) {
		QuestionOne.symptomThree = symptomThree;
	}

	public static String getDiseasename() {
		return diseaseName;
	}

	//method that prints the disease info 
	public static void dieseaseInfo ( ) {
		System.out.println("Disease name: " + diseaseName);
		System.out.println("The symptoms are :");
		System.out.println(symptomOne);
		System.out.println(symptomTwo);
		System.out.println(symptomTwo);
		}
	public static void main(String[] args) {
		//using the class to invoke and and set static values for static variables
		QuestionOne.setSymptomOne("constant headache");
		QuestionOne.setSymptomTwo("sleplessness");
		QuestionOne.setSymptomThree("Constant vomiting");
		QuestionOne.dieseaseInfo();
		// can also retrieve info using the getters
		System.out.println("This is using the getter to pull info:   " + QuestionOne.getDiseasename());
		
		
		

	}

}
