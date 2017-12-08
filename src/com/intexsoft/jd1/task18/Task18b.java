package com.intexsoft.jd1.task18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18b {

	public static void main(String[] args) {
		String s = "hjgjh kjhkjh , hl,l!jhl-klр.";
		int counter = 0;
		Pattern pattern = Pattern.compile("\\p{Punct}");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			counter++;
		}
		System.out.println("Количество знаков препинания в строке: " + counter);

	}

}
