/**
 * 
 */
package com.YomiOluwaara.Student_JUnit;

import java.util.Scanner;
import java.util.UUID;

/**
 * @author OO046152 : Yomi Oluwadara
 * 
 *         Contains methods that relates to student academic record
 */
public class StudentFinalScore {
	// write constructors after all variable have been declared
	private String studFName;
	private String studLastName;
	private UUID studId;
	private double studTestscore;
	private double studExamScore;
	private double finalScore;
	private studGradeScale studGrade;

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

	public UUID getStudId() {
		return studId;
	}

	public void setStudId(UUID studId) {
		this.studId = studId;
	}

	public double getStudTestscore() {
		return studTestscore;
	}

	public void setStudTestscore(double studTestscore) {
		this.studTestscore = studTestscore;
	}

	// method to take student names from input and return it

	public double getStudExamScore() {
		return studExamScore;
	}

	public void setStudExamScore(double studExamScore) {
		this.studExamScore = studExamScore;
	}

	public studGradeScale getStudGrade() {
		return studGrade;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public void setStudGrade(studGradeScale studGrade) {
		this.studGrade = studGrade;
	}

	// @overloaded class: parameterized constructor-for setting intial values when
	// class is instantiated
	public StudentFinalScore(String studFName, String studLastName, UUID studId, double studTestscore,
			double studExamScore, double finalScore, studGradeScale studGrade) {
		super();
		this.studFName = studFName;
		this.studLastName = studLastName;
		this.studId = studId;
		this.studTestscore = studTestscore;
		this.studExamScore = studExamScore;
		this.finalScore = finalScore;
		this.studGrade = studGrade;
	}

	// overloaded constructor : default
	public StudentFinalScore() {

	}

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

	// method that generates student id and returns it
	public UUID studID() {
		UUID id = UUID.randomUUID();
		setStudId(id);
		System.out.println(" student id is " + getStudId());
		return getStudId();
	}

	// method that takes and return student test score
	public double studTestScore() {
		final double invalidScore = 999;
		System.out.println("enter student test score (must be less than or equal to 30) ");
		setStudTestscore(new Scanner(System.in).nextDouble());
		if (getStudTestscore() <= 30.0) {
			System.out.println("student score is " + getStudTestscore());
			return getStudTestscore();
		} else
			System.out.println("Invalid score has been entered");
		return invalidScore;
	}

	// method that takes student final score
	public double studExamScore() {
		final double invalidScore = 999;
		System.out.println("enter student exam score (must not be more greater than 70) ");
		setStudExamScore(new Scanner(System.in).nextDouble());
		if (getStudExamScore() <= 70) {
			System.out.println("Student exams score is " + getStudExamScore());
			return getStudExamScore();
		} else
			System.out.println("Invalid score has been entered");
		return invalidScore;

	}

	// method that computes student final score
	public double studFinalScore() {
		setFinalScore(getStudTestscore() + getStudExamScore());
		return getFinalScore();

	}

	// method that computes students final grade
	public void studFinalGrade() {
		if (getFinalScore() > 0 && getFinalScore() <= 49) {
			System.out.println("Student final grade is " + studGradeScale.F);
		} else if (getFinalScore() >= 50 && getFinalScore() <= 60) {
			System.out.println("Student final grade is " + studGradeScale.C);
		} else if (getFinalScore() >= 61 && getFinalScore() <= 89) {
			System.out.println("Student final grade is " + studGradeScale.B);
		} else if (getFinalScore() >= 90 && getFinalScore() <= 100) {
			System.out.println("Student final grade is " + studGradeScale.A);

		}

	}

}
