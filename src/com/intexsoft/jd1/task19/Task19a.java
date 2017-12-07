package com.intexsoft.jd1.task19;

public class Task19a {

	public static void main(String[] args) {
		String s = "  это    пример строки с пробелами.  надо посчитать сколько в ней      слов   ";
		s = s.trim();
		int counter = 0;
		if (s.length() != 0)
			counter = 1;
		for (int i = 0; i < s.length() - 1; i++)
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
				counter++;
		System.out.println(String.format("В строке слов: %s", counter));

	}
}