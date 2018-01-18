package com.itacademy.jd1.part2.task1.food;

import com.itacademy.jd1.part2.task1.Article;

public class Grape extends Article {

	public Grape() {
		GrapeBase grape = GrapeBase.getRandomGrape();
		this.setName(grape.name());
		this.setPrice(grape.getPrice());
		this.setId(grape.getId());
	}
}
