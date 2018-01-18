package com.itacademy.jd1.part1.classwork.lection9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterr {

	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		Iterator<String> iterator = words.iterator();// ������� ����� ������                                                      �������� ��� ������� �� ���������
		for (String string : words) {
			System.out.println(string);
		}
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
