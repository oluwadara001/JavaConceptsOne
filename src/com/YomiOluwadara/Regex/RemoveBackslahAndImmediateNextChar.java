/**
 * 
 */
package com.YomiOluwadara.Regex;

/**
 * @author OO046152
 * 
 */
public class RemoveBackslahAndImmediateNextChar {
	public static String string = "###\\A-##\\A-####";
	public static String test = "###\\A-##\\A-####";
	public static String formattedString = string.replaceAll("\\\\.?", "");

	public static String prepMask(String maskFromDb, int unsecuredCharCount) {
		boolean showLeftSide = true;
		int securedCharCount = 0;
		if (unsecuredCharCount < 0) {
			showLeftSide = false;
			String withoutEscape = maskFromDb.replaceAll("\\\\.?", "");
			int totalAlphaNumericChar = 0;
			for (char c : withoutEscape.toCharArray()) {
				if (c == 'A' || c == '#') {
					totalAlphaNumericChar++;
				}
			}
			securedCharCount = totalAlphaNumericChar - unsecuredCharCount;
		}

		int pos = 0;
		int copyPos = 0;
		char[] preppedMask = new char[100];
		char[] sourceMask = maskFromDb.toCharArray();
		while (pos < sourceMask.length) {
			switch (sourceMask[pos]) {
			case '#':
				if (showLeftSide) {
					if (unsecuredCharCount > 0) {
						preppedMask[copyPos] = '~';
						unsecuredCharCount--;
					} else {
						preppedMask[copyPos] = '$';
					}
				} else {
					if (securedCharCount > 0) {
						preppedMask[copyPos] = '$';
						securedCharCount--;
					} else {
						preppedMask[copyPos] = '~';
					}
				}
				break;
			case 'A':
				if (showLeftSide) {
					if (unsecuredCharCount > 0) {
						preppedMask[copyPos] = '@';
						unsecuredCharCount--;
					} else {
						preppedMask[copyPos] = '$';
					}
				} else {
					if (securedCharCount > 0) {
						preppedMask[copyPos] = '$';
						securedCharCount--;
					} else {
						preppedMask[copyPos] = '@';
					}
				}
				break;
			case '\\':
				pos++;
				if (pos < sourceMask.length) {
					preppedMask[copyPos] = sourceMask[pos];
				}
				break;
			default:
				preppedMask[copyPos] = sourceMask[pos];
				break;
			}
			copyPos++;
			pos++;
		}
		return new String(preppedMask);
	}

	public static void main(String[] args) {
		System.out.println("raw string is :: " + string);
		System.out.println("String after removing \\ and next char is:: " + formattedString);
		System.out.println("");
		System.out.println("*%%%********line breaker****************&&&");
		System.out.println("");
		System.out.println("test string before is: " + test);
		System.out.println("test string after is: " + RemoveBackslahAndImmediateNextChar.prepMask(test, -5));

	}

}
