package com.cg.collection;

//Imorting package
import java.util.*;

//Class to create a TreeSet
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet of car which will remove repetition and sort it
		TreeSet<Car> car = new TreeSet<Car>();
		car.add(new Car("Maruti Suzuki", "Swift", 2017, 800000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		car.add(new Car("Renault", "Duster", 2012, 1100000));
		car.add(new Car("Audi", "R8", 2016, 20000000));
		// Printing the whole collection using for each loop
		for (Car ca : car) {
			System.out.println(ca);
		}

	}

}
