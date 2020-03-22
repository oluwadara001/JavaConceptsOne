/**
 * 
 */
package com.YomiOluwaara.Student_JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author OO046152
 * 
 *         Using the runner class API to run the test case --runner is not
 *         compulsory as test cases can be run using the debug option
 * 
 *
 */
public class StudentNamewithParamWithRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(StudentNamewithParamJUJuipterTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
