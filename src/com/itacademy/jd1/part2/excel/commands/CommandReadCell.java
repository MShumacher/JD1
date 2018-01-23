package com.itacademy.jd1.part2.excel.commands;

import java.util.Scanner;

import com.itacademy.jd1.part2.excel.Command;
import com.itacademy.jd1.part2.excel.Sheet;

public class CommandReadCell extends Command {
	private Sheet sheet;

	public CommandReadCell(String value, String output, Sheet sheet) {
		super(value, output);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
		int i;
		String j;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please, enter cell address.");
			System.out.println("Enter number row. (1-1000)");
			i = scan.nextInt();
			System.out.println("Enter number col. (A-Z)");
			j = scan.next();
		} while (!isAddressValid(i, j));
		try {
			System.out.println(String.format("Cell [%s,%s]=%s", i, j, this.sheet.getRow(i).getCell(j).getValue()));
		} catch (NullPointerException e) {
			System.out.println(String.format("Cell [%s,%s] doesn-t exist", i, j));
		}
	}

	private boolean isAddressValid(int i, String j) {
		if ((0 < i) && (i <= 1000) && (j.matches("[A-Z]"))) {
			return true;
		} else {
			return false;
		}
	}
}
