package com.itacademy.classwork.lection11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task30 {

	public static void main(String[] args) throws IOException {
		String filePath = "d:\\oleole\\JD1\\src\\com\\itacademy\\classwork\\lection11\\task30.txt";
		System.out.println(new File(filePath).exists());
		List<String> lines = Files
				.readAllLines(Paths.get(filePath), Charset.forName("cp1251"));
	
		int wordsCount = 0;
		for (String string : lines) {
			System.out.println(string);
			String[] split = string.split(" ");
			wordsCount += split.length;
		}
				System.out.println(String.format("Text in file has %s words.", wordsCount));
	}

}
