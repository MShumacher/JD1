package com.itacademy.jd1.part2.carmarketdb;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.itacademy.jd1.part2.carmarketdb.dao.IBrandDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IFuelTypeDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IModelDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.BrandDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.FuelTypeDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.ModelDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public abstract class Command {
	private String value;
	private String output;

	public Command(String value, String output) {
		super();
		this.value = value;
		this.output = output;
	}

	public void print() {
		System.out.println(String.format("%s \"%s\"", output, value));
	}

	public String getValue() {
		return value;
	}

	abstract public void execute() throws SQLException, IllegalArgumentException, IllegalAccessException;

	protected Car enterCar() throws SQLException, IllegalArgumentException, IllegalAccessException {
		IBrandDao brandDao = new BrandDaoImpl();
		IModelDao modelDao = new ModelDaoImpl();
		IFuelTypeDao fuelTypeDao = new FuelTypeDaoImpl();
		Car car = new Car();

		Integer brandId = enterCorrectBrand(brandDao);

		Integer modelId = enterCorrectModel(modelDao, brandId);
		car.setModelId(modelId);

		Integer fuelTypeId = enterCorrectFuelType(fuelTypeDao);
		car.setFuelTypeId(fuelTypeId);

		int year = enterCorrectYear();
		car.setYear(year);

		int price = enterCorrectPrice();
		car.setPrice(price);

		return car;
	}

	private int enterCorrectPrice() {
		int price = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct price."));
		try {
			price = scan.nextInt();
		} catch (InputMismatchException e) {
			return enterCorrectPrice();
		}
		if (price <= 0) {
			return enterCorrectPrice();
		}
		return price;
	}

	private int enterCorrectYear() {
		int year = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct year (1900-2018)."));
		try {
			year = scan.nextInt();
		} catch (InputMismatchException e) {
			return enterCorrectYear();
		}
		if ((year < 1900) || (year > 2018)) {
			return enterCorrectYear();
		}
		return year;
	}

	private Integer enterCorrectFuelType(IFuelTypeDao fuelTypeDao)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		String fuelType = "";
		Integer fuelTypeId = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct fuelType."));
		System.out.println("All available fuelType:");
		printNames(fuelTypeDao.getAll());
		fuelType = scan.nextLine();
		if (fuelTypeDao.getByName(fuelType) == null) {
			System.out.println("FuelType is incorrect (If you shore your %s is correct, please, inform us)");
			return enterCorrectFuelType(fuelTypeDao);
		} else {
			fuelTypeId = fuelTypeDao.getByName(fuelType).getId();
		}
		return fuelTypeId;
	}

	private Integer enterCorrectModel(IModelDao modelDao, Integer brandId)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		String model = "";
		Integer modelId = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct model."));
		System.out.println("All available model:");
		printNames(modelDao.getAllByBrandId(brandId));
		model = scan.nextLine();
		if (modelDao.getByNameAndBrandId(model, brandId) == null) {
			System.out.println("Model is incorrect (If you shore your %s is correct, please, inform us)");
			return enterCorrectModel(modelDao, brandId);
		} else {
			modelId = modelDao.getByNameAndBrandId(model, brandId).getId();
		}
		return modelId;
	}

	private Integer enterCorrectBrand(IBrandDao brandDao)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		String brand = "";
		Integer brandId = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct brand."));
		System.out.println("All available brands:");
		printNames(brandDao.getAll());
		brand = scan.nextLine();
		if (brandDao.getByName(brand) == null) {
			System.out.println("Brand is incorrect (If you shore your %s is correct, please, inform us)");
			return enterCorrectBrand(brandDao);
		} else {
			brandId = brandDao.getByName(brand).getId();
		}
		return brandId;
	}

	private static void printNames(List<? extends Object> all) throws IllegalArgumentException, IllegalAccessException {
		for (Object object : all) {
			Class<?> c = object.getClass();
			Field[] fields = c.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getName().equals("name"))
					System.out.print(field.get(object) + ", ");
			}
		}
		System.out.println();
	}

	private static void printList(List<? extends Object> all) {
		for (Object object : all) {
			System.out.print(object.toString() + ", ");
			System.out.println();
		}
	}
}
