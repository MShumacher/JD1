package com.itacademy.classwork.jd2.classstring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
	public static void main(String[] args) {
		String s = "hjgjh k12A 521521jhkjh , hl,l!jhl-klB.";
		Pattern pattern = Pattern.compile("[0-9A-F]+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
