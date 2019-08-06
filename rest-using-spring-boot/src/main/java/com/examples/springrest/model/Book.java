package com.examples.springrest.model;

import java.util.List;

public class Book {
	private Integer number;
	private List<String> authors;
	private String title;

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", authors=" + authors + ", title=" + title + "]";
	}

}
