package com.itacademy.jd1.part2.excelnew;

import java.util.ArrayList;
import java.util.List;
import com.itacademy.jd1.part2.excelnew.commands.CommandExit;
import com.itacademy.jd1.part2.excelnew.commands.CommandNewFile;
import com.itacademy.jd1.part2.excelnew.commands.CommandOpenFile;

public class Main {

	public static void main(String[] args) {
		List<Command> firstLevelCommands = new ArrayList<Command>();
		firstLevelCommands.add(new CommandOpenFile("open", "For open exists file print"));
		firstLevelCommands.add(new CommandNewFile("new", "For create new file print"));
		firstLevelCommands.add(new CommandExit("exit", "For close programm print"));
		Menu menu = new Menu(firstLevelCommands);
		menu.execute();
		System.out.println("Thank you for choosing our excel.");
	}

}
