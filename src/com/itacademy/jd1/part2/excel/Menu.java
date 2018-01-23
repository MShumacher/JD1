package com.itacademy.jd1.part2.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Menu {

	public void open() {
		Scanner scan = new Scanner(System.in);
		String fileName = "";
		do {
			System.out.println("Please, enter correct filename. (for example first.xls)");
			fileName = scan.next();
			try (FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis);) {
				Sheet sheet = (Sheet) ois.readObject();
				ois.close();
				workWithFile(sheet);
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
				fileName = "";
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} while (!isFileNameCorrect(fileName));
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
		Row row = new Row("A", cell);
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
				saveFile(sheet);
				break;
			case "-editCell":
				int i;
				String j;
				do {
					System.out.println("Please, enter cell address. Enter number row. (1-1000)");
					i = scan.nextInt();
					System.out.println("Enter number col. (A-Z)");
					j = scan.next();
				} while (!isAddressValid(i, j));
				menu2.editCell(sheet, i, j);
				break;
			case "-readCell":
				do {
					System.out.println("Please, enter cell address. Enter number row. (1-1000)");
					i = scan.nextInt();
					System.out.println("Enter number col. (A-Z)");
					j = scan.next();
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

	public void saveFile(Sheet sheet) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(System.in);
		String fileName = "";
		do {
			System.out.println("Please, enter correct filename. (for example first.xls)");
			fileName = scan.next();
		} while (!isFileNameCorrect(fileName));
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(sheet);
			oos.close();
		}
	}

	private boolean isFileNameCorrect(String fileName) {
		return fileName.matches("[0-9,a-z,A-Z]+.xls");

	}

	public boolean isAddressValid(int i, String j) {
		if ((0 < i) && (i <= 1000) && (j.matches("[A-Z]"))) {
			return true;
		} else {
			return false;
		}
		// return address.matches("\\[[0-9]+,[A-Z]\\]");
	}
}