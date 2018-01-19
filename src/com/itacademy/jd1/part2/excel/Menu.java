package com.itacademy.jd1.part2.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Menu {
	private String[] menu;

	public Menu(String... menu) {
		this.menu = menu;
	}

	public void open() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter filename.");
		ExcelFile excelfile = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		String fileName = scan.next();
		try {
			fis = new FileInputStream(fileName);
			in = new ObjectInputStream(fis);
			excelfile = (ExcelFile) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public void h() {
		System.out.println("\"-create\" for create new docyment.");
		System.out.println("\"-open\" for open document.");
		System.out.println("\"-exit\" for exit.");
	}

	public void print(String message) {
		for (int i = 0; i < menu.length; i++) {
			if (message == menu[i]) {
			}
		}
	}

	public void create() {
		System.out.println("New excelfile was created.");
		System.out.println("Please, enter command.(\"-h\" for help)");
		Menu menu = new Menu("-h", "-savefile", "-editcell", "-readcell", "-exit");
		Cell cell = new Cell();
		Row row = new Row(cell, 0);
		Sheet sheet = new Sheet(row, 0);

	}
}