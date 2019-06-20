/*
 *  Same Question as seen in ObjectAndMethodsPract1. java class but with different method implementation- 
method now accepts parameters while called
 * Write a program by creating an 'Employee' class having the following methods and print the final salary. -
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hour
IMPLEMENT THIS BY LETTING ONE METHOD LEVERAGE THE RETURN OF ANOTHER METHOD
 */
package com.YomiOluwadara.Abstraction;

import java.util.Scanner;

public class usingLocalVarOfAnotherMethod {
	
	int getSalary() throws Exception { 
	System.out.println("Enter the employee salary");
			Scanner scan = new Scanner (System.in);
			int salary = scan.nextInt();
		    return salary;
	}
	
  int getNoOfHoursPerday() throws Exception{
	  System.out.println("Enter number of hours employess worked today");
	  Scanner scan2 = new Scanner(System.in);
	  int noOfHours = scan2.nextInt();
	  return noOfHours;
	  }
  int addSalary(int x) {     // x will be salary passed in
	  if (x< 500) {
		  int newsalary = x + 10;
		   }
	  return x;  
	  }
	  
  int addSalaryByHour (int y) {   // y will be number of hours 
	  if(y > 6) {
		  
		  
	  }
	  return y;  
  }
  
	  
	  
	  
	public static void main(String[] args) {
		
		

	}

}
