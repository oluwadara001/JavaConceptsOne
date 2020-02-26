/**
 * 
 */
package com.YomiOluwadara.HashSetAndHashMap;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author OO046152 Take user input and store in HashMpa
 */
public class StoringIntoHashMap {

	private int customerNumber;
	private int pin;
	private int customerChoice;

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setCustomerChoice(int customerChoice) {
		this.customerChoice = customerChoice;
	}

	public int getCustomerChoice() {
		return customerChoice;
	}

	void placeHolderMethod() {
		System.out.println("You see me because the key and value pair are in the hasmap");
	}

	@SuppressWarnings("resource")
	void storeUserInputToMap() {
		try {
			// getting and setting user user inputs (customer number and pin)
			System.out.println("Enter 8 digits customer number");
			setCustomerNumber(new Scanner(System.in).nextInt());
			System.out.println("Enter 4 digits customer pin");
			setPin(new Scanner(System.in).nextInt());
		} catch (InputMismatchException e) {
			e.printStackTrace();

		} finally {

		}
		// creating a HashMap to hold customer login info
		HashMap<Integer, Integer> userLoginCreds = new HashMap<Integer, Integer>();
		// validation user input and storing the validated creentials in a HashMap
		String customerNum = String.valueOf(getCustomerNumber());
		String pn = String.valueOf(getPin());
		if (customerNum.isEmpty() || customerNum.length() != 8) {
			System.out.println(
					"Invalid Customer Number:: " + getCustomerNumber() + " entered, check credentials and try again");

		} else if (pn.isEmpty() || pn.length() != 4) {
			System.out.println("Invalid Customer PIN::  " + getPin() + " entered, check credentials and try again");
		} else
			userLoginCreds.put(getCustomerNumber(), getPin());
//checking if login credentials are in map
		if (userLoginCreds.containsKey(getCustomerNumber()) && userLoginCreds.containsValue(getPin())) {
			// System.out.println(userLoginCreds); // use this to test if the user login was
			// captured
			placeHolderMethod();

		} else
			System.out.println(" You login crendentials cannot be validated ");

	}

	public static void main(String[] args) {
		StoringIntoHashMap myobj = new StoringIntoHashMap();
		myobj.storeUserInputToMap();

	}

}
