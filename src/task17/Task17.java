package task17;

public class Task17 {

	public static void main(String[] args) {
		int marksLength = 8;
		int marks[][] = new int[marksLength][marksLength];
		for (int i = 0; i <= marksLength / 2; i++)
			for (int j = i; j <= marksLength - i - 1; j++) {
				marks[i][j] = 1;
				marks[marksLength - i - 1][marksLength - j - 1] = 1;
			}

		for (int i = 0; i <= marksLength - 1; i++) {
			for (int j = 0; j <= marksLength - 1; j++)
				System.out.print(marks[i][j] + " ");
			System.out.println();
		}
	}

}
