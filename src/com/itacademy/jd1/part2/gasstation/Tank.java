package com.itacademy.jd1.part2.gasstation;

import java.util.concurrent.atomic.AtomicInteger;

public class Tank extends FuelHolder {
	private AtomicInteger systemVolumeFuel = new AtomicInteger(0);

	public AtomicInteger getSystemVolumeFuel() {
		return systemVolumeFuel;
	}

	public Tank(FuelType fuelType, int volumeFuel) {
		super(fuelType, volumeFuel);
		this.systemVolumeFuel.set(volumeFuel);
	}

}
