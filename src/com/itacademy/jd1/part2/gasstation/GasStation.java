package com.itacademy.jd1.part2.gasstation;

import java.util.List;

public class GasStation {
	private List<Tank> tanks;

	public GasStation(List<Tank> tanks) {
		this.tanks = tanks;
	}

	public boolean isEmpty() {
		int volume = 0;
		for (Tank tank : tanks) {
			volume += tank.getSystemVolumeFuel().get();
		}
		if (volume == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Tank getTank(FuelType fuelType) {
		for (Tank tank : tanks) {
			if (tank.getFuelType() == fuelType) {
				return tank;
			}
		}
		return null;
	}
}