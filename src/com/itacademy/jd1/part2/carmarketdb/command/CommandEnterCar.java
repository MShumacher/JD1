package com.itacademy.jd1.part2.carmarketdb.command;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.itacademy.jd1.part2.carmarketdb.Command;
import com.itacademy.jd1.part2.carmarketdb.AbstractCar;
import com.itacademy.jd1.part2.carmarketdb.dao.IBrandDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IFuelTypeDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IModelDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.BrandDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.FuelTypeDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.ModelDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Car;

public abstract class CommandEnterCar extends Command {

	public CommandEnterCar(String value, String output) {
		super(value, output);
	}

	protected AbstractCar enterAbstractCar() throws SQLException, IllegalArgumentException, IllegalAccessException {
		IBrandDao brandDao = new BrandDaoImpl();
		IModelDao modelDao = new ModelDaoImpl();
		IFuelTypeDao fuelTypeDao = new FuelTypeDaoImpl();
		AbstractCar abstractCar = new AbstractCar();

		boolean fieldCanBeNull = true;
		Integer brandId = enterCorrectBrand(brandDao, fieldCanBeNull);
		abstractCar.setBrandId(brandId);

		Integer modelId = enterCorrectModel(modelDao, brandId, fieldCanBeNull);
		abstractCar.setModelId(modelId);

		Integer fuelTypeId = enterCorrectFuelType(fuelTypeDao, fieldCanBeNull);
		abstractCar.setFuelTypeId(fuelTypeId);

		System.out.println("Minimum year");
		int minYear = enterCorrectYear(fieldCanBeNull);
		abstractCar.setYear(minYear);

		System.out.println("Maximum year");
		int maxYear = enterCorrectYear(fieldCanBeNull);
		abstractCar.setMaxYear(maxYear);

		System.out.println("Minimum price");
		int minPrice = enterCorrectPrice(fieldCanBeNull);
		abstractCar.setPrice(minPrice);

		System.out.println("Maximum price");
		int maxPrice = enterCorrectPrice(fieldCanBeNull);
		abstractCar.setMaxPrice(maxPrice);
		return abstractCar;
	}

	protected Car enterCar() throws SQLException, IllegalArgumentException, IllegalAccessException {
		IBrandDao brandDao = new BrandDaoImpl();
		IModelDao modelDao = new ModelDaoImpl();
		IFuelTypeDao fuelTypeDao = new FuelTypeDaoImpl();
		Car car = new Car();
		boolean fieldCanBeNull = false;
		Integer brandId = enterCorrectBrand(brandDao, fieldCanBeNull);

		Integer modelId = enterCorrectModel(modelDao, brandId, fieldCanBeNull);
		car.setModelId(modelId);

		Integer fuelTypeId = enterCorrectFuelType(fuelTypeDao, fieldCanBeNull);
		car.setFuelTypeId(fuelTypeId);

		int year = enterCorrectYear(fieldCanBeNull);
		car.setYear(year);

		int price = enterCorrectPrice(fieldCanBeNull);
		car.setPrice(price);

		return car;
	}

	private int enterCorrectPrice(boolean fieldCanBeNull) {
		int price = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct price."));
		try {
			price = scan.nextInt();
		} catch (InputMismatchException e) {
			return enterCorrectPrice(fieldCanBeNull);
		}
		if ((fieldCanBeNull) && (price == 0)) {
			return 0;
		}
		if (price <= 0) {
			return enterCorrectPrice(fieldCanBeNull);
		}
		return price;
	}

	private int enterCorrectYear(boolean fieldCanBeNull) {
		int year = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct year (1900-2018)."));
		try {
			year = scan.nextInt();
		} catch (InputMismatchException e) {
			return enterCorrectYear(fieldCanBeNull);
		}
		if ((fieldCanBeNull) && (year == 0)) {
			return 0;
		}
		if ((year < 1900) || (year > 2018)) {
			return enterCorrectYear(fieldCanBeNull);
		}
		return year;
	}

	private Integer enterCorrectFuelType(IFuelTypeDao fuelTypeDao, boolean fieldCanBeNull)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		String fuelType = "";
		Integer fuelTypeId = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct fuelType."));
		System.out.println("All available fuelType:");
		printNames(fuelTypeDao.getAll());
		fuelType = scan.nextLine();
		if ((fieldCanBeNull) && (fuelType.equals("0"))) {
			return 0;
		}
		if (fuelTypeDao.getByName(fuelType) == null) {
			System.out.println("FuelType is incorrect (If you sure your %s is correct, please, inform us)");
			return enterCorrectFuelType(fuelTypeDao, fieldCanBeNull);
		} else {
			fuelTypeId = fuelTypeDao.getByName(fuelType).getId();
		}
		return fuelTypeId;
	}

	private Integer enterCorrectModel(IModelDao modelDao, Integer brandId, boolean fieldCanBeNull)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		String model = "";
		Integer modelId = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct model."));
		System.out.println("All available model:");
		if (brandId == 0) {
			System.out.println("0");
		} else {
			printNames(modelDao.getAllByBrandId(brandId));
		}
		model = scan.nextLine();
		if ((fieldCanBeNull) && (model.equals("0"))) {
			return 0;
		}
		if (modelDao.getByNameAndBrandId(model, brandId) == null) {
			System.out.println("Model is incorrect (If you sure your %s is correct, please, inform us)");
			return enterCorrectModel(modelDao, brandId, fieldCanBeNull);
		} else {
			modelId = modelDao.getByNameAndBrandId(model, brandId).getId();
		}
		return modelId;
	}

	private Integer enterCorrectBrand(IBrandDao brandDao, boolean fieldCanBeNull)
			throws SQLException, IllegalArgumentException, IllegalAccessException {
		String brand = "";
		Integer brandId = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(String.format("Please enter correct brand."));
		System.out.println("All available brands:");
		printNames(brandDao.getAll());
		brand = scan.nextLine();
		if ((fieldCanBeNull) && (brand.equals("0"))) {
			return 0;
		}
		if (brandDao.getByName(brand) == null) {
			System.out.println("Brand is incorrect (If you sure your %s is correct, please, inform us)");
			return enterCorrectBrand(brandDao, fieldCanBeNull);
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
