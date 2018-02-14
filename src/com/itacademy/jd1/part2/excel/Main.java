package com.itacademy.jd1.part2.excel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import com.itacademy.jd1.part2.excel.commands.CommandChangeLanguage;
import com.itacademy.jd1.part2.excel.commands.CommandExit;
import com.itacademy.jd1.part2.excel.commands.file.CommandNew;
import com.itacademy.jd1.part2.excel.commands.file.CommandOpen;

public class Main {

	public static void main(String[] args) {
		Locale currentLocale = new Locale("ru", "RU");
		ResourceBundle rb = ResourceBundle.getBundle("ExcelBundle", currentLocale);
		List<Command> firstLevelCommands = new ArrayList<Command>();
		firstLevelCommands.add(new CommandChangeLanguage(rb.getString("language"), rb.getString("languageM"), rb));
		firstLevelCommands.add(new CommandOpen(rb.getString("open"), rb.getString("openM"), rb));
		firstLevelCommands.add(new CommandNew(rb.getString("new"), rb.getString("newM"), rb));
		firstLevelCommands.add(new CommandExit(rb.getString("exit"), rb.getString("exitM"), rb));
		Menu menu = new Menu(firstLevelCommands, rb);
		menu.execute();
		System.out.println(rb.getString("thank"));
	}
}
