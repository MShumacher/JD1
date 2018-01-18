package com.itacademy.jd1.part1.task8;

public class Task8 {

	public static void main(String[] args) {
		long fakt = 1;
		int i = 1;
		while (i <= 15) {
			fakt *= i;
			i++;
		}
		System.out.println(String.format("��������� ����� %s ����� %s", --i, fakt));

	}

}
