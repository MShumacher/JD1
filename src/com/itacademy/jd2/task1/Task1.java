package com.itacademy.jd2.task1;

import java.io.File;
import java.io.IOException;

import com.itacademy.jd2.task1.food.Apple;
import com.itacademy.jd2.task1.food.AppleBase;
import com.itacademy.jd2.task1.food.Bread;
import com.itacademy.jd2.task1.food.BreadBase;
import com.itacademy.jd2.task1.food.ChewingGum;
import com.itacademy.jd2.task1.food.ChewingGumBase;
import com.itacademy.jd2.task1.food.Grape;
import com.itacademy.jd2.task1.food.GrapeBase;
import com.itacademy.jd2.task1.food.Milk;
import com.itacademy.jd2.task1.food.MilkBase;
import com.itacademy.jd2.task1.household.Packet;
import com.itacademy.jd2.task1.household.PacketBase;
import com.itacademy.jd2.task1.household.Pan;
import com.itacademy.jd2.task1.household.PanBase;

public class Task1 {
	private static int rand(int length) {
		int rand = (int) (Math.random() * (length - 1));
		return rand;
	}

	public static void main(String[] args) {
		// создаем все виды "прилавков"
		ShopCounter grape = new ShopCounter();
		ShopCounter apple = new ShopCounter();
		ShopCounter milk = new ShopCounter();
		ShopCounter bread = new ShopCounter();
		ShopCounter chewingGum = new ShopCounter();
		ShopCounter packet = new ShopCounter();
		ShopCounter pan = new ShopCounter();
		int rand = (int) (Math.random() * 5);
		// генерим случайным образом все прилавки
		for (int i = 0; i < rand; i++) {
			grape.addArticle(new Grape(GrapeBase.values()[rand(GrapeBase.values().length)]),
					1 + (int) (Math.random() * 15));
			apple.addArticle(new Apple(AppleBase.values()[rand(AppleBase.values().length)]),
					1 + (int) (Math.random() * 15));
			bread.addArticle(new Bread(BreadBase.values()[rand(BreadBase.values().length)]),
					1 + (int) (Math.random() * 15));
			chewingGum.addArticle(new ChewingGum(ChewingGumBase.values()[rand(ChewingGumBase.values().length)]),
					1 + (int) (Math.random() * 15));
			milk.addArticle(new Milk(MilkBase.values()[rand(MilkBase.values().length)]),
					1 + (int) (Math.random() * 15));
			packet.addArticle(new Packet(PacketBase.values()[rand(PacketBase.values().length)]),
					1 + (int) (Math.random() * 15));
			pan.addArticle(new Pan(PanBase.values()[rand(PanBase.values().length)]), 1 + (int) (Math.random() * 15));
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
		ShopCounter customer1 = new ShopCounter();
		rand = 1 + (int) (Math.random() * 6);
		for (int i = 0; i < rand; i++) {
			if (!apple.getDesk().isEmpty()) {
				customer1.addArticle(apple.getRandomItem(), 1);
			}
			if (!bread.getDesk().isEmpty()) {
				customer1.addArticle(bread.getRandomItem(), 1);
			}
			if (!chewingGum.getDesk().isEmpty()) {
				customer1.addArticle(chewingGum.getRandomItem(), 1);
			}
			if (!milk.getDesk().isEmpty()) {
				customer1.addArticle(milk.getRandomItem(), 1);
			}
			if (!packet.getDesk().isEmpty()) {
				customer1.addArticle(packet.getRandomItem(), 1);
			}
			if (!pan.getDesk().isEmpty()) {
				customer1.addArticle(pan.getRandomItem(), 1);
			}
		}
		customer1.print();

		// shop.print();
	}

}
