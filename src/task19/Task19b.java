package task19;

public class Task19b {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("  ���     ������  ������ � ���������. ���� ��������� ������� � ��� ���� ");
		int Counter = 0;
		while (s.indexOf(" ") != -1) {
			if (s.charAt(0) != ' ') {
				Counter++;
				s.delete(0, s.indexOf(" "));
			} else
				s.delete(0, 1);
		}
		if (s.length() != 0)
			Counter++;
		System.out.println(String.format("� ������ ����: %s", Counter));

	}

}
