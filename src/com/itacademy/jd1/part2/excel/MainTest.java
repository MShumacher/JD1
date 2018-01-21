package com.itacademy.jd1.part2.excel;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cell cell = new Cell();
		cell.setValue("hello");
		int i = scan.nextInt();
		int j = scan.nextInt();
		Row row = new Row(cell, j);

		Sheet sheet1 = new Sheet(i,row);
//		sheet1.getRow(i).getCell(1).setValue("hello");
		sheet1.PrintCell(i, 1);
		sheet1.PrintCell(3, 1);
	}
}