/*
 * Determining if someone has a fever using their body temperature and implementing the hasFever() in such a way that it can work with tempeature of any unit(C,F or K)
 */

package com.YomiOluwadara.InterviewQ;

public class Temperature {
	private final static double CELSIUS_OFFSET = 273.15;
    private final static double FAHRENHEIT_OFFSET = 32;
    private final static double FAHRENHEIT_FACTOR = 9.0 / 5.0;
    private double tempInKelvin;

    private Temperature () {
        //Private constructor, so only this class can access it
    }

    public static Temperature fromKelvin(double tempInKelvin) {
        final Temperature temperature = new Temperature();
        temperature.tempInKelvin = tempInKelvin;
        return temperature;
    }

    public static Temperature fromCelsius(double tempInCelsius) {
        return fromKelvin(tempInCelsius - CELSIUS_OFFSET);
    }

    public static Temperature fromFahrenheit(double tempInFahrenheit) {
        return fromCelsius((tempInFahrenheit - FAHRENHEIT_OFFSET) / FAHRENHEIT_FACTOR);
    }

    public double getInKelvin() {
        return tempInKelvin;
    }

    public double getInCelsius() {
        return tempInKelvin + CELSIUS_OFFSET;
    }

    public double getInFahrenheit() {
        return getInCelsius()*FAHRENHEIT_FACTOR + FAHRENHEIT_OFFSET;
    }
        
        
        public void hasFever(Temperature temp1, Temperature temp2, Temperature temp3, Temperature temp4, String bodylocation) {
        	 temp1 = Temperature.fromCelsius(39.2);
             temp2 = Temperature.fromFahrenheit(95.3);
             temp3 = Temperature.fromCelsius(39.1);
             temp4 = Temperature.fromCelsius(39.3);
            final int noOfTimesTempTaken = 4;
           
            if(bodylocation.equals("ear")) { //Determine if someone has fever if temperature was taken by the ear
                final double feverTemperature = 98.6;
                double avgTemp = (temp1.getInFahrenheit() + temp2.getInFahrenheit() + temp3.getInFahrenheit() + temp4.getInFahrenheit()) / noOfTimesTempTaken;
                if(avgTemp >= feverTemperature) {
                    System.out.println("This person has a fever because their temperature of " + avgTemp + " is greater than normal which is 98.6");
                } else {
                    System.out.println("This person does not have a fever because their temperature of " + avgTemp + " is less than normal which is 98.6");
                }
            }
            else if (bodylocation.equals("mouth")) { //Determine if someone has fever if temperature was taken by the ear
                final double feverTemperature = 99.6;
                double avgTemp = (temp1.getInFahrenheit() + temp2.getInFahrenheit() + temp3.getInFahrenheit() + temp4.getInFahrenheit()) / noOfTimesTempTaken;
                if(avgTemp >= feverTemperature) {
                    System.out.println("This person has a fever because their temperature of " + avgTemp + " is greater than normal which is 98.6");
                } else {
                    System.out.println("This person does not have a fever because their temperature of " + avgTemp + " is less than normal which is 98.6");
                }
            }
            else if (bodylocation.equals("armpit")) { //Determine if someone has fever if temperature was taken by the ear
                final double feverTemperature = 100.6;
                double avgTemp = (temp1.getInFahrenheit() + temp2.getInFahrenheit() + temp3.getInFahrenheit() + temp4.getInFahrenheit()) / noOfTimesTempTaken;
                if(avgTemp >= feverTemperature) {
                    System.out.println("This person has a fever because their temperature of " + avgTemp + " is greater than normal which is 98.6");
                } else {
                    System.out.println("This person does not have a fever because their temperature of " + avgTemp + " is less than normal which is 98.6");
                }
            }
            else if (! bodylocation.equals("armit")  || ! bodylocation.equals("ear") || ! bodylocation.equals("mouth"))  {   // if location is NOT EQal TO armpit, mouth or ear
    			System.out.println("Location can only be 'ear','mouth' or 'armpit' ");
    		}
        }
        
	public static void main(String[] args) {
		Temperature tempobj = new Temperature();
		
		


	}

}
