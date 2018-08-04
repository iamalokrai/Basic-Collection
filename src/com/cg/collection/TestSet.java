package com.cg.collection;

//Importing util packages
import java.util.*;

//Class to create collection of all the classes in HashSet
public class TestSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating HashSet of Laptop with repeated enteries
		Set<Laptop> laptop = new HashSet<Laptop>();
		laptop.add(new Laptop("Dell", "Inspiron", "Windows", "Intel i7"));
		laptop.add(new Laptop("HP", "Pavilion", "Windows", "Intel i9"));
		laptop.add(new Laptop("Apple", "MacBook Pro", "Mac OS", "Intel i7"));
		laptop.add(new Laptop("Dell", "Inspiron", "Windows", "Intel i9"));
		laptop.add(new Laptop("HP", "Pavilion", "Linux", "Intel i11"));
		// For each loop to print all the entries
		for (Laptop lap : laptop) {
			System.out.println(lap);
		}

		// HashSet of the class Car
		HashSet<Car> car = new HashSet<Car>();
		car.add(new Car("Maruti Suzuki", "Swift", 2017, 800000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		for (Car ca : car) {
			System.out.println(ca);
		}

		// HashSet of Telivision
		HashSet<Telivision> telivision = new HashSet<Telivision>();
		telivision.add(new Telivision("Sony", "Plasma", true, 300000));
		telivision.add(new Telivision("Samsung", "LED", false, 54000));
		telivision.add(new Telivision("MI", "LCD", false, 35000));
		telivision.add(new Telivision("Sony", "Plasma", true, 300000));
		telivision.add(new Telivision("Samsung", "LED", false, 54000));
		telivision.add(new Telivision("MI", "LCD", false, 35000));
		for (Telivision tv : telivision) {
			System.out.println(tv);
		}

		// Creating HashSet of School
		HashSet<School> school = new HashSet<School>();
		school.add(new School("St. Xavier's School", "Ballia", "Ballia", 10));
		school.add(new School("G.D Goenka", "Gr. Noida", "G.B. Nagar", 9));
		school.add(new School("D.P.S", "New Delhi", "New Delhi", 9));
		school.add(new School("St. Xavier's School", "Ballia", "Ballia", 10));
		// Displaying the whole HashSet
		for (School sch : school) {
			System.out.println(sch);
		}

	}
}
