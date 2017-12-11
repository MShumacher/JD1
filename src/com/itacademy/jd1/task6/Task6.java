package com.itacademy.jd1.task6;

public class Task6 {

	static int d = 28;
	static int m = 2;
	static int y = 2016;

	public static void isEndOfYear() {
		if (m == 12) {
			y++;
			m = 1;
		} else {
			m++;
		}
	}

	public static void IsEndOfMonth30() {
		if (d == 31) {
			d = 1;
			isEndOfYear();
		} else {
			d++;
		}
	}

	public static void IsEndOfMonth31() {
		if (d == 30) {
			d = 1;
			m++;
		} else {
			d++;
		}
	}

	public static void IsEndOfFebruary() {
		if ((y % 4 == 0) && (d == 28)) {
			d = 1;
			m++;
		} else {
			d++;
		}
	}

	public static void IsEndFebruaryAndLeapYear() {
		if ((y % 4 != 0) && (d == 29)) {
			d = 1;
			m++;
		} else {
			d++;
		}
	}

	public static void main(String[] args) {
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			IsEndOfMonth30();
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			IsEndOfMonth31();
			break;
		default:
			IsEndOfFebruary();
			IsEndFebruaryAndLeapYear();
		}
		System.out.println(String.format("Next date is: %s.%s.%s", d, m, y));
	}

}
