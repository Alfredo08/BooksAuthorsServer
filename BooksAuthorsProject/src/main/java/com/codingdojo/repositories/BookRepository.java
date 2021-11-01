package com.codingdojo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
