/*
 *using List & ArrayList, model a class that hold employee name, age, role, contract end date (for temps)-  and salary
 *hint: overload the constructor &
 */
package com.YomiOluwadara.ArraysandArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


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
	//3rd constructor that will be used for HashMap
	EmployeeInfo (String employeeName,double employeeSalary){
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	// 4th constructor- default that take no parameters, will use getters and setters
		EmployeeInfo (){
			
		}
		
		public void printInfNotinListForTemp() {
		System.out.println(employeeName);
		System.out.println(employeeAge);
		System.out.println(employeeRole);
		System.out.println(employeeSalary);
		System.out.println(employeeContractEndDate);
		
	}
	
	public void printInfNotinList() {
		System.out.println(employeeName);
		System.out.println(employeeAge);
		System.out.println(employeeRole);
		System.out.println(employeeSalary);
		
	}
	

	public static void main(String[] args) {
		// crating instances of the class
		
		EmployeeInfo emlpyee = new EmployeeInfo("Sally", 38, "Engeineer", 8500);
		EmployeeInfo employeeze = new EmployeeInfo ("Amanda", 25, "HR Specialist", 55000, "12/12/2019");
		EmployeeInfo employeeOne = new EmployeeInfo ("Jonas", 86500.56);
		//crate an instance of the class and use getters and setters to set value
		EmployeeInfo justhired = new EmployeeInfo ();
		justhired.setEmployeeName("Gena");
		justhired.setEmployeeAge(43);
		justhired.setEmployeeContractEndDate("2019/12/12");
		justhired.setEmployeeSalary(10500.00);
		justhired.setEmployeeRole("Senior Software Engineer");
		justhired.printInfNotinList();
		
	
		//using the instances to invoke the methods
		emlpyee.printInfNotinList();
		 employeeze.printInfNotinListForTemp();
		
		//crate an ArrayList object and store the elements in a list Map <datatype> name = new HashMap<datatype>();
		 Map <String,Double> employeeHasMap = new HashMap <String,Double> ();
		//adding elements to the HashMap
		 employeeHasMap.put("Patrick", 4500.00);
		 employeeHasMap.put("Yomi", 79000.56);
		 // print the content of the HashMap
		 System.out.println(employeeHasMap +  " printed from HashMap without traversing with a FOR statement");
		 
	}

}
