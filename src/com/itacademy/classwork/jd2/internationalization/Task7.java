package com.itacademy.classwork.jd2.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Task7 {

	public static void main(String[] args) {
		Locale locale = new Locale("ru", "RU");
		ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
		System.out.println(rb.getString("greetings"));
	}

}
