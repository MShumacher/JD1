package com.itacademy.jd1.part2.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.itacademy.jd1.part2.excelnew.Sheet;

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
		Cell cell = new Cell();
		sheet.getRow(1).getCell("A").setValue("hello");
		sheet.getRow(1).getCell("A").getValue();
		sheet.getRow(1).getCell("B").getValue();
	}
}