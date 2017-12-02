package task15;

public class Task15 {

	public static void main(String[] args) {
		int marksLength = 10;
		int marks[] = new int[marksLength];
		for (int i = 0; i < marksLength; i++) {
			System.out.print((marks[i] = (int) (Math.random() * 10 + 1)) + " ");
		}
		int maxMark = marks[0];
		int maxNumber = 1;
		int minMark = marks[0];
		int minNumber = 1;
		System.out.println();
		for (int i = 1; i < marks.length; i++) {
			if (maxMark < marks[i]) {
				maxMark = marks[i];
				maxNumber = i + 1;
			}
			if (minMark > marks[i]) {
				minMark = marks[i];
				minNumber = i + 1;
			}
		}
		if (minNumber < maxNumber) {
			int i = minNumber;
			minNumber = maxNumber;
			maxNumber = i;
		}
		int sum = 0;
		for (int i = maxNumber; i < minNumber - 1; i++) {
			sum += marks[i];
		}
		System.out.println("Сумма чисел между максимальным и минимальным элементами равна " + sum);

	}

}
