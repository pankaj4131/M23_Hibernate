package com.cg.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = "Book")
@NamedQueries(@NamedQuery(name = "getAllBooks", query = "SELECT b FROM Book b"))
public class Book implements Serializable
{
	@SuppressWarnings("unused")
	private static final long serialversionUID = 1L;
	@Id
	private Integer id;
	private String title;
	private String author;
	private Double price;
	
	//getter and setters method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	

}