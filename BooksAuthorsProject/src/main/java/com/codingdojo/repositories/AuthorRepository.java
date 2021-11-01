package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.codingdojo.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
	@Query("SELECT a FROM Author a")
	List<Author> selectAllAuthors();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO authors(firstname, lastname) " +
				   "VALUES(:firstname, :lastname)", nativeQuery=true)
	void insertNewAuthor(@Param("firstname") String firstname, @Param("lastname") String lastname);
}
