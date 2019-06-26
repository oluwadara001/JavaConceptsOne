/*Declare (using different methods) an array that stores ages of students in a class and print it
 * /*Declare (using different methods) an array that stores names of students in a class and print it
 */
package com.YomiOluwadara.ArraysandArrayList;

public class ArraysDeclarationAndTraversing {

	public static void main(String[] args) {
		//declaring the array using different methods
		//int arrays
		int [] AgeOfStudents = {19,23,34,12,45,32,55,33,44};
		int [] AgeofSudentsTwo = new int [] {3,4,3,5,3,5,3,55,3};
		
		int [] AgeofSudentsTwoThree = new int [4];
		AgeofSudentsTwoThree[0] = 2;
		AgeofSudentsTwoThree[1] = 12;
		AgeofSudentsTwoThree[2] = 2;
		AgeofSudentsTwoThree[3] = 32;
		//traverse the array and print the contents
		for(int i = 0;i<AgeofSudentsTwoThree.length; i++) {
			System.out.println( AgeOfStudents[i] );
			}
	 //String arrays
		   String[] nameArray= {"John", "Paul", "Ringo", "George","Yomi"};
		   //traversing the array and printing it
	        for (String name:nameArray)
	        {
	            System.out.println(name);
	        }
}
	}

