package com.itacademy.jd1.part2.carmarket;

public class CommandDelete extends CommandEnterCar {

	public CommandDelete(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		Car car = enterCar();
		CarBase carBase = CarBase.getMyBase();
		carBase.deleteCar(car);
		carBase.print();
	}

}
