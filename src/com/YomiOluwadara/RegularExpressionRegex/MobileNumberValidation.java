/**
 * 
 */
package com.YomiOluwadara.RegularExpressionRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author OO046152
 *
 */
public class MobileNumberValidation {
	public static boolean isValid(String s) {
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));
	}

	public static void main(String[] args) {
		String s = "4237376822";
		if (isValid(s))
			System.out.println("Valid Number");
		else
			System.out.println("Invalid Number");

	}

}
