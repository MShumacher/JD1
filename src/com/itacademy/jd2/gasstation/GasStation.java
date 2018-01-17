package com.itacademy.jd2.gasstation;

import java.util.List;

public class GasStation {
	private List<Fuel> tanks;
//	private List<Column> columns;

	public GasStation(List<Fuel> tanks/* , List<Column> columns */) {
		this.tanks = tanks;
	//	this.columns = columns;
	}

	public boolean isEmpty() {
		int volume = 0;
		synchronized (tanks) {
			for (Fuel tank : tanks) {
				volume += tank.getCount();
			}
			if (volume == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

}
