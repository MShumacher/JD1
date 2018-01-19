package com.itacademy.jd1.part2.excel;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cell cell = new Cell();
		int j = scan.nextInt();
		Row row = new Row(cell, j);
		int i = scan.nextInt();
		Sheet sheet1 = new Sheet(row, i);
		sheet1.SetCell(i, j, "hello");
		sheet1.PrintCell(i, j);
		sheet1.PrintCell(3, j);
	}
}