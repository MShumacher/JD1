package com.intexsoft.jd1.task20;

public class Task20a {

	public static void main(String[] args) {
		String str = "  Te st     s tri ng for split  ";
		for (int i = 1; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i - 1) != ' ')) {
				System.out.print(str.charAt(i - 1));
			}
		}

	}

}