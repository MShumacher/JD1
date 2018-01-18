package com.itacademy.jd1.part1.classwork.lection6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lection63 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(" +- +");
		Matcher matcher = p.matcher("Test - string - test");
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.end());
		}
	}

}
