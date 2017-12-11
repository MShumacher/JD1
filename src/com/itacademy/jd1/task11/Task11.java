package com.itacademy.jd1.task11;

public class Task11 {

	public static void main(String[] args) {
		int x = 3;
		boolean attribute = true;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0)
				attribute = false;
		}
		if (attribute) {
			System.out.println(String.format("Число %s простое", x));
		} else {
			System.out.println(String.format("Число %s не является простым", x));
		}
	}

}
