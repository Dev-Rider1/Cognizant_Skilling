package com.library;

import com.library.service.*;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(
	    exclude = {
	        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
	    }
	)
public class Application {
	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class,args);

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.displayBooks();
    }
}
