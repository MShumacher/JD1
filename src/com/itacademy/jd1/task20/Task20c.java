package com.itacademy.jd1.task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20c {

	public static void main(String[] args) {
		String str = "  Te st?  s tri ng for spl,it  ";
		Pattern pattern = Pattern.compile("\\W+");
		Matcher matcher = pattern.matcher(str + " ");
		while (matcher.find()) {
			if (matcher.start() != 0) {
				System.out.print(str.charAt(matcher.start() - 1));
			}
		}

	}
}