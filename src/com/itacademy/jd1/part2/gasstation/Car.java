package com.itacademy.jd1.part2.gasstation;

public class Car {
	private FuelType fuelType;
	private int sizeTank;

	public FuelType getFuelType() {
		return fuelType;
	}

	public int getSizeTank() {
		return sizeTank;
	}

	public void setSizeTank(int sizeTank) {
		this.sizeTank = sizeTank;
	}

	public Car(FuelType fuelType, int sizeTank) {
		this.fuelType = fuelType;
		this.sizeTank = sizeTank;
	}

}
