package com.itacademy.jd1.part2.excelnew.commands;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.itacademy.jd1.part2.excelnew.Sheet;

public class CommandSaveFile extends CommandForFile {

	private Sheet sheet;

	public CommandSaveFile(String value, String output, Sheet sheet) {
		super(value, output);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
		saveFile(sheet);
	}

	private void saveFile(Sheet sheet) {
		String fileName = enterFileName();
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(sheet);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}