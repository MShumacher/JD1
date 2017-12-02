package task7;

public class Task7 {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 3;
		int d = 6;
		int e = 6;
		int f = 7;
		boolean attribute = false;
		if ((a + d <= e) && (b <= f) && (c <= f))
			attribute = true;
		if ((b + c <= e) && (a <= f) && (d <= f))
			attribute = true;
		if ((a + c <= e) && (b <= f) && (d <= f))
			attribute = true;
		if ((b + d <= e) && (a <= f) && (c <= f))
			attribute = true;
		if ((a + d <= f) && (b <= e) && (c <= e))
			attribute = true;
		if ((b + c <= f) && (a <= e) && (d <= e))
			attribute = true;
		if ((a + c <= f) && (b <= e) && (d <= e))
			attribute = true;
		if ((b + d <= f) && (a <= e) && (c <= e))
			attribute = true;
		if (attribute)
			System.out.println(String.format("Дома размером %s*%s и %s*%s можно разместить на участке размером %s*%s",
					a, b, c, d, e, f));
		else
			System.out.println(String.format("Дома размером %s*%s и %s*%s нельзя разместить на участке размером %s*%s",
					a, b, c, d, e, f));
	}
}
