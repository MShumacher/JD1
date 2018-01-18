package com.itacademy.jd2.gasstation;

import java.util.List;

public class GasStation {
	private List<Car> tanks;
	// private List<Column> columns;

	public GasStation(List<Car> tanks) {
		this.tanks = tanks;
		// this.columns = columns;
	}

	public boolean isEmpty() {
		int volume = 0;
		synchronized (tanks) {
			for (Car tank : tanks) {
				volume += tank.getSizeTank();
			}
			if (volume == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

}
