package com.javainuse.model;

public class Product {

	private String type;
	private int discount;
	private Location location;

	public Product(String type, int discount, Location location) {
		super();
		this.type = type;
		this.discount = discount;
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
}