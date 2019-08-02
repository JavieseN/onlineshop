package com.es.eoi.shop.entities;

import com.es.eoi.shop.interfaces.Prizable;

public abstract class Article implements Prizable {

	private String name;
	private String code;
	private Double price=0.0;
	private String vat;
	private Integer stock;
	private String category;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public Double getTotalPrice() {			
		return this.getPrice();
	}

	@Override
	public String toString() {
		return "Article [name=" + name + ", code=" + code + ", price=" + price + ", stock=" + stock + ", category="
				+ category + "]";
	}

	




}
