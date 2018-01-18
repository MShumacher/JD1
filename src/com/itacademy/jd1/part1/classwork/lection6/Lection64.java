package com.itacademy.jd1.part1.classwork.lection6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lection64 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("www\\.(\\w+)\\.by");
		Matcher matcher = pattern.matcher("     www.tut.by     ");
		matcher.find();
		System.out.println(matcher.group(0));
		System.out.println(matcher.group(1));
	}

}
