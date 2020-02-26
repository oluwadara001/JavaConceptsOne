/**
 * 
 */
package CustomDatatype_RegisterStudentProj;

import java.util.Calendar;
import java.util.Scanner;
import java.util.UUID;

/**
 * @author OO046152 Class that holds operations that could be performed on
 *         student
 */
public class StudentService extends Student {

	public StudentService(String studentFName, String studentLName, Calendar studentDOB, UUID studentId, Gender gender,
			int phoneNumber) {
		super(studentFName, studentLName, studentDOB, studentId, gender, phoneNumber);

	}

	public StudentService() {

	}

	public void getAllStudents() {
		System.out.println("Enter Student First Name");
		setStudentFName(new Scanner(System.in).nextLine());
		System.out.println("Enter Student Last Name");
		setStudentLName(new Scanner(System.in).nextLine());
		Calendar cal = Calendar.getInstance();
		cal.set(1980, 12, 01);

		setStudentDOB(cal);
		UUID id = UUID.randomUUID(); // gen radom id
		setStudentId(id);
		setGender(Gender.female);
		System.out.println("Enter Student phone Number");
		setPhoneNumber(new Scanner(System.in).nextInt());
		// Using an array of type object that can multiple types
		Object[] allStudents = new Object[6];
		allStudents[0] = getStudentFName();
		allStudents[1] = getStudentLName();
		allStudents[2] = getStudentDOB();
		allStudents[3] = getStudentId();
		allStudents[4] = getGender();
		allStudents[5] = getPhoneNumber();
		System.out.println(toString());

	}

}
