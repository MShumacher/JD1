package com.intexsoft.classwork.lection6;

public class Lection62 {
	public static void main(String[] args) {

		// System.out.println("20a934".matches("-?[0-9a]+"));
		String str2 = "Test     st+\n++++ring for split";
		System.out.print(str2);
		// System.out.print(str2.replaceAll("\\++", "!"));
		System.out.print(str2.replaceAll("\\n", "!"));

	}
}
