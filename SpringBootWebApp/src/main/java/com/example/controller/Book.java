package com.example.controller;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String isbn;
	private String publisher;
	
	@ManyToMany
	@JoinTable(name="author_book",joinColumns=@JoinColumn(name="book_id"),
	inverseJoinColumns=@JoinColumn(name="author_id"))
	private Set<Author> authors = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

//	public Set<Author> getAuthors() {
//		return authors;
//	}
//
//	public void setAuthors(Set<Author> authors) {
//		this.authors = authors;
//	}
	
	
	
	
}
