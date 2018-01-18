package com.itacademy.jd1.part1.classwork.lection11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationSample2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		serializeSimpleObjects();
		deSerializeSimpleObjects();
	}

	private static void serializeSimpleObjects() throws IOException {

		try (FileOutputStream fos = new FileOutputStream("car.tmp");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Car car = new Car();
			car.setBrand("VW");
			car.setYear(2000);
			System.out.println("before serialization: " + car);
			oos.writeObject(car);
		}

	}

	private static void deSerializeSimpleObjects() throws IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream("car.tmp");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Car car = (Car) ois.readObject();
			System.out.println("after deserialization: " + car);
		}
	}

}
