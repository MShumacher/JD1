package com.itacademy.jd1.part2.excel.commands.file;

import java.util.ResourceBundle;

import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForFile;

public class CommandNew extends CommandForFile {

	public CommandNew(String value, String output, ResourceBundle rb) {
		super(value, output, rb);
	}

	@Override
	public void execute() {
		System.out.println("New file was created.");
		enterToSecondMenu(new Sheet());
	}

}
