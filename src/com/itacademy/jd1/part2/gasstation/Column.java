package com.itacademy.jd1.part2.gasstation;

import java.util.List;
import java.util.Queue;

public class Column extends Thread {
	private Queue<Car> queue;
	private GasStation gasStation;
	private String name;
	private FuelHolder myCar;

	public Column(Queue<Car> queue, GasStation gasStation) {
		super();
		this.queue = queue;
		this.gasStation = gasStation;
		this.name = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Start %s ", this.name));
		this.start();
	}

	@Override
	public void run() {
		while (!gasStation.isEmpty()) {
			myCar = queue.poll();
			if (myCar != null) {
				serveCar();
				try {
					Thread.sleep(myCar.getSizeTank() * 1000);
					System.out.println(String.format("%s is free.", this.name));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void serveCar() {
		synchronized (gasStation) {
			for (FuelHolder tank : gasStation.getTanks()) {
				if ((tank.getFuelType() == myCar.getFuelType()) && (tank.getSizeTank() >= myCar.getSizeTank())) {
					tank.setSizeTank(tank.getSizeTank() - myCar.getSizeTank());
					System.out.println(String.format("%s [%s]: car with tanksize[%s] start to fill up.", this.name,
							tank.getFuelType(), myCar.getSizeTank()));
					System.out.println(
							String.format("%s [%s]: remains %s", this.name, tank.getFuelType(), tank.getSizeTank()));
					return;
				}
			}
			System.out.println("Can't fill the car. Car go out.");
		}
	}
}
