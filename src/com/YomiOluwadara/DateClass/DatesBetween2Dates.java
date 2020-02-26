/*
 * How to Get All Dates Between Two Dates
 * First: we can get the difference of days between two dates using the between function – associated with DAYS constant of ChronoUnit enumeration.
 * Second: create a Stream of integers representing the number of days since the starting date.
 * Third: we convert our integers to LocalDate objects using the plusDays() API.
 * Fourthly:we collect everything into a list instance.
 */

package com.YomiOluwadara.DateClass;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DatesBetween2Dates {
	//random method 1
	public  List<LocalDate> getDatesBetweenUsingJava8(LocalDate startDate, LocalDate endDate) { 
			    long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate); 
			    return IntStream.iterate(0, i -> i + 1)
			      .limit(numOfDaysBetween)
			      .mapToObj(i -> startDate.plusDays(i))
			      .collect(Collectors.toList()); 
			}
	
	
	//randome method 2
	public  List<Date> getDaysBetweenDates(Date startdate, Date enddate){
	    List<Date> dates = new ArrayList<Date>();
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(startdate);

	    while (calendar.getTime().before(enddate))
	    {
	        Date result = calendar.getTime();
	        dates.add(result);
	        calendar.add(Calendar.DATE, 1);
	    }
	    return dates;
	}
	
	//random method 3 : it works!!!!!
	public void datesBetweenTwoDates (String str_date,String end_date){
		List<Date> dates = new ArrayList<Date>();
		Date startDate = null;
		Date endDate= null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		
		try {
			startDate = sdf.parse(str_date);
			 endDate = sdf.parse(end_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		long interval = 24*1000 * 60 * 60; // 1 hour in millis
		long endTime = endDate.getTime();// create your endtime here, possibly using Calendar or Date
		long curTime = startDate.getTime();
		while (curTime <= endTime) {
		    dates.add(new Date(curTime));
		    curTime += interval;
		}
		for(int i=0;i<dates.size();i++){
		    Date lDate =(Date)dates.get(i);
		    String ds = sdf.format(lDate);    
		    System.out.println(" Date is ..." + ds);
		}
		
	}
	

	public static void main(String[] args) {
		
		DatesBetween2Dates myobj  = new DatesBetween2Dates();
		myobj.datesBetweenTwoDates("2019/01/01", "2019/01/10");
		
		
		
		
		
		
		
		
	}

}
