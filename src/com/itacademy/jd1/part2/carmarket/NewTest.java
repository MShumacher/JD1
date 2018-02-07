package com.itacademy.jd1.part2.carmarket;

import java.io.File;
import java.io.IOException;

public class NewTest {

	public static void main(String[] args) throws IOException {
		File pathDir = null;
		String filePath = "F:\\Work\\Учеба\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\part2\\carmarket\\base\\models";
		String[] pathsFilesAndDir;
		try {
			pathDir = new File(filePath);
			// Массив файлов и папок
			pathsFilesAndDir = pathDir.list();
			int i=1;
			for (String brand : pathsFilesAndDir) {
				// Вывод списка файлов и каталогов
				brand = brand.replace(".txt", "");
				filePath = filePath.concat(brand);
				System.out.println(brand+" "+i++);

			}
		} catch (Exception e) {
			new File(filePath).createNewFile();
		}

	}

}
