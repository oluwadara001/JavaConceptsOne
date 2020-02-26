package com.YomiOluwadara.DateClass;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
public class DifferenceBewteenDates {
	Date startDate;
	Date endDate;

	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public void givenTwoDatesInJava8_whenDifferentiating_thenWeGetSix() {
	    LocalDate now = LocalDate.now();
	    LocalDate sixDaysBehind = now.minusDays(6);
	 
	    Period period = Period.between(now, sixDaysBehind);
	    int diff = period.getDays();
	    System.out.println(sixDaysBehind);
	    System.out.println(diff);
	    }
	public void diffInDays(Date getEndDate,Date getStartDate) {

	}
	
	
	public static void main(String[] args) {
		DifferenceBewteenDates myobj = new DifferenceBewteenDates ();
		myobj.givenTwoDatesInJava8_whenDifferentiating_thenWeGetSix();

	}

}
