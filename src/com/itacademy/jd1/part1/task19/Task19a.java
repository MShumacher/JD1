package com.itacademy.jd1.part1.task19;

public class Task19a {

	public static void main(String[] args) {
		String s = "  ���    ������ ������ � ���������.  ���� ��������� ������� � ���      ����   ";
		s = s.trim();
		int counter = 0;
		if (s.length() != 0) {
			counter = 1;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				counter++;
			}
		}
		System.out.println(String.format("� ������ ����: %s", counter));

	}
}