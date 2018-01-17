package com.itacademy.jd2.gasstation;

public class Car {
	private String fuel;
	private int sizeTank;

	public String getFuel() {
		return fuel;
	}

	public int getSizeTank() {
		return sizeTank;
	}

	public Car(String fuel) {
		this.fuel = fuel;
		this.sizeTank = 1 + (int) (Math.random() * 20);
	}

}
