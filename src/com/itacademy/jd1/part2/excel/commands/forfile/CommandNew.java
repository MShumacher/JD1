package com.itacademy.jd1.part2.excel.commands.forfile;

import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForFile;

public class CommandNew extends CommandForFile {

	public CommandNew(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		System.out.println("New file was created.");
		enterToSecondMenu(new Sheet());
	}

}
