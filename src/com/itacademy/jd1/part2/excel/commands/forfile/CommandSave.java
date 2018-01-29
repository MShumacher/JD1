package com.itacademy.jd1.part2.excel.commands.forfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ResourceBundle;

import com.itacademy.jd1.part2.excel.Sheet;
import com.itacademy.jd1.part2.excel.commands.CommandForFile;

public class CommandSave extends CommandForFile {

	private Sheet sheet;

	public CommandSave(String value, String output, ResourceBundle rb, Sheet sheet) {
		super(value, output, rb);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
		String fileName = enterFileName();
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(this.sheet);
			oos.close();
			System.out.println(String.format("File %s was saved.", fileName));
		} catch (IOException e) {
			System.out.println("Something was wrong. File wasn't saved. Please try again.");
		}
	}
}