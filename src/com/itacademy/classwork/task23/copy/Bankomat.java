package com.itacademy.classwork.task23.copy;

public class Bankomat {
	private int countOfNominals = 3;
	private int nominals[] = new int[] { 100, 50, 20 };
	public int count[] = new int[countOfNominals];
	private boolean validSum = false;
	private int lastOperation[] = new int[] { 0, 0, 0 };

	public Bankomat(int a, int b, int c) {
		count[0] = a;
		count[1] = b;
		count[2] = c;
	}

	public void addMoney(int a, int b, int c) {
		count[0] += a;
		count[1] += b;
		count[2] += c;
	}

	public void getStatus() {
		System.out.println("ATM loaded:");
		for (int i = 0; i < countOfNominals; i++) {
			System.out.println(String.format("%s PCs bill %s ", count[i], nominals[i]));
		}
	}

	public boolean getMoney(int sum) {
		checkBalance(sum, 0);
		if (validSum) {
			System.out.println(String.format("Take your Money %s of:", sum));
			for (int j = 0; j < countOfNominals; j++) {
				System.out.println(String.format("%s PCs bill %s ", lastOperation[j], nominals[j]));
				count[j] -= lastOperation[j];
			}
			return true;
		} else {
			System.out.println("ATM can not issue a specified amount.");
			return false;
		}
	}

	private void checkBalance(int s, int i) {
		// s - остаток денег, которые нужно добрать
		// купюрами
		// i - номер номинала, купюры которого
		// добираем
		// номиналы должны быть отсортированы по
		// убыванию
		int k = 0;// k - оличество купюр, которые "выкидывам" на
					// предыдущем номинале, если не
					// удалось набрать нужную сумму
		while ((validSum == false) && (s != 0) && (i < countOfNominals) && (k <= Math.min(count[i], s / nominals[i]))) {
			lastOperation[i] = Math.min(count[i], s / nominals[i]) - k;
			checkBalance(s - lastOperation[i] * nominals[i], i + 1);
			k++;
		}
		if (s == 0) { // удалось набрать нужную сумму денег
			validSum = true;
		}

	}

}
