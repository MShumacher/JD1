package com.itacademy.jd1.part2.excelnew.commands;

import java.util.Scanner;

import com.itacademy.jd1.part2.excelnew.Cell;
import com.itacademy.jd1.part2.excelnew.Command;
import com.itacademy.jd1.part2.excelnew.Row;
import com.itacademy.jd1.part2.excelnew.Sheet;

public class CommandEditCell extends Command {
	private Sheet sheet;

	public CommandEditCell(String value, String output, Sheet sheet) {
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
		System.out.println("Please type new value");
		Cell cell = new Cell();
		cell.setValue(scan.next());
		if (sheet.isRowExist(i)) {
			if (sheet.getRow(i).isCellExist(j)) {
				sheet.getRow(i).getCell(j).setValue(cell.getValue());
			} else {
				System.out.println(String.format("Cell [%s,%s] create", i, j));
				sheet.getRow(i).addCell(j, cell);
			}
		} else {
			System.out.println(String.format("Cell [%s,%s] create", i, j));
			Row row = new Row();
			row.addCell(j, cell);
			sheet.addRow(i, row);
		}
		System.out.println(String.format("Cell [%s,%s] has been recorded.", i, j));
		System.out.println("Don't remember to save changes in file!");
	}

	private boolean isAddressValid(int i, String j) {
		if ((0 < i) && (i <= 1000) && (j.matches("[A-Z]"))) {
			return true;
		} else {
			return false;
		}
	}
}
