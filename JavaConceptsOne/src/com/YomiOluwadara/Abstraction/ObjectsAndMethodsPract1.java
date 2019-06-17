package com.YomiOluwadara.Abstraction;
import java.util.Scanner;
/*
 * Write a program by creating an 'Employee' class having the following methods and print the final salary. -- break it down to 2 methods 
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours
4 - final() -prints the final salary
other option: list all the variable and use getters and setter methods
 */
public class ObjectsAndMethodsPract1 {
	//getting user i/p from keyboard
	
	 double getSalaryInfo( ) {
		System.out.println("Enter Employee salary");
		Scanner scan = new Scanner (System.in);
		double salary = scan.nextDouble();
		return salary;
		}
	double getNoOfHoursWorked() {
		System.out.println("Enter Employee number of worked per day");
		Scanner scan2 = new Scanner(System.in);
		double noOfHours = scan2.nextDouble();
		return noOfHours;
		}

	public static void main(String[] args) {
		//crate and object of the class ObjectsAndMethodsPract1
		ObjectsAndMethodsPract1 Gena = new ObjectsAndMethodsPract1 ();
		System.out.println(Gena.getNoOfHoursWorked());
		System.out.println(Gena.getSalaryInfo());
	
	}

}