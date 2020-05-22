/**
 * 
 */
package com.YomiOluwadara.RegexAndWrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author OO046152
 * 
 *         Wrappers Convert java int to Integer object Example
 */

public class Wrappers {
	static Integer integerWrapper() {
		Integer wrappedint = 0;
		try {
			System.out.println("enter an int");
			Scanner scanner = new Scanner(System.in);
			int numberToWrapToInteger = scanner.nextInt();
			// converting int to Integer
			wrappedint = new Integer(numberToWrapToInteger);
			// converting Integer to Sting
			String wrappedInterger = wrappedint.toString();
			System.out.println(numberToWrapToInteger + " has been wrapped to " + wrappedint);
			System.out.println("lenght of " + numberToWrapToInteger + " that was warapped to Ineger is now "
					+ wrappedInterger.length());
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {

		}
		return wrappedint;
	}

	public static void main(String[] args) {
		integerWrapper();

	}

}
