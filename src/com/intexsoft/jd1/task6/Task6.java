package com.intexsoft.jd1.task6;

public class Task6 {

	public static void main(String[] args) {
		int d = 28;
		int m = 2;
		int y = 2016;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (d == 31) {
				d = 1;
				if (m == 12) {
					y++;
					m = 1;
				} else {
					m++;
				}

			} else {
				d++;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (d == 30) {
				d = 1;
				m++;
			} else {
				d++;
			}
			break;
		default:
			if ((y % 4 == 0) && (d == 28)) {
				d = 1;
				m++;
			} else {
				d++;
			}
			if ((y % 4 != 0) && (d == 29)) {
				d = 1;
				m++;
			} else {
				d++;
			}
		}
		System.out.println(String.format("Следующий день: %s.%s.%s", d, m, y));
	}

}
