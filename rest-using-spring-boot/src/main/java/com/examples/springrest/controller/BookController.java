package com.examples.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.springrest.model.Book;
import com.examples.springrest.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping
	@RequestMapping(value="/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getBook(@PathVariable("number") Integer number) throws Exception {
		return this.bookService.getBook(number);
	}
	
	@PostMapping
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Book saveBook(@RequestBody Book book) throws Exception {
		return this.bookService.saveBook(book);
	}

	@PutMapping
	@RequestMapping(value="/{number}/udate", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book updateBook(@PathVariable("number") Integer number, @RequestBody Book book) throws Exception {
		return this.bookService.updateBook(number, book);
	}
	
	@DeleteMapping
	@RequestMapping(value="/{number}/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteBook(@PathVariable("number") Integer number) throws Exception {
		return this.bookService.deleteBook(number);
	}
}
