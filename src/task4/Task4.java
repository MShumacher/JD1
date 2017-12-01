package task4;

public class Task4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		int r = 4;
		if (r >= Math.sqrt(a * a + b * b))
			System.out.println(String.format(
					"ѕр€моугольное отверстие размерами %s*%s можно закрыть круглой картонкой диаметром %s", a, b, r));
		else
			System.out.println(String.format(
					"ѕр€моугольное отверстие размерами %s*%s нельз€ закрыть круглой картонкой диаметром %s", a, b, r));
		;
	}

}
