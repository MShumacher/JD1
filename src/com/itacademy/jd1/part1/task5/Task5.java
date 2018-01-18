package com.itacademy.jd1.part1.task5;

public class Task5 {

	public static void main(String[] args) {
		int x = 123450;
		switch (x % 10) {
		case 1:
			System.out.println(x + " �����");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println(x + " �����");
			break;
		default:
			System.out.println(x + " ������");
		}

	}

}
