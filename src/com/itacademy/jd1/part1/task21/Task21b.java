package com.itacademy.jd1.part1.task21;

public class Task21b {

	public static void main(String[] args) {
		String s = "wewerrtr";
		long dateStart = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			s += " ";
		}
		long dateStop = System.currentTimeMillis();
		System.out.println(String.format("Сложение строк с помощью оператора +. Время выполнения: %s миллисекунд.",
				+dateStop - dateStart));
		dateStart = System.currentTimeMillis();
		StringBuilder strB = new StringBuilder(s);
		for (int i = 0; i < 50000; i++) {
			strB.append(" wewerrtr");
		}
		dateStop = System.currentTimeMillis();
		System.out.println(String.format("Сложение строк с помощью StringBuilder. Время выполнения: %s миллисекунд.",
				+dateStop - dateStart));
	}

}