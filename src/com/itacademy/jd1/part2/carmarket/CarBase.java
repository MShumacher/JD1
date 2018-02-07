package com.itacademy.jd1.part2.carmarket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

public class CarBase extends LinkedList<Car> implements Serializable {
	private static CarBase carBase_instance;

	private CarBase() {
	}

	public static CarBase getMyBase() {
		try (FileInputStream fis = new FileInputStream(
				"f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\base\\carBase.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			carBase_instance = (CarBase) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			save();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (carBase_instance == null) {
			carBase_instance = new CarBase();
		}
		return carBase_instance;
	}

	public static void save() {
		try (FileOutputStream fos = new FileOutputStream(
				"f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\base\\carBase.txt");
				ObjectOutputStream out = new ObjectOutputStream(fos);) {
			out.writeObject(carBase_instance);
			// out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printMatchCar(CarRequest carRequest) {
		Iterator iterator = carBase_instance.iterator();
		while (iterator.hasNext()) {
			System.out.println(((Car) iterator.next()).match(carRequest));
		}
	}

	public void addCar(Car car) {
		carBase_instance.add(car);
		save();
	}

	@Override
	public void clear() {
		carBase_instance.clear();
		System.out.println("CarBase was successfully cleared.");
		save();
	}

	public void print() {
		Iterator iterator = carBase_instance.iterator();
		while (iterator.hasNext()) {
			System.out.println((Car) iterator.next());
		}
	}

	public void deleteCar(Car car) {
		Iterator iterator = carBase_instance.iterator();
		while (iterator.hasNext()) {
			if (car.equals((Car) iterator.next())) {
				carBase_instance.remove(car);
				System.out.println(car.getBrand() + " was delete from carBase.");
				save();
				return;
			}
		}
		System.out.println(car.getBrand() + " is not found in carBase.");
	}
}