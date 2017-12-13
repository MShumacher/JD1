package com.itacademy.classwork.lection8.box;

public class TestMain {

	public static void main(String[] args) {
		Box<String, Integer> myBox = new Box<String, Integer>();
		myBox.setItem("Test");
		myBox.setItem2(123);
		String item = myBox.getItem();
		String itemStr = item;
		System.out.println(itemStr);
		Integer item2 = myBox.getItem2();
		Integer itemInt = item2;
		System.out.println(itemInt);

	}

}
