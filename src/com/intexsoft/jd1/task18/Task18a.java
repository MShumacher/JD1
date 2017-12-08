package com.intexsoft.jd1.task18;

public class Task18a {

	public static void main(String[] args) {
		char[] punctuationMark = { ',', '.', '?', '!', '-', ';' };
		String s = "hjgjh kjhkjh , hl,l!jhl-klр.опшшибор1ё1";
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			// if (!Character.isLetter(s.charAt(i))) Counter++;
			for (int j = 0; j < punctuationMark.length; j++) {
				if (s.charAt(i) == punctuationMark[j]) {
					counter++;
				}
			}
		}
		System.out.println("Количество знаков препинания в строке: " + counter);
	}
}