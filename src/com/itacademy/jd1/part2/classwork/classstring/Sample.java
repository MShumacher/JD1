package com.itacademy.jd1.part2.classwork.classstring;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	private static List<Sample> list = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			list.add(new Sample());
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("i'm going to recycle bin " + hashCode());
	}

}
