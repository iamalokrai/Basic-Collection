package com.cg.collection;

//Class Car having setter and getter methods 
public class Car implements Comparable<Car> {
	String maker;
	String model;
	int year;
	int price;

	public Car(String maker, String model, int year, int price) { // Constructor
																	// for the
																	// Car class
		super();
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// toString method to print through calling constructors
	@Override
	public String toString() {
		return "Car [maker=" + maker + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	// hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	// compareTo method to compare and get that result
	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		return maker.compareTo(car.maker);
	}

}
