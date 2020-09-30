package CustomDatatype_RegisterStudentProj;

public class DriverClass {

	public static void main(String[] args) {
		StudentService StudentServiceObj = new StudentService();
		StudentServiceObj.collectStudentInfo();

		Student student1 = new Student(); // using non parameterized constructor to set values
		student1.setStudentFName("Yomi");

	}

}
