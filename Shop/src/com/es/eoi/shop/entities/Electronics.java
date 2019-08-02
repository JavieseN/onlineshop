package com.es.eoi.shop.entities;

public class Electronics extends Article {

	private static final Double ELECTRONICS_VAT = 1.21;
	private String power;
	private Double guarantee;

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Double getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(Double guarantee) {
		this.guarantee = guarantee;
	}

	@Override
	public Double getTotalPrice() {
		System.out.println("CALCULADO CON EL IVA DE ELECTRONICA");
		return this.getPrice() * ELECTRONICS_VAT;
	}

}
