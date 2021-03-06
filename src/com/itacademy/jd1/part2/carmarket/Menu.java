package com.itacademy.jd1.part2.carmarket;

import java.util.List;
import java.util.Scanner;

public class Menu {
	List<Command> LevelCommands;

	public Menu(List<Command> firstLevelCommands) {
		this.LevelCommands = firstLevelCommands;
	}

	public void execute() {
		String s = "";
		do {
			System.out.println("Please, make your choise.");
			for (Command command : LevelCommands) {
				command.print();
			}
			Scanner scan = new Scanner(System.in);
			s = scan.next();
			for (Command command : LevelCommands) {
				if (s.equals(command.getValue())) {
					command.execute();
				}
			}
		} while (!s.equals("exit"));

	}
}