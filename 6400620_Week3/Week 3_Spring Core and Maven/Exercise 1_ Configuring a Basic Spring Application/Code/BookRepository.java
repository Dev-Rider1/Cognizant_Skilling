package com.library.repository;

import java.util.*;
public class BookRepository {
	public List<String> getBooks() {
        return Arrays.asList("Login", "Create Account", "Borrow Book", "Search", "Logout");
    }
}
