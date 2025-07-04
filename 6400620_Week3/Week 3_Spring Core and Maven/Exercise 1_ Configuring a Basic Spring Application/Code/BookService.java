package com.library.service;

import com.library.repository.*;
import java.util.List;

public class BookService {
	private BookRepository bookRepository;


    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void displayBooks() {
        List<String> books = bookRepository.getBooks();
        System.out.println("Welcome to Library Management System...\n");
        for (String i : books) {
            System.out.println("- " + i);
        }
    }
}

