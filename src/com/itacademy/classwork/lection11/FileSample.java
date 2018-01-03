package com.itacademy.classwork.lection11;

import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\new.txt");
		System.out.println("file exists: " + file.exists());
		if (file.exists()) {
			System.out.println("file has been created before");
		} else {
			System.out.println("file created");
			file.createNewFile();
		}
		File fileDir = new File("d:\\new\\new\\new");
		// fileDir.mkdirs();
		System.out.println("file is directory " + fileDir.isDirectory());
		if (fileDir.isDirectory()) {
			System.out.println("file is directory");
			fileDir.list();
		} else {
			System.out.println("file created");
			fileDir.mkdirs();
		}

	}

}
