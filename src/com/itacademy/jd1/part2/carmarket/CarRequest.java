package com.itacademy.jd1.part2.carmarket;

public class CarRequest extends Car {
	private int maxYear;
	private int maxPrice;

	public CarRequest(String brand, String model, int year, int maxYear, int price, int maxPrice, String fuelType) {
		super(brand, model, year, price, fuelType);
		this.maxYear = maxYear;
		this.maxPrice = maxPrice;
	}

	public CarRequest() {
	}

	public int getMaxYear() {
		return maxYear;
	}

	public void setMaxYear(int maxYear) {
		this.maxYear = maxYear;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
}
