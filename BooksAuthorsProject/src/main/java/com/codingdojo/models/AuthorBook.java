package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="authors_books")
public class AuthorBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id")
    private Author author_id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book_id")
    private Book book_id;
    
    public AuthorBook() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Author getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Author author_id) {
		this.author_id = author_id;
	}

	public Book getBook_id() {
		return book_id;
	}

	public void setBook_id(Book book_id) {
		this.book_id = book_id;
	}
    
}