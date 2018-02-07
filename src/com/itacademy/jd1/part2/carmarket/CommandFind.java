package com.itacademy.jd1.part2.carmarket;

public class CommandFind extends Command {

	public CommandFind(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		System.out.println("");
		CarRequest carRequest = new CarRequest();
		carRequest.setBrand(EnterCorrectData.stringValue("brand"));
		carRequest.setModel(EnterCorrectData.stringValue(carRequest.getBrand()));
		carRequest.setFuelType(EnterCorrectData.stringValue("fuelType"));
		int minYear, maxYear;
		do {
			minYear = EnterCorrectData.intValue("minYear");
			carRequest.setYear(minYear);
			maxYear = EnterCorrectData.intValue("maxYear");
			carRequest.setMaxYear(maxYear);
		} while (minYear > maxYear);
		int minPrice, maxPrice;
		do {
			minPrice = EnterCorrectData.intValue("minPrice");
			carRequest.setYear(minPrice);
			maxPrice = EnterCorrectData.intValue("maxPrice");
			carRequest.setMaxYear(maxPrice);
		} while (minPrice > maxPrice);
	}

}
