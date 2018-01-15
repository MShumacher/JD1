package com.itacademy.jd2.task1.household;

import com.itacademy.jd2.task1.Article;

public class Packet extends Article {
	public Packet() {

		PacketBase packet = PacketBase.getRandomPacket();
		this.setName(packet.name());
		this.setPrice(packet.getPrice());
		this.setId(packet.getId());
	}

}
