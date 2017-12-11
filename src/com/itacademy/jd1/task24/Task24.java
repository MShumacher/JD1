package com.itacademy.jd1.task24;

import com.itacademy.jd1.task24.forHome.*;
import com.itacademy.jd1.task24.forKitchen.*;

public class Task24 {

	public static void main(String[] args) {
		Iron iron = new Iron("Samsung");
		Mixer mixer = new Mixer("Vitek");
		Microwave microwave = new Microwave("LG");
		iron.on();
		iron.printState();
		mixer.on();
		mixer.printState();
	}

}
