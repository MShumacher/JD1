package com.intexsoft.jd1.task10;

public class Task10 {
	public static void main(String[] args) {
		int x = 23204430;
		int sum = 0;
		System.out.print("����� ���� ����� " + x);
		while (x != 0) {
			sum += x % 10;
			x = x / 10;
		}
		System.out.println(" ����� " + sum);
	}
}
