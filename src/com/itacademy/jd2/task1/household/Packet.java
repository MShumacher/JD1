package com.itacademy.jd2.task1.household;

import com.itacademy.jd2.task1.Household;

public class Packet extends Household {

	public Packet(String name, int price, int id  ) {
		super(name, price, id);
	}

	public Packet(PacketBase packet) {
		super(packet.name(), packet.getPrice(), packet.getId());	}

}
