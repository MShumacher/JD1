package com.intexsoft.jd1.task4;

public class Task4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		int r = 4;
		if (r >= Math.sqrt(a * a + b * b) / 2) {
			System.out.println(String.format(
					"������������� ��������� ��������� %s*%s ����� ������� ������� ��������� ��������� %s", a, b, r));
		} else {
			System.out.println(String.format(
					"������������� ��������� ��������� %s*%s ������ ������� ������� ��������� ��������� %s", a, b, r));
		}
	}

}
