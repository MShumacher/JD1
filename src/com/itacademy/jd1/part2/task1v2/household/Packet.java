package com.itacademy.jd1.part2.task1v2.household;

import com.itacademy.jd1.part2.task1v2.Article;

public class Packet extends Article {
	public Packet() {

		PacketBase packet = PacketBase.getRandomPacket();
		this.setName(packet.name());
		this.setPrice(packet.getPrice());
		this.setId(packet.getId());
	}

}
