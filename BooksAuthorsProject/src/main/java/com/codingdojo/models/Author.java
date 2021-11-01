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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name = "authors" )
public class Author {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long author_id;
	
	@NotNull
	@Size( max = 100 )
	private String firstname;
	
	@NotNull
	@Size( max = 100 )
	private String lastname;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "authors_books", 
        joinColumns = @JoinColumn(name = "author_id"), 
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books;
	
	public Author(){}
	
	public Author( String firstname, String lastname ) {
		this.firstname = firstname;
		this.lastname = lastname;
	}


	public Long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
