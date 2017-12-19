package com.itacademy.jd1.task32;


	import java.util.HashMap;
	import java.util.Map;

	public class Task32 {
		public static void main(String[] args) {
			String text = "If if the type of an expression is a reference type,"
					+ " then the class of the referenced object, or even whether"
					+ " the value is a reference to an object rather than null,"
					+ " is not necessarily known at compile time. There are a"
					+ " few places in the Java programming language where the "
					+ "actual class of a referenced object affects program "
					+ "execution in a manner that cannot be deduced from the " + "type of the expression.";
			text = text.toLowerCase();
			text = text.replaceAll("[\\p{Punct}\\s]+", " ");

			Map<String, Integer> hashMap = new HashMap<String, Integer>();
			for (String string : text.split(" ")) {
				if (hashMap.containsKey(string)) {
					hashMap.put(string, hashMap.get(string) + 1);
				} else {
					hashMap.put(string, 1);
				}
			}
			hashMap.remove("");
			System.out.println(hashMap);
		}
	}
