package com.itacademy.jd1.part2.gasstation;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Queue<Car> queue = new ConcurrentLinkedQueue<Car>();
		List<Tank> tanks = new ArrayList<Tank>();
		for (int i = 0; i < FuelType.values().length; i++) {
			Tank tank = new Tank(FuelType.values()[i], 1000);
			tanks.add(tank);
			System.out.println(String.format("Tank[%s] has %s litеr of %s", i + 1, tank.getSystemVolumeFuel(),
					tank.getFuelType()));
		}
		GasStation gasStation = new GasStation(tanks/* ,columns */);
		for (int i = 0; i < 5; i++) {
			Column column = new Column(queue, gasStation);
		}
		int countCar = 1;
		while (!gasStation.isEmpty()) {
			int fuel = (int) (Math.random() * FuelType.values().length);
			if (queue.isEmpty()) {
				queue.add(new Car(FuelType.values()[fuel], 1 + (int) (Math.random() * 20), countCar));
				System.out.println(String.format("Car №%s add to queue.", countCar++));
			}
		}
		System.out.println("GasStation is empty.");
	}
}
