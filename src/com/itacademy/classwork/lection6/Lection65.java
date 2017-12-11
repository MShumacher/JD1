package com.itacademy.classwork.lection6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lection65 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("default local date string: " + date);
		System.out.println("current time in millis: " + date.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println("formatted date default: " + sdf.format(date));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		System.out.println("formatted date: " + sdf1.format(date));
		String strDate = "2017-06-12T21:06:34";
		Date parsedDate = sdf1.parse(strDate);
		System.out.println("parseDate: " + parsedDate.getTime());
		for (int i = 0; i < 18800888; i++) {
			i++;
		}
		Date date2 = new Date();
		System.out.println("current time in millis: " + date2.getTime());

	}

}
