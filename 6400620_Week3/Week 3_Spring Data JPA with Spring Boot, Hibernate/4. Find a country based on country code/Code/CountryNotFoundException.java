package com.cognizant.spring_learn.service.exception;

public class CountryNotFoundException extends Exception {
	
    public CountryNotFoundException(String msg) {
    	super(msg);
    }
}
