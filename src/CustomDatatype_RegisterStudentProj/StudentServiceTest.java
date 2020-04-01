/**
 * 
 */
package CustomDatatype_RegisterStudentProj;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
		StudentService studentService = new StudentService();
		Object[] expected = { "yomi", "oluwadara", 1980 - 12 - 31, "male", 1234567890 };
		// TODO: refactor the printStudentInfo() to return a list
		Object[] actual = { "apple", "mango", "grape" };
		assertArrayEquals(expected, actual, () -> "TEST FAILED: expecting " + expected + " returned " + actual);

	}

}
