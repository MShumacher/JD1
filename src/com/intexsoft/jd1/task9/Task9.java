package com.intexsoft.jd1.task9;

public class Task9 {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 20);
		int max = 0;
		while (x != 0) {
			x = (int) (Math.random() * 20);
			System.out.print(x + " ");
			if (max < x)
				max = x;
		}
		System.out.println();
		System.out.println("максимальное число: " + max);

	}

}
