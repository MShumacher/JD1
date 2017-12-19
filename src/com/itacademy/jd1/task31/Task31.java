package com.itacademy.jd1.task31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {

	public static List getNumberFromText(String str) {
		/*
		 * str = str.trim(); String[] words = str.split("\\D+"); LinkedList<Integer>
		 * numbers = new LinkedList<Integer>(); for (String string : words) {
		 * numbers.add(Integer.valueOf(string)); }
		 */
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			numbers.add(Integer.valueOf(m.group()));
		}
		return numbers;
	}

	public static int countSum(List<Integer> marks) {
		int sum = 0;
		for (Integer element : marks) {
			sum += element;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = new BufferedReader(
				new FileReader("d:\\work\\it-academy\\JD1\\src\\com\\itacademy\\jd1\\task31\\task31.txt"));
		String res = bfReader.readLine();
		List<Integer> marks = new LinkedList<Integer>();
		while (res != null) {
			marks.addAll(getNumberFromText(res));
			res = bfReader.readLine();
		}
		System.out.println("All numbers in file:");
		System.out.println(marks);
		System.out.println("Sum all elements in file: " + countSum(marks));
		Set<Integer> marksNoDuplicate = new HashSet<Integer>();
		System.out.println("All numbers without duplicate:");
		marksNoDuplicate.addAll(marks);
		System.out.println(marksNoDuplicate);

	}

}
