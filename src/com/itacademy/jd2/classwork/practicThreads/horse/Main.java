package com.itacademy.jd2.classwork.practicThreads.horse;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Horse> horseList = new ArrayList<Horse>();
		int count = 4 + (int) (Math.random() * 6);
		for (int i = 0; i < count + 1; i++) {
			Horse horse = new Horse();
			horse.setName("horse" + i);
			horse.start();
			horseList.add(horse);
		}
		Thread.sleep(200);
		int killHorse = 2 + (int) (Math.random() * count);
		horseList.get(killHorse).stop();
		System.out.println("horse" + (killHorse) + " dead");
	}

}
