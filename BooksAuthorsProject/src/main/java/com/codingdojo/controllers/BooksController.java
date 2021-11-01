package com.codingdojo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.services.AuthorsBooksService;

@Controller
@RequestMapping("/books")
public class BooksController {
private final AuthorsBooksService authorsBooksService;
	
	public BooksController( AuthorsBooksService authorsBooksService ) {
		this.authorsBooksService = authorsBooksService;
	}
	
	@RequestMapping( value="/", method=RequestMethod.GET )
	public String displayBooks( Model model ) {
		List<Object[]> bookList = authorsBooksService.getBooksAndAuthors();
		
		for( int i = 0; i < bookList.size(); i ++ ) {
			Object[] row = bookList.get( i );
			for( int j = 0; j < row.length; j ++) {
				System.out.print( row[j] + " " );
			}
			System.out.println("");
		}
		
		model.addAttribute( "bookList", bookList );
		
		return "books.jsp";
	}
}
