package com.itacademy.jd1.task30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
	public static int countWordsInText(String str) {
		str = str.trim();
		String[] words = str.split("\\W+");
		return words.length;
	}

	public static int countPMarksInText(String str) {
		int counter = 0;
		Pattern pattern = Pattern.compile("\\p{Punct}");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = new BufferedReader(
				new FileReader("d:\\work\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\task30\\task30.txt"));
		String res = bfReader.readLine();
		int counterPMarks = 0;
		int counterWords = 0;
		while (res != null) {
			counterPMarks += countPMarksInText(res);
			counterWords += countWordsInText(res);
			res = bfReader.readLine();
		}
		bfReader.close();
		System.out.println(
				String.format("Text in file has %s words and %s punctuation marks.", counterWords, counterPMarks));
	}

}