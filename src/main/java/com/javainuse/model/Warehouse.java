package com.javainuse.model;

import java.util.List;

public class Warehouse {

	List <Product> products;
	
	@SuppressWarnings("unchecked")
	public Warehouse(List products) {
		this.products = products;
		System.out.println("Size: " + products.size());
	}
}
