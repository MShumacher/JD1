package com.itacademy.jd2.classwork.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Task4 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		NumberFormat numberFormat2 = NumberFormat.getNumberInstance(locale);
		Number num = numberFormat2.parse("10,5");
		double n = num.doubleValue();
		System.out.println(n);

	}

}
