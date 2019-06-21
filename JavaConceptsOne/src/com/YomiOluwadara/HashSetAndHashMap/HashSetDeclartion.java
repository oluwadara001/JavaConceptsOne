/*Practice declaring Hash set and possible operations on Hash sets
 *
 * HashSet <data type> name = new HashSet<String>();
 */
package com.YomiOluwadara.HashSetAndHashMap;
import java.util.*; 
public class HashSetDeclartion {

	public static void main(String[] args) {
		//a Hash set holding student school numbers, does not allow dups
		HashSet <Integer> schoolNumberofStudents = new HashSet<Integer>();
		//adding values to the hash set
		schoolNumberofStudents.add(9987);
		schoolNumberofStudents.add(4563);
		schoolNumberofStudents.add(9632);
		//print the content of the integer type hash set
		System.out.println(schoolNumberofStudents);
		
		//Set <Integer> schoolNumberofStudentsEnrolledIn89 = new HashSet<Integer>();
		
		
		
		

	}

}

