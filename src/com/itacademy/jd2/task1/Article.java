package com.itacademy.jd2.task1;

public abstract class Article implements Comparable<Article> {

	@Override
	public int compareTo(Article article) {
		return this.name.compareTo(article.name);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [ " + name + " , " + price + " , " + id + " ]";
	}

	private String name;
	private int price;
	private int id;
	// private Date production;

	public Article(String name, int price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
