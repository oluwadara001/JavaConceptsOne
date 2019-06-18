/*
  Same Question as seen in ObjectAndMethodsPract1. java class but with different method implementation- method now accepts parameters while called
 * Write a program by creating an 'Employee' class having the following methods and print the final salary. -
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hour
 */
package com.YomiOluwadara.Abstraction;

import java.util.Scanner;

public class ObjectAndMethodsPract2 {
	//declare instance variable
	double employeeSalary;
	double employeeHoursPerDay;
	//class constructor that would be used when an object is called 
	ObjectAndMethodsPract2() {
		employeeSalary = this.employeeSalary;
		employeeHoursPerDay = this.employeeHoursPerDay;
	}

double  salary (double employeeSalary) {
		 if(employeeSalary < 500) {
			 employeeSalary = employeeSalary + 10; 
		 }
		 else {
			 employeeSalary = employeeSalary;
		 }
		 return employeeSalary;
	 }
double salaryBasedonHours(double employeeSalary) {
	System.out.println("Enter employee hour");//
	Scanner scan = new Scanner(System.in);
	double hour = scan.nextDouble();
	if(hour >6) {
		employeeSalary = employeeSalary + 5;
	}
		else {
			 employeeSalary = employeeSalary;
		}
	
	return employeeSalary;
}
	 
public static void main(String[] args) {
	ObjectAndMethodsPract2 jose = new ObjectAndMethodsPract2 ();
	System.out.println("This is salary based on how much I have been making " + jose.salary(300));
	System.out.println("This is salary based on working more than 6 hours a day " + jose.salaryBasedonHours(300));

}

}

