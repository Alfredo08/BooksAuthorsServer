package com.codingdojo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Author;
import com.codingdojo.repositories.*;

@Service
public class AuthorsBooksService {
	
	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;
	
	public AuthorsBooksService( AuthorRepository authorRepository, BookRepository bookRepository ) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}
	
	public List<Author> getAllAuthors(){
		return authorRepository.selectAllAuthors();
	}
	
	public List<Object[]> getBooksAndAuthors(){
		return bookRepository.selectBooksAndAuthors();
	}
	
	public void addAuthor( String firstname, String lastname ) {
		authorRepository.insertNewAuthor(firstname, lastname);
	}
}
