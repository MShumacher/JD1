package com.intexsoft.jd1.task14;

public class Task14 {

	public static void main(String[] args) {
		int marksLength = 10;
		int marks[] = new int[marksLength];
		for (int i = 0; i < marksLength; i++) {
			System.out.print((marks[i] = (int) (Math.random() * 10 + 1)) + " ");
		}
		int maxMark = marks[0];
		int maxNumber = 1;
		System.out.println();
		for (int i = 1; i < marks.length; i++) {
			if (maxMark < marks[i]) {
				maxMark = marks[i];
				maxNumber = i + 1;
			}
		}
		System.out.println(String.format("Максимальная оценка = %s и ее номер %s", maxMark, maxNumber));
	}
}