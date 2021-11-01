package com.codingdojo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String displayAuthors( Model model ) {
		model.addAttribute( "authorList", authorsBooksService.getAllAuthors() );
		return "authors.jsp";
	}
	
	@RequestMapping( value = "/add", method = RequestMethod.GET )
	public String addAuthors() {
		return "addAuthor.jsp";
	}
	
	@RequestMapping( value = "/new", method = RequestMethod.POST )
	public String createNewAuthor( @RequestParam( value = "firstname" ) String firstname,
								   @RequestParam( value = "lastname" ) String lastname ){
		authorsBooksService.addAuthor(firstname, lastname);
		return "redirect:/authors/";
	}
}
