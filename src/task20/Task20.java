package task20;

public class Task20 {

	public static void main(String[] args) {
		String s = " ���     ������  ������ � ���������. ���� ��������� ������� � ��� ���� ";

		// String Subs = " ��� ������ ������ � ���������. ���� ��������� ������� � ���
		// ���� ";
		// StringBuffer Subs = new StringBuffer(s);
		/*
		 * int Counter = 0; while (Subs.indexOf(" ") != 0) { if (Subs.charAt(0) != ' ')
		 * { Counter++; Subs= Subs.substring(Subs.indexOf(" ")); } else Subs=
		 * Subs.substring(1); } System.out.println(String.format("� ������ ����: %s",
		 * ++Counter));
		 */

		System.out.println(s.indexOf(" "));

	}

}
