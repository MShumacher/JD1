package com.itacademy.jd1.part2.gasstation;

public class Car {
	private String fuel;
	private int sizeTank;

	public String getFuel() {
		return fuel;
	}

	public int getSizeTank() {
		return sizeTank;
	}

	public void setSizeTank(int sizeTank) {
		this.sizeTank = sizeTank;
	}

	public Car(String fuel, int sizeTank) {
		this.fuel = fuel;
		this.sizeTank = sizeTank;
	}

}
