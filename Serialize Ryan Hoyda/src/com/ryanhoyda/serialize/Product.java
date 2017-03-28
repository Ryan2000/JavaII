package com.ryanhoyda.serialize;

import java.io.Serializable;

public class Product implements Serializable {
	
	int productId;
	String description;
	String manufacturer;
	Double price;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
		@Override
	public String toString() {
		return "Product [productId=" + productId + ", description=" + description + ", manufacturer=" + manufacturer
				+ ", price=" + price + "]";
	}
	
	
	
	

}
