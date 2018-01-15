package com.itacademy.jd2.task1.food;

import com.itacademy.jd2.task1.Article;

public class ChewingGum extends Article {
	
	public ChewingGum() {
		ChewingGumBase chewingGum = ChewingGumBase.getRandomChewingGum();
		this.setName(chewingGum.name());
		this.setPrice(chewingGum.getPrice());
		this.setId(chewingGum.getId());
	}

}
