package com.itacademy.jd1.part2.gasstation;

import java.util.List;
import java.util.Queue;

public class Column extends Thread {
	private Queue<Car> queue;
	private List<Car> tanks;
	private String name;
	private Car myCar;

	public Column(Queue<Car> queue, List<Car> tanks) {
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
			for (Car tank : tanks) {
				if ((tank.getFuelType() == myCar.getFuelType()) && (tank.getSizeTank() >= myCar.getSizeTank())) {
					tank.setSizeTank(tank.getSizeTank() - myCar.getSizeTank());
					System.out.println(String.format("%s [%s]: car [%s] starts to fill up.", this.name, tank.getFuelType(),
							myCar.getSizeTank()));
					System.out.println(
							String.format("%s [%s]: remains %s", this.name, tank.getFuelType(), tank.getSizeTank()));
					return true;
				}
			}
			System.out.println("Can't fill the car. Car goes out.");
			return false;
		}
	}
}
