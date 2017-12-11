package com.intexsoft.jd1.task21;

import java.util.Date;

public class Task21b {

	public static void main(String[] args) {
		// system.currenttimeinmillis
		String s = "wewerrtr";
		long dateStart1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			s += " ";
		}
		long dateStop1 = System.currentTimeMillis();
		System.out.println(String.format("Складываем строки с помощью +. Cкорость выполнения: %S миллисекунд",
				+dateStop1 - dateStart1));
		long dateStart2 = System.currentTimeMillis();
		StringBuilder strB = new StringBuilder(s);
		for (int i = 0; i < 50000; i++) {
			strB.append(" wewerrtr");
		}
		long dateStop2 = System.currentTimeMillis();
		System.out
				.println(String.format("Складываем строки с помощью StringBuilder. Cкорость выполнения: %S миллисекунд",
						+dateStop2 - dateStart2));
	}

}