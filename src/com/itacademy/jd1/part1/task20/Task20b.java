package com.itacademy.jd1.part1.task20;

public class Task20b {

	public static void main(String[] args) {
		String str = "  Te1st 1?    s,tri ng for split!  ";
		StringBuilder lastLetter = new StringBuilder();
		str = str.trim();
		String[] words = str.split("\\W+");
		for (String word : words) {
			lastLetter.append(word.charAt((word.length() - 1)));
		}
		System.out.println(lastLetter);

	

	}

}
