package com.itacademy.jd1.part2.task1.household;

import com.itacademy.jd1.part2.task1.Article;

public class Pan extends Article {

	public Pan() {
		PanBase pan = PanBase.getRandomPan();
		this.setName(pan.name());
		this.setPrice(pan.getPrice());
		this.setId(pan.getId());
	}
}
