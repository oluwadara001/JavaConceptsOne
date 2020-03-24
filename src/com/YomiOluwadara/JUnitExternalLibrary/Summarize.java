package com.YomiOluwadara.JUnitExternalLibrary;

import java.util.Scanner;

public class Summarize {

	// a static method
	public static int sumOfNumbersFromSystemIn() {

		System.out.println("enter first number");
		Scanner scanner = new Scanner(System.in);
		int firstSummand = scanner.nextInt();
		System.out.println("enter secound number");
		int secondSummand = scanner.nextInt();
		System.out.println(firstSummand + secondSummand);
		return firstSummand + secondSummand;

	}

	public static void main(String[] args) {
		// call static method
		sumOfNumbersFromSystemIn();
	}

}
