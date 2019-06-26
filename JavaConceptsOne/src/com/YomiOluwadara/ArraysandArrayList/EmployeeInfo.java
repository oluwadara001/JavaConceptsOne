/*
 *using List & ArrayList, model a class that hold employee name, age, role, contract end date (for temps)-  and salary
 *hint: overload the constructor &
 */
package com.YomiOluwadara.ArraysandArrayList;

public class EmployeeInfo {
	String employeeName;
	double employeeAge;
	String employeeRole;
	double employeeSalary;
	String employeeContractEndDate;   // use the date class next time-slack off for first time
	
	// setters and getters 

	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getEmployeeAge() {
		return employeeAge;
	}



	public void setEmployeeAge(double employeeAge) {
		this.employeeAge = employeeAge;
	}



	public String getEmployeeRole() {
		return employeeRole;
	}



	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}



	public double getEmployeeSalary() {
		return employeeSalary;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public void setEmployeeContractEndDate(String employeeContractEndDate) {
		this.employeeContractEndDate = employeeContractEndDate;
	}
	
	public String getEmployeeContractEndDate() {
		return employeeContractEndDate;
	}
	
	// constructors that would be used to  set instantiate the class- overload them
	EmployeeInfo (String employeeName,double employeeAge,String employeeRole,double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

// 2nd constructor- that has contract end date
	EmployeeInfo (String employeeName,double employeeAge,String employeeRole,double employeeSalary,String employeeContractEndDate) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
		this.employeeContractEndDate = employeeContractEndDate;
	}
	
	//overload  this method to account for temporary  staff
	public void printInfNotinList() {
		System.out.println(this.employeeName);
		System.out.println(this.employeeAge);
		
	}

	public static void main(String[] args) {
		// crating instances of the class
		
		EmployeeInfo Sally = new EmployeeInfo("Sally", 38, "Engeineer", 8500);
		EmployeeInfo Amanda = new EmployeeInfo ("Amanda", 25, "HR Specialist", 55000, "12/12/2019");
		System.out.println("This is  " + Sally  +  "being printed not from the list" );
		System.out.println("This is  "  + Amanda + "being printed not from the list" );
		
		//crate an ArrayList object and store the elements in a list
	}

}
