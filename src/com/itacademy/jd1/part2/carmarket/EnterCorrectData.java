package com.itacademy.jd1.part2.carmarket;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EnterCorrectData {

	public static String stringValue(String string) {
		try {
			String filePath = "F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\base\\"
					+ string + ".txt";
			new File(filePath).createNewFile();
			List<String> values = Files.readAllLines(Paths.get(filePath));
			System.out.println(String.format("Please enter correct %s. All available %s:", string, string));
			System.out.println(values);
			Scanner scan = new Scanner(System.in);
			String enterValue = scan.nextLine().toLowerCase();
			for (String value : values) {
				if (enterValue.equalsIgnoreCase(value)) {
					return value;
				}
			}
			if (values.isEmpty()) {
				return scan.toString().toLowerCase();
			} else {
				System.out.println(String.format(
						"%s is incorrect. (If you shore your %s is correct, please, inform us.)", string, string));
				return stringValue(string);
			}
		} catch (IOException e) {
			System.out.println("Something was wrong. Please try again.");
			return stringValue(string);
		}
	}

	public static int intValue(String string) {
		System.out.println(String.format("Please enter %s.", string));
		Scanner scan = new Scanner(System.in);
		try {
			int intValue = scan.nextInt();
			if (intValue > 0) {
				return intValue;
			} else {
				return intValue(string);
			}
		} catch (InputMismatchException e) {
			return intValue(string);
		}
	}
}
