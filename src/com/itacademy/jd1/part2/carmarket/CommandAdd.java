package com.itacademy.jd1.part2.carmarket;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class CommandAdd extends Command {

	public CommandAdd(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		Car car = new Car();
		// enterFuelType(enterPrice(enterYear(enterModel(
		car.setBrand(enterBrand());

	}

	private String enterBrand() {
		File pathDir = new File(
				"F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\model\\");
		String[] brands = pathDir.list();
		System.out.println("Please enter correct brand. All available brands:");
		for (int i = 0; i < brands.length; i++) {
			brands[i] = brands[i].substring(0, brands[i].length() - 4);
			System.out.print(brands[i] + ", ");
		}
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String brand = scan.next();
		for (String string : brands) {
			if (brand.equals(string)) {
				return brand;
			}
		}
		System.out.println("Brand is incorrect. (If you shore that brand is correct, please, inform us.)");
		return enterBrand();
	}
}
