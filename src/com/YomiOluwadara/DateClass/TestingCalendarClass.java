/**
 * 
 */
package com.YomiOluwadara.DateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author OO046152
 *
 */
public class TestingCalendarClass {

	public void datesBetweenMedicationStartAndStop(String medicationStartDate, String medicationEndDate) {
		List<Date> allDatesToTakeMds = new ArrayList<Date>(); // declaring an ArrayList that would hold the dates
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date startDate = sdf.parse(medicationStartDate);
			Date endDate = sdf.parse(medicationEndDate);
			final Date SentinelEndDate = sdf.parse("1900-01-01");

		} catch (ParseException e) {

			System.out.println("Error has occured while parsing date " + e.toString());
		} finally {

		}
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		Calendar sentinel = Calendar.getInstance();
		long startDate = start.getTimeInMillis();
		long endDate = end.getTimeInMillis();
		long SentinelEndDate = sentinel.getTimeInMillis();
		System.out.println(startDate);
		System.out.println(SentinelEndDate);
		System.out.println(endDate);

		/*
		 * long intervalInhour = 24 * 1000 * 60 * 60; // Converting hours to
		 * milliseconds long endTime = endDate.getTime();// gets the number of
		 * milliseconds between January 1 1970 and the date parsed // into it long
		 * curTime = startDate.getTime();
		 * 
		 * while (curTime <= endTime || curTime == endTime) { // while loops that adds
		 * to the allDatesToTakeMds List allDatesToTakeMds.add(new Date(curTime)); //
		 * adding to the ArrayList by: using its object to invoke the // add() method
		 * and parsing in startdate curTime += intervalInhour; // increment by an hour }
		 * 
		 * for (int i = 0; i < allDatesToTakeMds.size(); i++) { Date myDate = (Date)
		 * allDatesToTakeMds.get(i); String ds = sdf.format(myDate); TimeZone mytimezone
		 * = TimeZone.getTimeZone("America/Chicago"); // getting the time offset using
		 * the TimeZone // class int offSet =
		 * mytimezone.getOffset(Calendar.ZONE_OFFSET); System.out.println( ds +
		 * " is in between medication start and stop dates and the offset value is " +
		 * " " + offSet); }
		 */

	}

	public static void main(String[] args) {

		TestingCalendarClass obj1 = new TestingCalendarClass();
		obj1.datesBetweenMedicationStartAndStop("2019-01-01", "2019-09-01");
	}

}
