package com.itacademy.jd1.part2.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Menu2 {

	public void readCell() {

	}

	public void editCell() {
	}

	public void saveFile(Sheet sheet) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter filename.");
		String fileName = scan.next();
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(sheet);
		}
	}

	public void h() {
		System.out.println("\"-h\" for help.");
		System.out.println("\"-saveFile\" for save your document.");
		System.out.println("\"-editCell\" for edit Cell.");
		System.out.println("\"-readCell\" for read Cell.");
		System.out.println("\"-exit\" for exit to previous menu.");

	}
}
