package com.intexsoft.jd1.task21;

import java.util.Date;

public class Task21 {

	public static void main(String[] args) {
		String s = "wewerrtr";
		Date dateStart1 = new Date();
		for (int i = 0; i < 50000; i++) {
			s += " ";
		}
		Date dateStop1 = new Date();
		System.out.println(String.format("���������� ������ � ������� +. �������� ����������: %S �����������",
				+dateStop1.getTime() - dateStart1.getTime()));
		Date dateStart2 = new Date();
		StringBuilder strB = new StringBuilder(s);
		for (int i = 0; i < 50000; i++) {
			strB.append(" wewerrtr");
		}
		Date dateStop2 = new Date();
		System.out
				.println(String.format("���������� ������ � ������� StringBuilder. �������� ����������: %S �����������",
						+dateStop2.getTime() - dateStart2.getTime()));
	}

}
