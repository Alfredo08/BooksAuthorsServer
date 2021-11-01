package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	
	@Query( value="SELECT b.name, b.pages, a.firstname, a.lastname " +
				  "FROM authors a JOIN authors_books ab ON a.author_id = ab.author_id " +
				  			     "JOIN books b ON b.book_id = ab.book_id", nativeQuery=true )
	List<Object[]> selectBooksAndAuthors();
}
