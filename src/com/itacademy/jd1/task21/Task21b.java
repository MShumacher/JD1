package com.itacademy.jd1.task21;

import java.util.Date;

public class Task21b {

	public static void main(String[] args) {
		String s = "wewerrtr";
		long dateStart1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			s += " ";
		}
		long dateStop1 = System.currentTimeMillis();
		System.out.println(String.format("���������� ������ � ������� +. C������� ����������: %S �����������",
				+dateStop1 - dateStart1));
		long dateStart2 = System.currentTimeMillis();
		StringBuilder strB = new StringBuilder(s);
		for (int i = 0; i < 50000; i++) {
			strB.append(" wewerrtr");
		}
		long dateStop2 = System.currentTimeMillis();
		System.out
				.println(String.format("���������� ������ � ������� StringBuilder. C������� ����������: %S �����������",
						+dateStop2 - dateStart2));
	}

}