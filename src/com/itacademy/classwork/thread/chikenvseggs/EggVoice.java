package com.itacademy.classwork.thread.chikenvseggs;

class EggVoice extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000); // ���������������� ����� �� 1 �������
			} catch (InterruptedException e) {
			}
			System.out.println("����!");
		}
		// ����� ����� ������� 5 ���
	}
}