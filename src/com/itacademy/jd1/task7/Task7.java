package com.itacademy.jd1.task7;

public class Task7 {
	
	private static boolean isHomesInArea(int a, int b, int e, int c, int d, int f) {
		if ((a + d <= e) && (b <= f) && (c <= f)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 3;
		int d = 6;
		int e = 5;
		int f = 7;
		if (isHomesInArea(a, d, e, b, c, f) || isHomesInArea(a, d, f, b, c, e) || isHomesInArea(b, c, e, a, d, f)
				|| isHomesInArea(b, c, f, a, d, e) || isHomesInArea(a, c, e, b, d, f) || isHomesInArea(a, c, f, b, d, e)
				|| isHomesInArea(b, d, e, a, c, f) || isHomesInArea(b, d, f, a, c, e)) {
			System.out.println(String.format("дома размерами %s*%s и %s*%s можно разместить на участке размером %s*%s",
					a, b, c, d, e, f));
		} else {
			System.out.println(String.format("Дома размерами %s*%s и %s*%s нельзя разместить на участке размером %s*%s",
					a, b, c, d, e, f));
		}
	}
}
