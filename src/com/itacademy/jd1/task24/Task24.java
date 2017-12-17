package com.itacademy.jd1.task24;

import com.itacademy.jd1.task24.forHome.*;
import com.itacademy.jd1.task24.forKitchen.*;

public class Task24 {

	public static void main(String[] args) {
		Appliances iron = new Iron("Samsung");
		Appliances mixer = new Mixer("Vitek");
		Appliances microwave = new Microwave("LG");
		iron.on();
		iron.printState();
		mixer.on();
		mixer.printState();
		microwave.printState();
	}

}
