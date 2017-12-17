package com.itacademy.jd1.task29;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task29 {

	public static void main(String[] args) {
		String str = "Hello!\r\n" + "\r\n"
				+ "My name is Kate. My surname is Pavlova. I’m seven. I live in Minsk, in Pushkin street. I go to school number 214 . I’m in the first form.\r\n"
				+ "\r\n"
				+ "I’ve got a family. It is small. We are a family of four. I’ve got a father, a mother and a brother. I haven’t got a sister. My father is.an engineer. He works in a plant. My mother is a teacher. She works at school. My brother is little. He doesn’t go to school. He goes to a kindergarten. He is four.\r\n"
				+ "\r\n"
				+ "I like to play. I have got many toys. I have got a teddy-bear, dolls, a ball, a toy monkey and a doll’s house. I like the doll’s house very much. It is big. It is pink and nice.\r\n"
				+ "\r\n"
				+ "We have got a cat. It is small and grey. It is very nice. It has big blue eyes, a funny nose, a small mouth and sharp teeth. Its ears are small. It can play hide-and-seek. I love my cat. It loves me, too.\r\n"
				+ "\r\n"
				+ "I go to school. I’m a pupil. I have got many friends. We have our classroom. It is nice and large. You can see twelve desks, many chairs, our teacher’s table, a blackboard, two bookcases in the classroom. At the lessons we have pens, pencils, pencil-boxes or pencil-cases, rulers, erasers, textbooks, exercise-books, record-books on the desks.\r\n"
				+ "\r\n"
				+ "I like to read. I can read well. I like fairytales. They are very interesting. I like «Cinderella» and «Pinocchio» best.\r\n"
				+ "\r\n" + "Bye! ";
		str = str.trim();
		String[] words = str.toLowerCase().split("(\\W|\\d)+");
		List<String> dictionary = new LinkedList<String>();
		for (String string : words) {
			dictionary.add(string);
		}
		int i = 0;
		while (i < dictionary.size()) {
			int count = 1;
			int j = i + 1;
			while (j < dictionary.size()) {
				if (dictionary.get(i).equals(dictionary.get(j))) {
					count++;
					dictionary.remove(j);
				} else {
					j++;
				}
			}
			System.out.println(dictionary.get(i++) + " " + count);
		}
	}
}
