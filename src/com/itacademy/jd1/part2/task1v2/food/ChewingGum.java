package com.itacademy.jd1.part2.task1v2.food;

import com.itacademy.jd1.part2.task1v2.Article;

public class ChewingGum extends Article {
	
	public ChewingGum() {
		ChewingGumBase chewingGum = ChewingGumBase.getRandomChewingGum();
		this.setName(chewingGum.name());
		this.setPrice(chewingGum.getPrice());
		this.setId(chewingGum.getId());
	}

}
