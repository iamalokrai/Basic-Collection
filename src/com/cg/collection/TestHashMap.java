package com.cg.collection;

//Importing th packages of hashmap
import java.util.HashMap;
import java.util.Map;

//Class to create HashMap in which key is used to denote a object
public class TestHashMap {

	// Main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a map of Students having name as key and Favorite fruit as
		// object
		Map<String, String> students = new HashMap<String, String>();
		students.put("Alok", "Mango");
		students.put("Udit", "Banana");
		students.put("Gaurav", "Mango");
		students.put("Mayur", "Grapes");
		students.put("Rahul", "Apple");

		// Printing the favorite fruit by giving the name
		System.out.println(students.get("Rahul"));
		System.out.println(students.get("Alok"));
		System.out.println(students.get("Udit"));
		System.out.println(students.get("Mayur"));
		System.out.println(students.get("Gaurav"));

	}

}