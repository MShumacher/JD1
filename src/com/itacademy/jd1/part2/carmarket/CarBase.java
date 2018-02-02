package com.itacademy.jd1.part2.carmarket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

public class CarBase extends HashSet implements Serializable {
	private static CarBase base;

	private CarBase() {
	}

	public static void save() {
		try (FileOutputStream fos = new FileOutputStream(
				"f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\carBase.txt");
				ObjectOutputStream out = new ObjectOutputStream(fos);) {
			out.writeObject(base);
			// out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static CarBase getMyBase() {
		if (base == null) {
//			base = new CarBase();
			try (FileInputStream fis = new FileInputStream(
					"f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\carBase.txt");
					ObjectInputStream ois = new ObjectInputStream(fis);) {
				base = (CarBase) ois.readObject();
				ois.close();
			} catch (FileNotFoundException e) {
				save();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return base;
	}

	public Car getCar(Car car) {
		// TODO find car in base
		return car;
	}

	public void addCar(Car car) {
		base.add(car);
	}

	public void print() {
		Iterator iterator = base.iterator();
		while (iterator.hasNext()) {
			System.out.println((Car) iterator.next());
		}
	}
}