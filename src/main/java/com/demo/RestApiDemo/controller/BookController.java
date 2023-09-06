package com.demo.RestApiDemo.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.RestApiDemo.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
private ConcurrentHashMap<String, Book> books;
public BookController() {
	books=new ConcurrentHashMap<String, Book>();
	books.put("0X-13", new Book("0X-13","Gone with the wind","Cuong",1945));
	books.put("0X-14", new Book("0X-14","The Word","mm",1960));
	books.put("0X-15", new Book("0X-15","Family","Fa",1980));
}
@GetMapping
public List<Book> getBooks(){
	return books.values().stream().toList();
}
}
