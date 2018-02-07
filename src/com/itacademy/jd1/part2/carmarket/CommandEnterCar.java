package com.itacademy.jd1.part2.carmarket;

public abstract class CommandEnterCar extends Command {

	public CommandEnterCar(String value, String output) {
		super(value, output);
	}

	protected Car enterCar() {
		Car car = new Car();
		car.setBrand(EnterCorrectData.stringValue("brand"));
		car.setModel(EnterCorrectData.stringValue(car.getBrand()));
		car.setFuelType(EnterCorrectData.stringValue("fuelType"));
		car.setYear(EnterCorrectData.intValue("year"));
		car.setPrice(EnterCorrectData.intValue("price"));
		return car;
	}
}
