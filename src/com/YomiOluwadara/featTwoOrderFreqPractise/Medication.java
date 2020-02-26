package com.YomiOluwadara.featTwoOrderFreqPractise;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Medication {

	private Calendar medStartDate;
	private Calendar medEndDate;
	Frequency frequency;
	List<Frequency> medFreqList;

	// setters and getters
	public Calendar getMedStartDate() {
		return medStartDate;
	}

	public void setMedStartDate(Calendar medStartDate) {
		this.medStartDate = medStartDate;
	}

	public Calendar getMedEndDate() {
		return medEndDate;
	}

	public void setMedEndDate(Calendar medEndDate) {
		this.medEndDate = medEndDate;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public List<Frequency> getMedFreqList() {
		return medFreqList;
	}

	public void setMedFreqList(List<Frequency> medFreqList) {
		this.medFreqList = medFreqList;
	}

	// @overloaded constructor- when medication has both start + end date
	public Medication(Calendar medStartDate, Calendar medEndDate, Frequency frequency, List<Frequency> medFreqList) {
		this.medStartDate = medStartDate;
		this.medEndDate = medEndDate;
		this.frequency = frequency;
		this.medFreqList = medFreqList;
	}

	// @overloaded constructor- when medication has both start but No end
	public Medication(Calendar medStartDate, Frequency frequency, List<Frequency> medFreqList) {
		this.medStartDate = medStartDate;
		this.frequency = frequency;
		this.medFreqList = medFreqList;
	}

	// @overloaded constructor- default constructor
	public Medication() {

	}

	/*
	 * Step 2: Using the medication class, write a method that would calculate all
	 * the date & times the patient should take the medication
	 */
	void daysToTakeMedication() {
		// 3 calendar objects to set start, stop and noEnd
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		Calendar noendDate = Calendar.getInstance();
		// using setters to set dates and passing them to setters
		start.set(2020, 1, 1);
		end.set(2020, 2, 1);
		noendDate.set(1900, 1, 1);
		setMedStartDate(start);
		setMedEndDate(end);
		// for PRN ( gas start date and fre == prn
		setFrequency(Frequency.PRN);
		if (getFrequency() == Frequency.PRN && getMedStartDate() != null) {
			System.out.println("Medication is PRN, keep taking as needed");
		}
		// meds with start, but no end date, compare sentinel value against start date
		else if (getMedStartDate().before(noendDate.getTime())) {
			System.out.println("Medication has no end date, keepp taking");
		}
		// if medication has start and stop date
		else if (getMedStartDate().before(getMedEndDate())) {
			List<Date> daysBetween = new ArrayList<Date>();
			// adding days in between to the Array list
			daysBetween.add(new Date(Calendar.YEAR)); // using date method to add attributes of date YYYY,MM,DD
			daysBetween.add(new Date(Calendar.MONTH));
			daysBetween.add(new Date(Calendar.DAY_OF_MONTH));
			start.set(Calendar.DATE, 1); // using the start date to set one day increment
			for (int i = 0; i < daysBetween.size(); i++) {
				System.out.println(daysBetween.get(i)); // use array obj to print content of array

			}
		}

	}

	/*
	 * Using the above method, write a function that determines whether two
	 * medications would ever be given at the same time given their schedules.
	 * 
	 */
	public boolean takeTwoMedsTogether() {
		// creating calendar objects to set dates
		Calendar med1Start = Calendar.getInstance();
		Calendar med1Stop = Calendar.getInstance();
		Calendar med2Start = Calendar.getInstance();
		Calendar med2Stop = Calendar.getInstance();
		// using calendar objects to set dates
		med1Start.set(2016, 1, 1);
		med1Stop.set(2020, 2, 2);
		med2Start.set(2020, 3, 3);
		med2Stop.set(2020, 4, 4);
		// passing the dates to setters
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		setMedStartDate(med1Start);
		setMedStartDate(med2Start);
		setMedEndDate(med1Stop);
		setMedEndDate(med2Stop);
		String med1startFormatted = sdf.format(med1Start.getTime());
		String med1Stopformatted = sdf.format(med1Stop.getTime());
		String med2Startformatted = sdf.format(med2Start.getTime());
		String med2Stopformatted = sdf.format(med2Stop.getTime());

		System.out.println(med1startFormatted);
		System.out.println(med1Stopformatted);
		System.out.println(med2Startformatted);
		System.out.println(med2Stopformatted);
		System.out.println(getFrequency());
		System.out.println(getFrequency());

		Frequency med1 = null;
		Frequency med2 = null;
		setFrequency(med2 = Frequency.PRN);
		setFrequency(med1 = Frequency.before_bed);
		return false;
	}
}
