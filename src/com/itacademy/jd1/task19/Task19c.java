package com.itacademy.jd1.task19;

public class Task19c {

	public static void main(String[] args) {
		String s = " это пример строки с пробелами.  надо посчитать сколько в ней      слов ";
		int counter = 0;
		while (s.indexOf(" ") != -1) {
			if (s.charAt(0) != ' ') {
				counter++;
				s = s.substring(s.indexOf(" "));
			} else {
				s = s.substring(1);
			}
		}
		if (s.length() != 0) {
			counter++;
		}
		System.out.println(String.format("В строке слов: %s", counter));
	}
}