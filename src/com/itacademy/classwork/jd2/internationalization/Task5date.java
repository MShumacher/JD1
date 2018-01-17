package com.itacademy.classwork.jd2.internationalization;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Task5date {

	public static void main(String[] args) throws ParseException {
		Date currentDate = new Date();
		Locale locale = new Locale("ru", "RU");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(df.format(currentDate));
		System.out.println(df.parse("17 января 2018 г."));
	}

}
