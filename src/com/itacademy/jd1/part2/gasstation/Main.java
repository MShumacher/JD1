package com.itacademy.jd1.part2.gasstation;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Queue<Car> queue = new ConcurrentLinkedQueue<Car>();
		// List<Column> columns = new ArrayList<Column>();
		List<Car> tanks = new ArrayList<Car>();
		for (int i = 0; i < FuelType.values().length; i++) {
			Car tank = new Car(FuelType.values()[i], 1000);
			tanks.add(tank);
			System.out.println(
					String.format("Tank[%s] has %s litеr of %s", i + 1, tank.getSizeTank(), tank.getFuelType()));
		}
		for (int i = 0; i < 5; i++) {
			Column column = new Column(queue, tanks);
			// columns.add(column);
		}
		GasStation gasStation = new GasStation(tanks/* ,columns */);
		int countCar = 1;
		while (!gasStation.isEmpty()) {
			int fuel = (int) (Math.random() * 3);
			synchronized (queue) {
				if (queue.isEmpty()) {
					queue.add(new Car(FuelType.values()[fuel], 1 + (int) (Math.random() * 20)));
					System.out.println(String.format("Car[%s] add to queue.", countCar++));
					queue.notify();
				}
			}
			// Thread.sleep(100);
		}
		System.out.println("GasStation is empty.");
	}

}
