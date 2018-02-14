package com.itacademy.jd1.part2.excel;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cell implements Serializable {

	private String value;
	private Sheet sheet;

	public Cell(Sheet sheet) {
		this.sheet = sheet;
	}

	public String getValue() throws NoSuchElementException, NumberFormatException {
		if (value.charAt(0) != '=') {
			return value;
		} else {
			System.out.println(value);
			return doConversion(value.substring(1));
		}
	}

	public void setValue(String value) throws NoSuchElementException, NumberFormatException {
		if (value.charAt(0) == '=') {
			doConversion(value.substring(1));
		}
		this.value = value;
	}

	private String doConversion(String value) throws NoSuchElementException, NumberFormatException {
		// замена данных типа [1,A] на их значения
		Pattern p = Pattern.compile("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]");
		Matcher matcher = p.matcher(value);
		while (matcher.find()) {
			String gr = matcher.group();
			value = value.replace(gr, "(" + sheet.getCellValue(gr) + ")");
		}
		System.out.println("value for cheking - " + value);
		while (((value.indexOf('(') != -1) || (value.indexOf(')') != -1)) && (value.indexOf('(') < value.indexOf(')'))
				&& ((value.indexOf('(') != -1) && ((value.indexOf(')') != -1)))) {
			value = val(value);
		}
		return Integer.toString(PPN.eval(value));
	}

	private String val(String s) throws NoSuchElementException, NumberFormatException {
		Pattern p = Pattern.compile("\\([^\\(\\)]*\\)");
		Matcher matcher = p.matcher(s);
		String ss = s.intern();
		while (matcher.find()) {
			String gr = matcher.group();
			String h = "";
			if (matcher.start() >= 3) {
				h = s.substring(matcher.start() - 3, matcher.start());
			}
			String newgr = gr.intern();
			PPN ppn = new PPN();
			switch (h) {
			case "MAX":
				newgr = newgr.replace(",", ")x(");
				ss = ss.replace(h + gr, Integer.toString(ppn.eval(newgr)));
				break;
			case "MIN":
				newgr = newgr.replace(",", ")n(");
				ss = ss.replace(h + gr, Integer.toString(ppn.eval(newgr)));
				break;
			case "SUM":
				newgr = newgr.replace(",", ")+(");
				ss = ss.replace(h + gr, Integer.toString(ppn.eval(newgr)));
				break;
			case "AVG":
				newgr = newgr.replace(",", ")g(");
				ss = ss.replace(h + gr, Integer.toString(ppn.eval(newgr)));
				break;
			default:
				ss = ss.replace(gr, Integer.toString(ppn.eval(gr)));
				break;
			}
		}
		return ss;
	}
}
