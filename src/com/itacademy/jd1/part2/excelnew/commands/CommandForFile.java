package com.itacademy.jd1.part2.excelnew.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itacademy.jd1.part2.excelnew.Command;
import com.itacademy.jd1.part2.excelnew.Menu;
import com.itacademy.jd1.part2.excelnew.Sheet;

public abstract class CommandForFile extends Command {

	public CommandForFile(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
	}

	protected String enterFileName() {
		Scanner scan = new Scanner(System.in);
		String fileName = "";
		do {
			System.out.println("Please, type correct filename.(For example \"first.xls\")");
			fileName = scan.next();
		} while (!isFileNameCorrect(fileName));
		return fileName;
	}

	private boolean isFileNameCorrect(String fileName) {
		return fileName.matches("[0-9,a-z,A-Z]+.xls");
	}

	protected void enterToSecondMenu(Sheet sheet) {
		System.out.println("You are in file menu.");
		List<Command> secondLevelCommands = new ArrayList<Command>();
		secondLevelCommands.add(new CommandReadCell("read", "For read cell print", sheet));
		secondLevelCommands.add(new CommandEditCell("edit", "For edit cell print", sheet));
		secondLevelCommands.add(new CommandSaveFile("save", "For save file print", sheet));
		secondLevelCommands.add(new CommandExit("exit", "For close file and exit to previous menu print"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();
	}
}
