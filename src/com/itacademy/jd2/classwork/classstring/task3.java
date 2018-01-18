package com.itacademy.jd2.classwork.classstring;

public class task3 {

	public static void main(String[] args) {
		String s = "hjgjh<p> k12A <p >4 <p dssdf> 521521jhkjh , hl,l!jhl-klB.";

		System.out.println(s.replaceAll("<p[^>]*>", "<p>"));

	}

}
