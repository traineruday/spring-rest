package com.examples.springrest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.examples.springrest.model.Book;

@Service
public class BookService {
	
	private Map<Integer, Book> booksMap = new HashMap<>();
	public BookService() {
		
	}
	public Book saveBook(Book book) throws Exception {
		if (booksMap.containsKey(book.getNumber())) {
			throw new Exception("Book already exist");
		}
		booksMap.put(book.getNumber(), book);
		return book;
	}
	
	public Book updateBook(Integer number, Book book) throws Exception {
		if (!booksMap.containsKey(book.getNumber())) {
			throw new Exception("Book doesn't exist");
		}
		booksMap.put(number, book);
		return book;
	}

	public Book getBook(Integer number) throws Exception {
		if (!booksMap.containsKey(number)) {
			throw new Exception("Book doesn't exist");
		}
		return booksMap.get(number);
	}
	
	public String deleteBook(Integer number) throws Exception {
		if (!booksMap.containsKey(number)) {
			throw new Exception("Book doesn't exist");
		}
		booksMap.remove(number);		
		return "Book deleted successfully";
	}
}
