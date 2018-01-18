package com.itacademy.jd1.part1.task12;

public class Task12 {

	public static void main(String[] args) {
		int x = 1221241;
		System.out.printf("%,d",x);
		String s = "";
		while (x != 0) {
			s = x % 1000 + " " + s;
			x = x / 1000;
		}
		System.out.print(s);
		
	}
}
