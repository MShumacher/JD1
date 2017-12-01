package task5;

public class Task5 {

	public static void main(String[] args) {
		int x = 123450;
		switch (x % 10) {
		case 1:
			System.out.println(x + " рубль");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println(x + " рубля");
			break;
		default:
			System.out.println(x + " рублей");
		}

	}

}
