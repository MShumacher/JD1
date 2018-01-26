package com.itacademy.jd1.part2.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainTest {

	public static void main(String[] args) {
		Sheet sheet = null;
		try (FileInputStream fis = new FileInputStream("first.xls");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			sheet = (Sheet) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (Exception e) {
			System.out.println("Something is wrong.");
		}
		// Scanner scan = new Scanner(System.in);

		// String s = scan.next();
		// String s = "MAX([1,A],[1,S])+[1,A]";
		String s = "min(max([1,A],[1,S])+([1,A]))+()";
		// замена [1,A] на значения
		Pattern p = Pattern.compile("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]");
		Matcher matcher = p.matcher(s);
		while (matcher.find()) {
			String gr = matcher.group();
			s = s.replace(gr, sheet.getCellValue(gr));
		}
		// замена max,min,avg,sum
		p = Pattern.compile("\\([^\\(\\)]*\\)");
		matcher = p.matcher(s);
		while (matcher.find()) {
			String gr = matcher.group();
			System.out.println(gr);
			String newgr = gr;
			// меняем , на x,n,+,g
			char h = s.charAt(matcher.start() - 1);
			switch (h) {
			case 'x':
				newgr = gr.replace(',', 'x');
				break;
			case 'n':
				newgr = gr.replace(',', 'n');
				break;
			case 'm':
				newgr = gr.replace(',', '+');
				break;
			case 'g':
				newgr = gr.replace(',', 'g');
				break;
			}
			PPN ppn = new PPN();
			String w = newgr.substring(1, newgr.length() - 1);
			s = s.replace(gr.substring(1, gr.length() - 1), Integer.toString(ppn.eval(w)));
			System.out.println(s);
		}
		// вычисление выражения
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			Object result = engine.eval("3243+(854+6)/2-100");
			System.out.println(result);
		} catch (ScriptException e1) {
			System.out.println("Bad string");
		}

		PPN ppn = new PPN();
		try {
			System.out.println(ppn.eval("3243-(854/2x6x5000)*2g5000"));
		} catch (Exception e) {
			System.out.println("Bad string");
		}
		// while (true) {
		// Integer i = Integer.valueOf(s.substring(s.indexOf('[') + 1, s.indexOf(',')));
		// String j = s.substring(s.indexOf(',') + 1, s.indexOf(']'));

		// System.out.println(i + j);
		// if
		// (s.matches("(SUM|AVG|MAX|MIN)\\((\\[([1-9][0-9]{0,2}|1000),[A-Z]\\])+\\)")) {
		// if (s.matches("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]")) {
		// System.out.println(true);
		// } else {
		// System.out.println(false);
		// }
		// }
	}

}
