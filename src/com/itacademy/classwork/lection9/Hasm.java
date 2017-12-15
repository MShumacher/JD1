package com.itacademy.classwork.lection9;

import java.util.HashMap;
import java.util.Map;

public class Hasm {

	public static void main(String[] args) {
		Map<Integer, String> words = new HashMap<Integer, String>();
		words.put(1, "one");
		words.put(45, "two");
		words.put(3, "three");
		System.out.println("map :" + words);
		System.out.println("word is " + words.get(45));
	}
}
