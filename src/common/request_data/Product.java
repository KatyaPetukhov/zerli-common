package common.request_data;

import common.JSONObject;

public class Product extends JSONObject {
	public String name;
	public double price;
	public int discount; // Percent
	public String category;
	public String imageString;

	public Product() {
		name = null;
		price = 0.0;
		discount = 0;
		category = null;
		imageString = null;
	}

	public Product(String name, double price, int discount, String category, String imageString) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.category = category;
		this.imageString = imageString;
	}

	public static Product fromJson(String s) {
		/* Add such function to each subclass! */
		return (Product) fromJson(s, Product.class);
	}
}
