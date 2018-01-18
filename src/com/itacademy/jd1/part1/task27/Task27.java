package com.itacademy.jd1.part1.task27;

import java.util.ArrayList;
import java.util.List;

public class Task27 {
	public static void main(String[] args) {
		List<Integer> raiting = new ArrayList<Integer>();
		int raitingLength = (int) (Math.random() * 20 + 1);
		for (int i = 0; i < raitingLength; i++) {
			raiting.add((int) (Math.random() * 10 + 1));
			System.out.print(raiting.get(i) + " ");
		}
		System.out.println();
		int i = 0;
		while (i < raiting.size()) {
			if (i != raiting.indexOf(raiting.get(i))) {
				raiting.remove(i);
			} else {
				System.out.print(raiting.get(i++) + " ");
			}
		}
	}

}
