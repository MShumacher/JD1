package com.itacademy.jd1.part2.carmarket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Command> firstLevelCommands = new ArrayList<Command>();
		// firstLevelCommands.add(new CommandChangeLanguage(rb.getString("language"),
		// rb.getString("languageM"), rb));
		firstLevelCommands.add(new CommandAdd("add", "For adding car to base print"));
		firstLevelCommands.add(new CommandFind("find", "For finding car in base print"));
		firstLevelCommands.add(new CommandEdit("edit", "For editing base print"));
		firstLevelCommands.add(new CommandExit("exit", "For exit print"));
		Menu menu = new Menu(firstLevelCommands);
		menu.execute();
		System.out.println("Thank you for choosing our carmarket.");
//		 CarBase.getMyBase();
//		 int countCar = 7;
//		 int i = 0;
//		 CarBase carBase = CarBase.getMyBase();
//		 while (i <= countCar) {
//		 String brand = getRandomItem(
//		 "f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\Brand.txt");
//		 String fuelType = getRandomItem(
//		 "f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\FuelType.txt");
//		 String model = getRandomItem(
//		 "f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\model\\"
//		 + brand
//		 + ".txt");
//		 int year = 1978 + (int) (Math.random() * 40);
//		 int price = 8000 + (year - 2018) * 200 + (int) (Math.random() * 10) * 200;
//		 if (model != null) {
//		 i++;
//		 System.out.println(brand + " " + model + " " + year + " " + price);
//		 Car car = new Car(brand, model, year, price, fuelType);
//		 carBase.addCar(car);
//		 }
//		 }
//		 carBase.save();
//		 carBase.print();
	}

	public static void printCarBase() {
		String fileName = "f:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\carBase";
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis);) {
			CarBase carbase = (CarBase) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (Exception e) {
			System.out.println("Something is wrong.");
		}
		Iterator iterator = CarBase.getMyBase().iterator();
		while (iterator.hasNext()) {
			System.out.println((Car) iterator.next());
		}

	}

	public static String getRandomItem(String filePath) {
		List<String> items = new ArrayList<String>();
		int rand = 0;
		try {
			new File(filePath).createNewFile();
			items = Files.readAllLines(Paths.get(filePath));
			rand = (int) (Math.random() * items.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (items.size() == 0) {
			return null;
		} else {
			return items.get(rand);
		}
	}
}