package com.itacademy.jd1.part1.classwork.lection11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationSample2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		String s = serializeSimpleObjects();
		deSerializeSimpleObjects(s);
	}

	private static String serializeSimpleObjects() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter filename.");
		String fileName = scan.next();
		try (FileOutputStream fos = new FileOutputStream(fileName/* "car.tmp" */);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Car car = new Car();
			car.setBrand("VW");
			car.setYear(2000);
			System.out.println("before serialization: " + car);
			oos.writeObject(car);
		}
		return fileName;
	}

	private static void deSerializeSimpleObjects(String s) throws IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream(s); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Car car = (Car) ois.readObject();
			System.out.println("after deserialization: " + car);
		}
	}

}
