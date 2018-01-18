package com.itacademy.jd1.part1.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task28 {

	public static void main(String[] args) {
		List<Integer> raiting = new ArrayList<Integer>();
		int raitingLength = (int) (Math.random() * 20 + 1);
		for (int i = 0; i < raitingLength; i++) {
			raiting.add((int) (Math.random() * 10 + 1));
			System.out.print(raiting.get(i) + " ");
		}
		System.out.println();
		Iterator<Integer> iterator = raiting.iterator();
		int max = iterator.next();
		while (iterator.hasNext()) {
			int element = iterator.next();
			if (element > max) {
				max = element;
			}
		}
		System.out.println(max);
	}
}
