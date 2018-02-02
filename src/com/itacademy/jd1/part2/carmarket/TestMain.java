package com.itacademy.jd1.part2.carmarket;

import java.io.File;
import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, SecurityException {
		Car car = new Car();
		Class<?> c = car.getClass();
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			// field.setAccessible(true);
			enterField(car, field);
		}
		System.out.println(car);
	}

	public static void enterField(Car car, Field field) {
		System.out.println("Print " + field.getName().toString() + field.getName().toString());
		Scanner scan = new Scanner(System.in);
		field.setAccessible(true);
		try {
			switch (field.getType().getSimpleName()) {
			case "String":
				String newField = scan.next().toLowerCase();
				if (isFieldCorrect(field, newField)) {
					field.set(car, newField);
				}
				break;
			case "int":
				field.set(car, scan.nextInt());
				break;
			}
		} catch (IllegalArgumentException | IllegalAccessException | InputMismatchException e) {
			System.out.println("Enter correct value.");
			enterField(car, field);
		}
	}

	private static boolean isFieldCorrect(Field field, String newField) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isCarCorrect(Car car) {
		File pathDir = new File(
				"F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\model\\");
		String[] brands = pathDir.list();
		for (int i = 0; i < brands.length; i++) {
			brands[i] = brands[i].substring(0, brands[i].length() - 4);
			// if (car.getBrand().equals(brands[i])
		}
		return false;
	}
}