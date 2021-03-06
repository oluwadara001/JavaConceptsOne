/*
 * Declaration and basic operations on hasMaps
 * array: int [] studentage = new int [5];   , int [] sudentName = {"bob","Yomi"};
 * HashSet: set<datatype> hasseName = new HashSet<datatype>();
 * HashMap: HashMap <datatype1,datatype2> hasmapName = new Hashmap<datatype1,datatype2>();
 */
package com.YomiOluwadara.HashSetAndHashMap;
import java.util.*;
public class HashMapDeclaration {

	public static void main(String[] args) {
	
try {

	HashMap <String,Integer> studentNamesAndPhoneNumbers = new HashMap <String,Integer>();
	studentNamesAndPhoneNumbers.put("Yomi", 34353663);
	studentNamesAndPhoneNumbers.put("sean", 2333646);
	System.out.println(studentNamesAndPhoneNumbers);
}
catch(InputMismatchException e) {
	System.out.println("ERROR: input wrongly entered, try again " + e.toString());
	}
finally {
	
}
//declaring the HashMap
 HashMap <String,String> medicationFrequency = new HashMap <String,String>();
//adding values to the HashMap
 medicationFrequency.put("Ibruprofen", "3 times a day");
 medicationFrequency.put("PRN", "use as needed");
 System.out.println(medicationFrequency);
 System.out.println(medicationFrequency.size());
 System.out.println(medicationFrequency.isEmpty());
 //toString is not actually needed.
 System.out.println(medicationFrequency.toString());
}
	}


