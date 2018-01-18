package com.itacademy.jd1.part1.task23;

public class Bankomat {
	private int count100 = 8;
	private int count50 = 5;
	private int count20 = 6;

	public int getCount100() {
		return count100;
	}

	public void setCount100(int count100) {
		this.count100 = count100;
	}

	public int getCount50() {
		return count50;
	}

	public void setCount50(int count50) {
		this.count50 = count50;
	}

	public int getCount20() {
		return count20;
	}

	public void setCount20(int count20) {
		this.count20 = count20;
	}

	public Bankomat(int a, int b, int c) {
		count100 = a;
		count50 = b;
		count20 = c;
	}

	public void addMoney(int a, int b, int c) {
		count100 += a;
		count50 += b;
		count20 += c;
	}

	public void getStatus() {
		System.out.println("ATM loaded:");
		System.out.println(count100 + " PCs bill 100");
		System.out.println(count50 + " PCs bill 50");
		System.out.println(count20 + " PCs bill 20");
	}

	public boolean getMoney(int sum) {
		int i, j, k;
		int minimum100 = Math.min(count100, sum / 100);
		int minimum50 = Math.min(count50, sum / 50);
		int minimum20 = Math.min(count20, sum / 20);
		for (i = 0; i <= minimum20; i++) {
			for (j = 0; j <= minimum50; j++) {
				for (k = 0; k <= minimum100; k++) {
					if (sum == 20 * i + 50 * j + 100 * k) {
						System.out.println(String.format("Take your Money %s of:", sum));
						System.out.println(k + " PCs bill 100");
						System.out.println(j + " PCs bill 50");
						System.out.println(i + " PCs bill 20");
						return true;
					}
				}
			}
		}
		System.out.println("ATM can not issue a specified amount.");
		return false;
	}

	public void add100(int a) {
		count100 += a;
	}

	public void add50(int a) {
		count50 += a;
	}

	public void add20(int a) {
		count20 += a;
	}

}
