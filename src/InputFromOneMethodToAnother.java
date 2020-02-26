import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author OO046152 output of one method is consumed by another
 */
public class InputFromOneMethodToAnother {
	public double student_test_score;
	public double student_exam_score;

//getters and setters for class variable that methods are leveraging
	public double getStudent_test_score() {
		return student_test_score;
	}

	public double getStudent_exam_score() {
		return student_exam_score;
	}

	public void setStudent_exam_score(double student_exam_score) {
		this.student_exam_score = student_exam_score;
	}

	public void setStudent_test_score(double student_test_score) {
		this.student_test_score = student_test_score;
	}

	// Taking student test score from user
	@SuppressWarnings("resource")
	public void test_score() {
		try {
			System.out.println("Kindly student test score");
			Scanner sc = new Scanner(System.in);
			// using the setter method to get user input
			setStudent_test_score(new Scanner(System.in).nextDouble());
		} catch (InputMismatchException e) {
			System.out.println(" Your entry is not in the acceptable format, try again");
		} finally {

		}
	}

	// Taking student exam score from user
	@SuppressWarnings("resource")
	public void exam_score() {
		try {
			System.out.println("Kindly enter the student exam score");
			setStudent_exam_score(new Scanner(System.in).nextDouble());
		} catch (InputMismatchException e) {
			System.out.println(" Your entry is not in the acceptable format, try again");
		} finally {

		}
	}

//computing final grade using getters
	public void compute_final_score() {
		double final_score = getStudent_test_score() + getStudent_exam_score();
		System.out.println("Student scored  " + getStudent_test_score() + "  on the test, they scored "
				+ getStudent_exam_score() + "  on the finals, thier final score for the subject is " + final_score);

	}

	public static void main(String[] args) {
		InputFromOneMethodToAnother obj1 = new InputFromOneMethodToAnother();
		obj1.test_score();
		obj1.exam_score();
		obj1.compute_final_score();

	}

}
