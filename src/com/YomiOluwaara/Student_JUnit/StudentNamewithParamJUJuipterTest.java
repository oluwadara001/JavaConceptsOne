package com.YomiOluwaara.Student_JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class StudentNamewithParamJUJuipterTest {
	// class default constructor
	public StudentNamewithParamJUJuipterTest() {

	}

	@Test
	void studNamestest() {
		StudentFinalScore StudentFinalScoreObj = new StudentFinalScore();
		String result = "oluwadara" + "Yomi";
		assertEquals("oluwadaraYomi", result);
	}

}
