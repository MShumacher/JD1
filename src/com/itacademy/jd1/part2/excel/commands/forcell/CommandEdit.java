package com.itacademy.jd1.part2.excel.commands.forcell;

import java.util.Scanner;

import com.itacademy.jd1.part2.excel.Cell;
import com.itacademy.jd1.part2.excel.Command;
import com.itacademy.jd1.part2.excel.Row;
import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForCell;

public class CommandEdit extends CommandForCell {

	public CommandEdit(String value, String output, Sheet sheet) {
		super(value, output, sheet);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		enterNewValue(s);
		System.out.println("Don't remember to save changes in file!");
	}

	private void enterNewValue(String s) {
		Integer i = Integer.valueOf(s.substring(s.indexOf('[') + 1, s.indexOf(',')));
		String j = s.substring(s.indexOf(',') + 1, s.indexOf(']'));
		System.out.println("Please type new value.");
		Cell cell = new Cell();
		Scanner scan = new Scanner(System.in);
		cell.setValue(scan.next());
		if (sheet.isRowExist(i)) {
			if (sheet.getRow(i).isCellExist(j)) {
				sheet.getRow(i).getCell(j).setValue(cell.getValue());
			} else {
				sheet.getRow(i).addCell(j, cell);
			}
		} else {
			Row row = new Row();
			row.addCell(j, cell);
			sheet.addRow(i, row);
		}
		System.out.println(String.format("Cell %s has been recorded.", s));
	}
}
