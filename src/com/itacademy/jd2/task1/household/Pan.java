package com.itacademy.jd2.task1.household;

import com.itacademy.jd2.task1.Household;

public class Pan extends Household {

	public Pan(String name, int price, int id) {
		super(name, price, id);
	}

	public Pan(PanBase pan) {
		super(pan.name(), pan.getPrice(), pan.getId());
	}

}
