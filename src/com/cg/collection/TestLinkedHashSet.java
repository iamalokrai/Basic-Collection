package com.cg.collection;

import java.util.*;

//Test class to create LinkedHashSet of all the classes
public class TestLinkedHashSet {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Set<Laptop> laptop = new LinkedHashSet<Laptop>();
		laptop.add(new Laptop("Dell", "Inspiron", "Windows", "Intel i7"));
		laptop.add(new Laptop("HP", "Pavilion", "Windows", "Intel i9"));
		laptop.add(new Laptop("Apple", "MacBook Pro", "Mac OS", "Intel i7"));
		laptop.add(new Laptop("Dell", "Inspiron", "Windows", "Intel i9"));
		laptop.add(new Laptop("HP", "Pavilion", "Linux", "Intel i11"));
		for (Laptop lap : laptop) {
			System.out.println(lap);
		}

		// LinkedHashSet of Car with 5 cars
		LinkedHashSet<Car> car = new LinkedHashSet<Car>();
		car.add(new Car("Maruti Suzuki", "Swift", 2017, 800000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		for (Car ca : car) { // printing this whole set
			System.out.println(ca);
		}

		// LinkedHashSet of Telivision with 5 Telivisions
		LinkedHashSet<Telivision> telivision = new LinkedHashSet<Telivision>();
		telivision.add(new Telivision("Sony", "Plasma", true, 300000));
		telivision.add(new Telivision("Samsung", "LED", false, 54000));
		telivision.add(new Telivision("MI", "LCD", false, 35000));
		telivision.add(new Telivision("Sony", "Plasma", true, 300000));
		telivision.add(new Telivision("Samsung", "LED", false, 54000));
		telivision.add(new Telivision("MI", "LCD", false, 35000));
		for (Telivision tv : telivision) {
			System.out.println(tv);
		}

		// LinkedHashSet of School with 4 School
		LinkedHashSet<School> school = new LinkedHashSet<School>();
		school.add(new School("St. Xavier's School", "Ballia", "Ballia", 10));
		school.add(new School("G.D Goenka", "Gr. Noida", "G.B. Nagar", 9));
		school.add(new School("D.P.S", "New Delhi", "New Delhi", 9));
		school.add(new School("St. Xavier's School", "Ballia", "Ballia", 10));

		for (School sch : school) { // Printing the full set
			System.out.println(sch);
		}

	}

}
