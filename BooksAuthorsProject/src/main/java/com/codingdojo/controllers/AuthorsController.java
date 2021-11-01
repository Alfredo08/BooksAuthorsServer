package com.codingdojo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Author;
import com.codingdojo.services.AuthorsBooksService;

@Controller
@RequestMapping("/authors")
public class AuthorsController {
	private final AuthorsBooksService authorsBooksService;
	
	public AuthorsController( AuthorsBooksService authorsBooksService ) {
		this.authorsBooksService = authorsBooksService;
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String displayAuthors() {

		return "authors.jsp";
	}
	
	@RequestMapping( value = "/add", method = RequestMethod.GET )
	public String addAuthors() {
		return "addAuthor.jsp";
	}
}
