package com.itacademy.jd2.gasstation;

import java.util.List;
import java.util.Queue;

public class Column extends Thread {
	private Queue<Car> queue;
	private List<Fuel> tanks;
	private String name;
	private Car myCar;

	public Column(Queue<Car> queue, List<Fuel> tanks) {
		super();
		this.queue = queue;
		this.tanks = tanks;
		this.name = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Start %s ", this.name));
		this.setDaemon(true);
		this.start();
	}

	@Override
	public void run() {
		while (true) {
			do {
				synchronized (queue) {
					try {
						if (queue.isEmpty()) {
							queue.wait();
						}
						myCar = queue.poll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} while (!serveCarIfCan());
			try {
				Thread.sleep(myCar.getSizeTank() * 1000);
				System.out.println(String.format("%s is free.", this.name));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean serveCarIfCan() {
		synchronized (tanks) {
			for (Fuel tank : tanks) {
				if ((tank.name() == myCar.getFuel()) && (tank.getCount() >= myCar.getSizeTank())) {
					tank.setCount(tank.getCount() - myCar.getSizeTank());
					System.out.println(
							String.format("Car %s [%s] starts to fill up.", tank.getTitleRu(), myCar.getSizeTank()));
					System.out.println(String.format("[%s]: remains %s", tank.getTitleRu(), tank.getCount()));
					return true;
				}
			}
			System.out.println("Can't fill the car. Car goes out.");
			return false;
		}
	}
}
