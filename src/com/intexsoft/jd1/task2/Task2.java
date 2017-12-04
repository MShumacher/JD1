package com.intexsoft.jd1.task2;

public class Task2 {
	public static void main(String[] args) {
		int s = 37000000;
		int sec;
		int m, h;
		int min, hour;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		int d;
		int day, week;
		d = (h - hour) / 24;
		day = d % 7;
		week = (d - day) / 7;
		System.out.println(String.format("%s недель %s дней %s часов %s минут %s секунд", week, day, hour, min, sec));
	}
}