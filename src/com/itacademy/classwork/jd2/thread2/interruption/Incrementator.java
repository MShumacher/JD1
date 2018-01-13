package com.itacademy.classwork.jd2.thread2.interruption;

public class Incrementator extends Thread {

	private volatile boolean mIsIncrement = true;// инкрементатор, если тру ++, если фалсе то --
	private volatile boolean mFinish = false;// флажок обозначает продолжать или нет нет
	// .interrupt - аналог mFinish
	public int mValue = 0;// счетчик

	public void changeAction() {
		mIsIncrement = !mIsIncrement;// меняем направление ++ или --
	}

	public void finish() {
		mFinish = true;
	}

	@Override
	public void run() {
		System.out.print("Значение = ");

		do {
			// if (!mFinish) {
			if (!Thread.interrupted()) {
				if (mIsIncrement) {
					mValue++;
				} else {
					mValue--;
				}

				System.out.print(mValue + " ");
			} else {
				return;
			}

			try {
				Thread.sleep(1000);// делает то ++, то -- и чтобы не было очень быстро, ставим слип
			} catch (final InterruptedException e) {
				return;// завершение потока после прерывания
			}

		} while (true);// бесконечный цикл, пока не выполнится return выше
	}
}
