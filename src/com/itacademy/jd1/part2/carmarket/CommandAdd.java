package com.itacademy.jd1.part2.carmarket;

public class CommandAdd extends CommandEnterCar {

	public CommandAdd(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		Car car = enterCar();
		CarBase carBase = CarBase.getMyBase();
		carBase.addCar(car);
		System.out.println("Car added in carBase.");
		carBase.print();
	}
}
