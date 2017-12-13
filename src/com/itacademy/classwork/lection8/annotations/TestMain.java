package com.itacademy.classwork.lection8.annotations;

import java.lang.reflect.Method;

public class TestMain {

	public static void main(String[] args) {
		SampleObject sampleObject = new SampleObject();
		printObjectVersion(sampleObject);
	}

	private static void printObjectVersion(SampleObject sampleObject) {
		Class<? extends SampleObject> clazz = sampleObject.getClass();// ������� ����� getClass �� ������� sampleObject
																		// ��� ������ � ���, ��������� � ������ clazz
		Version annotation = clazz.getAnnotation(Version.class);// � annotation �������� "��������" ������ .class
		System.out.println("SampleObject vers.: " + annotation.info());
		Method[] methods = clazz.getMethods();// �� ������ �������� ����� ������� �� ���� ����� � �������� � ������
		for (Method method : methods) {
			Version methodVersion = method.getAnnotation(Version.class);
			// String versionString;
			// if (methodVersion== null) {versionString = "versioning unsupported";
			// }else{versionString=methodVersion.info();}}
			String versionString = methodVersion == null ? "versioning unsupported" : methodVersion.info();
			System.out.println(String.format("method '%s' version: %s", method.getName(), versionString));
		}
	}
}
