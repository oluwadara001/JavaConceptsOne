/**
 * 
 */
package com.YomiOluwadara.DateClass;

import java.util.Calendar;

/**
 * @author OO046152
 *
 */
public class PlayingWithCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		int year = 0;
		int month = 0;
		int date = 0;
		start.set(2016, 12, 25);
		end.set(2017, 1, 25);
		if (start.getTime().before(end.getTime())) {
			System.out.println("Take meds");
		}

		else if (start.getTime().after(end.getTime())) {
			System.out.println("Dont take meds");
		}
	}

}
