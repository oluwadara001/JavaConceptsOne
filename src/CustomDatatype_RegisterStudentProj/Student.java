/**
 * 
 */
package CustomDatatype_RegisterStudentProj;

import java.util.Calendar;
import java.util.UUID;

/**
 * @author OO046152 This class contains the details that student must have
 *         before they can register
 */
public class Student {
	private String studentFName;
	private String studentLName;
	private Calendar studentDOB;
	private UUID studentId;
	private Gender gender;
	private int phoneNumber;

	public String getStudentFName() {
		return studentFName;
	}

	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}

	public String getStudentLName() {
		return studentLName;
	}

	public void setStudentLName(String studentLName) {
		this.studentLName = studentLName;
	}

	public Calendar getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Calendar studentDOB) {
		this.studentDOB = studentDOB;
	}

	public UUID getStudentId() {
		return studentId;
	}

	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// toString
	@Override
	public String toString() {
		return "Student [studentFName=" + studentFName + ", studentLName=" + studentLName + ", studentDOB=" + studentDOB
				+ ", studentId=" + studentId + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}

	// constructor
	public Student(String studentFName, String studentLName, Calendar studentDOB, UUID studentId, Gender gender,
			int phoneNumber) {
		super();
		this.studentFName = studentFName;
		this.studentLName = studentLName;
		this.studentDOB = studentDOB;
		this.studentId = studentId;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public Student() {

	}

}
