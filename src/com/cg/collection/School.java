package com.cg.collection;

//School class having constructor and getter and setter methods
public class School {
	String name;
	String city;
	String schoolDistrict;
	int greatSchoolranking;

	// Constructor of class School for name,city,district and ranking
	public School(String name, String city, String schoolDistrict, int greatSchoolranking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolranking = greatSchoolranking;
	}

	// toString method to print all the details
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolranking=" + greatSchoolranking + "]";
	}

	// overriding the hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
		return result;
	}

	// overriding the equals method for removing duplicates
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}

}
