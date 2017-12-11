package com.itacademy.jd1.task3;

public class Task3 {
	public static void main(String[] args) {
		int x = 4548;
		if (x % 10 == 7) {
			System.out.println(String.format("У числа %s последняя цифра 7ка.", x));
		} else {
			System.out.println(String.format("У числа %s последняя цифра не 7ка.", x));
		}
	}
}
