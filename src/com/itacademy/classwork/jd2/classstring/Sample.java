package com.itacademy.classwork.jd2.classstring;

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
		System.out.println("i'm going to recyclebin " + hashCode());
	}

}
