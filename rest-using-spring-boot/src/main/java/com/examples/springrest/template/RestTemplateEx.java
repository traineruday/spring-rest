package com.examples.springrest.template;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.examples.springrest.model.Book;

public class RestTemplateEx {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Book request = new Book();
		request.setNumber(6);
		request.setTitle("title");
		System.out.println(" Calling Post api");
		ResponseEntity<Book> postForEntity = restTemplate.postForEntity("http://localhost:8080/book", request, Book.class);
		System.out.println("Data posted succesfully");
		System.out.println("Status Code: " + postForEntity.getStatusCodeValue());
		System.out.println("Body" + postForEntity.getBody());
		System.out.println("Headers: " + postForEntity.getHeaders());
		System.out.println("\n\n");
		
		System.out.println("Calling Get api");
		Book book = restTemplate.getForObject("http://localhost:8080/book/3", Book.class);
		System.out.println(book);
	}

}
