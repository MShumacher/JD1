package com.itacademy.jd1.part2.excel.commands.forcell;

import java.util.NoSuchElementException;
import java.util.ResourceBundle;

import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForCell;

public class CommandRead extends CommandForCell {

	public CommandRead(String value, String output, ResourceBundle rb, Sheet sheet) {
		super(value, output, rb, sheet);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		try {
			System.out.println(String.format("Cell %s=%s", s, this.sheet.getCellValue(s)));
		} catch (NullPointerException e) {
			System.out.println(String.format("Cell %s doesn-t exist", s));
		} catch (NoSuchElementException | NumberFormatException e) {
			System.out.println("Incorrect value in one of the cells.");
		}
	}
}
