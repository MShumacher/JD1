package com.itacademy.jd1.part2.excel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "";
		do {
			System.out.print("Enter your word: ");
			// s = scan.next();
			switch (s = scan.next()) {
			case "-h":
				System.out.println("-create for create new docyment.");
				System.out.println("-open for open document.");
				System.out.println("-exit fo exit.");
				break;
			case "-create":
				break;
			case "-open":
				break;
			case "-exit":
				break;
			default:
				System.out.println("For help type -h.");
			}
		} while (!s.equals("-exit"));
	}
}