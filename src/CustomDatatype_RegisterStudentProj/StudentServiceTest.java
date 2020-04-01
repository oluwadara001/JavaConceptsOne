/**
 * 
 */
package CustomDatatype_RegisterStudentProj;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author OO046152 : Yomi Oluwadara
 *
 *         JUnit 5 documentation -
 *         https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
 *         example :
 *         https://www.java2novice.com/junit-examples/assert-array-equals/
 */
class StudentServiceTest {

	@DisplayName("method validates and prints the info from the method collectStudentInfo() ")
	@Test
	void printStudentInfo() {
		// TODO : re-work the whole test case
		StudentService studentService = new StudentService();
		ArrayList<List> studentInfo = new ArrayList<List>();
		// List actual [] = studentService.printStudentInfoIntoList();
		Object[] expected = { "apple", "mango", "grape" };
		// assertArrayEquals(expected, actual, () -> "TEST FAILED: expecting " +
		// expected + " returned " + actual);

	}

}
