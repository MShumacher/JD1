package com.itacademy.jd1.part2.excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Excel start.");
		String s = "";
		do {
			System.out.println("Please, enter command.(\"-h\" for help)");
			s = scan.next();
			Menu menu = new Menu();
			switch (s) {
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
		System.out.println("Thank you for choosing our excel.");
	}
}