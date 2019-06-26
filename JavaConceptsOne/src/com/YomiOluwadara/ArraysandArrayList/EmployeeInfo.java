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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
