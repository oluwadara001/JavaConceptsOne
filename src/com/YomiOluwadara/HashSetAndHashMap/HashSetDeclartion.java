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
		schoolNumberofStudents.add(9632);
		schoolNumberofStudents.add(9632);
		schoolNumberofStudents.add(9632);
		//print the content of the integer type hash set
		System.out.println("The distinct  elements of the integer type Hashset is  " + schoolNumberofStudents);
		//more operation that can be invoked on Hash set by using the reference to invoke the applicable methods in the java built in library
		System.out.println("The size/cardinality/count distinct of elements in this hash set is "  + schoolNumberofStudents.size());
		System.out.println("Is this has set empty? " + schoolNumberofStudents.isEmpty());
		//declaring a has ste of type String
		Set <String> ListOfHowToTakeMed = new HashSet<String>();
		ListOfHowToTakeMed.add("bd- take at bed time");
		ListOfHowToTakeMed.add("td- once a day");
		ListOfHowToTakeMed.add("tid-three times a day");
		ListOfHowToTakeMed.add("qid- three times a day");
		ListOfHowToTakeMed.add("qy- take e=one every h hour");
		//iterate over the String hash set and print the content
		for(String name:ListOfHowToTakeMed) {
			System.out.println(name);
			
		}
		
		
		}

}

