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
			this.workWithFile(sheet);
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
		Sheet sheet = new Sheet(row, 0);
		this.workWithFile(sheet);
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
				menu2.editCell();
				break;
			case "-readCell":
				menu2.readCell();
				break;
			case "-exit":
				break;
			default:
				System.out.println("\"-h\" for help.");
			}
		} while (!s.equals("-exit"));

	}
}