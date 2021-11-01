package com.codingdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class BooksAuthorsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksAuthorsProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "index.jsp";
	}
}
