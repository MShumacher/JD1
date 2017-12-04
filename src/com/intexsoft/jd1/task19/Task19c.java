package com.intexsoft.jd1.task19;

public class Task19c {

	public static void main(String[] args) {
		String s = " это пример строки с пробелами.  надо посчитать сколько в ней      слов ";
		int Counter = 0;
		while (s.indexOf(" ") != -1) {
			if (s.charAt(0) != ' ') {
				Counter++;
				s = s.substring(s.indexOf(" "));
			} else
				s = s.substring(1);
		}
		if (s.length() != 0)
			Counter++;
		System.out.println(String.format("В строке слов: %s", Counter));
	}
}