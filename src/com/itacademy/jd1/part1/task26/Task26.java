package com.itacademy.jd1.part1.task26;

import java.util.ArrayList;
import java.util.List;

public class Task26 {

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
			if (raiting.get(i) <= 3) {
				raiting.remove(i);
			} else {
				System.out.print(raiting.get(i++) + " ");
			}
		}
	}
}
