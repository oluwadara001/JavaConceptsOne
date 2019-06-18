/*Same Question as seen in ObjectAndMethodsPract1. java class but with different method implementation
  -getters and setters will be used
 * Write a program by creating an 'Employee' class having the following methods and print the final salary. -
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hour
 */
 package com.YomiOluwadara.Abstraction;
public class ObjectAndMethodsPract3_Encapsulation {
	 double employeeSalary;
	 double hourPerDay;

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getHourPerDay() {
		return hourPerDay;
	}

	public void setHourPerDay(double hourPerDay) {
		this.hourPerDay = hourPerDay;
	}
	double AddSal() {
		if(employeeSalary< 500) {
			employeeSalary = employeeSalary + 10;
		}
		return employeeSalary;
	}
	double AddWork() {
		if (hourPerDay >6) {
			employeeSalary = employeeSalary +5;
		}
		return employeeSalary;
	}
	

	public static void main(String[] args) {
		//crating objects/references and using the reference for setting values for variables, and also  for calling the methods
		ObjectAndMethodsPract3_Encapsulation Odell = new ObjectAndMethodsPract3_Encapsulation ();
		Odell.setEmployeeSalary(300);
		Odell.setHourPerDay(7);
		System.out.println("Salary when employee makes less than 500 is  " + Odell.AddSal());
		System.out.println("salary when employese works more than 6 hours a day is " + Odell.AddWork());
		//just playing with getters here haha !
		//System.out.println(Odell.getHourPerDay());

		ObjectAndMethodsPract3_Encapsulation Yomi = new ObjectAndMethodsPract3_Encapsulation ();
		Yomi.setEmployeeSalary(600);
		Yomi.setHourPerDay(10);
		System.out.println("Salary when employee makes less than 500 is  " + Yomi.AddSal());
		System.out.println("salary when employese works more than 6 hours a day is " + Yomi.AddWork());
		
		
	}

}
