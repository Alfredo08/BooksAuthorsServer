package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
