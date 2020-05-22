/**
 * 
 */
package com.YomiOluwadara.Regex;

/**
 * @author OO046152
 * 
 */
public class RemoveBackslahAndImmediateNextChar {
	public static String s = "###\\A-##\\A-####";;
	public static String formatted = s.replaceAll("\\\\.?", "");

	public static void main(String[] args) {
		System.out.println("raw string is :: " + s);
		System.out.println("String after removing \\ and next char is:: " + formatted);

	}

}
