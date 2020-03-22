/**
 * 
 */
package com.YomiOluwaara.Student_JUnit;

import java.util.Scanner;

/**
 * @author OO046152 : Yomi Oluwadara
 * 
 *         Contains methods that relates to student academic record
 */
public class StudentFinalScore {
	private String studFName;
	private String studLastName;

	public String getStudFName() {
		return studFName;
	}

	public void setStudFName(String studFName) {
		this.studFName = studFName;
	}

	public String getStudLastName() {
		return studLastName;
	}

	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}

	// method to take student names from input and return it
	@SuppressWarnings("resource")
	public String studNames() {
		System.out.println("Enter student First name");
		setStudFName(new Scanner(System.in).nextLine());
		System.out.println("Enter student Last name");
		setStudLastName(new Scanner(System.in).nextLine());
		System.out.println("Student " + getStudLastName() + " " + getStudFName() + "  has been recorded");

		return getStudLastName() + getStudFName();
	}

	// @overloaded method- taking parameters at runtime
	public String studNames(String studFName, String studLastName) {

		System.out.println("name are " + studFName + " and " + studLastName);

		return studFName + studLastName;

	}

}
