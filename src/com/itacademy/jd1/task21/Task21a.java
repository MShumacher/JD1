package com.itacademy.jd1.task21;

import java.util.Date;

public class Task21a {

	public static void main(String[] args) {
		String s = "wewerrtr";
		Date dateStart1 = new Date();
		for (int i = 0; i < 50000; i++) {
			s += " ";
		}
		Date dateStop1 = new Date();
		System.out.println(String.format("Складываем строки с помощью +. Cкорость выполнения: %S миллисекунд",
				+dateStop1.getTime() - dateStart1.getTime()));
		Date dateStart2 = new Date();
		StringBuilder strB = new StringBuilder(s);
		for (int i = 0; i < 50000; i++) {
			strB.append(" wewerrtr");
		}
		Date dateStop2 = new Date();
		System.out
				.println(String.format("Складываем строки с помощью StringBuilder. Cкорость выполнения: %S миллисекунд",
						+dateStop2.getTime() - dateStart2.getTime()));
	}

}
