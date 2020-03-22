/**
 * 
 */
package com.YomiOluwaara.Student_JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author OO046152
 * 
 *         Testing parameterized method
 *
 */
public class StudentNamewithParamJU4Test {

	@Test
	public void studNamestestJU4() {
		StudentFinalScore StudentFinalScoreObj = new StudentFinalScore();
		String result = "oluwadara" + "Yomi";
		assertEquals("oluwadaraYomi", result);

	}

}
