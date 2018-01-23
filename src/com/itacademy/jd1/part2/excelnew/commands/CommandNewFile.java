package com.itacademy.jd1.part2.excelnew.commands;

import com.itacademy.jd1.part2.excelnew.Sheet;

public class CommandNewFile extends CommandForFile {

	public CommandNewFile(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		System.out.println("New file was created.");
		enterToSecondMenu(new Sheet());
	}

}
