package task11;

public class Task11 {

	public static void main(String[] args) {
		int x = 50;
		boolean attribute = true;
		for (int i = 2; i < x - 1; i++) {
			if (x % i == 0)
				attribute = false;
		}
		if (attribute == true)
			System.out.println(String.format("Число %s простое", x));
		else
			System.out.println(String.format("Число %s не является простым", x));
	}

}
