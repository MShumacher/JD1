package com.intexsoft.jd1.task16;

public class Task16 {

	public static void main(String[] args) {
		int marksLength = 10;
		int marks[] = new int[marksLength];
		for (int i = 0; i <= marksLength - 1; i++) {
			System.out.print((marks[i] = (int) (Math.random() * 10 + 1)) + " ");
		}
		System.out.println();
		int x;
		for (int i = 0; i <= marksLength / 2 - 1; i++) {
			x = marks[i];
			marks[i] = marks[marksLength - i - 1];
			marks[marksLength - i - 1] = x;
		}
		for (int i : marks) {
			System.out.print(i + " ");
		}
	}
}
