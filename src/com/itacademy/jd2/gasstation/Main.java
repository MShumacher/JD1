package com.itacademy.jd2.gasstation;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Queue<Car> queue = new ConcurrentLinkedQueue<Car>();
		// List<Column> columns = new ArrayList<Column>();
		List<Fuel> tanks = new ArrayList<Fuel>();
		for (int i = 0; i < Fuel.values().length; i++) {
			Fuel tank = Fuel.values()[i];
			tank.setCount(1000);
			tanks.add(tank);
			System.out.println(String.format("Tank[%s] has %s litеr of %s", i + 1, tanks.get(i).getCount(),
					tanks.get(i).getTitleRu()));
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
					queue.add(new Car(Fuel.values()[fuel].name()));
					System.out.println(String.format("Car[%s] add to queue.", countCar++));
					queue.notify();
				}
			}
			// Thread.sleep(100);
		}
		System.out.println("GasStation is empty.");
	}

}
