package com.itacademy.jd1.part2.excel;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PPN {

	private static boolean isDelim(char c) {
		return c == ' ';
	}

	private static boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == 'x' || c == 'n' || c == 'g';
	}

	private static int priority(char op) {
		switch (op) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
		case 'x':
		case 'n':
		case 'g':
			return 2;
		default:
			return -1;
		}
	}

	private static void processOperator(LinkedList<Integer> st, char op) {
		int r = st.removeLast();
		int l = st.removeLast();
		switch (op) {
		case '+':
			st.add(l + r);
			break;
		case '-':
			st.add(l - r);
			break;
		case '*':
			st.add(l * r);
			break;
		case '/':
			st.add(l / r);
			break;
		case '%':
			st.add(l % r);
			break;
		case 'x':
			st.add(Math.max(l, r));
			break;
		case 'n':
			st.add(Math.min(l, r));
			break;
		case 'g':
			st.add((l + r) / 2);
			break;
		}
	}

	public static int eval(String s) throws NoSuchElementException {
		LinkedList<Integer> st = new LinkedList<Integer>();
		LinkedList<Character> op = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isDelim(c))
				continue;
			if (c == '(')
				op.add('(');
			else if (c == ')') {
				while (op.getLast() != '(')
					processOperator(st, op.removeLast());
				op.removeLast();
			} else if (isOperator(c)) {
				while (!op.isEmpty() && priority(op.getLast()) >= priority(c))
					processOperator(st, op.removeLast());
				op.add(c);
			} else {
				String operand = "";
				while (i < s.length() && Character.isDigit(s.charAt(i)))
					operand += s.charAt(i++);
				--i;
				st.add(Integer.parseInt(operand));
			}
		}
		while (!op.isEmpty())
			processOperator(st, op.removeLast());
		return st.get(0);
	}
}