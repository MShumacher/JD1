package com.intexsoft.jd1.task23;

public class Bankomat {
	private int countOfNominals = 3;
	// private int nominals[] = new int[countOfNominals];nominals={ 100, 50, 20 };
	private int nominals[] = new int[] { 100, 50, 20 };
	public int count[] = new int[countOfNominals];
	private boolean validSum = false;
	private int[] lastOperation = { 0, 0, 0 };

	public Bankomat(int a, int b, int c) {
		count[0] = a;
		count[1] = b;
		count[2] = c;
	}

	public void addMoney(int a, int b, int c) {
		count[0] += a;
		count[1] += b;
		count[2] += c;
	}

	public void getStatus() {
		System.out.println("�������� �������� ���:");
		for (int i = 0; i < countOfNominals; i++) {
			System.out.println(String.format("%s ����� ��������� %s ", count[i], nominals[i]));
		}
	}

	public boolean getMoney(int sum) {
		balance(sum, 0);
		if (validSum) {
			System.out.println(String.format("������ ����� %s ��������:", sum));
			for (int j = 0; j < countOfNominals; j++) {
				System.out.println(String.format("%s �� ��������� %s ", lastOperation[j], nominals[j]));
				count[j] -= lastOperation[j];
			}
			return true;
		} else {
			System.out.println("��������� ����� ������ ����������.");
			return false;
		}
	}

	private void balance(int s, int i) {
		// s - �����, ������� �������� �������
		// i - ����� ��������, ������ �������� ��������
		// �������� ������ ���� ������������� �� ��������
		int k = 0;// k - ���������� �����, ������� "���������" �� ���������� ��������, ���� ��
					// ������� ������� ������ �����
		while ((validSum == false) && (s != 0) && (i < countOfNominals) && (k <= Math.min(count[i], s / nominals[i]))) {
			lastOperation[i] = Math.min(count[i], s / nominals[i]) - k;
			balance(s - lastOperation[i] * nominals[i], i + 1);
			k++;
		}
		if (s == 0) { // ������� ������� ������ ����� �����
			validSum = true;
		}

	}

}
