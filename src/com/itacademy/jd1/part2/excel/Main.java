package com.itacademy.jd1.part2.excel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Excel start.");
		String s = "";
		do {
			System.out.println("Please, enter command.(\"-h\" for help)");
			// s = scan.next();
			Menu menu = new Menu("-h", "-create", "-open", "-exit");
			// menu1.print(s = scan.next());
			s = scan.next();
			if (isValidOption(s)) {
			}

			switch (s = scan.next()) {
			case "-h":
				menu.h();
				break;
			case "-create":
				menu.create();
				break;
			case "-open":
				menu.open();
				break;
			case "-exit":
				break;
			default:
				System.out.println("\"-h\" for help.");
			}

		} while (!s.equals("-exit"));
	}

	private static boolean isValidOption(String s) {
		for (int i = 0; i < Menu1.values().length; i++) {
			if (s.equals(Menu1.values()[i])) {
				return true;
			}
		}
		return false;
	}
}