package com.itacademy.jd2.task1.household;

import com.itacademy.jd2.task1.Article;

public class Pan extends Article {

	public Pan() {
		PanBase pan = PanBase.getRandomPan();
		this.setName(pan.name());
		this.setPrice(pan.getPrice());
		this.setId(pan.getId());
	}
}
