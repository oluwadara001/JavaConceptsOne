/*
  Same Question as seen in ObjectAndMethodsPract1. java class but with different method implementation- method now accepts parameters while called
 * Write a program by creating an 'Employee' class having the following methods and print the final salary. -
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hour
 */
package com.YomiOluwadara.Abstraction;
public class ObjectAndMethodsPract2 {
	//declare instance variable
	double employeeSalary;
	double employeeHoursPerDay;
	
 double  getInfo (double employeeSalary, double employeeHoursPerDay) {
	 if(employeeSalary < 500) {
		 employeeSalary = employeeSalary + 10; 
	 }
	 else {
		 employeeSalary = employeeSalary;
	 }
	 return employeeSalary;
 }
 
 
 
 
public static void main(String[] args) {


}

}

