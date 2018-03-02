package com.itacademy.jd1.part2.carmarketdb;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.dao.IBrandDao;
import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IFuelTypeDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IModelDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.BrandDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.FuelTypeDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.ModelDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Brand;
import com.itacademy.jd1.part2.carmarketdb.model.Car;
import com.itacademy.jd1.part2.carmarketdb.model.FuelType;
import com.itacademy.jd1.part2.carmarketdb.model.Model;

public class DbLoader {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, SQLException {
		IBrandDao brandDao = BrandDaoImpl.INSTANCE;
		IModelDao modelDao = ModelDaoImpl.INSTANCE;
		ICarDao carDao = CarDaoImpl.INSTANCE;
		IFuelTypeDao fuelTypeDao = FuelTypeDaoImpl.INSTANCE;

		// fillBrandFromFile(brandDao);
		// fillFuelTypeFromFile(fuelTypeDao);
		// fillModelFromFiles(modelDao);
		// fillRandomCars(carDao, 100);

		// printList(brandDao.getAll());
		// printList(modelDao.getAll());
		// printList(fuelTypeDao.getAll());
		printList(carDao.getAll());
	}

	private static void fillRandomCars(ICarDao carDao, int count) throws SQLException {
		for (int i = 0; i < count; i++) {
			Car object = new Car();
			int modelId = 1 + (int) (Math.random() * 757);
			object.setModelId(modelId);
			int year = 1978 + (int) (Math.random() * 40);
			object.setYear(year);
			int price = 8000 + (year - 2018) * 200 + (int) (Math.random() * 10) * 200;
			object.setPrice(price);
			int fuelTypeId = 1 + (int) (Math.random() * 3);
			object.setFuelTypeId(fuelTypeId);
			Integer generatedId = carDao.insert(object);
			System.out.println(String.format("Car %s was added to base.", i));
		}
	}

	private static void fillFuelTypeFromFile(IFuelTypeDao fuelTypeDao) throws SQLException, IOException {
		String filePath = "F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarketdb\\files\\FuelType.txt";
		new File(filePath).createNewFile();
		List<String> values = Files.readAllLines(Paths.get(filePath));
		for (String value : values) {
			FuelType object = new FuelType();
			object.setName(value);
			Integer generatedId = fuelTypeDao.insert(object);
		}
	}

	private static void fillModelFromFiles(IModelDao modelDao) throws SQLException, IOException {
		File pathDir = null;
		String filePath = "F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarketdb\\files\\models\\";
		String[] pathsFilesAndDir;
		pathDir = new File(filePath);
		pathsFilesAndDir = pathDir.list();
		int brandId = 1;
		for (String brand : pathsFilesAndDir) {
			System.out.println(brand);
			List<String> values = Files.readAllLines(Paths.get(filePath + brand));
			for (String value : values) {
				Model object = new Model();
				object.setName(value);
				object.setBrandId(brandId);
				Integer generatedId = modelDao.insert(object);
			}
			brandId++;
		}
	}

	private static void fillBrandFromFile(IBrandDao brandDao) throws IOException, SQLException {
		String filePath = "F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarketdb\\files\\Brand.txt";
		new File(filePath).createNewFile();
		List<String> values = Files.readAllLines(Paths.get(filePath));
		for (String value : values) {
			Brand object = new Brand();
			object.setName(value);
			Integer generatedId = brandDao.insert(object);
		}
	}

	private static void printList(List<? extends Object> all) throws IllegalArgumentException, IllegalAccessException {
		for (Object object : all) {
			Class<?> c = object.getClass();
			Field[] fields = c.getDeclaredFields();
			System.out.println();
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getName().equals("modelId")) {
					System.out.print(String.format("%s=%s ||", field.getName(), field.get(object)));
				}
			}
			System.out.println(object.toString());
		}
	}
}
