package com.itacademy.jd1.part2.excel.commands.forfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ResourceBundle;

import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForFile;

public class CommandOpen extends CommandForFile {

	public CommandOpen(String value, String output, ResourceBundle rb) {
		super(value, output, rb);
	}

	@Override
	public void execute() {
		String fileName = enterFileName();
		Sheet sheet = new Sheet();
		sheet = openFile(fileName);
		enterToSecondMenu(sheet);
	}

	private Sheet openFile(String fileName) {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Sheet sheet = (Sheet) ois.readObject();
			ois.close();
			return sheet;
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			openFile(enterFileName());
		} catch (Exception e) {
			System.out.println("Something is wrong.");
			openFile(enterFileName());
		}
		return null;
	}
}
