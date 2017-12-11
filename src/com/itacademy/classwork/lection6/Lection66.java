package com.itacademy.classwork.lection6;

import java.util.Calendar;
import java.util.Date;

public class Lection66 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date dateFromCalendar = calendar.getTime();
		System.out.println("dateFromCalendar:" + dateFromCalendar);
		// сдвигаем дату на +26 часов
		calendar.add(Calendar.HOUR_OF_DAY, 26);
		System.out.println("shifted date:" + calendar.getTime());
		// сдвигаем дату на -26 часов
		calendar.add(Calendar.HOUR_OF_DAY, -26);
		System.out.println("shifted date:" + calendar.getTime());
	}
}
