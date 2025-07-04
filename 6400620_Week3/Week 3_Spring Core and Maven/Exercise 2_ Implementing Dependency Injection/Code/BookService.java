package com.library.service;

import com.library.repository.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

    
    public void displayBooks() {
    	System.out.println(bookRepository.message());
        List<String> books = bookRepository.getBooks();
        System.out.println("Welcome to Library Management System...\n");
        for (String i : books) {
            System.out.println("- " + i);
        }
    }
}

