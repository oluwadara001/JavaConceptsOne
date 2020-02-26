import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 
 */

/**
 * @author OO046152
 *
 */
public class Medication {
	Calendar medStartDate;
	Calendar medEndDate;
	Frequency frequency;
	private List<Frequency> medFrequency;

	// getters and setters
	public void setMeStartDate(Calendar medStartDate) {
		this.medStartDate = medStartDate;
	}

	public Calendar getMedStartDate() {
		return medStartDate;
	}

	public void setMedendDate(Calendar medEndDate) {
		this.medEndDate = medEndDate;
	}

	public Calendar getMedEndDate() {
		return medEndDate;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setMedFrequencyList(List<Frequency> medFrequencyList) {
		this.medFrequency = medFrequencyList;
	}

	public List<Frequency> getMedFrequencyList() {
		return medFrequency;
	}

	// class constructors @overloaded
	// parameterized constructor- when med has both start and end dates
	public Medication(Calendar medStartDate, Calendar medEndDate, Frequency frequency,
			List<Frequency> medFrequencyList) {
		this.medStartDate = medStartDate;
		this.medEndDate = medEndDate;
		this.frequency = frequency;
		this.medFrequency = medFrequencyList;
	}

	// parameterized constructor- when med has no end date
	public Medication(Calendar medStartDate, Frequency frequency, List<Frequency> medFrequencyList) {
		this.medStartDate = medStartDate;
		this.frequency = frequency;
		this.medFrequency = medFrequencyList;
	}

	// default- no parameter constructor
	public Medication() {

	}

//	Using the medication class, write a method that would calculate all the date & times the
//	patient should take the medication.

//Note: talk about the ideal situation, in real imlementation, I'd be using the setter method and an object 
	// of the scanner class to set these dates
//can take string and convert to date
	public void datesBtwnStartandStop() {
		// creating 3 calendar objects
		Calendar medstart = Calendar.getInstance();
		Calendar medstop = Calendar.getInstance();
		Calendar noEndDate = Calendar.getInstance();
		// setting dates using calendar objects
		medstart.set(2020, 01, 01);
		medstop.set(2020, 01, 8);
		noEndDate.set(1800, 01, 01);
		// System.out.println(medstart.getTime());

		// det dates for PRN meds
		if ((frequency == Frequency.prn_asNeeded) && (medstart.getTime() != null)) {
			System.out.println("med is PRN, take as needed ");
		}
		// det dates for meds with no end dates
		else if (medstart.getTime().before(noEndDate.getTime())) {
			System.out.println("Keep taking the neds, it has no end date");
		}
		// det dates for meds with both start and stop dates
		else if (medstart.getTime().before(medstop.getTime())) {
			List<Date> datesbtw = new ArrayList<Date>();
			datesbtw.add(new Date(medstart.get(Calendar.YEAR)));
			datesbtw.add(new Date(medstart.get(Calendar.MONTH)));
			datesbtw.add(new Date(medstart.get(Calendar.DAY_OF_MONTH)));
			// increment date by 1
			medstart.add(Calendar.DATE, 1);
			// iterate over array and print it
			for (int i = 0; i < datesbtw.size(); i++) {
				System.out.println(datesbtw.get(i));
			}

		}

	}

//	Using the above method, write a function that determines whether two medications would ever be given at
//	the same time given their schedules.
	public boolean takeTwoMedsTogether() {
		Calendar med1StartDate = Calendar.getInstance();
		Calendar med1StopDate = Calendar.getInstance();
		Calendar med2StartDate = Calendar.getInstance();
		Calendar med2StopDate = Calendar.getInstance();
		Frequency med1Freq = null;
		Frequency med2Freq = null;
		// setting dates
		med1StartDate.set(2020, 01, 01);
		med1StopDate.set(2020, 01, 9);
		med2StartDate.set(2020, 01, 6);
		med2StopDate.set(2020, 01, 22);
		// when meds does not have an end date but at least must have a start date
		if (med1Freq == med2Freq && med1StartDate.getTime() != null && med2StartDate.getTime() != null) {
			return true;
		}
//		if meds are PRN- they must have least have a start date
		else if (med1Freq == med2Freq && med1StartDate.getTime() != null && med2StartDate.getTime() != null) {
			med1Freq = Frequency.prn_asNeeded;
			med2Freq = Frequency.prn_asNeeded;
			return true;
			// if meds have both start and stop dates
		} else if (med1Freq == med1Freq && med1StartDate.getTime().after(med2StartDate.getTime())
				&& med2StartDate.getTime().before(med1StopDate.getTime())) {
			return true;

		} else

			return false;
	}

}
