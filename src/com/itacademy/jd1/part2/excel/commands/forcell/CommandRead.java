package com.itacademy.jd1.part2.excel.commands.forcell;

import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForCell;

public class CommandRead extends CommandForCell {

	public CommandRead(String value, String output, Sheet sheet) {
		super(value, output, sheet);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		try {
			System.out.println(String.format("Cell %s=%s", s, this.sheet.getCellValue(s)));
		} catch (NullPointerException e) {
			System.out.println(String.format("Cell %s doesn-t exist", s));
		}
	}
}
