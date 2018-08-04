package com.cg.collection;

//Importing the packages
import java.util.*;

//Class to create the array collection and implement the methods
public class TestArrayList {

	// main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array list of laptop
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("Dell", "Inspiron", "Windows", "Intel i7"));
		laptop.add(new Laptop("HP", "Pavilion", "Windows", "Intel i9"));
		laptop.add(new Laptop("Apple", "MacBook Pro", "Mac OS", "Intel i7"));
		laptop.add(new Laptop("Apple", "MacBook Pro", "Mac OS", "Intel i7"));
		for (Laptop lap : laptop) {
			System.out.println(lap);
		}

		// Collection of Car
		ArrayList<Car> car = new ArrayList<Car>();
		car.add(new Car("Maruti Suzuki", "Swift", 2017, 800000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		for (Car ca : car) {
			System.out.println(ca);
		}

		// Array list of Telivision
		ArrayList<Telivision> telivision = new ArrayList<Telivision>();
		telivision.add(new Telivision("Sony", "Plasma", true, 300000));
		telivision.add(new Telivision("Samsung", "LED", false, 54000));
		telivision.add(new Telivision("MI", "LCD", false, 35000));
		for (Telivision tv : telivision) {
			System.out.println(tv);
		}

		// Array list of School
		ArrayList<School> school = new ArrayList<School>();
		school.add(new School("St. Xavier's School", "Ballia", "Ballia", 10));
		school.add(new School("G.D Goenka", "Gr. Noida", "G.B. Nagar", 9));
		school.add(new School("D.P.S", "New Delhi", "New Delhi", 9));
		for (School sch : school) {
			System.out.println(sch);
		}

	}

}
