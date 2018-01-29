package com.itacademy.jd1.part2.excel.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import com.itacademy.jd1.part2.excel.Command;

public class CommandChangeLanguage extends Command {

	public CommandChangeLanguage(String value, String output, ResourceBundle rb) {
		super(value, output, rb);
	}

	@Override
	public void execute() {
		String country = "", language = "";
		System.out.println("1 – Английский");
		System.out.println("2 – Русский");
		System.out.println("");
		char i = 0;
		try {
			i = (char) System.in.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		switch (i) {
		case '1':
			language = "en";
			country = "EN";
			break;
		case '2':
			language = "ru";
			country = "RU";
		}
		Locale currentLocale = new Locale(language, country);
		this.setRb(ResourceBundle.getBundle("ExcelBundle", currentLocale));
	}
}
