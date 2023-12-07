package com.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBooksData {
	
	@JsonProperty("bookId")
	private int bookId;
	
	@JsonProperty("bookname")
	private String bookName;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("price")
	private int price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}