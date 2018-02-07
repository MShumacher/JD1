package com.itacademy.jd1.part2.carmarket;

import java.io.Serializable;

public class Car implements Serializable {
	private String brand;
	private String model;
	private String fuelType;
	private int year;
	private int price;

	public Car() {
	}

	public Car(String brand, String model, int year, int price, String fuelType) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return brand + " " + model + " " + year + " " + price + " " + fuelType;

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	public String getFuelType() {
		return fuelType;
	}

	@Override
	public boolean equals(Object car) {
		if ((this.brand.equals(((Car) car).brand)) && (this.model.equals(((Car) car).model))
				&& (this.fuelType.equals(((Car) car).fuelType)) && (this.price == (((Car) car).price))
				&& (this.year == (((Car) car).year))) {
			return true;
		} else {
			return false;
		}
	}

	public Car match(CarRequest carRequest) {
		if ((this.brand.equals(carRequest.getBrand()) && (this.model.equals(carRequest.getModel()))
				&& (this.fuelType.equals(carRequest.getFuelType())) && (this.price == carRequest.getMaxPrice())
				&& (this.year == carRequest.getMaxYear()))) {
			return this;
		}
		return null;
	}
}