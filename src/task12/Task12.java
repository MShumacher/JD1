package task12;

public class Task12 {

	public static void main(String[] args) {
		int x = 1221241;
		String s = "";
		while (x != 0) {
			s = x % 1000 + " " + s;
			x = x / 1000;
		}
		System.out.print(s);
	}
}
