package com.itacademy.jd2.task1;

import com.itacademy.jd2.task1.food.Apple;
import com.itacademy.jd2.task1.food.Bread;
import com.itacademy.jd2.task1.food.ChewingGum;
import com.itacademy.jd2.task1.food.Grape;
import com.itacademy.jd2.task1.food.GrapeEnum;
import com.itacademy.jd2.task1.food.Milk;
import com.itacademy.jd2.task1.household.Packet;
import com.itacademy.jd2.task1.household.Pan;

public class Task1 {

	public static void main(String[] args) {
		// создаем все виды "прилавков"
		ShopCounter grape = new ShopCounter();
		int rand = (int) (Math.random() * 5);
		// генерим случайным образом виноград
		for (int i = 0; i < rand; i++) {
			int rand2 = (int) (Math.random() * (GrapeEnum.values().length - 1));
			int rand3 = 1 + (int) (Math.random() * 5);
			grape.addArticle(new Grape(GrapeEnum.values()[rand2]), rand3);
		}
		ShopCounter apple = new ShopCounter();
		ShopCounter milk = new ShopCounter();
		ShopCounter bread = new ShopCounter();
		ShopCounter chewingGum = new ShopCounter();
		ShopCounter packet = new ShopCounter();
		ShopCounter pan = new ShopCounter();
		apple.addArticle(new Apple("Jonagored", 2, 100001), 15);
		apple.addArticle(new Apple("Jonagold", 3, 100002), 12);
		// shopcounter.remove("Jonagored", 5);
		// shopcounter.remove(1298524, 2);
		bread.addArticle(new Bread("Hrodensky", 1, 100101), 10);
		for (int i = 0; i < 10; i++) {
			rand = (int) (Math.random() * 6);
			int rand2 = (int) (Math.random() * 10);
			switch (rand) {
			case 1:
				apple.addArticle(new Apple("Apple" + rand2, rand2, 100000 + rand2), rand2);
				break;
			case 2:
				bread.addArticle(new Bread("Bread" + rand2, rand2, 100000 + rand2), rand2);
				break;
			case 3:
				chewingGum.addArticle(new ChewingGum("ChewingGum" + rand2, rand2, 100000 + rand2), rand2);
				break;
			case 4:
				milk.addArticle(new Milk("Milk" + rand2, rand2, 100000 + rand2), rand2);
				break;
			case 5:
				packet.addArticle(new Packet("Packet" + rand2, rand2, 100000 + rand2), rand2);
				break;
			case 6:
				pan.addArticle(new Pan("Pan" + rand2, rand2, 100000 + rand2), rand2);
				break;
			}
		}
		Shop shop = new Shop();
		shop.addCounter(grape);
		shop.addCounter(apple);
		shop.addCounter(bread);
		shop.addCounter(chewingGum);
		shop.addCounter(milk);
		shop.addCounter(packet);
		shop.addCounter(pan);
		shop.print();
		// заполняем корзину покупателя
		ShoppingBasket customer1 = new ShoppingBasket();
		rand = 1 + (int) (Math.random() * 10);

		for (int i = 0; i < rand; i++) {
			customer1.addArticle(apple.getRandomItem(), 1);
			customer1.addArticle(bread.getRandomItem(), 1);
			customer1.addArticle(chewingGum.getRandomItem(), 1);
			customer1.addArticle(milk.getRandomItem(), 1);
		}
		customer1.print();

		// shop.print();
	}
}
