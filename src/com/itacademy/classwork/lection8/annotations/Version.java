package com.itacademy.classwork.lection8.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
	// "������" ������ �� ���
	// String info();// ������ �� "�����" ��� ����, ����� ���� ���������. �� ���
	// ��������

	String info() default "1.0.0";

	int someAttribute();
}
