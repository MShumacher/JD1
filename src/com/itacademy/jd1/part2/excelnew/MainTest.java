package com.itacademy.jd1.part2.excelnew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		// Cell cell = new Cell();
		// Cell cell = cell;
		// cell.setValue("hello");
		Sheet sheet = new Sheet();
		try (FileInputStream fis = new FileInputStream("first.xls");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			sheet = (Sheet) ois.readObject();
			ois.close();
		}
		Row row = new Row();
		Cell cell = new Cell();
		row.addCell("A", cell);
		sheet.addRow(1, row);
		// sheet.getRow(1).getCell("A").setValue("hello");
		System.out.println(sheet.getRow(1).getCell("A").getValue());
		try {
			System.out.println(sheet.getRow(1).getCell("B").getValue());
		} catch (NullPointerException e) {
			System.out.println("Cell doesn't exist.");
		}

	}
}