package com.intexsoft.jd1.task24;

import com.intexsoft.jd1.task24.forHome.*;
import com.intexsoft.jd1.task24.forKitchen.*;

public class Task24 {

	public static void main(String[] args) {
		Iron iron = new Iron("Samsung");
		Mixer mixer = new Mixer("Vitek");
		Microwave microwave = new Microwave("LG Витек");
		iron.on();
		iron.printState();
		mixer.on();
		mixer.printState();
	}

}
