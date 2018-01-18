package com.itacademy.jd1.part2.classwork.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Task1 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(rubFormat.format(153.5));

		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		System.out.println(numberFormat.format(15300000.5));

		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
		System.out.println(percentFormat.format(1530.5));

		NumberFormat numberFormat2 = NumberFormat.getNumberInstance(locale);
		Number num = numberFormat2.parse("10,5");
		double n = num.doubleValue();
		System.out.println(n);

	}

}
