package task20;

public class Task20 {

	public static void main(String[] args) {
		String s = " это     пример  строки с пробелами. надо посчитать сколько в ней слов ";

		// String Subs = " это пример строки с пробелами. надо посчитать сколько в ней
		// слов ";
		// StringBuffer Subs = new StringBuffer(s);
		/*
		 * int Counter = 0; while (Subs.indexOf(" ") != 0) { if (Subs.charAt(0) != ' ')
		 * { Counter++; Subs= Subs.substring(Subs.indexOf(" ")); } else Subs=
		 * Subs.substring(1); } System.out.println(String.format("В строке слов: %s",
		 * ++Counter));
		 */

		System.out.println(s.indexOf(" "));

	}

}
