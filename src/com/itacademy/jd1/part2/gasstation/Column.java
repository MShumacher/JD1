package com.itacademy.jd1.part2.gasstation;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Column extends Thread {
	private Queue<Car> queue;
	private GasStation gasStation;
	private String name;
	private Car myCar;

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
		while ((!gasStation.isEmpty()) || (!queue.isEmpty())) {
			myCar = queue.poll();
			if (myCar != null) {
				serveCar();
				System.out.println(String.format("%s is free.", this.name));
			}
		}
	}

	private void serveCar() {
		Tank currentTank = gasStation.getTank(myCar.getFuelType());
		AtomicInteger systemVolumeFuel = currentTank.getSystemVolumeFuel();
		int carVolumeFuel = myCar.getVolumeFuel().get();

		if (systemVolumeFuel.get() >= carVolumeFuel) {
			systemVolumeFuel.getAndAdd(-carVolumeFuel);
			System.out.println(String.format("%s [%s]: car №%s with tanksize[%s] start to fill up.", this.name,
					currentTank.getFuelType(), myCar.getNumber(), carVolumeFuel));
			try {
				for (int i = 0; i < carVolumeFuel; i++) {
					Thread.sleep(1000);
					currentTank.getVolumeFuel().getAndDecrement();
					// System.out.println(String.format("%s : car №%s tanks. Remains
					// in tank[%s]:%s", this.name, myCar.getNumber(), currentTank.getFuelType(),
					// currentTank.getVolumeFuel().get()));
				}
				System.out.println(String.format("%s : car №%s go out. Remains in system[%s]:%s", this.name,
						myCar.getNumber(), currentTank.getFuelType(), systemVolumeFuel));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return;
		}
		System.out.println(String.format("%s [%s]: Can't fill the car №%s. Car go out.", this.name,
				currentTank.getFuelType(), myCar.getNumber()));
	}
}