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

public class UsingReturnValueOfOneMethodInAnotherMethod {
	
	static int getSalary() throws Exception { 
	System.out.println("Enter the employee salary");
			Scanner scan = new Scanner (System.in);
			int salary = scan.nextInt();
		    return salary;
	}
	
   static int getNoOfHoursPerday() throws Exception{
	  System.out.println("Enter number of hours employess worked today");
	  Scanner scan2 = new Scanner(System.in);
	  int noOfHours = scan2.nextInt();
	  return noOfHours;
	  }
 static  void  addSalaryByBasePay(int x) {     // x  will be salary from getSalary()
	  if (x< 500) {
		  int newsalary = x + 10;
		  System.out.println("Your adjusted salary is  " + newsalary );
		   }
	  else {
		  System.out.println("Salary adjustment not needed, your already makng more than 500 numb nuts!!");
	  }
	  
}	  
 static  void addSalaryByHour (int y,int  b) {   // y will be number of hours , b  will be salary from getSalary()
	  if(y > 6) {
		  int salary =  b + 5;
		  System.out.println(" Your OT based salary is " + salary);
		  }
	  else {
		  System.out.println("No adjusted salary becuase you worked less than 6 hours/day");
	  }
	  
  }
 
public static void main(String[] args) {
	//getting salary
		try {
		UsingReturnValueOfOneMethodInAnotherMethod.getSalary();
		}
			catch(Exception e) {
				System.out.println("Error occured while invoking the getSalary "  + e.toString());
			}
		finally {
			
		}
	//assigning the return value from the method so it is now in the scope of the class
	try {
		int x =  getSalary();
		}
	catch(Exception e) {
		System.out.println("Error seeting return value for getSalary" + e.toString());
	}
	finally {
		
	}
	//passing in the return value of one method as input to the other while calling the method
	try {
		UsingReturnValueOfOneMethodInAnotherMethod.addSalaryByBasePay(getSalary());
	}
	catch(Exception e) {
		System.out.println("Error occured while passing in paramater into  addSalaryByBasePay " + e.toString());
	}
	finally {
		
	}
	// do the hour based salary part
	try {
		UsingReturnValueOfOneMethodInAnotherMethod.getNoOfHoursPerday();
	}
	catch(Exception e) {
		System.out.println("Error occured while getting the number of hours worked per day " + e.toString());
	}
	finally {
		
	}
	try {
		int y = getNoOfHoursPerday();
	}
	catch(Exception e) {
		System.out.println("Error occured while setting the return value from getNoOfHoursPerday " + e.toString());
	}
	finally {
		
	}
	// //passing in the return values of two method as input to the other while calling the method
	try {
		UsingReturnValueOfOneMethodInAnotherMethod.addSalaryByHour(getSalary(), getNoOfHoursPerday());
	}
	catch(Exception e) {
		System.out.println("Error occured while passing in the retun values from the two methods getSalary() and getNoOfHoursPerday()"
				+ " into the method addSalaryByHour " + e.toString());
	}
	finally {
		
	}
	
	}//end of main

}
