package com.itacademy.jd1.part1.task18;

public class Task18a {

	public static void main(String[] args) {
		char[] punctuationMark = { ',', '.', '?', '!', '-', ';' };
		String s = "hjgjh kjhkjh , hl,l!jhl-kl�.��������1�1";
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			// if (!Character.isLetter(s.charAt(i))) Counter++;
			for (int j = 0; j < punctuationMark.length; j++) {
				if (s.charAt(i) == punctuationMark[j]) {
					counter++;
				}
			}
		}
		System.out.println("���������� ������ ���������� � ������: " + counter);
	}
}