package com.itacademy.jd2.classwork.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Task3 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
		System.out.println(percentFormat.format(1530.5));

	}

}
