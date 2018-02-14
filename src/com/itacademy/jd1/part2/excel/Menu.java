package com.itacademy.jd1.part2.excel;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Menu {
	private List<Command> LevelCommands;
	private ResourceBundle rb;

	public Menu(List<Command> LevelCommands, ResourceBundle rb) {
		this.LevelCommands = LevelCommands;
		this.rb = rb;
	}

	public void execute() {
		String s = "";
		do {
			System.out.println(this.rb.getString("choise"));
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