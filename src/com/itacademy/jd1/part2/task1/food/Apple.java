package com.itacademy.jd1.part2.task1.food;

import com.itacademy.jd1.part2.task1.Article;

public class Apple extends Article {

	public Apple() {
		AppleBase apple = AppleBase.getRandomApple();
		this.setName(apple.name());
		this.setPrice(apple.getPrice());
		this.setId(apple.getId());
	}

}
