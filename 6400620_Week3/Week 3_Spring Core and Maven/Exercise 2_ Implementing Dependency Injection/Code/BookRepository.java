package com.library.repository;

import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public String message() {
		return "Spring IoC is achieved using Dependency Injection";
	}
	public List<String> getBooks() {
        return Arrays.asList("Login", "Create Account", "Borrow Book", "Search", "Logout");
    }
}
