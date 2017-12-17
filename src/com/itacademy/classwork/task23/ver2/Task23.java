package com.itacademy.classwork.task23.ver2;

import java.util.ArrayList;

public class Task23 {

	// private static int numberOfNominals[] = new int[] { 8, 10, 5, 3 };

	public static void main(String[] args) {
		Bankomat bankomat = new Bankomat(10);
		bankomat.print();
		/*
		 * ArrayList<Nominal> load = new ArrayList<>(); for (int i = 0; i <
		 * bankomat.countOfNominals; i++) { Nominal nominal = new
		 * Nominal(bankomat.nominals[i], numberOfNominals[i]); load.add(nominal); }
		 * 
		 * bankomat.load(load);
		 */
		bankomat.reload(5, 5);
		bankomat.print();
		// bankomat.SetNominals(newNominals);
		// bankomat.loadInt(8, 10, 5, 3);
		// bankomat.printLoad();
		bankomat.add(10, 5, 15);
		bankomat.print();
		bankomat.giveMoney(810);
	}

}
