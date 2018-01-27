package com.itacademy.jd1.part2.gasstation;

public class Car extends FuelHolder {
	int number;

	public Car(FuelType fuelType, int volumeFuel, int number) {
		super(fuelType, volumeFuel);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
