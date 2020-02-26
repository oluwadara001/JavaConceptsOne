
/*
 * see https://stackoverflow.com/questions/39709125/notify-nurse-about-the-frequency-of-a-medicine-the-patient-must-take
 * for hint on how to implement the schedule functionality (notification functionality that notifies the nurse bout medicine frequency )

The solution i have is
 */
package com.YomiOluwadara.MedicationSchduleStackOVersion;
import java.util.ArrayList; import java.util.List;

import com.YomiOluwadara.MedicationSchduleStackOVersion.Frequency.PartoftheDay; // package path + className + method name (enum)
public class Program {

	public static void main(String[] args) {
	//crating an instance/ object of the Frequency class and using it to set values (from the enum) for the part of day
	    List<Frequency> freque1 = new ArrayList<Frequency>();
	    freque1.add(new Frequency(PartoftheDay.Morning));
	    freque1.add(new Frequency(PartoftheDay.Evening));

	   //crating an instance of the medicine class and assigning in initial values based on the constructor method definition from the medicine class
	    Medicine med1 = new Medicine("Paracetemol", "38g", "For fever");
	    // using the object of the medicine class to set value
	    med1.setFrequencyList(freque1);
	    //Second object and similar operations as performed on the first object
	    List<Frequency> freque2 = new ArrayList<Frequency>();
	    freque2.add(new Frequency(PartoftheDay.Morning));
	    freque2.add(new Frequency(PartoftheDay.Evening));
	    Medicine med2 = new Medicine("Ibuprofen", "38g", "For body pains");
	    med2.setFrequencyList(freque2);
	    //crating an instance of the list class and added to 2 meds
	    List<Medicine> medicineList = new ArrayList<Medicine>();
	    medicineList.add(med1);
	    medicineList.add(med2);
	    
	    //crating an instance of the patient class and assigning initial values based on the constructor definition
	    Patient patient1 = new Patient("Deepthi", "For body pains");
	    patient1.setMedicineList(medicineList);
	    //adding patient1 created above to the list
	    List<Patient> patientList = new ArrayList<Patient>();
	    patientList.add(patient1);
	    //traversing over the list and printing the contents using getter mthods
	    for (Patient patientt : patientList) {
	        System.out.println(patientt.getDisease());
	        System.out.println(patientt.getName());

	        for (Medicine medi : patientt.getMedicineList()) {

	            System.out.println(medi.getDetails() + medi.getComposition()
	                    + medi.getName());

	            for (Frequency freq : medi.getFrequencyList()) {
	                System.out.println(freq.getPart());
	            }

	        }

	    }

	}

	}


