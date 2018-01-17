package com.itacademy.classwork.jd2.internationalization;

import java.text.Collator;
import java.util.Locale;

public class Task6 {

	public static void main(String[] args) {
		Locale locale = new Locale("ru", "RU");
		Collator collator = Collator.getInstance(locale);
		System.out.println(collator.compare("abc", "def"));
		
	}

}
