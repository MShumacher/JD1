package com.itacademy.classwork.lection9;

import java.util.ArrayList;
import java.util.List;

public class Coll {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		System.out.println("first word is: " + words.get(0));
		words.remove(0);
		System.out.println("first word after remove is: " + words.get(0));

	}
}
