package com.itacademy.jd2.classwork.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Task2 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		System.out.println(numberFormat.format(15300000.5));
	}

}
