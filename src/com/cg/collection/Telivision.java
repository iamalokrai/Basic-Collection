package com.cg.collection;

public class Telivision { // Television class created
	String company;
	String type;
	boolean threeDenabled;
	int price;

	// Constructor for telivision class having parameters
	public Telivision(String company, String type, boolean threeDenabled, int price) {

		super();
		this.company = company;
		this.type = type;
		this.threeDenabled = threeDenabled;
		this.price = price;
	}

	@Override
	public String toString() { // Overriding the toString method
		return "Telivision [company=" + company + ", type=" + type + ", threeDenabled=" + threeDenabled + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Telivision other = (Telivision) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
