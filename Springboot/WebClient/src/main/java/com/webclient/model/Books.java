package com.webclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {
	@JsonProperty("bookId")
	private Integer bookId;
	
	@JsonProperty("bookName")
	private String bookName;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("price")
	private Integer price;
	
	public Books() {
		super();
	}
	public Books(Integer bookId, String bookName, String author, Integer price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
}
