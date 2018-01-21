package com.itacademy.jd1.part2.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Menu2 {

	public void readCell(Sheet sheet, int i, int j) {
		System.out.println(sheet.getRow(i).getCell(j).getValue());
	}

	public void editCell(Sheet sheet, int i, int j) {
		System.out.println(String.format("You change cell [%s,%s]. Please enter new value.", i, j));
		Scanner scan = new Scanner(System.in);
		Cell newCell = new Cell();
		newCell.setValue(scan.next());
		if (sheet.getRow(i) != null) {
			sheet.getRow(i).setCell(j, newCell);
		} else {
			Row row = new Row(newCell, j);
			sheet.setRow(i, row);
		}
		System.out.println(String.format("Cell [%s,%s] has been changed.", i, j));
	}

	public void saveFile(Sheet sheet) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter filename.");
		String fileName = scan.next();
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(sheet);
			oos.close();
		}
	}

	public void h() {
		System.out.println("\"-h\" for help.");
		System.out.println("\"-saveFile\" for save your document.");
		System.out.println("\"-editCell\" for edit cell.");
		System.out.println("\"-readCell\" for read cell.");
		// System.out.println("cell input in format [1..1000,A-Z]");
		System.out.println("\"-exit\" for exit to previous menu.");
	}
}
