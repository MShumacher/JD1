package com.itacademy.jd1.part2.gasstation;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class FuelHolder {
	private FuelType fuelType;
	private AtomicInteger volumeFuel = new AtomicInteger(0);

	public FuelType getFuelType() {
		return fuelType;
	}

	public AtomicInteger getVolumeFuel() {
		return volumeFuel;
	}

	public FuelHolder(FuelType fuelType, int volumeFuel) {
		this.fuelType = fuelType;
		this.volumeFuel.set(volumeFuel);
	}

}
