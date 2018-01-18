package com.itacademy.jd2.classwork.thread2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {// класс запускает поток, который запускается периодически
	private static int i = 0;

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				i++;
				System.out.println(i);
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
}