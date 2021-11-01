package com.codingdojo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table( name = "books" )
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long book_id;
	
	@NotNull
	@Size( max = 100 )
	private String name;
	
	@NotNull
	@Size( max = 100 )
	private Long pages;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "authors_books", 
        joinColumns = @JoinColumn(name = "book_id"), 
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;
	
	public Book(){}
	
	public Book( String name, Long pages ) {
		this.name = name;
		this.pages = pages;
	}

	public Long getBook_id() {
		return book_id;
	}

	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPages() {
		return pages;
	}

	public void setPages(Long pages) {
		this.pages = pages;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}