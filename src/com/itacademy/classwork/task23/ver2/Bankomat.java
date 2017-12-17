package com.itacademy.classwork.task23.ver2;

import java.util.ArrayList;

public class Bankomat {
	public int countOfNominals = 4;
	static int nominals[] = new int[] { 100, 50, 20, 10 };
	private ArrayList<Nominal> load = new ArrayList<>();
	private int lastOperation[] = new int[] { 0, 0, 0, 0 };
	private boolean validSum = false;

	/*
	 * public Bankomat(ArrayList<Nominal> load) { this.load = load; }
	 * 
	 * public void load(ArrayList<Nominal> load) { this.load = load; }
	 * 
	 * public ArrayList<Nominal> getLoad() { return load; }
	 */
	public Bankomat() {
	}

	public Bankomat(Integer... items) {
		reload(items);
	}

	public void reload(Integer... items) {
		load.clear();
		countOfNominals = items.length;
		for (int i = 0; i < countOfNominals; i++) {
			Nominal nominal = new Nominal(nominals[i], items[i]);
			load.add(i, nominal);
		}
	}

	public void add(Integer... items) {
		if (load.isEmpty()) {
			reload(items);
		} else {

			for (int i = 0; i < items.length; i++) {
				if (i < countOfNominals) {
					load.get(i).setCount(load.get(i).getCount() + items[i]);
				} else {
					Nominal nominal = new Nominal(nominals[i], items[i]);
					load.add(i, nominal);
				}
			}
			countOfNominals = items.length;
		}
	}

	public void setNominals(int[] items) {
		for (int i = 0; i < items.length; i++) {
			load.get(i).setNominal(items[i]);
		}
	}

	public void print() {
		if (load.isEmpty()) {
			System.out.println("ATM is empty.");
		} else {
			System.out.println("ATM is loaded of:");
			for (Nominal nominal : load) {
				System.out.println(String.format("%s PSc of %s", nominal.getCount(), nominal.getNominal()));
			}
		}
	}

	public boolean giveMoney(int sum) {
		checkBalance(sum, 0);
		if (validSum) {
			System.out.println(String.format("Take your Money %s of:", sum));
			for (int j = 0; j < countOfNominals; j++) {
				System.out.println(String.format("%s PCs bill %s ", lastOperation[j], load.get(j).getNominal()));
				load.get(j).setCount(load.get(j).getCount() - lastOperation[j]);
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
		while ((validSum == false) && (s != 0) && (i < countOfNominals)
				&& (k <= Math.min(load.get(i).getCount(), s / load.get(i).getNominal()))) {
			lastOperation[i] = Math.min(load.get(i).getCount(), s / load.get(i).getNominal()) - k;
			checkBalance(s - lastOperation[i] * load.get(i).getNominal(), i + 1);
			k++;
		}
		if (s == 0) { // удалось набрать нужную сумму денег
			validSum = true;
		}

	}

}
