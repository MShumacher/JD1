package com.itacademy.jd1.part2.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Menu {

	public void open() throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter filename.");
		String fileName = scan.next();
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Sheet sheet = (Sheet) ois.readObject();
			ois.close();
			// System.out.println(sheet);
			workWithFile(sheet);
		}
	}

	public void h() {
		System.out.println("\"-h\" for help.");
		System.out.println("\"-create\" for create new document.");
		System.out.println("\"-open\" for open document.");
		System.out.println("\"-exit\" for exit.");
	}

	public void create() throws FileNotFoundException, IOException {
		System.out.println("New excelfile was created.");
		Cell cell = new Cell();
		Row row = new Row(cell, 0);
		Sheet sheet = new Sheet(0, row);
		workWithFile(sheet);
	}

	public void workWithFile(Sheet sheet) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You start work with file.");
		String s = "";
		do {
			System.out.println("Please, enter command.(\"-h\" for help)");
			s = scan.next();
			Menu2 menu2 = new Menu2();
			switch (s) {
			case "-h":
				menu2.h();
				break;
			case "-saveFile":
				menu2.saveFile(sheet);
				break;
			case "-editCell":
				int i;
				int j;
				do {
					System.out.println("Please, enter cell address. Enter number row");
					i = scan.nextInt();
					System.out.println("Enter number col");
					j = scan.nextInt();
				} while (!isAddressValid(i, j)); {
				menu2.editCell(sheet, i, j);
			}
				break;
			case "-readCell":
				do {
					System.out.println("Please, enter cell address. Enter number row");
					i = scan.nextInt();
					System.out.println("Enter number col");
					j = scan.nextInt();
				} while (!isAddressValid(i, j));
				menu2.readCell(sheet, i, j);
				break;
			case "-exit":
				break;
			default:
				System.out.println("\"-h\" for help.");
			}
		} while (!s.equals("-exit"));

	}

	public boolean isAddressValid(int i, int j) {
		if ((i <= 1000) && (j < 30)) {
			return true;
		} else {
			return false;
		}
		// return address.matches("\\[[0-9]+,[A-Z]\\]");
	}
}