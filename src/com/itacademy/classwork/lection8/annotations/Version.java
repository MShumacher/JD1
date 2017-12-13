package com.itacademy.classwork.lection8.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
	// "вешаем" версии на все
	// String info();// похоже на "метод" без тела, может быть несколько. но это
	// свойство

	String info() default "1.0.0";

	int someAttribute();
}
