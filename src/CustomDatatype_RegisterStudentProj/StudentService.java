/**
 * 
 */
package CustomDatatype_RegisterStudentProj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * @author OO046152 Class that holds operations that could be performed on
 *         student
 */
public class StudentService extends Student {

	public StudentService(String studentFName, String studentLName, Date studentDOB, UUID studentId, Gender gender,
			int phoneNumber) {
		super(studentFName, studentLName, studentDOB, studentId, gender, phoneNumber);

	}

	public StudentService() {

	}

	@SuppressWarnings("resource")
	public void collectStudentInfo() {
		System.out.println("Enter Student First Name");
		try {
			// setting student names
			setStudentFName(new Scanner(System.in).nextLine());
			System.out.println("Enter Student Last Name");
			setStudentLName(new Scanner(System.in).nextLine());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			System.out.println("Enter Student DOB in  the format 'yyyy-mm -dd' ");
			String date = new Scanner(System.in).next();
			// assigning input string to the declared date variable and passing it to the
			// setter method
			Date studentDOB = sdf.parse(date);
			// setting student id
			setStudentDOB(studentDOB);
			UUID id = UUID.randomUUID(); // generate random id
			setStudentId(id);
			// setting student gender
			System.out.println(
					"Enter your gender : type 'f' for Female, 'm' for Male, 's' for self identified, 'o' for others");
			String userChoice = new Scanner(System.in).nextLine();
			switch (userChoice) {
			case "f":
				setGender(Gender.female);
				break;
			case "m":
				setGender(Gender.male);
				break;
			case "s":
				setGender(Gender.self_identified);
				break;
			case "o":
				setGender(Gender.others);
				break;
			}
			// setting student phone number
			System.out.println("enter student phone number(must be exact 10 digits)");
			setPhoneNumber(new Scanner(System.in).nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Error: Invalid input, try again");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Error: Invalid input, try again");
			e.printStackTrace();
		} finally {
			System.out.println("The student information we have on file is");
			// calling the printStudentInfo() from the finally block
			// printStudentInfo();
			printStudentInfoIntoList();
		}

	}

	// validate each variable and add to a a data structure-map
	public void printStudentInfo() {
		String phoneNo = String.valueOf(getPhoneNumber()); // convert phone to String so can validate
		if (getStudentFName().isEmpty() || getStudentLName().isEmpty() || getStudentDOB() == null || getGender() == null
				|| getStudentId() == null || phoneNo.length() != 10) {
			System.out.println("One of the student information is not correct,check and try again");

		} else {
			// ArayList of type Object to hold multiple data types in one ArrayList
			ArrayList<Object> studentInfo = new ArrayList<Object>();
			studentInfo.add(getStudentFName());
			studentInfo.add(getStudentLName());
			studentInfo.add(getStudentDOB());
			studentInfo.add(getGender());
			studentInfo.add(getStudentId());
			studentInfo.add(getPhoneNumber());
			System.out.println(studentInfo);
		}
	}

	// returns the student info as a List
	public List printStudentInfoIntoList() {
		// ArayList of type Object to hold multiple data types in one ArrayList
		ArrayList<Object> studentInfo = new ArrayList<Object>();
		String phoneNo = String.valueOf(getPhoneNumber()); // convert phone to String so can validate
		if (getStudentFName().isEmpty() || getStudentLName().isEmpty() || getStudentDOB() == null || getGender() == null
				|| getStudentId() == null || phoneNo.length() != 10) {
			System.out.println("One of the student information is not correct,check and try again");

		} else {
			studentInfo.add(getStudentFName());
			studentInfo.add(getStudentLName());
			studentInfo.add(getStudentDOB());
			studentInfo.add(getGender());
			studentInfo.add(getStudentId());
			studentInfo.add(getPhoneNumber());
		}
		System.out.println(studentInfo);
		return studentInfo;

	}

}
