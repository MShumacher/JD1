package com.itacademy.jd1.part2.classwork.classstring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
	public static void main(String[] args) {
		// String s = "hj, gjh k12A 521521jhkjh , hl,l!jhl-klB.";
		// Pattern pattern = Pattern.compile("[0-9A-F]+");
		String s = "[A,1] hj[C,12]gjh k12A 521521jhkjh , hl,l!jhl-klB.";
		Pattern pattern = Pattern.compile("\\[[A-Z],[0-9]+\\]");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
